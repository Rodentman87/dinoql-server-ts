import { DinoQLDocument } from "./Document.js";
import { DinoQLType } from "./Type.js";

export class DinoQLProperty {
	constructor(
		public name: string,
		public type: DinoQLType,
		public isId: boolean,
		public isOptional: boolean,
		public docComment: string | null,
		public document: DinoQLDocument
	) {}

	validateSchema() {
		this.type.validateSchema();
	}

	static fromAntlr(ctx: any, document: DinoQLDocument): DinoQLProperty {
		const name = ctx.ID().symbol.text;
		const optional = ctx.OPTIONAL() !== null;
		const isId = ctx.IDENTIFIER() !== null;
		const type = DinoQLType.fromAntlr(ctx.value(), document);
		const docComment: string | null =
			ctx.DOC_COMMENT() !== null
				? ctx.DOC_COMMENT().symbol.text.slice(2, -2).trim()
				: null;
		return new DinoQLProperty(name, type, isId, optional, docComment, document);
	}
}
