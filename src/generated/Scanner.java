// Generated from C:/Users/RebecaBA/Documents/InterpreteAlpha\Scanner.g4 by ANTLR 4.7.2
package generated;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Scanner extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PyCOMA=1, ASSIGN=2, PIZQ=3, PDER=4, VIR=5, DOSPUN=6, SUM=7, SUB=8, MUL=9, 
		DIV=10, MAYOR=11, MENOR=12, IGUAL=13, MAYORIGUAL=14, MENORIGUAL=15, IF=16, 
		WHILE=17, LET=18, THEN=19, ELSE=20, IN=21, DO=22, BEGIN=23, END=24, CONST=25, 
		VAR=26, OR=27, AND=28, PRINT=29, BOOLEAN=30, ID=31, NUM=32, STRING=33, 
		SPECIAL_STRING=34, WS=35;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PyCOMA", "ASSIGN", "PIZQ", "PDER", "VIR", "DOSPUN", "SUM", "SUB", "MUL", 
			"DIV", "MAYOR", "MENOR", "IGUAL", "MAYORIGUAL", "MENORIGUAL", "IF", "WHILE", 
			"LET", "THEN", "ELSE", "IN", "DO", "BEGIN", "END", "CONST", "VAR", "OR", 
			"AND", "PRINT", "BOOLEAN", "ID", "NUM", "STRING", "SPECIAL_STRING", "LETTER", 
			"DIGIT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "':='", "'('", "')'", "'~'", "':'", "'+'", "'-'", "'*'", 
			"'/'", "'>'", "'<'", "'=='", "'>='", "'<='", "'if'", "'while'", "'let'", 
			"'then'", "'else'", "'in'", "'do'", "'begin'", "'end'", "'const'", "'var'", 
			"'or'", "'and'", "'print'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PyCOMA", "ASSIGN", "PIZQ", "PDER", "VIR", "DOSPUN", "SUM", "SUB", 
			"MUL", "DIV", "MAYOR", "MENOR", "IGUAL", "MAYORIGUAL", "MENORIGUAL", 
			"IF", "WHILE", "LET", "THEN", "ELSE", "IN", "DO", "BEGIN", "END", "CONST", 
			"VAR", "OR", "AND", "PRINT", "BOOLEAN", "ID", "NUM", "STRING", "SPECIAL_STRING", 
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


	public Scanner(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Scanner.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2%\u00ec\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\5\3"+
		"\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3"+
		"\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3"+
		"\25\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3"+
		"\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u00b7\n\37\3 \3"+
		" \3 \7 \u00bc\n \f \16 \u00bf\13 \3!\3!\7!\u00c3\n!\f!\16!\u00c6\13!\3"+
		"\"\3\"\3\"\3\"\7\"\u00cc\n\"\f\"\16\"\u00cf\13\"\3\"\3\"\3#\3#\3#\3#\3"+
		"#\3#\7#\u00d9\n#\f#\16#\u00dc\13#\3#\3#\3#\3#\3$\3$\3%\3%\3&\6&\u00e7"+
		"\n&\r&\16&\u00e8\3&\3&\2\2\'\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G\2I\2K%\3\2\5\3\2$$\4\2C\\c|"+
		"\5\2\13\f\17\17\"\"\2\u00f2\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2"+
		"\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C"+
		"\3\2\2\2\2E\3\2\2\2\2K\3\2\2\2\3M\3\2\2\2\5O\3\2\2\2\7R\3\2\2\2\tT\3\2"+
		"\2\2\13V\3\2\2\2\rX\3\2\2\2\17Z\3\2\2\2\21\\\3\2\2\2\23^\3\2\2\2\25`\3"+
		"\2\2\2\27b\3\2\2\2\31d\3\2\2\2\33f\3\2\2\2\35i\3\2\2\2\37l\3\2\2\2!o\3"+
		"\2\2\2#r\3\2\2\2%x\3\2\2\2\'|\3\2\2\2)\u0081\3\2\2\2+\u0086\3\2\2\2-\u0089"+
		"\3\2\2\2/\u008c\3\2\2\2\61\u0092\3\2\2\2\63\u0096\3\2\2\2\65\u009c\3\2"+
		"\2\2\67\u00a0\3\2\2\29\u00a3\3\2\2\2;\u00a7\3\2\2\2=\u00b6\3\2\2\2?\u00b8"+
		"\3\2\2\2A\u00c0\3\2\2\2C\u00c7\3\2\2\2E\u00d2\3\2\2\2G\u00e1\3\2\2\2I"+
		"\u00e3\3\2\2\2K\u00e6\3\2\2\2MN\7=\2\2N\4\3\2\2\2OP\7<\2\2PQ\7?\2\2Q\6"+
		"\3\2\2\2RS\7*\2\2S\b\3\2\2\2TU\7+\2\2U\n\3\2\2\2VW\7\u0080\2\2W\f\3\2"+
		"\2\2XY\7<\2\2Y\16\3\2\2\2Z[\7-\2\2[\20\3\2\2\2\\]\7/\2\2]\22\3\2\2\2^"+
		"_\7,\2\2_\24\3\2\2\2`a\7\61\2\2a\26\3\2\2\2bc\7@\2\2c\30\3\2\2\2de\7>"+
		"\2\2e\32\3\2\2\2fg\7?\2\2gh\7?\2\2h\34\3\2\2\2ij\7@\2\2jk\7?\2\2k\36\3"+
		"\2\2\2lm\7>\2\2mn\7?\2\2n \3\2\2\2op\7k\2\2pq\7h\2\2q\"\3\2\2\2rs\7y\2"+
		"\2st\7j\2\2tu\7k\2\2uv\7n\2\2vw\7g\2\2w$\3\2\2\2xy\7n\2\2yz\7g\2\2z{\7"+
		"v\2\2{&\3\2\2\2|}\7v\2\2}~\7j\2\2~\177\7g\2\2\177\u0080\7p\2\2\u0080("+
		"\3\2\2\2\u0081\u0082\7g\2\2\u0082\u0083\7n\2\2\u0083\u0084\7u\2\2\u0084"+
		"\u0085\7g\2\2\u0085*\3\2\2\2\u0086\u0087\7k\2\2\u0087\u0088\7p\2\2\u0088"+
		",\3\2\2\2\u0089\u008a\7f\2\2\u008a\u008b\7q\2\2\u008b.\3\2\2\2\u008c\u008d"+
		"\7d\2\2\u008d\u008e\7g\2\2\u008e\u008f\7i\2\2\u008f\u0090\7k\2\2\u0090"+
		"\u0091\7p\2\2\u0091\60\3\2\2\2\u0092\u0093\7g\2\2\u0093\u0094\7p\2\2\u0094"+
		"\u0095\7f\2\2\u0095\62\3\2\2\2\u0096\u0097\7e\2\2\u0097\u0098\7q\2\2\u0098"+
		"\u0099\7p\2\2\u0099\u009a\7u\2\2\u009a\u009b\7v\2\2\u009b\64\3\2\2\2\u009c"+
		"\u009d\7x\2\2\u009d\u009e\7c\2\2\u009e\u009f\7t\2\2\u009f\66\3\2\2\2\u00a0"+
		"\u00a1\7q\2\2\u00a1\u00a2\7t\2\2\u00a28\3\2\2\2\u00a3\u00a4\7c\2\2\u00a4"+
		"\u00a5\7p\2\2\u00a5\u00a6\7f\2\2\u00a6:\3\2\2\2\u00a7\u00a8\7r\2\2\u00a8"+
		"\u00a9\7t\2\2\u00a9\u00aa\7k\2\2\u00aa\u00ab\7p\2\2\u00ab\u00ac\7v\2\2"+
		"\u00ac<\3\2\2\2\u00ad\u00ae\7v\2\2\u00ae\u00af\7t\2\2\u00af\u00b0\7w\2"+
		"\2\u00b0\u00b7\7g\2\2\u00b1\u00b2\7h\2\2\u00b2\u00b3\7c\2\2\u00b3\u00b4"+
		"\7n\2\2\u00b4\u00b5\7u\2\2\u00b5\u00b7\7g\2\2\u00b6\u00ad\3\2\2\2\u00b6"+
		"\u00b1\3\2\2\2\u00b7>\3\2\2\2\u00b8\u00bd\5G$\2\u00b9\u00bc\5G$\2\u00ba"+
		"\u00bc\5I%\2\u00bb\u00b9\3\2\2\2\u00bb\u00ba\3\2\2\2\u00bc\u00bf\3\2\2"+
		"\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be@\3\2\2\2\u00bf\u00bd"+
		"\3\2\2\2\u00c0\u00c4\5I%\2\u00c1\u00c3\5I%\2\u00c2\u00c1\3\2\2\2\u00c3"+
		"\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5B\3\2\2\2"+
		"\u00c6\u00c4\3\2\2\2\u00c7\u00cd\7$\2\2\u00c8\u00c9\7$\2\2\u00c9\u00cc"+
		"\7$\2\2\u00ca\u00cc\n\2\2\2\u00cb\u00c8\3\2\2\2\u00cb\u00ca\3\2\2\2\u00cc"+
		"\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d0\3\2"+
		"\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00d1\7$\2\2\u00d1D\3\2\2\2\u00d2\u00d3"+
		"\7$\2\2\u00d3\u00d4\7^\2\2\u00d4\u00da\7$\2\2\u00d5\u00d6\7$\2\2\u00d6"+
		"\u00d9\7$\2\2\u00d7\u00d9\n\2\2\2\u00d8\u00d5\3\2\2\2\u00d8\u00d7\3\2"+
		"\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db"+
		"\u00dd\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00de\7^\2\2\u00de\u00df\7$\2"+
		"\2\u00df\u00e0\7$\2\2\u00e0F\3\2\2\2\u00e1\u00e2\t\3\2\2\u00e2H\3\2\2"+
		"\2\u00e3\u00e4\4\62;\2\u00e4J\3\2\2\2\u00e5\u00e7\t\4\2\2\u00e6\u00e5"+
		"\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9"+
		"\u00ea\3\2\2\2\u00ea\u00eb\b&\2\2\u00ebL\3\2\2\2\f\2\u00b6\u00bb\u00bd"+
		"\u00c4\u00cb\u00cd\u00d8\u00da\u00e8\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}