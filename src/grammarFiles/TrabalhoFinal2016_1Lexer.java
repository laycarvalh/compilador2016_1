package grammarFiles;
// Generated from C:\Users\layca\Google Drive\UNIVERSIDADE\2016.1\Constru��o de Compiladores\Trabalho Final 2016.1\TrabalhoFinal2016_1.g4 by ANTLR 4.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TrabalhoFinal2016_1Lexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__39=1, T__38=2, T__37=3, T__36=4, T__35=5, T__34=6, T__33=7, T__32=8, 
		T__31=9, T__30=10, T__29=11, T__28=12, T__27=13, T__26=14, T__25=15, T__24=16, 
		T__23=17, T__22=18, T__21=19, T__20=20, T__19=21, T__18=22, T__17=23, 
		T__16=24, T__15=25, T__14=26, T__13=27, T__12=28, T__11=29, T__10=30, 
		T__9=31, T__8=32, T__7=33, T__6=34, T__5=35, T__4=36, T__3=37, T__2=38, 
		T__1=39, T__0=40, STRING=41, BOOLEAN=42, ID=43, INT=44, REAL=45, WS=46, 
		SL_COMMENT=47, SL_COMMENTM=48;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'read'", "']'", "','", "'exit'", "'['", "'while'", "'-'", "'*'", "'('", 
		"':'", "'if'", "'program'", "'int'", "'<'", "'main'", "'!='", "'<='", 
		"'{'", "'break'", "'final'", "'else'", "'}'", "'boolean'", "')'", "'step'", 
		"'+'", "'print'", "'for'", "'<>'", "'return'", "'='", "';'", "'>'", "'then'", 
		"'string'", "'=='", "'/'", "'>='", "'!'", "'real'", "STRING", "BOOLEAN", 
		"ID", "INT", "REAL", "WS", "SL_COMMENT", "SL_COMMENTM"
	};
	public static final String[] ruleNames = {
		"T__39", "T__38", "T__37", "T__36", "T__35", "T__34", "T__33", "T__32", 
		"T__31", "T__30", "T__29", "T__28", "T__27", "T__26", "T__25", "T__24", 
		"T__23", "T__22", "T__21", "T__20", "T__19", "T__18", "T__17", "T__16", 
		"T__15", "T__14", "T__13", "T__12", "T__11", "T__10", "T__9", "T__8", 
		"T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "STRING", 
		"BOOLEAN", "ID", "INT", "REAL", "WS", "SL_COMMENT", "SL_COMMENTM"
	};


	public TrabalhoFinal2016_1Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TrabalhoFinal2016_1.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 45: WS_action((RuleContext)_localctx, actionIndex); break;

		case 46: SL_COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 47: SL_COMMENTM_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}
	private void SL_COMMENTM_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2: skip();  break;
		}
	}
	private void SL_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\62\u0149\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3"+
		"\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3"+
		"\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3#\3#\3$\3$"+
		"\3$\3$\3$\3$\3$\3%\3%\3%\3&\3&\3\'\3\'\3\'\3(\3(\3)\3)\3)\3)\3)\3*\3*"+
		"\7*\u00fb\n*\f*\16*\u00fe\13*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u010b"+
		"\n+\3,\3,\7,\u010f\n,\f,\16,\u0112\13,\3-\3-\7-\u0116\n-\f-\16-\u0119"+
		"\13-\3.\6.\u011c\n.\r.\16.\u011d\3.\3.\6.\u0122\n.\r.\16.\u0123\5.\u0126"+
		"\n.\3/\6/\u0129\n/\r/\16/\u012a\3/\3/\3\60\3\60\3\60\3\60\7\60\u0133\n"+
		"\60\f\60\16\60\u0136\13\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\7\61"+
		"\u0140\n\61\f\61\16\61\u0143\13\61\3\61\3\61\3\61\3\61\3\61\5\u00fc\u0134"+
		"\u0141\62\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25"+
		"\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)"+
		"\26\1+\27\1-\30\1/\31\1\61\32\1\63\33\1\65\34\1\67\35\19\36\1;\37\1= "+
		"\1?!\1A\"\1C#\1E$\1G%\1I&\1K\'\1M(\1O)\1Q*\1S+\1U,\1W-\1Y.\1[/\1]\60\2"+
		"_\61\3a\62\4\3\2\6\4\2C\\c|\6\2\62;C\\aac|\3\2\62;\5\2\13\f\17\17\"\""+
		"\u0152\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2"+
		"G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3"+
		"\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2"+
		"\2\2a\3\2\2\2\3c\3\2\2\2\5h\3\2\2\2\7j\3\2\2\2\tl\3\2\2\2\13q\3\2\2\2"+
		"\rs\3\2\2\2\17y\3\2\2\2\21{\3\2\2\2\23}\3\2\2\2\25\177\3\2\2\2\27\u0081"+
		"\3\2\2\2\31\u0084\3\2\2\2\33\u008c\3\2\2\2\35\u0090\3\2\2\2\37\u0092\3"+
		"\2\2\2!\u0097\3\2\2\2#\u009a\3\2\2\2%\u009d\3\2\2\2\'\u009f\3\2\2\2)\u00a5"+
		"\3\2\2\2+\u00ab\3\2\2\2-\u00b0\3\2\2\2/\u00b2\3\2\2\2\61\u00ba\3\2\2\2"+
		"\63\u00bc\3\2\2\2\65\u00c1\3\2\2\2\67\u00c3\3\2\2\29\u00c9\3\2\2\2;\u00cd"+
		"\3\2\2\2=\u00d0\3\2\2\2?\u00d7\3\2\2\2A\u00d9\3\2\2\2C\u00db\3\2\2\2E"+
		"\u00dd\3\2\2\2G\u00e2\3\2\2\2I\u00e9\3\2\2\2K\u00ec\3\2\2\2M\u00ee\3\2"+
		"\2\2O\u00f1\3\2\2\2Q\u00f3\3\2\2\2S\u00f8\3\2\2\2U\u010a\3\2\2\2W\u010c"+
		"\3\2\2\2Y\u0113\3\2\2\2[\u011b\3\2\2\2]\u0128\3\2\2\2_\u012e\3\2\2\2a"+
		"\u013b\3\2\2\2cd\7t\2\2de\7g\2\2ef\7c\2\2fg\7f\2\2g\4\3\2\2\2hi\7_\2\2"+
		"i\6\3\2\2\2jk\7.\2\2k\b\3\2\2\2lm\7g\2\2mn\7z\2\2no\7k\2\2op\7v\2\2p\n"+
		"\3\2\2\2qr\7]\2\2r\f\3\2\2\2st\7y\2\2tu\7j\2\2uv\7k\2\2vw\7n\2\2wx\7g"+
		"\2\2x\16\3\2\2\2yz\7/\2\2z\20\3\2\2\2{|\7,\2\2|\22\3\2\2\2}~\7*\2\2~\24"+
		"\3\2\2\2\177\u0080\7<\2\2\u0080\26\3\2\2\2\u0081\u0082\7k\2\2\u0082\u0083"+
		"\7h\2\2\u0083\30\3\2\2\2\u0084\u0085\7r\2\2\u0085\u0086\7t\2\2\u0086\u0087"+
		"\7q\2\2\u0087\u0088\7i\2\2\u0088\u0089\7t\2\2\u0089\u008a\7c\2\2\u008a"+
		"\u008b\7o\2\2\u008b\32\3\2\2\2\u008c\u008d\7k\2\2\u008d\u008e\7p\2\2\u008e"+
		"\u008f\7v\2\2\u008f\34\3\2\2\2\u0090\u0091\7>\2\2\u0091\36\3\2\2\2\u0092"+
		"\u0093\7o\2\2\u0093\u0094\7c\2\2\u0094\u0095\7k\2\2\u0095\u0096\7p\2\2"+
		"\u0096 \3\2\2\2\u0097\u0098\7#\2\2\u0098\u0099\7?\2\2\u0099\"\3\2\2\2"+
		"\u009a\u009b\7>\2\2\u009b\u009c\7?\2\2\u009c$\3\2\2\2\u009d\u009e\7}\2"+
		"\2\u009e&\3\2\2\2\u009f\u00a0\7d\2\2\u00a0\u00a1\7t\2\2\u00a1\u00a2\7"+
		"g\2\2\u00a2\u00a3\7c\2\2\u00a3\u00a4\7m\2\2\u00a4(\3\2\2\2\u00a5\u00a6"+
		"\7h\2\2\u00a6\u00a7\7k\2\2\u00a7\u00a8\7p\2\2\u00a8\u00a9\7c\2\2\u00a9"+
		"\u00aa\7n\2\2\u00aa*\3\2\2\2\u00ab\u00ac\7g\2\2\u00ac\u00ad\7n\2\2\u00ad"+
		"\u00ae\7u\2\2\u00ae\u00af\7g\2\2\u00af,\3\2\2\2\u00b0\u00b1\7\177\2\2"+
		"\u00b1.\3\2\2\2\u00b2\u00b3\7d\2\2\u00b3\u00b4\7q\2\2\u00b4\u00b5\7q\2"+
		"\2\u00b5\u00b6\7n\2\2\u00b6\u00b7\7g\2\2\u00b7\u00b8\7c\2\2\u00b8\u00b9"+
		"\7p\2\2\u00b9\60\3\2\2\2\u00ba\u00bb\7+\2\2\u00bb\62\3\2\2\2\u00bc\u00bd"+
		"\7u\2\2\u00bd\u00be\7v\2\2\u00be\u00bf\7g\2\2\u00bf\u00c0\7r\2\2\u00c0"+
		"\64\3\2\2\2\u00c1\u00c2\7-\2\2\u00c2\66\3\2\2\2\u00c3\u00c4\7r\2\2\u00c4"+
		"\u00c5\7t\2\2\u00c5\u00c6\7k\2\2\u00c6\u00c7\7p\2\2\u00c7\u00c8\7v\2\2"+
		"\u00c88\3\2\2\2\u00c9\u00ca\7h\2\2\u00ca\u00cb\7q\2\2\u00cb\u00cc\7t\2"+
		"\2\u00cc:\3\2\2\2\u00cd\u00ce\7>\2\2\u00ce\u00cf\7@\2\2\u00cf<\3\2\2\2"+
		"\u00d0\u00d1\7t\2\2\u00d1\u00d2\7g\2\2\u00d2\u00d3\7v\2\2\u00d3\u00d4"+
		"\7w\2\2\u00d4\u00d5\7t\2\2\u00d5\u00d6\7p\2\2\u00d6>\3\2\2\2\u00d7\u00d8"+
		"\7?\2\2\u00d8@\3\2\2\2\u00d9\u00da\7=\2\2\u00daB\3\2\2\2\u00db\u00dc\7"+
		"@\2\2\u00dcD\3\2\2\2\u00dd\u00de\7v\2\2\u00de\u00df\7j\2\2\u00df\u00e0"+
		"\7g\2\2\u00e0\u00e1\7p\2\2\u00e1F\3\2\2\2\u00e2\u00e3\7u\2\2\u00e3\u00e4"+
		"\7v\2\2\u00e4\u00e5\7t\2\2\u00e5\u00e6\7k\2\2\u00e6\u00e7\7p\2\2\u00e7"+
		"\u00e8\7i\2\2\u00e8H\3\2\2\2\u00e9\u00ea\7?\2\2\u00ea\u00eb\7?\2\2\u00eb"+
		"J\3\2\2\2\u00ec\u00ed\7\61\2\2\u00edL\3\2\2\2\u00ee\u00ef\7@\2\2\u00ef"+
		"\u00f0\7?\2\2\u00f0N\3\2\2\2\u00f1\u00f2\7#\2\2\u00f2P\3\2\2\2\u00f3\u00f4"+
		"\7t\2\2\u00f4\u00f5\7g\2\2\u00f5\u00f6\7c\2\2\u00f6\u00f7\7n\2\2\u00f7"+
		"R\3\2\2\2\u00f8\u00fc\7$\2\2\u00f9\u00fb\13\2\2\2\u00fa\u00f9\3\2\2\2"+
		"\u00fb\u00fe\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\u00ff"+
		"\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff\u0100\7$\2\2\u0100T\3\2\2\2\u0101\u0102"+
		"\7V\2\2\u0102\u0103\7T\2\2\u0103\u0104\7W\2\2\u0104\u010b\7G\2\2\u0105"+
		"\u0106\7H\2\2\u0106\u0107\7C\2\2\u0107\u0108\7N\2\2\u0108\u0109\7U\2\2"+
		"\u0109\u010b\7G\2\2\u010a\u0101\3\2\2\2\u010a\u0105\3\2\2\2\u010bV\3\2"+
		"\2\2\u010c\u0110\t\2\2\2\u010d\u010f\t\3\2\2\u010e\u010d\3\2\2\2\u010f"+
		"\u0112\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111X\3\2\2\2"+
		"\u0112\u0110\3\2\2\2\u0113\u0117\t\4\2\2\u0114\u0116\t\4\2\2\u0115\u0114"+
		"\3\2\2\2\u0116\u0119\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118"+
		"Z\3\2\2\2\u0119\u0117\3\2\2\2\u011a\u011c\t\4\2\2\u011b\u011a\3\2\2\2"+
		"\u011c\u011d\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u0125"+
		"\3\2\2\2\u011f\u0121\7\60\2\2\u0120\u0122\t\4\2\2\u0121\u0120\3\2\2\2"+
		"\u0122\u0123\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0126"+
		"\3\2\2\2\u0125\u011f\3\2\2\2\u0125\u0126\3\2\2\2\u0126\\\3\2\2\2\u0127"+
		"\u0129\t\5\2\2\u0128\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u0128\3\2"+
		"\2\2\u012a\u012b\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012d\b/\2\2\u012d"+
		"^\3\2\2\2\u012e\u012f\7\61\2\2\u012f\u0130\7\61\2\2\u0130\u0134\3\2\2"+
		"\2\u0131\u0133\13\2\2\2\u0132\u0131\3\2\2\2\u0133\u0136\3\2\2\2\u0134"+
		"\u0135\3\2\2\2\u0134\u0132\3\2\2\2\u0135\u0137\3\2\2\2\u0136\u0134\3\2"+
		"\2\2\u0137\u0138\7\f\2\2\u0138\u0139\3\2\2\2\u0139\u013a\b\60\3\2\u013a"+
		"`\3\2\2\2\u013b\u013c\7\61\2\2\u013c\u013d\7,\2\2\u013d\u0141\3\2\2\2"+
		"\u013e\u0140\13\2\2\2\u013f\u013e\3\2\2\2\u0140\u0143\3\2\2\2\u0141\u0142"+
		"\3\2\2\2\u0141\u013f\3\2\2\2\u0142\u0144\3\2\2\2\u0143\u0141\3\2\2\2\u0144"+
		"\u0145\7,\2\2\u0145\u0146\7\61\2\2\u0146\u0147\3\2\2\2\u0147\u0148\b\61"+
		"\4\2\u0148b\3\2\2\2\r\2\u00fc\u010a\u0110\u0117\u011d\u0123\u0125\u012a"+
		"\u0134\u0141";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}