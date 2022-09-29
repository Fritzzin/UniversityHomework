// Generated from Churumela.g by ANTLR 4.5.3


import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ChurumelaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PLUS=1, MINUS=2, TIMES=3, OVER=4, REMAINDER=5, OPEN_C=6, CLOSE_C=7, OPEN_P=8, 
		CLOSE_P=9, ATTRIB=10, FUNC=11, MAIN=12, PRINT=13, VAR=14, NUM=15, NL=16, 
		SPACE=17;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"PLUS", "MINUS", "TIMES", "OVER", "REMAINDER", "OPEN_C", "CLOSE_C", "OPEN_P", 
		"CLOSE_P", "ATTRIB", "FUNC", "MAIN", "PRINT", "VAR", "NUM", "NL", "SPACE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'+'", "'-'", "'*'", "'/'", "'%'", "'{'", "'}'", "'('", "')'", "'='", 
		"'function'", "'main'", "'print'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "PLUS", "MINUS", "TIMES", "OVER", "REMAINDER", "OPEN_C", "CLOSE_C", 
		"OPEN_P", "CLOSE_P", "ATTRIB", "FUNC", "MAIN", "PRINT", "VAR", "NUM", 
		"NL", "SPACE"
	};
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



	    public static void main(String[] args) throws Exception
	    {
	        ANTLRInputStream input = new ANTLRInputStream(System.in);
	        ChurumelaLexer lexer = new ChurumelaLexer(input);
	        CommonTokenStream tokens = new CommonTokenStream(lexer);
	        ChurumelaParser parser = new ChurumelaParser(tokens);

	        //symbol_table = new ArrayList<String>();        
	        parser.program();
	        //System.out.println("symbols: " + symbol_table);
	    }


	public ChurumelaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Churumela.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 16:
			SPACE_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void SPACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			 skip(); 
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\23c\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3"+
		"\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\17\6\17O\n\17\r\17\16\17P\3\20\6\20T\n"+
		"\20\r\20\16\20U\3\21\5\21Y\n\21\3\21\3\21\3\22\6\22^\n\22\r\22\16\22_"+
		"\3\22\3\22\2\2\23\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23\3\2\3\4\2\13\13\"\"f\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\3%\3\2\2\2\5\'\3"+
		"\2\2\2\7)\3\2\2\2\t+\3\2\2\2\13-\3\2\2\2\r/\3\2\2\2\17\61\3\2\2\2\21\63"+
		"\3\2\2\2\23\65\3\2\2\2\25\67\3\2\2\2\279\3\2\2\2\31B\3\2\2\2\33G\3\2\2"+
		"\2\35N\3\2\2\2\37S\3\2\2\2!X\3\2\2\2#]\3\2\2\2%&\7-\2\2&\4\3\2\2\2\'("+
		"\7/\2\2(\6\3\2\2\2)*\7,\2\2*\b\3\2\2\2+,\7\61\2\2,\n\3\2\2\2-.\7\'\2\2"+
		".\f\3\2\2\2/\60\7}\2\2\60\16\3\2\2\2\61\62\7\177\2\2\62\20\3\2\2\2\63"+
		"\64\7*\2\2\64\22\3\2\2\2\65\66\7+\2\2\66\24\3\2\2\2\678\7?\2\28\26\3\2"+
		"\2\29:\7h\2\2:;\7w\2\2;<\7p\2\2<=\7e\2\2=>\7v\2\2>?\7k\2\2?@\7q\2\2@A"+
		"\7p\2\2A\30\3\2\2\2BC\7o\2\2CD\7c\2\2DE\7k\2\2EF\7p\2\2F\32\3\2\2\2GH"+
		"\7r\2\2HI\7t\2\2IJ\7k\2\2JK\7p\2\2KL\7v\2\2L\34\3\2\2\2MO\4c|\2NM\3\2"+
		"\2\2OP\3\2\2\2PN\3\2\2\2PQ\3\2\2\2Q\36\3\2\2\2RT\4\62;\2SR\3\2\2\2TU\3"+
		"\2\2\2US\3\2\2\2UV\3\2\2\2V \3\2\2\2WY\7\17\2\2XW\3\2\2\2XY\3\2\2\2YZ"+
		"\3\2\2\2Z[\7\f\2\2[\"\3\2\2\2\\^\t\2\2\2]\\\3\2\2\2^_\3\2\2\2_]\3\2\2"+
		"\2_`\3\2\2\2`a\3\2\2\2ab\b\22\2\2b$\3\2\2\2\7\2PUX_\3\3\22\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}