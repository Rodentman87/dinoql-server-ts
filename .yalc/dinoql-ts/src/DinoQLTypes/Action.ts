import { DinoQLDocument } from "./Document.js";
import { DinoQLParameter } from "./Parameter.js";
import { DinoQLType } from "./Type.js";

export class DinoQLAction {
	constructor(
		public name: string,
		public isStatic: boolean,
		public parameters: DinoQLParameter[],
		public returnType: DinoQLType,
		public docComment: string | null,
		public document: DinoQLDocument
	) {}

	validateSchema() {
		for (const parameter of this.parameters) {
			parameter.validateSchema();
		}
		this.returnType.validateSchema();
	}

	validateParameters(parameters: Record<string, any>) {
		const errors: Record<string, any> = {};
		const valid = this.parameters.every((p: DinoQLParameter) => {
			const value = parameters[p.name];
			if (value === undefined && !p.isOptional)
				errors[p.name] = `Parameter ${p.name} is required`;
			else if (value === undefined) return true;
			const valid = p.type.checkValue(value);
			if (valid !== true) {
				errors[p.name] = valid;
				return false;
			}
			return valid;
		});
		if (!valid) return errors;
		return valid;
	}

	static fromAntlr(ctx: any, document: DinoQLDocument): DinoQLAction {
		const name = ctx.ID().symbol.text;
		const isStatic = ctx.STATIC() !== null;
		const parameters = ctx
			.parameterListDefinition()
			.parameterDefinition()
			.map((p: any) => DinoQLParameter.fromAntlr(p, document));
		const returnType = DinoQLType.fromAntlr(ctx.value(), document);
		const docComment: string | null =
			ctx.DOC_COMMENT() !== null
				? ctx.DOC_COMMENT().symbol.text.slice(2, -2).trim()
				: null;
		return new DinoQLAction(
			name,
			isStatic,
			parameters,
			returnType,
			docComment,
			document
		);
	}
}
