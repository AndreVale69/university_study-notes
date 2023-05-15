// Generated from C:/Universit�/Linguaggi/Laboratorio/consegne/VR443470-lab_5/src\Imp.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ImpLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NAT=1, BOOL=2, STRING=3, PLUS=4, MINUS=5, MUL=6, DIV=7, MOD=8, POW=9, 
		AND=10, OR=11, EQQ=12, NEQ=13, LEQ=14, GEQ=15, LT=16, GT=17, NOT=18, IF=19, 
		THEN=20, ELSE=21, WHILE=22, SKIPP=23, ASSIGN=24, OUT=25, TOSTR=26, CONC=27, 
		LPAR=28, RPAR=29, LPARQUA=30, RPARQUA=31, LBRACE=32, RBRACE=33, SEMICOLON=34, 
		ID=35, WS=36;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"NAT", "BOOL", "STRING", "LETT", "ESCAPE", "PLUS", "MINUS", "MUL", "DIV", 
			"MOD", "POW", "AND", "OR", "EQQ", "NEQ", "LEQ", "GEQ", "LT", "GT", "NOT", 
			"IF", "THEN", "ELSE", "WHILE", "SKIPP", "ASSIGN", "OUT", "TOSTR", "CONC", 
			"LPAR", "RPAR", "LPARQUA", "RPARQUA", "LBRACE", "RBRACE", "SEMICOLON", 
			"ID", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'+'", "'-'", "'*'", "'/'", "'mod'", "'^'", "'&'", 
			"'|'", "'=='", "'!='", "'<='", "'>='", "'<'", "'>'", "'!'", "'if'", "'then'", 
			"'else'", "'while'", "'skip'", "'='", "'out'", "'tostr'", "'.'", "'('", 
			"')'", "'['", "']'", "'{'", "'}'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NAT", "BOOL", "STRING", "PLUS", "MINUS", "MUL", "DIV", "MOD", 
			"POW", "AND", "OR", "EQQ", "NEQ", "LEQ", "GEQ", "LT", "GT", "NOT", "IF", 
			"THEN", "ELSE", "WHILE", "SKIPP", "ASSIGN", "OUT", "TOSTR", "CONC", "LPAR", 
			"RPAR", "LPARQUA", "RPARQUA", "LBRACE", "RBRACE", "SEMICOLON", "ID", 
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


	public ImpLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Imp.g4"; }

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
		"\u0004\u0000$\u00d6\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0005\u0000Q\b\u0000\n\u0000\f\u0000T\t\u0000"+
		"\u0003\u0000V\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"a\b\u0001\u0001\u0002\u0001\u0002\u0005\u0002e\b\u0002\n\u0002\f\u0002"+
		"h\t\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0003\u0003"+
		"n\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e"+
		"\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001!\u0001!\u0001\"\u0001\"\u0001"+
		"#\u0001#\u0001$\u0004$\u00cc\b$\u000b$\f$\u00cd\u0001%\u0004%\u00d1\b"+
		"%\u000b%\f%\u00d2\u0001%\u0001%\u0000\u0000&\u0001\u0001\u0003\u0002\u0005"+
		"\u0003\u0007\u0000\t\u0000\u000b\u0004\r\u0005\u000f\u0006\u0011\u0007"+
		"\u0013\b\u0015\t\u0017\n\u0019\u000b\u001b\f\u001d\r\u001f\u000e!\u000f"+
		"#\u0010%\u0011\'\u0012)\u0013+\u0014-\u0015/\u00161\u00173\u00185\u0019"+
		"7\u001a9\u001b;\u001c=\u001d?\u001eA\u001fC E!G\"I#K$\u0001\u0000\u0006"+
		"\u0001\u000019\u0001\u000009\u0004\u0000\n\n\r\r\"\"\\\\\b\u0000\"\"\'"+
		"\'\\\\bbffnnrrtt\u0001\u0000az\u0003\u0000\t\n\r\r  \u00da\u0000\u0001"+
		"\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005"+
		"\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001"+
		"\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001"+
		"\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001"+
		"\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001"+
		"\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001"+
		"\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000"+
		"\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000"+
		"\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000"+
		"+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001"+
		"\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000"+
		"\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000\u0000"+
		"9\u0001\u0000\u0000\u0000\u0000;\u0001\u0000\u0000\u0000\u0000=\u0001"+
		"\u0000\u0000\u0000\u0000?\u0001\u0000\u0000\u0000\u0000A\u0001\u0000\u0000"+
		"\u0000\u0000C\u0001\u0000\u0000\u0000\u0000E\u0001\u0000\u0000\u0000\u0000"+
		"G\u0001\u0000\u0000\u0000\u0000I\u0001\u0000\u0000\u0000\u0000K\u0001"+
		"\u0000\u0000\u0000\u0001U\u0001\u0000\u0000\u0000\u0003`\u0001\u0000\u0000"+
		"\u0000\u0005b\u0001\u0000\u0000\u0000\u0007m\u0001\u0000\u0000\u0000\t"+
		"o\u0001\u0000\u0000\u0000\u000br\u0001\u0000\u0000\u0000\rt\u0001\u0000"+
		"\u0000\u0000\u000fv\u0001\u0000\u0000\u0000\u0011x\u0001\u0000\u0000\u0000"+
		"\u0013z\u0001\u0000\u0000\u0000\u0015~\u0001\u0000\u0000\u0000\u0017\u0080"+
		"\u0001\u0000\u0000\u0000\u0019\u0082\u0001\u0000\u0000\u0000\u001b\u0084"+
		"\u0001\u0000\u0000\u0000\u001d\u0087\u0001\u0000\u0000\u0000\u001f\u008a"+
		"\u0001\u0000\u0000\u0000!\u008d\u0001\u0000\u0000\u0000#\u0090\u0001\u0000"+
		"\u0000\u0000%\u0092\u0001\u0000\u0000\u0000\'\u0094\u0001\u0000\u0000"+
		"\u0000)\u0096\u0001\u0000\u0000\u0000+\u0099\u0001\u0000\u0000\u0000-"+
		"\u009e\u0001\u0000\u0000\u0000/\u00a3\u0001\u0000\u0000\u00001\u00a9\u0001"+
		"\u0000\u0000\u00003\u00ae\u0001\u0000\u0000\u00005\u00b0\u0001\u0000\u0000"+
		"\u00007\u00b4\u0001\u0000\u0000\u00009\u00ba\u0001\u0000\u0000\u0000;"+
		"\u00bc\u0001\u0000\u0000\u0000=\u00be\u0001\u0000\u0000\u0000?\u00c0\u0001"+
		"\u0000\u0000\u0000A\u00c2\u0001\u0000\u0000\u0000C\u00c4\u0001\u0000\u0000"+
		"\u0000E\u00c6\u0001\u0000\u0000\u0000G\u00c8\u0001\u0000\u0000\u0000I"+
		"\u00cb\u0001\u0000\u0000\u0000K\u00d0\u0001\u0000\u0000\u0000MV\u0005"+
		"0\u0000\u0000NR\u0007\u0000\u0000\u0000OQ\u0007\u0001\u0000\u0000PO\u0001"+
		"\u0000\u0000\u0000QT\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000"+
		"RS\u0001\u0000\u0000\u0000SV\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000"+
		"\u0000UM\u0001\u0000\u0000\u0000UN\u0001\u0000\u0000\u0000V\u0002\u0001"+
		"\u0000\u0000\u0000WX\u0005t\u0000\u0000XY\u0005r\u0000\u0000YZ\u0005u"+
		"\u0000\u0000Za\u0005e\u0000\u0000[\\\u0005f\u0000\u0000\\]\u0005a\u0000"+
		"\u0000]^\u0005l\u0000\u0000^_\u0005s\u0000\u0000_a\u0005e\u0000\u0000"+
		"`W\u0001\u0000\u0000\u0000`[\u0001\u0000\u0000\u0000a\u0004\u0001\u0000"+
		"\u0000\u0000bf\u0005\"\u0000\u0000ce\u0003\u0007\u0003\u0000dc\u0001\u0000"+
		"\u0000\u0000eh\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000fg\u0001"+
		"\u0000\u0000\u0000gi\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000"+
		"ij\u0005\"\u0000\u0000j\u0006\u0001\u0000\u0000\u0000kn\b\u0002\u0000"+
		"\u0000ln\u0003\t\u0004\u0000mk\u0001\u0000\u0000\u0000ml\u0001\u0000\u0000"+
		"\u0000n\b\u0001\u0000\u0000\u0000op\u0005\\\u0000\u0000pq\u0007\u0003"+
		"\u0000\u0000q\n\u0001\u0000\u0000\u0000rs\u0005+\u0000\u0000s\f\u0001"+
		"\u0000\u0000\u0000tu\u0005-\u0000\u0000u\u000e\u0001\u0000\u0000\u0000"+
		"vw\u0005*\u0000\u0000w\u0010\u0001\u0000\u0000\u0000xy\u0005/\u0000\u0000"+
		"y\u0012\u0001\u0000\u0000\u0000z{\u0005m\u0000\u0000{|\u0005o\u0000\u0000"+
		"|}\u0005d\u0000\u0000}\u0014\u0001\u0000\u0000\u0000~\u007f\u0005^\u0000"+
		"\u0000\u007f\u0016\u0001\u0000\u0000\u0000\u0080\u0081\u0005&\u0000\u0000"+
		"\u0081\u0018\u0001\u0000\u0000\u0000\u0082\u0083\u0005|\u0000\u0000\u0083"+
		"\u001a\u0001\u0000\u0000\u0000\u0084\u0085\u0005=\u0000\u0000\u0085\u0086"+
		"\u0005=\u0000\u0000\u0086\u001c\u0001\u0000\u0000\u0000\u0087\u0088\u0005"+
		"!\u0000\u0000\u0088\u0089\u0005=\u0000\u0000\u0089\u001e\u0001\u0000\u0000"+
		"\u0000\u008a\u008b\u0005<\u0000\u0000\u008b\u008c\u0005=\u0000\u0000\u008c"+
		" \u0001\u0000\u0000\u0000\u008d\u008e\u0005>\u0000\u0000\u008e\u008f\u0005"+
		"=\u0000\u0000\u008f\"\u0001\u0000\u0000\u0000\u0090\u0091\u0005<\u0000"+
		"\u0000\u0091$\u0001\u0000\u0000\u0000\u0092\u0093\u0005>\u0000\u0000\u0093"+
		"&\u0001\u0000\u0000\u0000\u0094\u0095\u0005!\u0000\u0000\u0095(\u0001"+
		"\u0000\u0000\u0000\u0096\u0097\u0005i\u0000\u0000\u0097\u0098\u0005f\u0000"+
		"\u0000\u0098*\u0001\u0000\u0000\u0000\u0099\u009a\u0005t\u0000\u0000\u009a"+
		"\u009b\u0005h\u0000\u0000\u009b\u009c\u0005e\u0000\u0000\u009c\u009d\u0005"+
		"n\u0000\u0000\u009d,\u0001\u0000\u0000\u0000\u009e\u009f\u0005e\u0000"+
		"\u0000\u009f\u00a0\u0005l\u0000\u0000\u00a0\u00a1\u0005s\u0000\u0000\u00a1"+
		"\u00a2\u0005e\u0000\u0000\u00a2.\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005"+
		"w\u0000\u0000\u00a4\u00a5\u0005h\u0000\u0000\u00a5\u00a6\u0005i\u0000"+
		"\u0000\u00a6\u00a7\u0005l\u0000\u0000\u00a7\u00a8\u0005e\u0000\u0000\u00a8"+
		"0\u0001\u0000\u0000\u0000\u00a9\u00aa\u0005s\u0000\u0000\u00aa\u00ab\u0005"+
		"k\u0000\u0000\u00ab\u00ac\u0005i\u0000\u0000\u00ac\u00ad\u0005p\u0000"+
		"\u0000\u00ad2\u0001\u0000\u0000\u0000\u00ae\u00af\u0005=\u0000\u0000\u00af"+
		"4\u0001\u0000\u0000\u0000\u00b0\u00b1\u0005o\u0000\u0000\u00b1\u00b2\u0005"+
		"u\u0000\u0000\u00b2\u00b3\u0005t\u0000\u0000\u00b36\u0001\u0000\u0000"+
		"\u0000\u00b4\u00b5\u0005t\u0000\u0000\u00b5\u00b6\u0005o\u0000\u0000\u00b6"+
		"\u00b7\u0005s\u0000\u0000\u00b7\u00b8\u0005t\u0000\u0000\u00b8\u00b9\u0005"+
		"r\u0000\u0000\u00b98\u0001\u0000\u0000\u0000\u00ba\u00bb\u0005.\u0000"+
		"\u0000\u00bb:\u0001\u0000\u0000\u0000\u00bc\u00bd\u0005(\u0000\u0000\u00bd"+
		"<\u0001\u0000\u0000\u0000\u00be\u00bf\u0005)\u0000\u0000\u00bf>\u0001"+
		"\u0000\u0000\u0000\u00c0\u00c1\u0005[\u0000\u0000\u00c1@\u0001\u0000\u0000"+
		"\u0000\u00c2\u00c3\u0005]\u0000\u0000\u00c3B\u0001\u0000\u0000\u0000\u00c4"+
		"\u00c5\u0005{\u0000\u0000\u00c5D\u0001\u0000\u0000\u0000\u00c6\u00c7\u0005"+
		"}\u0000\u0000\u00c7F\u0001\u0000\u0000\u0000\u00c8\u00c9\u0005;\u0000"+
		"\u0000\u00c9H\u0001\u0000\u0000\u0000\u00ca\u00cc\u0007\u0004\u0000\u0000"+
		"\u00cb\u00ca\u0001\u0000\u0000\u0000\u00cc\u00cd\u0001\u0000\u0000\u0000"+
		"\u00cd\u00cb\u0001\u0000\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000"+
		"\u00ceJ\u0001\u0000\u0000\u0000\u00cf\u00d1\u0007\u0005\u0000\u0000\u00d0"+
		"\u00cf\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000\u0000\u0000\u00d2"+
		"\u00d0\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3"+
		"\u00d4\u0001\u0000\u0000\u0000\u00d4\u00d5\u0006%\u0000\u0000\u00d5L\u0001"+
		"\u0000\u0000\u0000\b\u0000RU`fm\u00cd\u00d2\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}