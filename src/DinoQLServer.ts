import express from "express";
import { DinoQLDocument, DinoQLResource } from "dinoql-ts";
import { ResourceHandler } from "./ResourceHandler";

interface DinoQLRequest {
	resource: string;
	id?: string | Object;
	method: string;
	params: Object;
	batchId?: string;
}

export interface ServerOptions {
	schema: DinoQLDocument;
	endpoint?: string;
	app?: express.Application;
}

export class DinoQLServer {
	schema: DinoQLDocument;
	app: express.Application;

	private resourceHandlers = new Map<string, ResourceHandler>();

	constructor(options: ServerOptions) {
		this.app = options.app ?? express();

		options.schema.validateSchema();
		this.schema = options.schema;

		this.handleRequest = this.handleRequest.bind(this);

		this.app.post(options.endpoint ?? "/dinoql", this.handleRequest);
	}

	addResourceHandler(handler: ResourceHandler) {
		const resource = this.schema.getTypeDefinition(handler.resourceName);
		if (!resource || !(resource instanceof DinoQLResource)) {
			throw new Error(`Resource ${handler.resourceName} not found`);
		}
		for (const [name] of resource.queries) {
			if (
				!handler.hasOwnProperty(name) ||
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
				!handler.hasOwnProperty(name) ||
				// @ts-expect-error The above validates that the key exists
				typeof handler[name] !== "function"
			) {
				throw new Error(
					`Action handler ${name} not found in handler ${handler.resourceName}`
				);
			}
		}
	}

	start(port: number) {
		this.app.listen(port);
	}

	private validateRequest(body: any): body is DinoQLRequest {
		if (!body.resource || typeof body.resource !== "string") return false;
		if (!body.method || typeof body.method !== "string") return false;
		if (!body.params || typeof body.params !== "object") return false;
		return true;
	}

	private handleRequest(req: express.Request, res: express.Response) {
		// Check if the body is valid
		const body = req.body;
		if (!this.validateRequest(body)) {
			res.status(400).send("Invalid request");
			return;
		}
		// Check if the resource exists
		const resource = this.schema.getTypeDefinition(body.resource);
		if (!resource || !(resource instanceof DinoQLResource)) {
			res.status(404).json({
				errors: ["Resource not found"],
			});
			return;
		}
		// Check if the method exists
		const method = resource.getMethod(body.method);
		if (!method) {
			res.status(404).json({
				errors: ["Method not found"],
			});
			return;
		}
		// Check if the params are valid
		const params = method.validateParameters(body.params);
		if (Array.isArray(params)) {
			res.status(400).json({
				errors: params,
			});
			return;
		}
		const handler = this.resourceHandlers.get(body.resource)!;
	}
}
