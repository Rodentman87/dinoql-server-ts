import {
	fastify,
	FastifyInstance,
	FastifyRequest,
	FastifyReply,
} from "fastify";
import { DinoQLDocument, DinoQLResource } from "dinoql-ts";
import { ResourceHandler } from "./ResourceHandler.js";
import { RequestError } from "./Errors.js";

interface RelationSelector {
	[key: string]: true | RelationSelector;
}

interface DinoQLRequest {
	resource: string;
	id?: string | Object;
	method: string;
	params: Object;
	batchId?: string;
	relations?: RelationSelector;
}

export interface ServerOptions {
	schema: DinoQLDocument;
	endpoint?: string;
	app?: FastifyInstance;
}

export class DinoQLServer {
	schema: DinoQLDocument;
	app: FastifyInstance;

	private resourceHandlers = new Map<string, ResourceHandler>();

	constructor(options: ServerOptions) {
		this.app = options.app ?? fastify();

		options.schema.validateSchema();
		this.schema = options.schema;

		this.handleRequest = this.handleRequest.bind(this);
		this.handleServerReq = this.handleServerReq.bind(this);
		this.resolveRelations = this.resolveRelations.bind(this);

		this.app.post(options.endpoint ?? "/dinoql", this.handleServerReq);
	}

	async addResourceHandler(handler: ResourceHandler) {
		const resource = this.schema.getTypeDefinition(handler.resourceName);
		if (!resource || resource.type !== "resource") {
			throw new Error(`Resource ${handler.resourceName} not found`);
		}
		for (const [name] of resource.queries) {
			if (
				!(name in handler) ||
				// @ts-expect-error The above validates that the key exists
				typeof handler[name] !== "function"
			) {
				throw new Error(
					`Query handler ${name} not found in handler ${handler.resourceName}`
				);
			}
		}
		for (const [name] of resource.actions) {
			if (
				!(name in handler) ||
				// @ts-expect-error The above validates that the key exists
				typeof handler[name] !== "function"
			) {
				throw new Error(
					`Action handler ${name} not found in handler ${handler.resourceName}`
				);
			}
		}
		this.resourceHandlers.set(handler.resourceName, handler);
	}

	start(port: number) {
		return this.app.listen({ port });
	}

	private async handleServerReq(req: FastifyRequest, res: FastifyReply) {
		// Check if the request is an object or an array of objects
		const body = req.body;
		if (Array.isArray(body)) {
			const ids = new Set<string>();
			body.forEach((req) => {
				if (!req.batchId) {
					res.status(400).send({
						error: "Batch requests must have a batchId",
					});
					return;
				} else {
					if (ids.has(req.batchId)) {
						res.status(400).send({
							error: "All batchIds must be unique",
						});
						return;
					}
					ids.add(req.batchId);
				}
			});
			const outputs: Record<string, any> = {};
			let allErrors = true;
			for (const request of body) {
				try {
					outputs[request.batchId] = await this.handleRequest(request);
					allErrors = false;
				} catch (e) {
					outputs[request.batchId] = {
						_error: e.message,
					};
				}
			}
			res.status(allErrors ? 400 : 200).send(outputs);
		} else {
			const valid = this.validateRequest(body);
			if (!valid) {
				res.status(400).send({
					_error: "Invalid request",
				});
				return;
			}
			try {
				const out = await this.handleRequest(body);
				res.status(200).send(out);
			} catch (e) {
				if (e instanceof RequestError) {
					res.status(e.statusCode).send({
						_error: e.messages,
					});
					return;
				} else {
					throw e;
				}
			}
		}
	}

	private validateRequest(body: any): body is DinoQLRequest {
		if (!body.resource || typeof body.resource !== "string") return false;
		if (!body.method || typeof body.method !== "string") return false;
		if (!body.params || typeof body.params !== "object") return false;
		if (body.relations !== undefined && typeof body.relations !== "object")
			return false;
		if (body.relations !== undefined) {
			return this.resursivelyValidateRelationsStructure(body.relations);
		}
		return true;
	}

