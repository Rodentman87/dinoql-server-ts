// Generated from /home/maisy/repos/dinoql-ts/grammar/dinoql.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class dinoqlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, ID=20, WS=21, OPTIONAL=22;
	public static final int
		RULE_document = 0, RULE_definition = 1, RULE_scalarDefinition = 2, RULE_enumDefinition = 3, 
		RULE_interfaceDefinition = 4, RULE_resourceDefinition = 5, RULE_resourceMember = 6, 
		RULE_fieldDefinition = 7, RULE_queryDefinition = 8, RULE_actionDefinition = 9, 
		RULE_parameterListDefinition = 10, RULE_parameterDefinition = 11, RULE_value = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"document", "definition", "scalarDefinition", "enumDefinition", "interfaceDefinition", 
			"resourceDefinition", "resourceMember", "fieldDefinition", "queryDefinition", 
			"actionDefinition", "parameterListDefinition", "parameterDefinition", 
			"value"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'scalar'", "'enum'", "'{'", "','", "'}'", "'interface'", "'global'", 
			"'resource'", "'#'", "':'", "';'", "'static'", "'query'", "'action'", 
			"'()'", "'('", "')'", "'['", "']'", null, null, "'?'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "ID", "WS", "OPTIONAL"
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
	public String getGrammarFileName() { return "dinoql.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public dinoqlParser(TokenStream input) {
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
			setState(27); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(26);
				definition();
				}
				}
				setState(29); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0) );
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
			setState(35);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(31);
				scalarDefinition();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(32);
				interfaceDefinition();
				}
				break;
			case T__6:
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				setState(33);
				resourceDefinition();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 4);
				{
				setState(34);
				enumDefinition();
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

	public static class ScalarDefinitionContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(dinoqlParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(dinoqlParser.ID, i);
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
			setState(37);
			match(T__0);
			setState(38);
			match(ID);
			setState(39);
			match(ID);
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
		public List<TerminalNode> ID() { return getTokens(dinoqlParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(dinoqlParser.ID, i);
		}
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
			match(T__1);
			setState(42);
			match(ID);
			setState(43);
			match(T__2);
			setState(44);
			match(ID);
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(45);
				match(T__3);
				setState(46);
				match(ID);
				}
				}
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(52);
			match(T__4);
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
		public TerminalNode ID() { return getToken(dinoqlParser.ID, 0); }
		public List<FieldDefinitionContext> fieldDefinition() {
			return getRuleContexts(FieldDefinitionContext.class);
		}
		public FieldDefinitionContext fieldDefinition(int i) {
			return getRuleContext(FieldDefinitionContext.class,i);
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
			setState(54);
			match(T__5);
			setState(55);
			match(ID);
			setState(56);
			match(T__2);
			setState(58); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(57);
				fieldDefinition();
				}
				}
				setState(60); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__8 || _la==ID );
			setState(62);
			match(T__4);
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
		public TerminalNode ID() { return getToken(dinoqlParser.ID, 0); }
		public List<ResourceMemberContext> resourceMember() {
			return getRuleContexts(ResourceMemberContext.class);
		}
		public ResourceMemberContext resourceMember(int i) {
			return getRuleContext(ResourceMemberContext.class,i);
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
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(64);
				match(T__6);
				}
			}

			setState(67);
			match(T__7);
			setState(68);
			match(ID);
			setState(69);
			match(T__2);
			setState(71); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(70);
				resourceMember();
				}
				}
				setState(73); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << ID))) != 0) );
			setState(75);
			match(T__4);
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

	public static class ResourceMemberContext extends ParserRuleContext {
		public FieldDefinitionContext fieldDefinition() {
			return getRuleContext(FieldDefinitionContext.class,0);
		}
		public QueryDefinitionContext queryDefinition() {
			return getRuleContext(QueryDefinitionContext.class,0);
		}
		public ActionDefinitionContext actionDefinition() {
			return getRuleContext(ActionDefinitionContext.class,0);
		}
		public ResourceMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceMember; }
	}

	public final ResourceMemberContext resourceMember() throws RecognitionException {
		ResourceMemberContext _localctx = new ResourceMemberContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_resourceMember);
		try {
			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				fieldDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				queryDefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(79);
				actionDefinition();
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

	public static class FieldDefinitionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(dinoqlParser.ID, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode OPTIONAL() { return getToken(dinoqlParser.OPTIONAL, 0); }
		public FieldDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDefinition; }
	}

	public final FieldDefinitionContext fieldDefinition() throws RecognitionException {
		FieldDefinitionContext _localctx = new FieldDefinitionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_fieldDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(82);
				match(T__8);
				}
			}

			setState(85);
			match(ID);
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPTIONAL) {
				{
				setState(86);
				match(OPTIONAL);
				}
			}

			setState(89);
			match(T__9);
			setState(90);
			value();
			setState(91);
			match(T__10);
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
		public TerminalNode ID() { return getToken(dinoqlParser.ID, 0); }
		public ParameterListDefinitionContext parameterListDefinition() {
			return getRuleContext(ParameterListDefinitionContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public QueryDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryDefinition; }
	}

	public final QueryDefinitionContext queryDefinition() throws RecognitionException {
		QueryDefinitionContext _localctx = new QueryDefinitionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_queryDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(93);
				match(T__11);
				}
			}

			setState(96);
			match(T__12);
			setState(97);
			match(ID);
			setState(98);
			parameterListDefinition();
			setState(99);
			match(T__9);
			setState(100);
			value();
			setState(101);
			match(T__10);
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
		public TerminalNode ID() { return getToken(dinoqlParser.ID, 0); }
		public ParameterListDefinitionContext parameterListDefinition() {
			return getRuleContext(ParameterListDefinitionContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ActionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actionDefinition; }
	}

	public final ActionDefinitionContext actionDefinition() throws RecognitionException {
		ActionDefinitionContext _localctx = new ActionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_actionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(103);
				match(T__11);
				}
			}

			setState(106);
			match(T__13);
			setState(107);
			match(ID);
			setState(108);
			parameterListDefinition();
			setState(109);
			match(T__9);
			setState(110);
			value();
			setState(111);
			match(T__10);
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
		enterRule(_localctx, 20, RULE_parameterListDefinition);
		try {
			int _alt;
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				match(T__14);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				match(T__15);
				setState(115);
				parameterDefinition();
				setState(116);
				match(T__16);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(118);
				match(T__15);
				setState(122); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(119);
						parameterDefinition();
						setState(120);
						match(T__3);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(124); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(126);
				parameterDefinition();
				setState(127);
				match(T__16);
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
		public TerminalNode ID() { return getToken(dinoqlParser.ID, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ParameterDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDefinition; }
	}

	public final ParameterDefinitionContext parameterDefinition() throws RecognitionException {
		ParameterDefinitionContext _localctx = new ParameterDefinitionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_parameterDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(ID);
			setState(132);
			match(T__9);
			setState(133);
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
		public TerminalNode ID() { return getToken(dinoqlParser.ID, 0); }
		public TerminalNode OPTIONAL() { return getToken(dinoqlParser.OPTIONAL, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_value);
		int _la;
		try {
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				match(T__17);
				setState(136);
				match(ID);
				setState(137);
				match(T__18);
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONAL) {
					{
					setState(138);
					match(OPTIONAL);
					}
				}

				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				match(ID);
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONAL) {
					{
					setState(142);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\30\u0096\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\6\2\36\n\2\r\2\16\2\37\3\3\3\3\3\3"+
		"\3\3\5\3&\n\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\7\5\62\n\5\f\5\16"+
		"\5\65\13\5\3\5\3\5\3\6\3\6\3\6\3\6\6\6=\n\6\r\6\16\6>\3\6\3\6\3\7\5\7"+
		"D\n\7\3\7\3\7\3\7\3\7\6\7J\n\7\r\7\16\7K\3\7\3\7\3\b\3\b\3\b\5\bS\n\b"+
		"\3\t\5\tV\n\t\3\t\3\t\5\tZ\n\t\3\t\3\t\3\t\3\t\3\n\5\na\n\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\13\5\13k\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\6\f}\n\f\r\f\16\f~\3\f\3\f\3\f\5"+
		"\f\u0084\n\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\5\16\u008e\n\16\3\16"+
		"\3\16\5\16\u0092\n\16\5\16\u0094\n\16\3\16\2\2\17\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\2\2\2\u009c\2\35\3\2\2\2\4%\3\2\2\2\6\'\3\2\2\2\b+\3\2\2"+
		"\2\n8\3\2\2\2\fC\3\2\2\2\16R\3\2\2\2\20U\3\2\2\2\22`\3\2\2\2\24j\3\2\2"+
		"\2\26\u0083\3\2\2\2\30\u0085\3\2\2\2\32\u0093\3\2\2\2\34\36\5\4\3\2\35"+
		"\34\3\2\2\2\36\37\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 \3\3\2\2\2!&\5\6\4"+
		"\2\"&\5\n\6\2#&\5\f\7\2$&\5\b\5\2%!\3\2\2\2%\"\3\2\2\2%#\3\2\2\2%$\3\2"+
		"\2\2&\5\3\2\2\2\'(\7\3\2\2()\7\26\2\2)*\7\26\2\2*\7\3\2\2\2+,\7\4\2\2"+
		",-\7\26\2\2-.\7\5\2\2.\63\7\26\2\2/\60\7\6\2\2\60\62\7\26\2\2\61/\3\2"+
		"\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\66\3\2\2\2\65\63\3\2"+
		"\2\2\66\67\7\7\2\2\67\t\3\2\2\289\7\b\2\29:\7\26\2\2:<\7\5\2\2;=\5\20"+
		"\t\2<;\3\2\2\2=>\3\2\2\2><\3\2\2\2>?\3\2\2\2?@\3\2\2\2@A\7\7\2\2A\13\3"+
		"\2\2\2BD\7\t\2\2CB\3\2\2\2CD\3\2\2\2DE\3\2\2\2EF\7\n\2\2FG\7\26\2\2GI"+
		"\7\5\2\2HJ\5\16\b\2IH\3\2\2\2JK\3\2\2\2KI\3\2\2\2KL\3\2\2\2LM\3\2\2\2"+
		"MN\7\7\2\2N\r\3\2\2\2OS\5\20\t\2PS\5\22\n\2QS\5\24\13\2RO\3\2\2\2RP\3"+
		"\2\2\2RQ\3\2\2\2S\17\3\2\2\2TV\7\13\2\2UT\3\2\2\2UV\3\2\2\2VW\3\2\2\2"+
		"WY\7\26\2\2XZ\7\30\2\2YX\3\2\2\2YZ\3\2\2\2Z[\3\2\2\2[\\\7\f\2\2\\]\5\32"+
		"\16\2]^\7\r\2\2^\21\3\2\2\2_a\7\16\2\2`_\3\2\2\2`a\3\2\2\2ab\3\2\2\2b"+
		"c\7\17\2\2cd\7\26\2\2de\5\26\f\2ef\7\f\2\2fg\5\32\16\2gh\7\r\2\2h\23\3"+
		"\2\2\2ik\7\16\2\2ji\3\2\2\2jk\3\2\2\2kl\3\2\2\2lm\7\20\2\2mn\7\26\2\2"+
		"no\5\26\f\2op\7\f\2\2pq\5\32\16\2qr\7\r\2\2r\25\3\2\2\2s\u0084\7\21\2"+
		"\2tu\7\22\2\2uv\5\30\r\2vw\7\23\2\2w\u0084\3\2\2\2x|\7\22\2\2yz\5\30\r"+
		"\2z{\7\6\2\2{}\3\2\2\2|y\3\2\2\2}~\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177"+
		"\u0080\3\2\2\2\u0080\u0081\5\30\r\2\u0081\u0082\7\23\2\2\u0082\u0084\3"+
		"\2\2\2\u0083s\3\2\2\2\u0083t\3\2\2\2\u0083x\3\2\2\2\u0084\27\3\2\2\2\u0085"+
		"\u0086\7\26\2\2\u0086\u0087\7\f\2\2\u0087\u0088\5\32\16\2\u0088\31\3\2"+
		"\2\2\u0089\u008a\7\24\2\2\u008a\u008b\7\26\2\2\u008b\u008d\7\25\2\2\u008c"+
		"\u008e\7\30\2\2\u008d\u008c\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0094\3"+
		"\2\2\2\u008f\u0091\7\26\2\2\u0090\u0092\7\30\2\2\u0091\u0090\3\2\2\2\u0091"+
		"\u0092\3\2\2\2\u0092\u0094\3\2\2\2\u0093\u0089\3\2\2\2\u0093\u008f\3\2"+
		"\2\2\u0094\33\3\2\2\2\22\37%\63>CKRUY`j~\u0083\u008d\u0091\u0093";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}