// Generated from /home/maisy/repos/dinoql-ts/grammar/DinoQL.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DinoQLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, STATIC=15, ID=16, WS=17, 
		OPTIONAL=18, IDENTIFIER=19, ARRAY_START=20, ARRAY_END=21, DOC_START=22, 
		DOC_COMMENT=23, DOC_END=24;
	public static final int
		RULE_document = 0, RULE_definition = 1, RULE_scalarDefinition = 2, RULE_enumDefinition = 3, 
		RULE_interfaceDefinition = 4, RULE_resourceDefinition = 5, RULE_propertyDefinition = 6, 
		RULE_queryDefinition = 7, RULE_actionDefinition = 8, RULE_parameterListDefinition = 9, 
		RULE_parameterDefinition = 10, RULE_value = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"document", "definition", "scalarDefinition", "enumDefinition", "interfaceDefinition", 
			"resourceDefinition", "propertyDefinition", "queryDefinition", "actionDefinition", 
			"parameterListDefinition", "parameterDefinition", "value"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'scalar'", "';'", "'enum'", "'{'", "','", "'}'", "'interface'", 
			"'resource'", "':'", "'query'", "'action'", "'()'", "'('", "')'", "'static'", 
			null, null, "'?'", "'#'", "'['", "']'", "'/*'", null, "'*/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "STATIC", "ID", "WS", "OPTIONAL", "IDENTIFIER", "ARRAY_START", 
			"ARRAY_END", "DOC_START", "DOC_COMMENT", "DOC_END"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "DinoQL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DinoQLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class DocumentContext extends ParserRuleContext {
		public List<DefinitionContext> definition() {
			return getRuleContexts(DefinitionContext.class);
		}
		public DefinitionContext definition(int i) {
			return getRuleContext(DefinitionContext.class,i);
		}
		public DocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_document; }
	}

	public final DocumentContext document() throws RecognitionException {
		DocumentContext _localctx = new DocumentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_document);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(24);
				definition();
				}
				}
				setState(27); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__6) | (1L << T__7) | (1L << STATIC) | (1L << DOC_COMMENT))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefinitionContext extends ParserRuleContext {
		public ScalarDefinitionContext scalarDefinition() {
			return getRuleContext(ScalarDefinitionContext.class,0);
		}
		public InterfaceDefinitionContext interfaceDefinition() {
			return getRuleContext(InterfaceDefinitionContext.class,0);
		}
		public ResourceDefinitionContext resourceDefinition() {
			return getRuleContext(ResourceDefinitionContext.class,0);
		}
		public EnumDefinitionContext enumDefinition() {
			return getRuleContext(EnumDefinitionContext.class,0);
		}
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_definition);
		try {
			setState(33);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				scalarDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(30);
				interfaceDefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(31);
				resourceDefinition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(32);
				enumDefinition();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScalarDefinitionContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(DinoQLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DinoQLParser.ID, i);
		}
		public ScalarDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scalarDefinition; }
	}

	public final ScalarDefinitionContext scalarDefinition() throws RecognitionException {
		ScalarDefinitionContext _localctx = new ScalarDefinitionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_scalarDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(T__0);
			setState(36);
			match(ID);
			setState(37);
			match(ID);
			setState(38);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumDefinitionContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(DinoQLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DinoQLParser.ID, i);
		}
		public TerminalNode DOC_COMMENT() { return getToken(DinoQLParser.DOC_COMMENT, 0); }
		public EnumDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDefinition; }
	}

	public final EnumDefinitionContext enumDefinition() throws RecognitionException {
		EnumDefinitionContext _localctx = new EnumDefinitionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_enumDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOC_COMMENT) {
				{
				setState(40);
				match(DOC_COMMENT);
				}
			}

			setState(43);
			match(T__2);
			setState(44);
			match(ID);
			setState(45);
			match(T__3);
			setState(46);
			match(ID);
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(47);
				match(T__4);
				setState(48);
				match(ID);
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(54);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceDefinitionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DinoQLParser.ID, 0); }
		public TerminalNode DOC_COMMENT() { return getToken(DinoQLParser.DOC_COMMENT, 0); }
		public List<PropertyDefinitionContext> propertyDefinition() {
			return getRuleContexts(PropertyDefinitionContext.class);
		}
		public PropertyDefinitionContext propertyDefinition(int i) {
			return getRuleContext(PropertyDefinitionContext.class,i);
		}
		public InterfaceDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDefinition; }
	}

	public final InterfaceDefinitionContext interfaceDefinition() throws RecognitionException {
		InterfaceDefinitionContext _localctx = new InterfaceDefinitionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_interfaceDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOC_COMMENT) {
				{
				setState(56);
				match(DOC_COMMENT);
				}
			}

			setState(59);
			match(T__6);
			setState(60);
			match(ID);
			setState(61);
			match(T__3);
			setState(63); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(62);
				propertyDefinition();
				}
				}
				setState(65); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << IDENTIFIER) | (1L << DOC_COMMENT))) != 0) );
			setState(67);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceDefinitionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DinoQLParser.ID, 0); }
		public TerminalNode DOC_COMMENT() { return getToken(DinoQLParser.DOC_COMMENT, 0); }
		public TerminalNode STATIC() { return getToken(DinoQLParser.STATIC, 0); }
		public List<PropertyDefinitionContext> propertyDefinition() {
			return getRuleContexts(PropertyDefinitionContext.class);
		}
		public PropertyDefinitionContext propertyDefinition(int i) {
			return getRuleContext(PropertyDefinitionContext.class,i);
		}
		public List<QueryDefinitionContext> queryDefinition() {
			return getRuleContexts(QueryDefinitionContext.class);
		}
		public QueryDefinitionContext queryDefinition(int i) {
			return getRuleContext(QueryDefinitionContext.class,i);
		}
		public List<ActionDefinitionContext> actionDefinition() {
			return getRuleContexts(ActionDefinitionContext.class);
		}
		public ActionDefinitionContext actionDefinition(int i) {
			return getRuleContext(ActionDefinitionContext.class,i);
		}
		public ResourceDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceDefinition; }
	}

	public final ResourceDefinitionContext resourceDefinition() throws RecognitionException {
		ResourceDefinitionContext _localctx = new ResourceDefinitionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_resourceDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOC_COMMENT) {
				{
				setState(69);
				match(DOC_COMMENT);
				}
			}

			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(72);
				match(STATIC);
				}
			}

			setState(75);
			match(T__7);
			setState(76);
			match(ID);
			setState(77);
			match(T__3);
			setState(81); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(81);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(78);
					propertyDefinition();
					}
					break;
				case 2:
					{
					setState(79);
					queryDefinition();
					}
					break;
				case 3:
					{
					setState(80);
					actionDefinition();
					}
					break;
				}
				}
				setState(83); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << STATIC) | (1L << ID) | (1L << IDENTIFIER) | (1L << DOC_COMMENT))) != 0) );
			setState(85);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyDefinitionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DinoQLParser.ID, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode DOC_COMMENT() { return getToken(DinoQLParser.DOC_COMMENT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(DinoQLParser.IDENTIFIER, 0); }
		public TerminalNode OPTIONAL() { return getToken(DinoQLParser.OPTIONAL, 0); }
		public PropertyDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyDefinition; }
	}

	public final PropertyDefinitionContext propertyDefinition() throws RecognitionException {
		PropertyDefinitionContext _localctx = new PropertyDefinitionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_propertyDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOC_COMMENT) {
				{
				setState(87);
				match(DOC_COMMENT);
				}
			}

			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(90);
				match(IDENTIFIER);
				}
			}

			setState(93);
			match(ID);
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPTIONAL) {
				{
				setState(94);
				match(OPTIONAL);
				}
			}

			setState(97);
			match(T__8);
			setState(98);
			value();
			setState(99);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryDefinitionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DinoQLParser.ID, 0); }
		public ParameterListDefinitionContext parameterListDefinition() {
			return getRuleContext(ParameterListDefinitionContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode DOC_COMMENT() { return getToken(DinoQLParser.DOC_COMMENT, 0); }
		public TerminalNode STATIC() { return getToken(DinoQLParser.STATIC, 0); }
		public QueryDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryDefinition; }
	}

	public final QueryDefinitionContext queryDefinition() throws RecognitionException {
		QueryDefinitionContext _localctx = new QueryDefinitionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_queryDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOC_COMMENT) {
				{
				setState(101);
				match(DOC_COMMENT);
				}
			}

			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(104);
				match(STATIC);
				}
			}

			setState(107);
			match(T__9);
			setState(108);
			match(ID);
			setState(109);
			parameterListDefinition();
			setState(110);
			match(T__8);
			setState(111);
			value();
			setState(112);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ActionDefinitionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DinoQLParser.ID, 0); }
		public ParameterListDefinitionContext parameterListDefinition() {
			return getRuleContext(ParameterListDefinitionContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode DOC_COMMENT() { return getToken(DinoQLParser.DOC_COMMENT, 0); }
		public TerminalNode STATIC() { return getToken(DinoQLParser.STATIC, 0); }
		public ActionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actionDefinition; }
	}

	public final ActionDefinitionContext actionDefinition() throws RecognitionException {
		ActionDefinitionContext _localctx = new ActionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_actionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOC_COMMENT) {
				{
				setState(114);
				match(DOC_COMMENT);
				}
			}

			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(117);
				match(STATIC);
				}
			}

			setState(120);
			match(T__10);
			setState(121);
			match(ID);
			setState(122);
			parameterListDefinition();
			setState(123);
			match(T__8);
			setState(124);
			value();
			setState(125);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterListDefinitionContext extends ParserRuleContext {
		public List<ParameterDefinitionContext> parameterDefinition() {
			return getRuleContexts(ParameterDefinitionContext.class);
		}
		public ParameterDefinitionContext parameterDefinition(int i) {
			return getRuleContext(ParameterDefinitionContext.class,i);
		}
		public ParameterListDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterListDefinition; }
	}

	public final ParameterListDefinitionContext parameterListDefinition() throws RecognitionException {
		ParameterListDefinitionContext _localctx = new ParameterListDefinitionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_parameterListDefinition);
		try {
			int _alt;
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				match(T__11);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				match(T__12);
				setState(129);
				parameterDefinition();
				setState(130);
				match(T__13);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(132);
				match(T__12);
				setState(136); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(133);
						parameterDefinition();
						setState(134);
						match(T__4);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(138); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(140);
				parameterDefinition();
				setState(141);
				match(T__13);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterDefinitionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DinoQLParser.ID, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode DOC_COMMENT() { return getToken(DinoQLParser.DOC_COMMENT, 0); }
		public TerminalNode OPTIONAL() { return getToken(DinoQLParser.OPTIONAL, 0); }
		public ParameterDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDefinition; }
	}

	public final ParameterDefinitionContext parameterDefinition() throws RecognitionException {
		ParameterDefinitionContext _localctx = new ParameterDefinitionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_parameterDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOC_COMMENT) {
				{
				setState(145);
				match(DOC_COMMENT);
				}
			}

			setState(148);
			match(ID);
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPTIONAL) {
				{
				setState(149);
				match(OPTIONAL);
				}
			}

			setState(152);
			match(T__8);
			setState(153);
			value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode ARRAY_START() { return getToken(DinoQLParser.ARRAY_START, 0); }
		public TerminalNode ID() { return getToken(DinoQLParser.ID, 0); }
		public TerminalNode ARRAY_END() { return getToken(DinoQLParser.ARRAY_END, 0); }
		public TerminalNode OPTIONAL() { return getToken(DinoQLParser.OPTIONAL, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_value);
		int _la;
		try {
			setState(165);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ARRAY_START:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				match(ARRAY_START);
				setState(156);
				match(ID);
				setState(157);
				match(ARRAY_END);
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONAL) {
					{
					setState(158);
					match(OPTIONAL);
					}
				}

				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				match(ID);
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONAL) {
					{
					setState(162);
					match(OPTIONAL);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\32\u00aa\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\3\2\6\2\34\n\2\r\2\16\2\35\3\3\3\3\3\3\3\3\5\3$"+
		"\n\3\3\4\3\4\3\4\3\4\3\4\3\5\5\5,\n\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\64\n"+
		"\5\f\5\16\5\67\13\5\3\5\3\5\3\6\5\6<\n\6\3\6\3\6\3\6\3\6\6\6B\n\6\r\6"+
		"\16\6C\3\6\3\6\3\7\5\7I\n\7\3\7\5\7L\n\7\3\7\3\7\3\7\3\7\3\7\3\7\6\7T"+
		"\n\7\r\7\16\7U\3\7\3\7\3\b\5\b[\n\b\3\b\5\b^\n\b\3\b\3\b\5\bb\n\b\3\b"+
		"\3\b\3\b\3\b\3\t\5\ti\n\t\3\t\5\tl\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n"+
		"\5\nv\n\n\3\n\5\ny\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\6\13\u008b\n\13\r\13\16\13\u008c\3\13\3\13\3"+
		"\13\5\13\u0092\n\13\3\f\5\f\u0095\n\f\3\f\3\f\5\f\u0099\n\f\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\5\r\u00a2\n\r\3\r\3\r\5\r\u00a6\n\r\5\r\u00a8\n\r\3"+
		"\r\2\2\16\2\4\6\b\n\f\16\20\22\24\26\30\2\2\2\u00b9\2\33\3\2\2\2\4#\3"+
		"\2\2\2\6%\3\2\2\2\b+\3\2\2\2\n;\3\2\2\2\fH\3\2\2\2\16Z\3\2\2\2\20h\3\2"+
		"\2\2\22u\3\2\2\2\24\u0091\3\2\2\2\26\u0094\3\2\2\2\30\u00a7\3\2\2\2\32"+
		"\34\5\4\3\2\33\32\3\2\2\2\34\35\3\2\2\2\35\33\3\2\2\2\35\36\3\2\2\2\36"+
		"\3\3\2\2\2\37$\5\6\4\2 $\5\n\6\2!$\5\f\7\2\"$\5\b\5\2#\37\3\2\2\2# \3"+
		"\2\2\2#!\3\2\2\2#\"\3\2\2\2$\5\3\2\2\2%&\7\3\2\2&\'\7\22\2\2\'(\7\22\2"+
		"\2()\7\4\2\2)\7\3\2\2\2*,\7\31\2\2+*\3\2\2\2+,\3\2\2\2,-\3\2\2\2-.\7\5"+
		"\2\2./\7\22\2\2/\60\7\6\2\2\60\65\7\22\2\2\61\62\7\7\2\2\62\64\7\22\2"+
		"\2\63\61\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\668\3\2\2\2"+
		"\67\65\3\2\2\289\7\b\2\29\t\3\2\2\2:<\7\31\2\2;:\3\2\2\2;<\3\2\2\2<=\3"+
		"\2\2\2=>\7\t\2\2>?\7\22\2\2?A\7\6\2\2@B\5\16\b\2A@\3\2\2\2BC\3\2\2\2C"+
		"A\3\2\2\2CD\3\2\2\2DE\3\2\2\2EF\7\b\2\2F\13\3\2\2\2GI\7\31\2\2HG\3\2\2"+
		"\2HI\3\2\2\2IK\3\2\2\2JL\7\21\2\2KJ\3\2\2\2KL\3\2\2\2LM\3\2\2\2MN\7\n"+
		"\2\2NO\7\22\2\2OS\7\6\2\2PT\5\16\b\2QT\5\20\t\2RT\5\22\n\2SP\3\2\2\2S"+
		"Q\3\2\2\2SR\3\2\2\2TU\3\2\2\2US\3\2\2\2UV\3\2\2\2VW\3\2\2\2WX\7\b\2\2"+
		"X\r\3\2\2\2Y[\7\31\2\2ZY\3\2\2\2Z[\3\2\2\2[]\3\2\2\2\\^\7\25\2\2]\\\3"+
		"\2\2\2]^\3\2\2\2^_\3\2\2\2_a\7\22\2\2`b\7\24\2\2a`\3\2\2\2ab\3\2\2\2b"+
		"c\3\2\2\2cd\7\13\2\2de\5\30\r\2ef\7\4\2\2f\17\3\2\2\2gi\7\31\2\2hg\3\2"+
		"\2\2hi\3\2\2\2ik\3\2\2\2jl\7\21\2\2kj\3\2\2\2kl\3\2\2\2lm\3\2\2\2mn\7"+
		"\f\2\2no\7\22\2\2op\5\24\13\2pq\7\13\2\2qr\5\30\r\2rs\7\4\2\2s\21\3\2"+
		"\2\2tv\7\31\2\2ut\3\2\2\2uv\3\2\2\2vx\3\2\2\2wy\7\21\2\2xw\3\2\2\2xy\3"+
		"\2\2\2yz\3\2\2\2z{\7\r\2\2{|\7\22\2\2|}\5\24\13\2}~\7\13\2\2~\177\5\30"+
		"\r\2\177\u0080\7\4\2\2\u0080\23\3\2\2\2\u0081\u0092\7\16\2\2\u0082\u0083"+
		"\7\17\2\2\u0083\u0084\5\26\f\2\u0084\u0085\7\20\2\2\u0085\u0092\3\2\2"+
		"\2\u0086\u008a\7\17\2\2\u0087\u0088\5\26\f\2\u0088\u0089\7\7\2\2\u0089"+
		"\u008b\3\2\2\2\u008a\u0087\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008a\3\2"+
		"\2\2\u008c\u008d\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\5\26\f\2\u008f"+
		"\u0090\7\20\2\2\u0090\u0092\3\2\2\2\u0091\u0081\3\2\2\2\u0091\u0082\3"+
		"\2\2\2\u0091\u0086\3\2\2\2\u0092\25\3\2\2\2\u0093\u0095\7\31\2\2\u0094"+
		"\u0093\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0098\7\22"+
		"\2\2\u0097\u0099\7\24\2\2\u0098\u0097\3\2\2\2\u0098\u0099\3\2\2\2\u0099"+
		"\u009a\3\2\2\2\u009a\u009b\7\13\2\2\u009b\u009c\5\30\r\2\u009c\27\3\2"+
		"\2\2\u009d\u009e\7\26\2\2\u009e\u009f\7\22\2\2\u009f\u00a1\7\27\2\2\u00a0"+
		"\u00a2\7\24\2\2\u00a1\u00a0\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a8\3"+
		"\2\2\2\u00a3\u00a5\7\22\2\2\u00a4\u00a6\7\24\2\2\u00a5\u00a4\3\2\2\2\u00a5"+
		"\u00a6\3\2\2\2\u00a6\u00a8\3\2\2\2\u00a7\u009d\3\2\2\2\u00a7\u00a3\3\2"+
		"\2\2\u00a8\31\3\2\2\2\32\35#+\65;CHKSUZ]ahkux\u008c\u0091\u0094\u0098"+
		"\u00a1\u00a5\u00a7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}