import antlr4 from "antlr4";
import { DinoQLAction } from "./DinoQLTypes/Action.js";
import { DinoQLDocument } from "./DinoQLTypes/Document.js";
import { DinoQLEnum } from "./DinoQLTypes/Enum.js";
import { DinoQLInterface } from "./DinoQLTypes/Interface.js";
import { DinoQLProperty } from "./DinoQLTypes/Property.js";
import { DinoQLQuery } from "./DinoQLTypes/Query.js";
import { DinoQLResource } from "./DinoQLTypes/Resource.js";
import { DinoQLScalar } from "./DinoQLTypes/Scalar.js";
import DinoQLLexer from "./grammar/DinoQLLexer.js";
import DinoQLListener from "./grammar/DinoQLListener.js";
import DinoQLParser from "./grammar/DinoQLParser.js";

class MyCustomListener extends DinoQLListener {
	document: DinoQLDocument;

	constructor() {
		super();
		this.document = new DinoQLDocument([]);
	}

	enterScalarDefinition(ctx: any): void {
		const identifiers = ctx.ID();
		const scalarNameToken = identifiers.shift();
		const fallbackToken = identifiers.shift();
		if (!scalarNameToken) {
			throw new Error(
				`Scalar name is missing expected at ${scalarNameToken.symbol.line}:${scalarNameToken.symbol.column}`
			);
		}
		if (!fallbackToken) {
			throw new Error(
				`Fallback is missing expected at ${fallbackToken.symbol.line}:${fallbackToken.symbol.column}`
			);
		}
		const scalarObject = new DinoQLScalar(
			scalarNameToken.symbol.text,
			fallbackToken.symbol.text,
			this.document
		);
		this.document.addDefinition(scalarObject);
	}

	enterEnumDefinition(ctx: any): void {
		const identifiers = ctx.ID();
		const enumNameToken = identifiers.shift();
		if (!enumNameToken) {
			throw new Error(
				`Enum name is missing expected at ${enumNameToken.symbol.line}:${enumNameToken.symbol.column}`
			);
		}
		const values = identifiers.map((i: any) => i.symbol.text);
		const docComment: string | null =
			ctx.DOC_COMMENT() !== null
				? ctx.DOC_COMMENT().symbol.text.slice(2, -2).trim()
				: null;
		const enumObject = new DinoQLEnum(
			enumNameToken.symbol.text,
			values,
			docComment,
			this.document
		);
		this.document.addDefinition(enumObject);
	}

	enterInterfaceDefinition(ctx: any): void {
		const interfaceNameToken = ctx.ID();
		const properties = ctx
			.propertyDefinition()
			.map((f: any) => DinoQLProperty.fromAntlr(f, this.document));
		const docComment: string | null =
			ctx.DOC_COMMENT() !== null
				? ctx.DOC_COMMENT().symbol.text.slice(2, -2).trim()
				: null;
		const interfaceObject = new DinoQLInterface(
			interfaceNameToken.symbol.text,
			properties,
			docComment,
			this.document
		);
		this.document.addDefinition(interfaceObject);
	}

	enterResourceDefinition(ctx: any): void {
		const resourceNameToken = ctx.ID();
		const isStatic = ctx.STATIC() !== null;
		const properties = ctx
			.propertyDefinition()
			.map((f: any) => DinoQLProperty.fromAntlr(f, this.document));
		const queries = ctx
			.queryDefinition()
			.map((q: any) => DinoQLQuery.fromAntlr(q, this.document));
		const actions = ctx
			.actionDefinition()
			.map((a: any) => DinoQLAction.fromAntlr(a, this.document));
		const docComment: string | null =
			ctx.DOC_COMMENT() !== null
				? ctx.DOC_COMMENT().symbol.text.slice(2, -2).trim()
				: null;
		const resourceObject = new DinoQLResource(
			resourceNameToken.symbol.text,
			isStatic,
			properties,
			queries,
			actions,
			docComment,
			this.document
		);
		this.document.addDefinition(resourceObject);
	}
}

export function parseDocument(doc: string): DinoQLDocument {
	const chars = new antlr4.InputStream(doc);
	const lexer = new DinoQLLexer(chars);
	const tokens = new antlr4.CommonTokenStream(lexer);
	const parser = new DinoQLParser(tokens);
	// @ts-expect-error It does exist, I just don't want to spend the time typing this
	parser.buildParseTrees = true;
	const tree = parser.document();

	const listener = new MyCustomListener();
	antlr4.tree.ParseTreeWalker.DEFAULT.walk(listener, tree);
	listener.document.validateSchema();
	return listener.document;
}
