// Generated from c:\Users\warne\Desktop\backendCompiler\miParser.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class miParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PyCOMA=1, PIZQ=2, PDER=3, KEYDER=4, KEYIZQ=5, ASSIGN=6, COMA=7, UNDERS=8, 
		PCIZQ=9, PCDER=10, PUNTO=11, COMI=12, ROPERATOR=13, STYPE=14, AOP=15, 
		MOP=16, UNARY=17, IF=18, ELSE=19, WHILE=20, RETURN=21, PRINT=22, CLASS=23, 
		NEW=24, LENGTH=25, INTLITERAL=26, REALLITERAL=27, BOOLITERAL=28, STRINGLITERAL=29, 
		ID=30, WS=31;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_block = 2, RULE_funtionDeclaration = 3, 
		RULE_formalParams = 4, RULE_formalParam = 5, RULE_whileStatement = 6, 
		RULE_ifStatement = 7, RULE_returnStatement = 8, RULE_printStatement = 9, 
		RULE_classDeclaration = 10, RULE_classVariableDeclaration = 11, RULE_variableDeclaration = 12, 
		RULE_type = 13, RULE_arrayType = 14, RULE_assigment = 15, RULE_arrayAssignment = 16, 
		RULE_expression = 17, RULE_simpleExpression = 18, RULE_term = 19, RULE_factor = 20, 
		RULE_unary = 21, RULE_allocationExpression = 22, RULE_arrayAllocationExpression = 23, 
		RULE_subExpression = 24, RULE_funtionCall = 25, RULE_actualParams = 26, 
		RULE_arrayLookup = 27, RULE_arrayLength = 28, RULE_literal = 29;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "block", "funtionDeclaration", "formalParams", 
			"formalParam", "whileStatement", "ifStatement", "returnStatement", "printStatement", 
			"classDeclaration", "classVariableDeclaration", "variableDeclaration", 
			"type", "arrayType", "assigment", "arrayAssignment", "expression", "simpleExpression", 
			"term", "factor", "unary", "allocationExpression", "arrayAllocationExpression", 
			"subExpression", "funtionCall", "actualParams", "arrayLookup", "arrayLength", 
			"literal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'('", "')'", "'}'", "'{'", "'='", "','", "'_'", "'['", 
			"']'", "'.'", "'\"'", null, null, null, null, null, "'if'", "'else'", 
			"'while'", "'return'", "'print'", "'class'", "'new'", "'length'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PyCOMA", "PIZQ", "PDER", "KEYDER", "KEYIZQ", "ASSIGN", "COMA", 
			"UNDERS", "PCIZQ", "PCDER", "PUNTO", "COMI", "ROPERATOR", "STYPE", "AOP", 
			"MOP", "UNARY", "IF", "ELSE", "WHILE", "RETURN", "PRINT", "CLASS", "NEW", 
			"LENGTH", "INTLITERAL", "REALLITERAL", "BOOLITERAL", "STRINGLITERAL", 
			"ID", "WS"
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
	public String getGrammarFileName() { return "miParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public miParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYIZQ) | (1L << STYPE) | (1L << IF) | (1L << WHILE) | (1L << RETURN) | (1L << PRINT) | (1L << CLASS) | (1L << ID))) != 0)) {
				{
				{
				setState(60);
				statement();
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class StatementContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public TerminalNode PyCOMA() { return getToken(miParser.PyCOMA, 0); }
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public AssigmentContext assigment() {
			return getRuleContext(AssigmentContext.class,0);
		}
		public ArrayAssignmentContext arrayAssignment() {
			return getRuleContext(ArrayAssignmentContext.class,0);
		}
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public FuntionDeclarationContext funtionDeclaration() {
			return getRuleContext(FuntionDeclarationContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				variableDeclaration();
				setState(67);
				match(PyCOMA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				classDeclaration();
				setState(70);
				match(PyCOMA);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(72);
				assigment();
				setState(73);
				match(PyCOMA);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(75);
				arrayAssignment();
				setState(76);
				match(PyCOMA);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(78);
				printStatement();
				setState(79);
				match(PyCOMA);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(81);
				ifStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(82);
				whileStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(83);
				returnStatement();
				setState(84);
				match(PyCOMA);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(86);
				funtionDeclaration();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(87);
				block();
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode KEYIZQ() { return getToken(miParser.KEYIZQ, 0); }
		public TerminalNode KEYDER() { return getToken(miParser.KEYDER, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(KEYIZQ);
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYIZQ) | (1L << STYPE) | (1L << IF) | (1L << WHILE) | (1L << RETURN) | (1L << PRINT) | (1L << CLASS) | (1L << ID))) != 0)) {
				{
				{
				setState(91);
				statement();
				}
				}
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(97);
			match(KEYDER);
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

	public static class FuntionDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(miParser.ID, 0); }
		public TerminalNode PIZQ() { return getToken(miParser.PIZQ, 0); }
		public TerminalNode PDER() { return getToken(miParser.PDER, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FormalParamsContext formalParams() {
			return getRuleContext(FormalParamsContext.class,0);
		}
		public FuntionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funtionDeclaration; }
	}

	public final FuntionDeclarationContext funtionDeclaration() throws RecognitionException {
		FuntionDeclarationContext _localctx = new FuntionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_funtionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			type();
			setState(100);
			match(ID);
			setState(101);
			match(PIZQ);
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STYPE || _la==ID) {
				{
				setState(102);
				formalParams();
				}
			}

			setState(105);
			match(PDER);
			setState(106);
			block();
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

	public static class FormalParamsContext extends ParserRuleContext {
		public List<FormalParamContext> formalParam() {
			return getRuleContexts(FormalParamContext.class);
		}
		public FormalParamContext formalParam(int i) {
			return getRuleContext(FormalParamContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(miParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(miParser.COMA, i);
		}
		public FormalParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParams; }
	}

	public final FormalParamsContext formalParams() throws RecognitionException {
		FormalParamsContext _localctx = new FormalParamsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_formalParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			formalParam();
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(109);
				match(COMA);
				setState(110);
				formalParam();
				}
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class FormalParamContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(miParser.ID, 0); }
		public FormalParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParam; }
	}

	public final FormalParamContext formalParam() throws RecognitionException {
		FormalParamContext _localctx = new FormalParamContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_formalParam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			type();
			setState(117);
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

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(miParser.WHILE, 0); }
		public TerminalNode PIZQ() { return getToken(miParser.PIZQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PDER() { return getToken(miParser.PDER, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(WHILE);
			setState(120);
			match(PIZQ);
			setState(121);
			expression();
			setState(122);
			match(PDER);
			setState(123);
			block();
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

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(miParser.IF, 0); }
		public TerminalNode PIZQ() { return getToken(miParser.PIZQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PDER() { return getToken(miParser.PDER, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(miParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(IF);
			setState(126);
			match(PIZQ);
			setState(127);
			expression();
			setState(128);
			match(PDER);
			setState(129);
			block();
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(130);
				match(ELSE);
				setState(131);
				block();
				}
			}

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

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(miParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(RETURN);
			setState(135);
			expression();
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

	public static class PrintStatementContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(miParser.PRINT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_printStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(PRINT);
			setState(138);
			expression();
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

	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(miParser.CLASS, 0); }
		public TerminalNode ID() { return getToken(miParser.ID, 0); }
		public TerminalNode KEYIZQ() { return getToken(miParser.KEYIZQ, 0); }
		public TerminalNode KEYDER() { return getToken(miParser.KEYDER, 0); }
		public List<ClassVariableDeclarationContext> classVariableDeclaration() {
			return getRuleContexts(ClassVariableDeclarationContext.class);
		}
		public ClassVariableDeclarationContext classVariableDeclaration(int i) {
			return getRuleContext(ClassVariableDeclarationContext.class,i);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(CLASS);
			setState(141);
			match(ID);
			setState(142);
			match(KEYIZQ);
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STYPE) {
				{
				{
				setState(143);
				classVariableDeclaration();
				}
				}
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(149);
			match(KEYDER);
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

	public static class ClassVariableDeclarationContext extends ParserRuleContext {
		public TerminalNode STYPE() { return getToken(miParser.STYPE, 0); }
		public TerminalNode ID() { return getToken(miParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(miParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ClassVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classVariableDeclaration; }
	}

	public final ClassVariableDeclarationContext classVariableDeclaration() throws RecognitionException {
		ClassVariableDeclarationContext _localctx = new ClassVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_classVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(STYPE);
			setState(152);
			match(ID);
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(153);
				match(ASSIGN);
				setState(154);
				expression();
				}
			}

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

	public static class VariableDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(miParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(miParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			type();
			setState(158);
			match(ID);
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(159);
				match(ASSIGN);
				setState(160);
				expression();
				}
			}

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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode STYPE() { return getToken(miParser.STYPE, 0); }
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(miParser.ID, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_type);
		try {
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				match(STYPE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				arrayType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(165);
				match(ID);
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

	public static class ArrayTypeContext extends ParserRuleContext {
		public TerminalNode STYPE() { return getToken(miParser.STYPE, 0); }
		public TerminalNode PCIZQ() { return getToken(miParser.PCIZQ, 0); }
		public TerminalNode PCDER() { return getToken(miParser.PCDER, 0); }
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_arrayType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(STYPE);
			setState(169);
			match(PCIZQ);
			setState(170);
			match(PCDER);
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

	public static class AssigmentContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(miParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(miParser.ID, i);
		}
		public TerminalNode ASSIGN() { return getToken(miParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PUNTO() { return getToken(miParser.PUNTO, 0); }
		public AssigmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assigment; }
	}

	public final AssigmentContext assigment() throws RecognitionException {
		AssigmentContext _localctx = new AssigmentContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_assigment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(ID);
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PUNTO) {
				{
				setState(173);
				match(PUNTO);
				setState(174);
				match(ID);
				}
			}

			setState(177);
			match(ASSIGN);
			setState(178);
			expression();
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

	public static class ArrayAssignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(miParser.ID, 0); }
		public TerminalNode PCIZQ() { return getToken(miParser.PCIZQ, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PCDER() { return getToken(miParser.PCDER, 0); }
		public TerminalNode ASSIGN() { return getToken(miParser.ASSIGN, 0); }
		public ArrayAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAssignment; }
	}

	public final ArrayAssignmentContext arrayAssignment() throws RecognitionException {
		ArrayAssignmentContext _localctx = new ArrayAssignmentContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_arrayAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(ID);
			setState(181);
			match(PCIZQ);
			setState(182);
			expression();
			setState(183);
			match(PCDER);
			setState(184);
			match(ASSIGN);
			setState(185);
			expression();
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

	public static class ExpressionContext extends ParserRuleContext {
		public List<SimpleExpressionContext> simpleExpression() {
			return getRuleContexts(SimpleExpressionContext.class);
		}
		public SimpleExpressionContext simpleExpression(int i) {
			return getRuleContext(SimpleExpressionContext.class,i);
		}
		public List<TerminalNode> ROPERATOR() { return getTokens(miParser.ROPERATOR); }
		public TerminalNode ROPERATOR(int i) {
			return getToken(miParser.ROPERATOR, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			simpleExpression();
			setState(192);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(188);
					match(ROPERATOR);
					setState(189);
					simpleExpression();
					}
					} 
				}
				setState(194);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
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

	public static class SimpleExpressionContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> AOP() { return getTokens(miParser.AOP); }
		public TerminalNode AOP(int i) {
			return getToken(miParser.AOP, i);
		}
		public SimpleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExpression; }
	}

	public final SimpleExpressionContext simpleExpression() throws RecognitionException {
		SimpleExpressionContext _localctx = new SimpleExpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_simpleExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			term();
			setState(200);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(196);
					match(AOP);
					setState(197);
					term();
					}
					} 
				}
				setState(202);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
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

	public static class TermContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> MOP() { return getTokens(miParser.MOP); }
		public TerminalNode MOP(int i) {
			return getToken(miParser.MOP, i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_term);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			factor();
			setState(208);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(204);
					match(MOP);
					setState(205);
					factor();
					}
					} 
				}
				setState(210);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
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

	public static class FactorContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(miParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(miParser.ID, i);
		}
		public TerminalNode PUNTO() { return getToken(miParser.PUNTO, 0); }
		public FuntionCallContext funtionCall() {
			return getRuleContext(FuntionCallContext.class,0);
		}
		public ArrayLookupContext arrayLookup() {
			return getRuleContext(ArrayLookupContext.class,0);
		}
		public ArrayLengthContext arrayLength() {
			return getRuleContext(ArrayLengthContext.class,0);
		}
		public SubExpressionContext subExpression() {
			return getRuleContext(SubExpressionContext.class,0);
		}
		public ArrayAllocationExpressionContext arrayAllocationExpression() {
			return getRuleContext(ArrayAllocationExpressionContext.class,0);
		}
		public AllocationExpressionContext allocationExpression() {
			return getRuleContext(AllocationExpressionContext.class,0);
		}
		public UnaryContext unary() {
			return getRuleContext(UnaryContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_factor);
		int _la;
		try {
			setState(224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				match(ID);
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTO) {
					{
					setState(213);
					match(PUNTO);
					setState(214);
					match(ID);
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(217);
				funtionCall();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(218);
				arrayLookup();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(219);
				arrayLength();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(220);
				subExpression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(221);
				arrayAllocationExpression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(222);
				allocationExpression();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(223);
				unary();
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

	public static class UnaryContext extends ParserRuleContext {
		public TerminalNode UNARY() { return getToken(miParser.UNARY, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public UnaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary; }
	}

	public final UnaryContext unary() throws RecognitionException {
		UnaryContext _localctx = new UnaryContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_unary);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(226);
			match(UNARY);
			}
			setState(230);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(227);
					expression();
					}
					} 
				}
				setState(232);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
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

	public static class AllocationExpressionContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(miParser.NEW, 0); }
		public TerminalNode ID() { return getToken(miParser.ID, 0); }
		public TerminalNode PIZQ() { return getToken(miParser.PIZQ, 0); }
		public TerminalNode PDER() { return getToken(miParser.PDER, 0); }
		public AllocationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allocationExpression; }
	}

	public final AllocationExpressionContext allocationExpression() throws RecognitionException {
		AllocationExpressionContext _localctx = new AllocationExpressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_allocationExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(NEW);
			setState(234);
			match(ID);
			setState(235);
			match(PIZQ);
			setState(236);
			match(PDER);
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

	public static class ArrayAllocationExpressionContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(miParser.NEW, 0); }
		public TerminalNode STYPE() { return getToken(miParser.STYPE, 0); }
		public TerminalNode PCIZQ() { return getToken(miParser.PCIZQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PCDER() { return getToken(miParser.PCDER, 0); }
		public ArrayAllocationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAllocationExpression; }
	}

	public final ArrayAllocationExpressionContext arrayAllocationExpression() throws RecognitionException {
		ArrayAllocationExpressionContext _localctx = new ArrayAllocationExpressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_arrayAllocationExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(NEW);
			setState(239);
			match(STYPE);
			setState(240);
			match(PCIZQ);
			setState(241);
			expression();
			setState(242);
			match(PCDER);
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

	public static class SubExpressionContext extends ParserRuleContext {
		public TerminalNode PIZQ() { return getToken(miParser.PIZQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PDER() { return getToken(miParser.PDER, 0); }
		public SubExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subExpression; }
	}

	public final SubExpressionContext subExpression() throws RecognitionException {
		SubExpressionContext _localctx = new SubExpressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_subExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(PIZQ);
			setState(245);
			expression();
			setState(246);
			match(PDER);
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

	public static class FuntionCallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(miParser.ID, 0); }
		public TerminalNode PIZQ() { return getToken(miParser.PIZQ, 0); }
		public TerminalNode PDER() { return getToken(miParser.PDER, 0); }
		public ActualParamsContext actualParams() {
			return getRuleContext(ActualParamsContext.class,0);
		}
		public FuntionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funtionCall; }
	}

	public final FuntionCallContext funtionCall() throws RecognitionException {
		FuntionCallContext _localctx = new FuntionCallContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_funtionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(ID);
			setState(249);
			match(PIZQ);
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PIZQ) | (1L << UNARY) | (1L << NEW) | (1L << INTLITERAL) | (1L << REALLITERAL) | (1L << BOOLITERAL) | (1L << STRINGLITERAL) | (1L << ID))) != 0)) {
				{
				setState(250);
				actualParams();
				}
			}

			setState(253);
			match(PDER);
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

	public static class ActualParamsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(miParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(miParser.COMA, i);
		}
		public ActualParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actualParams; }
	}

	public final ActualParamsContext actualParams() throws RecognitionException {
		ActualParamsContext _localctx = new ActualParamsContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_actualParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			expression();
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(256);
				match(COMA);
				setState(257);
				expression();
				}
				}
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class ArrayLookupContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(miParser.ID, 0); }
		public TerminalNode PCIZQ() { return getToken(miParser.PCIZQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PCDER() { return getToken(miParser.PCDER, 0); }
		public ArrayLookupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLookup; }
	}

	public final ArrayLookupContext arrayLookup() throws RecognitionException {
		ArrayLookupContext _localctx = new ArrayLookupContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_arrayLookup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(ID);
			setState(264);
			match(PCIZQ);
			setState(265);
			expression();
			setState(266);
			match(PCDER);
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

	public static class ArrayLengthContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(miParser.ID, 0); }
		public TerminalNode PUNTO() { return getToken(miParser.PUNTO, 0); }
		public TerminalNode LENGTH() { return getToken(miParser.LENGTH, 0); }
		public ArrayLengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLength; }
	}

	public final ArrayLengthContext arrayLength() throws RecognitionException {
		ArrayLengthContext _localctx = new ArrayLengthContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_arrayLength);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(ID);
			setState(269);
			match(PUNTO);
			setState(270);
			match(LENGTH);
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode INTLITERAL() { return getToken(miParser.INTLITERAL, 0); }
		public TerminalNode REALLITERAL() { return getToken(miParser.REALLITERAL, 0); }
		public TerminalNode BOOLITERAL() { return getToken(miParser.BOOLITERAL, 0); }
		public TerminalNode STRINGLITERAL() { return getToken(miParser.STRINGLITERAL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTLITERAL) | (1L << REALLITERAL) | (1L << BOOLITERAL) | (1L << STRINGLITERAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3!\u0115\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\7\2@"+
		"\n\2\f\2\16\2C\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3[\n\3\3\4\3\4\7\4_\n\4\f\4\16"+
		"\4b\13\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5j\n\5\3\5\3\5\3\5\3\6\3\6\3\6\7\6"+
		"r\n\6\f\6\16\6u\13\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\5\t\u0087\n\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\7\f\u0093\n\f\f\f\16\f\u0096\13\f\3\f\3\f\3\r\3\r\3\r\3\r\5\r\u009e"+
		"\n\r\3\16\3\16\3\16\3\16\5\16\u00a4\n\16\3\17\3\17\3\17\5\17\u00a9\n\17"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\5\21\u00b2\n\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\7\23\u00c1\n\23\f\23\16"+
		"\23\u00c4\13\23\3\24\3\24\3\24\7\24\u00c9\n\24\f\24\16\24\u00cc\13\24"+
		"\3\25\3\25\3\25\7\25\u00d1\n\25\f\25\16\25\u00d4\13\25\3\26\3\26\3\26"+
		"\3\26\5\26\u00da\n\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00e3\n"+
		"\26\3\27\3\27\7\27\u00e7\n\27\f\27\16\27\u00ea\13\27\3\30\3\30\3\30\3"+
		"\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3"+
		"\33\5\33\u00fe\n\33\3\33\3\33\3\34\3\34\3\34\7\34\u0105\n\34\f\34\16\34"+
		"\u0108\13\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3"+
		"\37\2\2 \2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668"+
		":<\2\3\3\2\34\37\2\u0119\2A\3\2\2\2\4Z\3\2\2\2\6\\\3\2\2\2\be\3\2\2\2"+
		"\nn\3\2\2\2\fv\3\2\2\2\16y\3\2\2\2\20\177\3\2\2\2\22\u0088\3\2\2\2\24"+
		"\u008b\3\2\2\2\26\u008e\3\2\2\2\30\u0099\3\2\2\2\32\u009f\3\2\2\2\34\u00a8"+
		"\3\2\2\2\36\u00aa\3\2\2\2 \u00ae\3\2\2\2\"\u00b6\3\2\2\2$\u00bd\3\2\2"+
		"\2&\u00c5\3\2\2\2(\u00cd\3\2\2\2*\u00e2\3\2\2\2,\u00e4\3\2\2\2.\u00eb"+
		"\3\2\2\2\60\u00f0\3\2\2\2\62\u00f6\3\2\2\2\64\u00fa\3\2\2\2\66\u0101\3"+
		"\2\2\28\u0109\3\2\2\2:\u010e\3\2\2\2<\u0112\3\2\2\2>@\5\4\3\2?>\3\2\2"+
		"\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2B\3\3\2\2\2CA\3\2\2\2DE\5\32\16\2EF\7"+
		"\3\2\2F[\3\2\2\2GH\5\26\f\2HI\7\3\2\2I[\3\2\2\2JK\5 \21\2KL\7\3\2\2L["+
		"\3\2\2\2MN\5\"\22\2NO\7\3\2\2O[\3\2\2\2PQ\5\24\13\2QR\7\3\2\2R[\3\2\2"+
		"\2S[\5\20\t\2T[\5\16\b\2UV\5\22\n\2VW\7\3\2\2W[\3\2\2\2X[\5\b\5\2Y[\5"+
		"\6\4\2ZD\3\2\2\2ZG\3\2\2\2ZJ\3\2\2\2ZM\3\2\2\2ZP\3\2\2\2ZS\3\2\2\2ZT\3"+
		"\2\2\2ZU\3\2\2\2ZX\3\2\2\2ZY\3\2\2\2[\5\3\2\2\2\\`\7\7\2\2]_\5\4\3\2^"+
		"]\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2ac\3\2\2\2b`\3\2\2\2cd\7\6\2\2"+
		"d\7\3\2\2\2ef\5\34\17\2fg\7 \2\2gi\7\4\2\2hj\5\n\6\2ih\3\2\2\2ij\3\2\2"+
		"\2jk\3\2\2\2kl\7\5\2\2lm\5\6\4\2m\t\3\2\2\2ns\5\f\7\2op\7\t\2\2pr\5\f"+
		"\7\2qo\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2t\13\3\2\2\2us\3\2\2\2vw\5"+
		"\34\17\2wx\7 \2\2x\r\3\2\2\2yz\7\26\2\2z{\7\4\2\2{|\5$\23\2|}\7\5\2\2"+
		"}~\5\6\4\2~\17\3\2\2\2\177\u0080\7\24\2\2\u0080\u0081\7\4\2\2\u0081\u0082"+
		"\5$\23\2\u0082\u0083\7\5\2\2\u0083\u0086\5\6\4\2\u0084\u0085\7\25\2\2"+
		"\u0085\u0087\5\6\4\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\21"+
		"\3\2\2\2\u0088\u0089\7\27\2\2\u0089\u008a\5$\23\2\u008a\23\3\2\2\2\u008b"+
		"\u008c\7\30\2\2\u008c\u008d\5$\23\2\u008d\25\3\2\2\2\u008e\u008f\7\31"+
		"\2\2\u008f\u0090\7 \2\2\u0090\u0094\7\7\2\2\u0091\u0093\5\30\r\2\u0092"+
		"\u0091\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2"+
		"\2\2\u0095\u0097\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u0098\7\6\2\2\u0098"+
		"\27\3\2\2\2\u0099\u009a\7\20\2\2\u009a\u009d\7 \2\2\u009b\u009c\7\b\2"+
		"\2\u009c\u009e\5$\23\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\31"+
		"\3\2\2\2\u009f\u00a0\5\34\17\2\u00a0\u00a3\7 \2\2\u00a1\u00a2\7\b\2\2"+
		"\u00a2\u00a4\5$\23\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\33"+
		"\3\2\2\2\u00a5\u00a9\7\20\2\2\u00a6\u00a9\5\36\20\2\u00a7\u00a9\7 \2\2"+
		"\u00a8\u00a5\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a7\3\2\2\2\u00a9\35"+
		"\3\2\2\2\u00aa\u00ab\7\20\2\2\u00ab\u00ac\7\13\2\2\u00ac\u00ad\7\f\2\2"+
		"\u00ad\37\3\2\2\2\u00ae\u00b1\7 \2\2\u00af\u00b0\7\r\2\2\u00b0\u00b2\7"+
		" \2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3"+
		"\u00b4\7\b\2\2\u00b4\u00b5\5$\23\2\u00b5!\3\2\2\2\u00b6\u00b7\7 \2\2\u00b7"+
		"\u00b8\7\13\2\2\u00b8\u00b9\5$\23\2\u00b9\u00ba\7\f\2\2\u00ba\u00bb\7"+
		"\b\2\2\u00bb\u00bc\5$\23\2\u00bc#\3\2\2\2\u00bd\u00c2\5&\24\2\u00be\u00bf"+
		"\7\17\2\2\u00bf\u00c1\5&\24\2\u00c0\u00be\3\2\2\2\u00c1\u00c4\3\2\2\2"+
		"\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3%\3\2\2\2\u00c4\u00c2\3"+
		"\2\2\2\u00c5\u00ca\5(\25\2\u00c6\u00c7\7\21\2\2\u00c7\u00c9\5(\25\2\u00c8"+
		"\u00c6\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2"+
		"\2\2\u00cb\'\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00d2\5*\26\2\u00ce\u00cf"+
		"\7\22\2\2\u00cf\u00d1\5*\26\2\u00d0\u00ce\3\2\2\2\u00d1\u00d4\3\2\2\2"+
		"\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3)\3\2\2\2\u00d4\u00d2\3"+
		"\2\2\2\u00d5\u00e3\5<\37\2\u00d6\u00d9\7 \2\2\u00d7\u00d8\7\r\2\2\u00d8"+
		"\u00da\7 \2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00e3\3\2"+
		"\2\2\u00db\u00e3\5\64\33\2\u00dc\u00e3\58\35\2\u00dd\u00e3\5:\36\2\u00de"+
		"\u00e3\5\62\32\2\u00df\u00e3\5\60\31\2\u00e0\u00e3\5.\30\2\u00e1\u00e3"+
		"\5,\27\2\u00e2\u00d5\3\2\2\2\u00e2\u00d6\3\2\2\2\u00e2\u00db\3\2\2\2\u00e2"+
		"\u00dc\3\2\2\2\u00e2\u00dd\3\2\2\2\u00e2\u00de\3\2\2\2\u00e2\u00df\3\2"+
		"\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e1\3\2\2\2\u00e3+\3\2\2\2\u00e4\u00e8"+
		"\7\23\2\2\u00e5\u00e7\5$\23\2\u00e6\u00e5\3\2\2\2\u00e7\u00ea\3\2\2\2"+
		"\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9-\3\2\2\2\u00ea\u00e8\3"+
		"\2\2\2\u00eb\u00ec\7\32\2\2\u00ec\u00ed\7 \2\2\u00ed\u00ee\7\4\2\2\u00ee"+
		"\u00ef\7\5\2\2\u00ef/\3\2\2\2\u00f0\u00f1\7\32\2\2\u00f1\u00f2\7\20\2"+
		"\2\u00f2\u00f3\7\13\2\2\u00f3\u00f4\5$\23\2\u00f4\u00f5\7\f\2\2\u00f5"+
		"\61\3\2\2\2\u00f6\u00f7\7\4\2\2\u00f7\u00f8\5$\23\2\u00f8\u00f9\7\5\2"+
		"\2\u00f9\63\3\2\2\2\u00fa\u00fb\7 \2\2\u00fb\u00fd\7\4\2\2\u00fc\u00fe"+
		"\5\66\34\2\u00fd\u00fc\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00ff\3\2\2\2"+
		"\u00ff\u0100\7\5\2\2\u0100\65\3\2\2\2\u0101\u0106\5$\23\2\u0102\u0103"+
		"\7\t\2\2\u0103\u0105\5$\23\2\u0104\u0102\3\2\2\2\u0105\u0108\3\2\2\2\u0106"+
		"\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107\67\3\2\2\2\u0108\u0106\3\2\2"+
		"\2\u0109\u010a\7 \2\2\u010a\u010b\7\13\2\2\u010b\u010c\5$\23\2\u010c\u010d"+
		"\7\f\2\2\u010d9\3\2\2\2\u010e\u010f\7 \2\2\u010f\u0110\7\r\2\2\u0110\u0111"+
		"\7\33\2\2\u0111;\3\2\2\2\u0112\u0113\t\2\2\2\u0113=\3\2\2\2\25AZ`is\u0086"+
		"\u0094\u009d\u00a3\u00a8\u00b1\u00c2\u00ca\u00d2\u00d9\u00e2\u00e8\u00fd"+
		"\u0106";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}