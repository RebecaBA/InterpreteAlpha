// Generated from C:/Users/jaffe/Downloads/Examen/Alpha_Jaffette\Parser2.g4 by ANTLR 4.7.2
package generated;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Parser2 extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PyCOMA=1, ASSIGN=2, PIZQ=3, PDER=4, VIR=5, DOSPUN=6, SUM=7, SUB=8, MUL=9, 
		DIV=10, MAYOR=11, MENOR=12, IGUAL=13, MAYORIGUAL=14, MENORIGUAL=15, IF=16, 
		WHILE=17, LET=18, THEN=19, ELSE=20, IN=21, DO=22, BEGIN=23, END=24, CONST=25, 
		VAR=26, AND=27, OR=28, PRINT=29, BOOLEAN=30, ID=31, NUM=32, STRING=33, 
		SPECIAL_STRING=34, WS=35;
	public static final int
		RULE_program = 0, RULE_command = 1, RULE_singleCommand = 2, RULE_declaration = 3, 
		RULE_singleDeclaration = 4, RULE_typedenoter = 5, RULE_expression = 6, 
		RULE_primaryExpression = 7, RULE_operator = 8, RULE_comparison = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "command", "singleCommand", "declaration", "singleDeclaration", 
			"typedenoter", "expression", "primaryExpression", "operator", "comparison"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "':='", "'('", "')'", "'~'", "':'", "'+'", "'-'", "'*'", 
			"'/'", "'>'", "'<'", "'=='", "'>='", "'<='", "'if'", "'while'", "'let'", 
			"'then'", "'else'", "'in'", "'do'", "'begin'", "'end'", "'const'", "'var'", 
			"'and'", "'or'", "'print'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PyCOMA", "ASSIGN", "PIZQ", "PDER", "VIR", "DOSPUN", "SUM", "SUB", 
			"MUL", "DIV", "MAYOR", "MENOR", "IGUAL", "MAYORIGUAL", "MENORIGUAL", 
			"IF", "WHILE", "LET", "THEN", "ELSE", "IN", "DO", "BEGIN", "END", "CONST", 
			"VAR", "AND", "OR", "PRINT", "BOOLEAN", "ID", "NUM", "STRING", "SPECIAL_STRING", 
			"WS"
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
	public String getGrammarFileName() { return "Parser2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Parser2(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	 
		public ProgramContext() { }
		public void copyFrom(ProgramContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ProgramASTContext extends ProgramContext {
		public SingleCommandContext singleCommand() {
			return getRuleContext(SingleCommandContext.class,0);
		}
		public TerminalNode EOF() { return getToken(Parser2.EOF, 0); }
		public ProgramASTContext(ProgramContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Parser2Visitor ) return ((Parser2Visitor<? extends T>)visitor).visitProgramAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			_localctx = new ProgramASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			singleCommand();
			setState(21);
			match(EOF);
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

	public static class CommandContext extends ParserRuleContext {
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
	 
		public CommandContext() { }
		public void copyFrom(CommandContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CommandASTContext extends CommandContext {
		public List<SingleCommandContext> singleCommand() {
			return getRuleContexts(SingleCommandContext.class);
		}
		public SingleCommandContext singleCommand(int i) {
			return getRuleContext(SingleCommandContext.class,i);
		}
		public List<TerminalNode> PyCOMA() { return getTokens(Parser2.PyCOMA); }
		public TerminalNode PyCOMA(int i) {
			return getToken(Parser2.PyCOMA, i);
		}
		public CommandASTContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Parser2Visitor ) return ((Parser2Visitor<? extends T>)visitor).visitCommandAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_command);
		int _la;
		try {
			_localctx = new CommandASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			singleCommand();
			setState(28);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PyCOMA) {
				{
				{
				setState(24);
				match(PyCOMA);
				setState(25);
				singleCommand();
				}
				}
				setState(30);
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

	public static class SingleCommandContext extends ParserRuleContext {
		public SingleCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleCommand; }
	 
		public SingleCommandContext() { }
		public void copyFrom(SingleCommandContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LetSCASTContext extends SingleCommandContext {
		public TerminalNode LET() { return getToken(Parser2.LET, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode IN() { return getToken(Parser2.IN, 0); }
		public SingleCommandContext singleCommand() {
			return getRuleContext(SingleCommandContext.class,0);
		}
		public LetSCASTContext(SingleCommandContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Parser2Visitor ) return ((Parser2Visitor<? extends T>)visitor).visitLetSCAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CallSCASTContext extends SingleCommandContext {
		public TerminalNode ID() { return getToken(Parser2.ID, 0); }
		public TerminalNode PIZQ() { return getToken(Parser2.PIZQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PDER() { return getToken(Parser2.PDER, 0); }
		public CallSCASTContext(SingleCommandContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Parser2Visitor ) return ((Parser2Visitor<? extends T>)visitor).visitCallSCAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintSCASTContext extends SingleCommandContext {
		public TerminalNode PRINT() { return getToken(Parser2.PRINT, 0); }
		public TerminalNode PIZQ() { return getToken(Parser2.PIZQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PDER() { return getToken(Parser2.PDER, 0); }
		public PrintSCASTContext(SingleCommandContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Parser2Visitor ) return ((Parser2Visitor<? extends T>)visitor).visitPrintSCAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BeginSCASTContext extends SingleCommandContext {
		public TerminalNode BEGIN() { return getToken(Parser2.BEGIN, 0); }
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public TerminalNode END() { return getToken(Parser2.END, 0); }
		public BeginSCASTContext(SingleCommandContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Parser2Visitor ) return ((Parser2Visitor<? extends T>)visitor).visitBeginSCAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignSCASTContext extends SingleCommandContext {
		public TerminalNode ID() { return getToken(Parser2.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(Parser2.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignSCASTContext(SingleCommandContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Parser2Visitor ) return ((Parser2Visitor<? extends T>)visitor).visitAssignSCAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileSCASTContext extends SingleCommandContext {
		public TerminalNode WHILE() { return getToken(Parser2.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DO() { return getToken(Parser2.DO, 0); }
		public SingleCommandContext singleCommand() {
			return getRuleContext(SingleCommandContext.class,0);
		}
		public WhileSCASTContext(SingleCommandContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Parser2Visitor ) return ((Parser2Visitor<? extends T>)visitor).visitWhileSCAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfSCASTContext extends SingleCommandContext {
		public TerminalNode IF() { return getToken(Parser2.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(Parser2.THEN, 0); }
		public List<SingleCommandContext> singleCommand() {
			return getRuleContexts(SingleCommandContext.class);
		}
		public SingleCommandContext singleCommand(int i) {
			return getRuleContext(SingleCommandContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(Parser2.ELSE, 0); }
		public IfSCASTContext(SingleCommandContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Parser2Visitor ) return ((Parser2Visitor<? extends T>)visitor).visitIfSCAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleCommandContext singleCommand() throws RecognitionException {
		SingleCommandContext _localctx = new SingleCommandContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_singleCommand);
		try {
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new AssignSCASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(31);
				match(ID);
				setState(32);
				match(ASSIGN);
				setState(33);
				expression();
				}
				break;
			case 2:
				_localctx = new CallSCASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				match(ID);
				setState(35);
				match(PIZQ);
				setState(36);
				expression();
				setState(37);
				match(PDER);
				}
				break;
			case 3:
				_localctx = new IfSCASTContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(39);
				match(IF);
				setState(40);
				expression();
				setState(41);
				match(THEN);
				setState(42);
				singleCommand();
				setState(43);
				match(ELSE);
				setState(44);
				singleCommand();
				}
				break;
			case 4:
				_localctx = new WhileSCASTContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(46);
				match(WHILE);
				setState(47);
				expression();
				setState(48);
				match(DO);
				setState(49);
				singleCommand();
				}
				break;
			case 5:
				_localctx = new LetSCASTContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(51);
				match(LET);
				setState(52);
				declaration();
				setState(53);
				match(IN);
				setState(54);
				singleCommand();
				}
				break;
			case 6:
				_localctx = new PrintSCASTContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(56);
				match(PRINT);
				setState(57);
				match(PIZQ);
				setState(58);
				expression();
				setState(59);
				match(PDER);
				}
				break;
			case 7:
				_localctx = new BeginSCASTContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(61);
				match(BEGIN);
				setState(62);
				command();
				setState(63);
				match(END);
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

	public static class DeclarationContext extends ParserRuleContext {
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	 
		public DeclarationContext() { }
		public void copyFrom(DeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeclarationASTContext extends DeclarationContext {
		public List<SingleDeclarationContext> singleDeclaration() {
			return getRuleContexts(SingleDeclarationContext.class);
		}
		public SingleDeclarationContext singleDeclaration(int i) {
			return getRuleContext(SingleDeclarationContext.class,i);
		}
		public List<TerminalNode> PyCOMA() { return getTokens(Parser2.PyCOMA); }
		public TerminalNode PyCOMA(int i) {
			return getToken(Parser2.PyCOMA, i);
		}
		public DeclarationASTContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Parser2Visitor ) return ((Parser2Visitor<? extends T>)visitor).visitDeclarationAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaration);
		int _la;
		try {
			_localctx = new DeclarationASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			singleDeclaration();
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PyCOMA) {
				{
				{
				setState(68);
				match(PyCOMA);
				setState(69);
				singleDeclaration();
				}
				}
				setState(74);
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

	public static class SingleDeclarationContext extends ParserRuleContext {
		public SingleDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleDeclaration; }
	 
		public SingleDeclarationContext() { }
		public void copyFrom(SingleDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ConstDeclASTContext extends SingleDeclarationContext {
		public TerminalNode CONST() { return getToken(Parser2.CONST, 0); }
		public TerminalNode ID() { return getToken(Parser2.ID, 0); }
		public TerminalNode VIR() { return getToken(Parser2.VIR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConstDeclASTContext(SingleDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Parser2Visitor ) return ((Parser2Visitor<? extends T>)visitor).visitConstDeclAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarDeclASTContext extends SingleDeclarationContext {
		public TerminalNode VAR() { return getToken(Parser2.VAR, 0); }
		public TerminalNode ID() { return getToken(Parser2.ID, 0); }
		public TerminalNode DOSPUN() { return getToken(Parser2.DOSPUN, 0); }
		public TypedenoterContext typedenoter() {
			return getRuleContext(TypedenoterContext.class,0);
		}
		public VarDeclASTContext(SingleDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Parser2Visitor ) return ((Parser2Visitor<? extends T>)visitor).visitVarDeclAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleDeclarationContext singleDeclaration() throws RecognitionException {
		SingleDeclarationContext _localctx = new SingleDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_singleDeclaration);
		try {
			setState(83);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
				_localctx = new ConstDeclASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				match(CONST);
				setState(76);
				match(ID);
				setState(77);
				match(VIR);
				setState(78);
				expression();
				}
				break;
			case VAR:
				_localctx = new VarDeclASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				match(VAR);
				setState(80);
				match(ID);
				setState(81);
				match(DOSPUN);
				setState(82);
				typedenoter();
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

	public static class TypedenoterContext extends ParserRuleContext {
		public TypedenoterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedenoter; }
	 
		public TypedenoterContext() { }
		public void copyFrom(TypedenoterContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TypedenoterASTContext extends TypedenoterContext {
		public TerminalNode ID() { return getToken(Parser2.ID, 0); }
		public TypedenoterASTContext(TypedenoterContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Parser2Visitor ) return ((Parser2Visitor<? extends T>)visitor).visitTypedenoterAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypedenoterContext typedenoter() throws RecognitionException {
		TypedenoterContext _localctx = new TypedenoterContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_typedenoter);
		try {
			_localctx = new TypedenoterASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExpressionASTContext extends ExpressionContext {
		public List<PrimaryExpressionContext> primaryExpression() {
			return getRuleContexts(PrimaryExpressionContext.class);
		}
		public PrimaryExpressionContext primaryExpression(int i) {
			return getRuleContext(PrimaryExpressionContext.class,i);
		}
		public List<OperatorContext> operator() {
			return getRuleContexts(OperatorContext.class);
		}
		public OperatorContext operator(int i) {
			return getRuleContext(OperatorContext.class,i);
		}
		public List<ComparisonContext> comparison() {
			return getRuleContexts(ComparisonContext.class);
		}
		public ComparisonContext comparison(int i) {
			return getRuleContext(ComparisonContext.class,i);
		}
		public ExpressionASTContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Parser2Visitor ) return ((Parser2Visitor<? extends T>)visitor).visitExpressionAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expression);
		int _la;
		try {
			_localctx = new ExpressionASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			primaryExpression();
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUM) | (1L << SUB) | (1L << MUL) | (1L << DIV) | (1L << MAYOR) | (1L << MENOR) | (1L << IGUAL) | (1L << MAYORIGUAL) | (1L << MENORIGUAL))) != 0)) {
				{
				{
				setState(90);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SUM:
				case SUB:
				case MUL:
				case DIV:
					{
					setState(88);
					operator();
					}
					break;
				case MAYOR:
				case MENOR:
				case IGUAL:
				case MAYORIGUAL:
				case MENORIGUAL:
					{
					setState(89);
					comparison();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(92);
				primaryExpression();
				}
				}
				setState(98);
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

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
	 
		public PrimaryExpressionContext() { }
		public void copyFrom(PrimaryExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BooleanPEASTContext extends PrimaryExpressionContext {
		public TerminalNode BOOLEAN() { return getToken(Parser2.BOOLEAN, 0); }
		public BooleanPEASTContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Parser2Visitor ) return ((Parser2Visitor<? extends T>)visitor).visitBooleanPEAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumPEASTContext extends PrimaryExpressionContext {
		public TerminalNode NUM() { return getToken(Parser2.NUM, 0); }
		public NumPEASTContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Parser2Visitor ) return ((Parser2Visitor<? extends T>)visitor).visitNumPEAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdPEASTContext extends PrimaryExpressionContext {
		public TerminalNode ID() { return getToken(Parser2.ID, 0); }
		public IdPEASTContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Parser2Visitor ) return ((Parser2Visitor<? extends T>)visitor).visitIdPEAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GroupPEASTContext extends PrimaryExpressionContext {
		public TerminalNode PIZQ() { return getToken(Parser2.PIZQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PDER() { return getToken(Parser2.PDER, 0); }
		public GroupPEASTContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Parser2Visitor ) return ((Parser2Visitor<? extends T>)visitor).visitGroupPEAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringPEASTContext extends PrimaryExpressionContext {
		public TerminalNode STRING() { return getToken(Parser2.STRING, 0); }
		public TerminalNode SPECIAL_STRING() { return getToken(Parser2.SPECIAL_STRING, 0); }
		public StringPEASTContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Parser2Visitor ) return ((Parser2Visitor<? extends T>)visitor).visitStringPEAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_primaryExpression);
		int _la;
		try {
			setState(107);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				_localctx = new NumPEASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				match(NUM);
				}
				break;
			case BOOLEAN:
				_localctx = new BooleanPEASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				match(BOOLEAN);
				}
				break;
			case ID:
				_localctx = new IdPEASTContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(101);
				match(ID);
				}
				break;
			case STRING:
			case SPECIAL_STRING:
				_localctx = new StringPEASTContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(102);
				_la = _input.LA(1);
				if ( !(_la==STRING || _la==SPECIAL_STRING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case PIZQ:
				_localctx = new GroupPEASTContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(103);
				match(PIZQ);
				setState(104);
				expression();
				setState(105);
				match(PDER);
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

	public static class OperatorContext extends ParserRuleContext {
		public TerminalNode SUM() { return getToken(Parser2.SUM, 0); }
		public TerminalNode SUB() { return getToken(Parser2.SUB, 0); }
		public TerminalNode MUL() { return getToken(Parser2.MUL, 0); }
		public TerminalNode DIV() { return getToken(Parser2.DIV, 0); }
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Parser2Visitor ) return ((Parser2Visitor<? extends T>)visitor).visitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUM) | (1L << SUB) | (1L << MUL) | (1L << DIV))) != 0)) ) {
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

	public static class ComparisonContext extends ParserRuleContext {
		public TerminalNode MAYOR() { return getToken(Parser2.MAYOR, 0); }
		public TerminalNode MENOR() { return getToken(Parser2.MENOR, 0); }
		public TerminalNode IGUAL() { return getToken(Parser2.IGUAL, 0); }
		public TerminalNode MAYORIGUAL() { return getToken(Parser2.MAYORIGUAL, 0); }
		public TerminalNode MENORIGUAL() { return getToken(Parser2.MENORIGUAL, 0); }
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Parser2Visitor ) return ((Parser2Visitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAYOR) | (1L << MENOR) | (1L << IGUAL) | (1L << MAYORIGUAL) | (1L << MENORIGUAL))) != 0)) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3%t\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3\2"+
		"\3\2\3\2\3\3\3\3\3\3\7\3\35\n\3\f\3\16\3 \13\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4D\n\4\3\5\3\5\3\5\7\5I\n"+
		"\5\f\5\16\5L\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6V\n\6\3\7\3\7\3\b"+
		"\3\b\3\b\5\b]\n\b\3\b\3\b\7\ba\n\b\f\b\16\bd\13\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\5\tn\n\t\3\n\3\n\3\13\3\13\3\13\2\2\f\2\4\6\b\n\f\16\20\22"+
		"\24\2\5\3\2#$\3\2\t\f\3\2\r\21\2x\2\26\3\2\2\2\4\31\3\2\2\2\6C\3\2\2\2"+
		"\bE\3\2\2\2\nU\3\2\2\2\fW\3\2\2\2\16Y\3\2\2\2\20m\3\2\2\2\22o\3\2\2\2"+
		"\24q\3\2\2\2\26\27\5\6\4\2\27\30\7\2\2\3\30\3\3\2\2\2\31\36\5\6\4\2\32"+
		"\33\7\3\2\2\33\35\5\6\4\2\34\32\3\2\2\2\35 \3\2\2\2\36\34\3\2\2\2\36\37"+
		"\3\2\2\2\37\5\3\2\2\2 \36\3\2\2\2!\"\7!\2\2\"#\7\4\2\2#D\5\16\b\2$%\7"+
		"!\2\2%&\7\5\2\2&\'\5\16\b\2\'(\7\6\2\2(D\3\2\2\2)*\7\22\2\2*+\5\16\b\2"+
		"+,\7\25\2\2,-\5\6\4\2-.\7\26\2\2./\5\6\4\2/D\3\2\2\2\60\61\7\23\2\2\61"+
		"\62\5\16\b\2\62\63\7\30\2\2\63\64\5\6\4\2\64D\3\2\2\2\65\66\7\24\2\2\66"+
		"\67\5\b\5\2\678\7\27\2\289\5\6\4\29D\3\2\2\2:;\7\37\2\2;<\7\5\2\2<=\5"+
		"\16\b\2=>\7\6\2\2>D\3\2\2\2?@\7\31\2\2@A\5\4\3\2AB\7\32\2\2BD\3\2\2\2"+
		"C!\3\2\2\2C$\3\2\2\2C)\3\2\2\2C\60\3\2\2\2C\65\3\2\2\2C:\3\2\2\2C?\3\2"+
		"\2\2D\7\3\2\2\2EJ\5\n\6\2FG\7\3\2\2GI\5\n\6\2HF\3\2\2\2IL\3\2\2\2JH\3"+
		"\2\2\2JK\3\2\2\2K\t\3\2\2\2LJ\3\2\2\2MN\7\33\2\2NO\7!\2\2OP\7\7\2\2PV"+
		"\5\16\b\2QR\7\34\2\2RS\7!\2\2ST\7\b\2\2TV\5\f\7\2UM\3\2\2\2UQ\3\2\2\2"+
		"V\13\3\2\2\2WX\7!\2\2X\r\3\2\2\2Yb\5\20\t\2Z]\5\22\n\2[]\5\24\13\2\\Z"+
		"\3\2\2\2\\[\3\2\2\2]^\3\2\2\2^_\5\20\t\2_a\3\2\2\2`\\\3\2\2\2ad\3\2\2"+
		"\2b`\3\2\2\2bc\3\2\2\2c\17\3\2\2\2db\3\2\2\2en\7\"\2\2fn\7 \2\2gn\7!\2"+
		"\2hn\t\2\2\2ij\7\5\2\2jk\5\16\b\2kl\7\6\2\2ln\3\2\2\2me\3\2\2\2mf\3\2"+
		"\2\2mg\3\2\2\2mh\3\2\2\2mi\3\2\2\2n\21\3\2\2\2op\t\3\2\2p\23\3\2\2\2q"+
		"r\t\4\2\2r\25\3\2\2\2\t\36CJU\\bm";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}