	private resursivelyValidateRelationsStructure(object: any): boolean {
		for (const key in object) {
			switch (typeof object[key]) {
				case "boolean":
					if (object[key] !== true) return false;
					break;
				case "object":
					if (!this.resursivelyValidateRelationsStructure(object[key]))
						return false;
					break;
				default:
					return false;
			}
		}
		return true;
	}

	private async handleRequest(request: DinoQLRequest) {
		// Check if the resource exists
		const resource = this.schema.getTypeDefinition(request.resource);
		if (!resource || resource.type !== "resource") {
			return {
				errors: ["Resource not found"],
			};
		}
		// Check if the method exists
		const method = resource.getMethod(request.method);
		if (!method) {
			throw new RequestError(400, "Method not found");
		}
		// Check if the params are valid
		const params = method.validateParameters(request.params);
		if (params !== true) {
			throw new RequestError(
				400,
				Object.keys(params).map((key) => params[key])
			);
		}
		if (request.relations) {
			const valid = this.validateRelations(resource, request.relations);
			if (valid !== true) {
				throw new RequestError(400, valid);
			}
		}
		const handler = this.resourceHandlers.get(request.resource)!;
		if (!handler)
			throw new Error(`Resource handler not found for ${request.resource}`);
		// Call the handler
		let result;
		if (!request.id || request.id === "static") {
			// @ts-expect-error We've already validated that the key exists
			result = handler[request.method](request.params);
		} else {
			// @ts-expect-error We've already validated that the key exists
			result = handler[request.method](request.id, request.params);
		}
		const resolvedResult = await result;
		let final = resolvedResult;
		if (request.relations) {
			final = await this.resolveRelations(
				resolvedResult,
				resource,
				request.relations
			);
		}
		return final;
	}

	private validateRelations(
		resource: DinoQLResource,
		relation: RelationSelector,
		parentPath: string = ""
	): true | string {
		for (const key in relation) {
			const field = resource.properties.get(key);
			if (!field)
				return `Invalid relation, field ${parentPath}${key} not found`;
			if (field.type.baseTypeDef === undefined)
				return `Invalid relation, field ${parentPath}${key} is not a resource`;
			if (field.type.baseTypeDef.type !== "resource")
				return `Invalid relation, field ${parentPath}${key} is not a resource`;
			if (typeof relation[key] === "object") {
				return this.validateRelations(
					field.type.baseTypeDef,
					relation[key] as RelationSelector,
					parentPath + key + "."
				);
			}
		}
		return true;
	}

	private async resolveRelations<T>(
		object: T,
		type: DinoQLResource,
		relations: RelationSelector
	): Promise<any> {
		const out: any = {
			...object,
		};
		// 1. Loop over the relations to be fetched
		for (const key in relations) {
			// 3. Get the type of the relation
			const relationField = type.properties.get(key)!; // We know this exists because we validated it against the schema
			const relationType = relationField.type.baseTypeDef as DinoQLResource;
			if (relationField.isOptional && out[key] === undefined) continue; // Skip optional fields that are not present
			if (relationField.type.nullable && out[key] === null) {
				out[key] = null;
			} else if (relationField.type.array) {
				// Get the resolver
				const resolver = this.resourceHandlers.get(relationType.name)!;
				let finalArray = out[key].map(async (idObj: any) => {
					// Call the resolver
					// @ts-expect-error We've already validated that the key exists
					const result = resolver.get(idObj);
					// Resolve the result
					const resolvedResult = await result;
					// Recurse
					if (typeof relations[key] === "object") {
						return this.resolveRelations(
							resolvedResult,
							relationType,
							relations[key] as RelationSelector
						);
					} else {
						return resolvedResult;
					}
				});
				out[key] = await Promise.all(finalArray);
			} else {
				// Get the resolver
				const resolver = this.resourceHandlers.get(relationType.name)!;
				// Call the resolver
				// @ts-expect-error We know that the key exists
				const result = resolver.get(out[topLevelRelation]);
				// Resolve the result
				const resolvedResult = await result;
				// Recurse
				if (typeof relations[key] === "object") {
					out[key] = this.resolveRelations(
						resolvedResult,
						relationType,
						relations[key] as RelationSelector
					);
				} else {
					out[key] = resolvedResult;
				}
			}
		}
		return out;
	}
}
