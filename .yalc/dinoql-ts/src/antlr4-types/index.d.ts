// Making my own types for the antlr4 library because the existing ones are out of date.
// I'll probably contribute these at some point. Or maybe see if I can fork the library and make it TS.
declare module "antlr4" {
	export default {
		atn: {
			ATNDeserializer,
			LexerATNSimulator,
		},
		dfa: {
			DFA,
		},
		tree: {
			ParseTreeListener,
			ParseTreeWalker,
		},
		Lexer,
		InputStream,
		PredictionContextCache,
		Token,
		CommonTokenStream,
	};

	declare class ParseTreeWalker {
		static DEFAULT: ParseTreeWalker;
		walk(listener: any, tree: any): void;
	}

	declare class CommonTokenStream {
		constructor(lexer: Lexer);
		readonly tokens: Token[];
		readonly index: number;
		readonly size: number;
		LA(i: number): number;
	}

	declare class ParseTreeListener {
		visitTerminal(node);

		visitErrorNode(node);

		enterEveryRule(node);

		exitEveryRule(node);
	}

	declare class Token {
		static INVALID_TYPE: number;
		static EPSILON: number;
		static MIN_USER_TOKEN_TYPE: number;
		static EOF: number;
		static DEFAULT_CHANNEL: number;
		static HIDDEN_CHANNEL: number;
	}

	declare class Lexer {
		constructor(input: antlr4.InputStream);
	}

	declare class InputStream {
		constructor(input: string);
	}

	declare class DFA {
		atnStartState: number;
		decision: number;

		constructor(atnStartState: number, decision?: number);
	}

	declare class PredictionContextCache {
		constructor();
	}

	declare class LexerATNSimulator {
		constructor(
			recog: Lexer,
			atn: ATN,
			decisionToDFA: DFA[],
			sharedContextCache: PredictionContextCache
		);
	}

	declare class ATNDeserializer {
		deserializationOptions;
		stateFactories: null;
		actionFactories: null;

		constructor(options?: {
			verifyATN: boolean;
			generateRuleBypassTransitions: boolean;
		});

		deserialize(data: number[]): ATN;
		reset(data: number[]): boolean;
		skipUUID(): void;
		checkVersion(legacy: boolean): void;
		readATN(): void;
		readStates(atn, legacy: boolean): void;
		readRules(atn, legacy: boolean): void;
		readModes(atn): void;
		readSets(atn, sets: any[], reader: () => number): void;
		readEdges(atn, sets: any[]): void;
		readDecisions(atn): void;
		readLexerActions(atn, legacy: boolean): void;
		generateRuleBypassTransitions(atn): void;
		generateRuleBypassTransition(atn, idx: number): void;
	}

	declare class ATN {
		grammarType: number;
		maxTokenType: number;
		states: any[];
		decisionToState: any[];
		ruleToStartState: any[];
		ruleToStopState: boolean;
		modeNameToStartState: any;
		ruleToTokenType: null;
		lexerActions: null;
		modeToStartState: any[];

		constructor(grammarType: number, maxTokenType: number);

		nextTokensInContext(s, ctx): IntervalSet;
		nextTokensNoContext(s): IntervalSet;
	}

	declare class IntervalSet {
		intervals: null | Interval[];
		readOnly: boolean;

		constructor();
		first(): number;
		addOne(v: number): void;
		addRange(l: number, h: number): void;
		addInterval(toAdd: Interval): void;
		addSet(other: IntervalSet): this;
		reduce(pos: number): void;
		complement(start: number, stop: number): IntervalSet;
		contains(item: number): boolean;
		removeRange(toRemove: Interval): void;
		removeOne(value: number): void;
		toString(literalNames, symbolicNames, elemsAreChar): string;
		toCharString(): string;
		toIndexString(): string;
		toTokenString(literalNames, symbolicNames): string;
		elementName(literalNames, symbolicNames, token): string;
		get length(): number;
	}

	declare class Interval {
		start: number;
		stop: number;

		static INVALID_INTERVAL: Interval;

		constructor(start: number, stop: number);
		clone(): Interval;
		contains(item: number);
		toString(): string;
		get length(): number;
	}
}
