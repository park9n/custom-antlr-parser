// Generated from /home/cspark/git/custom-antlr-parser/CPP14Lexer.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CPP14Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MultiLineMacro=1, Directive=2, Alignas=3, Alignof=4, Asm=5, Auto=6, Bool=7, 
		Break=8, Case=9, Catch=10, Char=11, Char16=12, Char32=13, Class=14, Const=15, 
		Constexpr=16, Const_cast=17, Continue=18, Decltype=19, Default=20, Delete=21, 
		Do=22, Double=23, Dynamic_cast=24, Else=25, Enum=26, Explicit=27, Export=28, 
		Extern=29, False=30, Final=31, Float=32, For=33, Friend=34, Goto=35, If=36, 
		Inline=37, Int=38, Long=39, Mutable=40, Namespace=41, New=42, Noexcept=43, 
		Nullptr=44, Operator=45, Override=46, Private=47, Protected=48, Public=49, 
		Register=50, Reinterpret_cast=51, Return=52, Short=53, Signed=54, Sizeof=55, 
		Static=56, Static_assert=57, Static_cast=58, Struct=59, Switch=60, Template=61, 
		This=62, Thread_local=63, Throw=64, True=65, Try=66, Typedef=67, Typeid_=68, 
		Typename_=69, Union=70, Unsigned=71, Using=72, Virtual=73, Void=74, Volatile=75, 
		Wchar=76, While=77, LeftParen=78, RightParen=79, LeftBracket=80, RightBracket=81, 
		LeftBrace=82, RightBrace=83, Plus=84, Minus=85, Star=86, Div=87, Mod=88, 
		Caret=89, And=90, Or=91, Tilde=92, Not=93, AlternativeNot=94, Assign=95, 
		Less=96, Greater=97, PlusAssign=98, MinusAssign=99, StarAssign=100, DivAssign=101, 
		ModAssign=102, XorAssign=103, AndAssign=104, OrAssign=105, LeftShift=106, 
		LeftShiftAssign=107, RightShiftAssign=108, Equal=109, NotEqual=110, LessEqual=111, 
		GreaterEqual=112, AndAnd=113, AlternativeAndAnd=114, OrOr=115, AlternativeOrOr=116, 
		PlusPlus=117, MinusMinus=118, Comma=119, ArrowStar=120, Arrow=121, Question=122, 
		Colon=123, Doublecolon=124, Semi=125, Dot=126, DotStar=127, Ellipsis=128, 
		Identifier=129, Integerliteral=130, Decimalliteral=131, Octalliteral=132, 
		Hexadecimalliteral=133, Binaryliteral=134, Integersuffix=135, Characterliteral=136, 
		Floatingliteral=137, Stringliteral=138, Userdefinedintegerliteral=139, 
		Userdefinedfloatingliteral=140, Userdefinedstringliteral=141, Userdefinedcharacterliteral=142, 
		Whitespace=143, Newline=144, BlockComment=145, LineComment=146;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"MultiLineMacro", "Directive", "Alignas", "Alignof", "Asm", "Auto", "Bool", 
			"Break", "Case", "Catch", "Char", "Char16", "Char32", "Class", "Const", 
			"Constexpr", "Const_cast", "Continue", "Decltype", "Default", "Delete", 
			"Do", "Double", "Dynamic_cast", "Else", "Enum", "Explicit", "Export", 
			"Extern", "False", "Final", "Float", "For", "Friend", "Goto", "If", "Inline", 
			"Int", "Long", "Mutable", "Namespace", "New", "Noexcept", "Nullptr", 
			"Operator", "Override", "Private", "Protected", "Public", "Register", 
			"Reinterpret_cast", "Return", "Short", "Signed", "Sizeof", "Static", 
			"Static_assert", "Static_cast", "Struct", "Switch", "Template", "This", 
			"Thread_local", "Throw", "True", "Try", "Typedef", "Typeid_", "Typename_", 
			"Union", "Unsigned", "Using", "Virtual", "Void", "Volatile", "Wchar", 
			"While", "LeftParen", "RightParen", "LeftBracket", "RightBracket", "LeftBrace", 
			"RightBrace", "Plus", "Minus", "Star", "Div", "Mod", "Caret", "And", 
			"Or", "Tilde", "Not", "AlternativeNot", "Assign", "Less", "Greater", 
			"PlusAssign", "MinusAssign", "StarAssign", "DivAssign", "ModAssign", 
			"XorAssign", "AndAssign", "OrAssign", "LeftShift", "LeftShiftAssign", 
			"RightShiftAssign", "Equal", "NotEqual", "LessEqual", "GreaterEqual", 
			"AndAnd", "AlternativeAndAnd", "OrOr", "AlternativeOrOr", "PlusPlus", 
			"MinusMinus", "Comma", "ArrowStar", "Arrow", "Question", "Colon", "Doublecolon", 
			"Semi", "Dot", "DotStar", "Ellipsis", "Hexquad", "Universalcharactername", 
			"Identifier", "Identifiernondigit", "NONDIGIT", "DIGIT", "Integerliteral", 
			"Decimalliteral", "Octalliteral", "Hexadecimalliteral", "Binaryliteral", 
			"NONZERODIGIT", "OCTALDIGIT", "HEXADECIMALDIGIT", "BINARYDIGIT", "Integersuffix", 
			"Unsignedsuffix", "Longsuffix", "Longlongsuffix", "Characterliteral", 
			"Cchar", "Escapesequence", "Simpleescapesequence", "Octalescapesequence", 
			"Hexadecimalescapesequence", "Floatingliteral", "Fractionalconstant", 
			"Exponentpart", "SIGN", "Digitsequence", "Floatingsuffix", "Stringliteral", 
			"Encodingprefix", "Schar", "Rawstring", "Userdefinedintegerliteral", 
			"Userdefinedfloatingliteral", "Userdefinedstringliteral", "Userdefinedcharacterliteral", 
			"Udsuffix", "Whitespace", "Newline", "BlockComment", "LineComment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'alignas'", "'alignof'", "'asm'", "'auto'", "'bool'", 
			"'break'", "'case'", "'catch'", "'char'", "'char16_t'", "'char32_t'", 
			"'class'", "'const'", "'constexpr'", "'const_cast'", "'continue'", "'decltype'", 
			"'default'", "'delete'", "'do'", "'double'", "'dynamic_cast'", "'else'", 
			"'enum'", "'explicit'", "'export'", "'extern'", "'false'", "'final'", 
			"'float'", "'for'", "'friend'", "'goto'", "'if'", "'inline'", "'int'", 
			"'long'", "'mutable'", "'namespace'", "'new'", "'noexcept'", "'nullptr'", 
			"'operator'", "'override'", "'private'", "'protected'", "'public'", "'register'", 
			"'reinterpret_cast'", "'return'", "'short'", "'signed'", "'sizeof'", 
			"'static'", "'static_assert'", "'static_cast'", "'struct'", "'switch'", 
			"'template'", "'this'", "'thread_local'", "'throw'", "'true'", "'try'", 
			"'typedef'", "'typeid'", "'typename'", "'union'", "'unsigned'", "'using'", 
			"'virtual'", "'void'", "'volatile'", "'wchar_t'", "'while'", "'('", "')'", 
			"'['", "']'", "'{'", "'}'", "'+'", "'-'", "'*'", "'/'", "'%'", "'^'", 
			"'&'", "'|'", "'~'", "'!'", "'not'", "'='", "'<'", "'>'", "'+='", "'-='", 
			"'*='", "'/='", "'%='", "'^='", "'&='", "'|='", "'<<'", "'<<='", "'>>='", 
			"'=='", "'!='", "'<='", "'>='", "'&&'", "'and'", "'||'", "'or'", "'++'", 
			"'--'", "','", "'->*'", "'->'", "'?'", "':'", "'::'", "';'", "'.'", "'.*'", 
			"'...'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MultiLineMacro", "Directive", "Alignas", "Alignof", "Asm", "Auto", 
			"Bool", "Break", "Case", "Catch", "Char", "Char16", "Char32", "Class", 
			"Const", "Constexpr", "Const_cast", "Continue", "Decltype", "Default", 
			"Delete", "Do", "Double", "Dynamic_cast", "Else", "Enum", "Explicit", 
			"Export", "Extern", "False", "Final", "Float", "For", "Friend", "Goto", 
			"If", "Inline", "Int", "Long", "Mutable", "Namespace", "New", "Noexcept", 
			"Nullptr", "Operator", "Override", "Private", "Protected", "Public", 
			"Register", "Reinterpret_cast", "Return", "Short", "Signed", "Sizeof", 
			"Static", "Static_assert", "Static_cast", "Struct", "Switch", "Template", 
			"This", "Thread_local", "Throw", "True", "Try", "Typedef", "Typeid_", 
			"Typename_", "Union", "Unsigned", "Using", "Virtual", "Void", "Volatile", 
			"Wchar", "While", "LeftParen", "RightParen", "LeftBracket", "RightBracket", 
			"LeftBrace", "RightBrace", "Plus", "Minus", "Star", "Div", "Mod", "Caret", 
			"And", "Or", "Tilde", "Not", "AlternativeNot", "Assign", "Less", "Greater", 
			"PlusAssign", "MinusAssign", "StarAssign", "DivAssign", "ModAssign", 
			"XorAssign", "AndAssign", "OrAssign", "LeftShift", "LeftShiftAssign", 
			"RightShiftAssign", "Equal", "NotEqual", "LessEqual", "GreaterEqual", 
			"AndAnd", "AlternativeAndAnd", "OrOr", "AlternativeOrOr", "PlusPlus", 
			"MinusMinus", "Comma", "ArrowStar", "Arrow", "Question", "Colon", "Doublecolon", 
			"Semi", "Dot", "DotStar", "Ellipsis", "Identifier", "Integerliteral", 
			"Decimalliteral", "Octalliteral", "Hexadecimalliteral", "Binaryliteral", 
			"Integersuffix", "Characterliteral", "Floatingliteral", "Stringliteral", 
			"Userdefinedintegerliteral", "Userdefinedfloatingliteral", "Userdefinedstringliteral", 
			"Userdefinedcharacterliteral", "Whitespace", "Newline", "BlockComment", 
			"LineComment"
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


	public CPP14Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CPP14Lexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\u0094\u05bf\b\1\4"+
		"\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n"+
		"\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4"+
		"I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\t"+
		"T\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_"+
		"\4`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k"+
		"\tk\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv"+
		"\4w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t"+
		"\u0080\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084"+
		"\4\u0085\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089"+
		"\t\u0089\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d"+
		"\4\u008e\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092"+
		"\t\u0092\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096"+
		"\4\u0097\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b"+
		"\t\u009b\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f"+
		"\4\u00a0\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4"+
		"\t\u00a4\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8"+
		"\4\u00a9\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad"+
		"\t\u00ad\3\2\3\2\7\2\u015e\n\2\f\2\16\2\u0161\13\2\3\2\3\2\5\2\u0165\n"+
		"\2\3\2\6\2\u0168\n\2\r\2\16\2\u0169\3\2\6\2\u016d\n\2\r\2\16\2\u016e\3"+
		"\2\3\2\3\3\3\3\7\3\u0175\n\3\f\3\16\3\u0178\13\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33"+
		"\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3"+
		"#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'"+
		"\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3"+
		"*\3*\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3"+
		".\3.\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3"+
		"\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3"+
		"\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3"+
		"\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3"+
		"\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\38\38\38\3"+
		"8\38\38\38\39\39\39\39\39\39\39\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3"+
		":\3:\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3=\3=\3"+
		"=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3>\3>\3>\3>\3?\3?\3?\3?\3?\3@\3@\3@\3@\3"+
		"@\3@\3@\3@\3@\3@\3@\3@\3@\3A\3A\3A\3A\3A\3A\3B\3B\3B\3B\3B\3C\3C\3C\3"+
		"C\3D\3D\3D\3D\3D\3D\3D\3D\3E\3E\3E\3E\3E\3E\3E\3F\3F\3F\3F\3F\3F\3F\3"+
		"F\3F\3G\3G\3G\3G\3G\3G\3H\3H\3H\3H\3H\3H\3H\3H\3H\3I\3I\3I\3I\3I\3I\3"+
		"J\3J\3J\3J\3J\3J\3J\3J\3K\3K\3K\3K\3K\3L\3L\3L\3L\3L\3L\3L\3L\3L\3M\3"+
		"M\3M\3M\3M\3M\3M\3M\3N\3N\3N\3N\3N\3N\3O\3O\3P\3P\3Q\3Q\3R\3R\3S\3S\3"+
		"T\3T\3U\3U\3V\3V\3W\3W\3X\3X\3Y\3Y\3Z\3Z\3[\3[\3\\\3\\\3]\3]\3^\3^\3_"+
		"\3_\3_\3_\3`\3`\3a\3a\3b\3b\3c\3c\3c\3d\3d\3d\3e\3e\3e\3f\3f\3f\3g\3g"+
		"\3g\3h\3h\3h\3i\3i\3i\3j\3j\3j\3k\3k\3k\3l\3l\3l\3l\3m\3m\3m\3m\3n\3n"+
		"\3n\3o\3o\3o\3p\3p\3p\3q\3q\3q\3r\3r\3r\3s\3s\3s\3s\3t\3t\3t\3u\3u\3u"+
		"\3v\3v\3v\3w\3w\3w\3x\3x\3y\3y\3y\3y\3z\3z\3z\3{\3{\3|\3|\3}\3}\3}\3~"+
		"\3~\3\177\3\177\3\u0080\3\u0080\3\u0080\3\u0081\3\u0081\3\u0081\3\u0081"+
		"\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0083\3\u0083\3\u0083\3\u0083"+
		"\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\5\u0083\u0438\n\u0083"+
		"\3\u0084\3\u0084\3\u0084\7\u0084\u043d\n\u0084\f\u0084\16\u0084\u0440"+
		"\13\u0084\3\u0085\3\u0085\5\u0085\u0444\n\u0085\3\u0086\3\u0086\3\u0087"+
		"\3\u0087\3\u0088\3\u0088\5\u0088\u044c\n\u0088\3\u0088\3\u0088\5\u0088"+
		"\u0450\n\u0088\3\u0088\3\u0088\5\u0088\u0454\n\u0088\3\u0088\3\u0088\5"+
		"\u0088\u0458\n\u0088\5\u0088\u045a\n\u0088\3\u0089\3\u0089\5\u0089\u045e"+
		"\n\u0089\3\u0089\7\u0089\u0461\n\u0089\f\u0089\16\u0089\u0464\13\u0089"+
		"\3\u008a\3\u008a\5\u008a\u0468\n\u008a\3\u008a\7\u008a\u046b\n\u008a\f"+
		"\u008a\16\u008a\u046e\13\u008a\3\u008b\3\u008b\3\u008b\3\u008b\5\u008b"+
		"\u0474\n\u008b\3\u008b\3\u008b\5\u008b\u0478\n\u008b\3\u008b\7\u008b\u047b"+
		"\n\u008b\f\u008b\16\u008b\u047e\13\u008b\3\u008c\3\u008c\3\u008c\3\u008c"+
		"\5\u008c\u0484\n\u008c\3\u008c\3\u008c\5\u008c\u0488\n\u008c\3\u008c\7"+
		"\u008c\u048b\n\u008c\f\u008c\16\u008c\u048e\13\u008c\3\u008d\3\u008d\3"+
		"\u008e\3\u008e\3\u008f\3\u008f\3\u0090\3\u0090\3\u0091\3\u0091\5\u0091"+
		"\u049a\n\u0091\3\u0091\3\u0091\5\u0091\u049e\n\u0091\3\u0091\3\u0091\5"+
		"\u0091\u04a2\n\u0091\3\u0091\3\u0091\5\u0091\u04a6\n\u0091\5\u0091\u04a8"+
		"\n\u0091\3\u0092\3\u0092\3\u0093\3\u0093\3\u0094\3\u0094\3\u0094\3\u0094"+
		"\5\u0094\u04b2\n\u0094\3\u0095\3\u0095\6\u0095\u04b6\n\u0095\r\u0095\16"+
		"\u0095\u04b7\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\6\u0095\u04bf\n\u0095"+
		"\r\u0095\16\u0095\u04c0\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\6\u0095"+
		"\u04c8\n\u0095\r\u0095\16\u0095\u04c9\3\u0095\3\u0095\3\u0095\3\u0095"+
		"\3\u0095\6\u0095\u04d1\n\u0095\r\u0095\16\u0095\u04d2\3\u0095\3\u0095"+
		"\5\u0095\u04d7\n\u0095\3\u0096\3\u0096\3\u0096\5\u0096\u04dc\n\u0096\3"+
		"\u0097\3\u0097\3\u0097\5\u0097\u04e1\n\u0097\3\u0098\3\u0098\3\u0098\3"+
		"\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098"+
		"\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098"+
		"\3\u0098\5\u0098\u04f9\n\u0098\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099"+
		"\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\5\u0099\u0506\n\u0099"+
		"\3\u009a\3\u009a\3\u009a\3\u009a\6\u009a\u050c\n\u009a\r\u009a\16\u009a"+
		"\u050d\3\u009b\3\u009b\5\u009b\u0512\n\u009b\3\u009b\5\u009b\u0515\n\u009b"+
		"\3\u009b\3\u009b\3\u009b\5\u009b\u051a\n\u009b\5\u009b\u051c\n\u009b\3"+
		"\u009c\5\u009c\u051f\n\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\5"+
		"\u009c\u0526\n\u009c\3\u009d\3\u009d\5\u009d\u052a\n\u009d\3\u009d\3\u009d"+
		"\3\u009d\5\u009d\u052f\n\u009d\3\u009d\5\u009d\u0532\n\u009d\3\u009e\3"+
		"\u009e\3\u009f\3\u009f\5\u009f\u0538\n\u009f\3\u009f\7\u009f\u053b\n\u009f"+
		"\f\u009f\16\u009f\u053e\13\u009f\3\u00a0\3\u00a0\3\u00a1\5\u00a1\u0543"+
		"\n\u00a1\3\u00a1\3\u00a1\7\u00a1\u0547\n\u00a1\f\u00a1\16\u00a1\u054a"+
		"\13\u00a1\3\u00a1\3\u00a1\5\u00a1\u054e\n\u00a1\3\u00a1\3\u00a1\5\u00a1"+
		"\u0552\n\u00a1\3\u00a2\3\u00a2\3\u00a2\5\u00a2\u0557\n\u00a2\3\u00a3\3"+
		"\u00a3\3\u00a3\5\u00a3\u055c\n\u00a3\3\u00a4\3\u00a4\7\u00a4\u0560\n\u00a4"+
		"\f\u00a4\16\u00a4\u0563\13\u00a4\3\u00a4\3\u00a4\7\u00a4\u0567\n\u00a4"+
		"\f\u00a4\16\u00a4\u056a\13\u00a4\3\u00a4\3\u00a4\7\u00a4\u056e\n\u00a4"+
		"\f\u00a4\16\u00a4\u0571\13\u00a4\3\u00a4\3\u00a4\3\u00a5\3\u00a5\3\u00a5"+
		"\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5"+
		"\5\u00a5\u0581\n\u00a5\3\u00a6\3\u00a6\5\u00a6\u0585\n\u00a6\3\u00a6\3"+
		"\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6\5\u00a6\u058d\n\u00a6\3\u00a7\3"+
		"\u00a7\3\u00a7\3\u00a8\3\u00a8\3\u00a8\3\u00a9\3\u00a9\3\u00aa\6\u00aa"+
		"\u0598\n\u00aa\r\u00aa\16\u00aa\u0599\3\u00aa\3\u00aa\3\u00ab\3\u00ab"+
		"\5\u00ab\u05a0\n\u00ab\3\u00ab\5\u00ab\u05a3\n\u00ab\3\u00ab\3\u00ab\3"+
		"\u00ac\3\u00ac\3\u00ac\3\u00ac\7\u00ac\u05ab\n\u00ac\f\u00ac\16\u00ac"+
		"\u05ae\13\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ad\3\u00ad"+
		"\3\u00ad\3\u00ad\7\u00ad\u05b9\n\u00ad\f\u00ad\16\u00ad\u05bc\13\u00ad"+
		"\3\u00ad\3\u00ad\7\u015f\u0561\u0568\u056f\u05ac\2\u00ae\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{"+
		"?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091"+
		"J\u0093K\u0095L\u0097M\u0099N\u009bO\u009dP\u009fQ\u00a1R\u00a3S\u00a5"+
		"T\u00a7U\u00a9V\u00abW\u00adX\u00afY\u00b1Z\u00b3[\u00b5\\\u00b7]\u00b9"+
		"^\u00bb_\u00bd`\u00bfa\u00c1b\u00c3c\u00c5d\u00c7e\u00c9f\u00cbg\u00cd"+
		"h\u00cfi\u00d1j\u00d3k\u00d5l\u00d7m\u00d9n\u00dbo\u00ddp\u00dfq\u00e1"+
		"r\u00e3s\u00e5t\u00e7u\u00e9v\u00ebw\u00edx\u00efy\u00f1z\u00f3{\u00f5"+
		"|\u00f7}\u00f9~\u00fb\177\u00fd\u0080\u00ff\u0081\u0101\u0082\u0103\2"+
		"\u0105\2\u0107\u0083\u0109\2\u010b\2\u010d\2\u010f\u0084\u0111\u0085\u0113"+
		"\u0086\u0115\u0087\u0117\u0088\u0119\2\u011b\2\u011d\2\u011f\2\u0121\u0089"+
		"\u0123\2\u0125\2\u0127\2\u0129\u008a\u012b\2\u012d\2\u012f\2\u0131\2\u0133"+
		"\2\u0135\u008b\u0137\2\u0139\2\u013b\2\u013d\2\u013f\2\u0141\u008c\u0143"+
		"\2\u0145\2\u0147\2\u0149\u008d\u014b\u008e\u014d\u008f\u014f\u0090\u0151"+
		"\2\u0153\u0091\u0155\u0092\u0157\u0093\u0159\u0094\3\2\22\3\2\f\f\5\2"+
		"C\\aac|\3\2\62;\3\2\63;\3\2\629\5\2\62;CHch\3\2\62\63\4\2WWww\4\2NNnn"+
		"\6\2\f\f\17\17))^^\4\2--//\6\2HHNNhhnn\5\2NNWWww\6\2\f\f\17\17$$^^\4\2"+
		"\13\13\"\"\4\2\f\f\17\17\2\u05fd\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2"+
		"\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2"+
		"\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O"+
		"\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2"+
		"\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2"+
		"\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u"+
		"\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081"+
		"\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2"+
		"\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093"+
		"\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2"+
		"\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5"+
		"\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2"+
		"\2\2\u00af\3\2\2\2\2\u00b1\3\2\2\2\2\u00b3\3\2\2\2\2\u00b5\3\2\2\2\2\u00b7"+
		"\3\2\2\2\2\u00b9\3\2\2\2\2\u00bb\3\2\2\2\2\u00bd\3\2\2\2\2\u00bf\3\2\2"+
		"\2\2\u00c1\3\2\2\2\2\u00c3\3\2\2\2\2\u00c5\3\2\2\2\2\u00c7\3\2\2\2\2\u00c9"+
		"\3\2\2\2\2\u00cb\3\2\2\2\2\u00cd\3\2\2\2\2\u00cf\3\2\2\2\2\u00d1\3\2\2"+
		"\2\2\u00d3\3\2\2\2\2\u00d5\3\2\2\2\2\u00d7\3\2\2\2\2\u00d9\3\2\2\2\2\u00db"+
		"\3\2\2\2\2\u00dd\3\2\2\2\2\u00df\3\2\2\2\2\u00e1\3\2\2\2\2\u00e3\3\2\2"+
		"\2\2\u00e5\3\2\2\2\2\u00e7\3\2\2\2\2\u00e9\3\2\2\2\2\u00eb\3\2\2\2\2\u00ed"+
		"\3\2\2\2\2\u00ef\3\2\2\2\2\u00f1\3\2\2\2\2\u00f3\3\2\2\2\2\u00f5\3\2\2"+
		"\2\2\u00f7\3\2\2\2\2\u00f9\3\2\2\2\2\u00fb\3\2\2\2\2\u00fd\3\2\2\2\2\u00ff"+
		"\3\2\2\2\2\u0101\3\2\2\2\2\u0107\3\2\2\2\2\u010f\3\2\2\2\2\u0111\3\2\2"+
		"\2\2\u0113\3\2\2\2\2\u0115\3\2\2\2\2\u0117\3\2\2\2\2\u0121\3\2\2\2\2\u0129"+
		"\3\2\2\2\2\u0135\3\2\2\2\2\u0141\3\2\2\2\2\u0149\3\2\2\2\2\u014b\3\2\2"+
		"\2\2\u014d\3\2\2\2\2\u014f\3\2\2\2\2\u0153\3\2\2\2\2\u0155\3\2\2\2\2\u0157"+
		"\3\2\2\2\2\u0159\3\2\2\2\3\u015b\3\2\2\2\5\u0172\3\2\2\2\7\u017b\3\2\2"+
		"\2\t\u0183\3\2\2\2\13\u018b\3\2\2\2\r\u018f\3\2\2\2\17\u0194\3\2\2\2\21"+
		"\u0199\3\2\2\2\23\u019f\3\2\2\2\25\u01a4\3\2\2\2\27\u01aa\3\2\2\2\31\u01af"+
		"\3\2\2\2\33\u01b8\3\2\2\2\35\u01c1\3\2\2\2\37\u01c7\3\2\2\2!\u01cd\3\2"+
		"\2\2#\u01d7\3\2\2\2%\u01e2\3\2\2\2\'\u01eb\3\2\2\2)\u01f4\3\2\2\2+\u01fc"+
		"\3\2\2\2-\u0203\3\2\2\2/\u0206\3\2\2\2\61\u020d\3\2\2\2\63\u021a\3\2\2"+
		"\2\65\u021f\3\2\2\2\67\u0224\3\2\2\29\u022d\3\2\2\2;\u0234\3\2\2\2=\u023b"+
		"\3\2\2\2?\u0241\3\2\2\2A\u0247\3\2\2\2C\u024d\3\2\2\2E\u0251\3\2\2\2G"+
		"\u0258\3\2\2\2I\u025d\3\2\2\2K\u0260\3\2\2\2M\u0267\3\2\2\2O\u026b\3\2"+
		"\2\2Q\u0270\3\2\2\2S\u0278\3\2\2\2U\u0282\3\2\2\2W\u0286\3\2\2\2Y\u028f"+
		"\3\2\2\2[\u0297\3\2\2\2]\u02a0\3\2\2\2_\u02a9\3\2\2\2a\u02b1\3\2\2\2c"+
		"\u02bb\3\2\2\2e\u02c2\3\2\2\2g\u02cb\3\2\2\2i\u02dc\3\2\2\2k\u02e3\3\2"+
		"\2\2m\u02e9\3\2\2\2o\u02f0\3\2\2\2q\u02f7\3\2\2\2s\u02fe\3\2\2\2u\u030c"+
		"\3\2\2\2w\u0318\3\2\2\2y\u031f\3\2\2\2{\u0326\3\2\2\2}\u032f\3\2\2\2\177"+
		"\u0334\3\2\2\2\u0081\u0341\3\2\2\2\u0083\u0347\3\2\2\2\u0085\u034c\3\2"+
		"\2\2\u0087\u0350\3\2\2\2\u0089\u0358\3\2\2\2\u008b\u035f\3\2\2\2\u008d"+
		"\u0368\3\2\2\2\u008f\u036e\3\2\2\2\u0091\u0377\3\2\2\2\u0093\u037d\3\2"+
		"\2\2\u0095\u0385\3\2\2\2\u0097\u038a\3\2\2\2\u0099\u0393\3\2\2\2\u009b"+
		"\u039b\3\2\2\2\u009d\u03a1\3\2\2\2\u009f\u03a3\3\2\2\2\u00a1\u03a5\3\2"+
		"\2\2\u00a3\u03a7\3\2\2\2\u00a5\u03a9\3\2\2\2\u00a7\u03ab\3\2\2\2\u00a9"+
		"\u03ad\3\2\2\2\u00ab\u03af\3\2\2\2\u00ad\u03b1\3\2\2\2\u00af\u03b3\3\2"+
		"\2\2\u00b1\u03b5\3\2\2\2\u00b3\u03b7\3\2\2\2\u00b5\u03b9\3\2\2\2\u00b7"+
		"\u03bb\3\2\2\2\u00b9\u03bd\3\2\2\2\u00bb\u03bf\3\2\2\2\u00bd\u03c1\3\2"+
		"\2\2\u00bf\u03c5\3\2\2\2\u00c1\u03c7\3\2\2\2\u00c3\u03c9\3\2\2\2\u00c5"+
		"\u03cb\3\2\2\2\u00c7\u03ce\3\2\2\2\u00c9\u03d1\3\2\2\2\u00cb\u03d4\3\2"+
		"\2\2\u00cd\u03d7\3\2\2\2\u00cf\u03da\3\2\2\2\u00d1\u03dd\3\2\2\2\u00d3"+
		"\u03e0\3\2\2\2\u00d5\u03e3\3\2\2\2\u00d7\u03e6\3\2\2\2\u00d9\u03ea\3\2"+
		"\2\2\u00db\u03ee\3\2\2\2\u00dd\u03f1\3\2\2\2\u00df\u03f4\3\2\2\2\u00e1"+
		"\u03f7\3\2\2\2\u00e3\u03fa\3\2\2\2\u00e5\u03fd\3\2\2\2\u00e7\u0401\3\2"+
		"\2\2\u00e9\u0404\3\2\2\2\u00eb\u0407\3\2\2\2\u00ed\u040a\3\2\2\2\u00ef"+
		"\u040d\3\2\2\2\u00f1\u040f\3\2\2\2\u00f3\u0413\3\2\2\2\u00f5\u0416\3\2"+
		"\2\2\u00f7\u0418\3\2\2\2\u00f9\u041a\3\2\2\2\u00fb\u041d\3\2\2\2\u00fd"+
		"\u041f\3\2\2\2\u00ff\u0421\3\2\2\2\u0101\u0424\3\2\2\2\u0103\u0428\3\2"+
		"\2\2\u0105\u0437\3\2\2\2\u0107\u0439\3\2\2\2\u0109\u0443\3\2\2\2\u010b"+
		"\u0445\3\2\2\2\u010d\u0447\3\2\2\2\u010f\u0459\3\2\2\2\u0111\u045b\3\2"+
		"\2\2\u0113\u0465\3\2\2\2\u0115\u0473\3\2\2\2\u0117\u0483\3\2\2\2\u0119"+
		"\u048f\3\2\2\2\u011b\u0491\3\2\2\2\u011d\u0493\3\2\2\2\u011f\u0495\3\2"+
		"\2\2\u0121\u04a7\3\2\2\2\u0123\u04a9\3\2\2\2\u0125\u04ab\3\2\2\2\u0127"+
		"\u04b1\3\2\2\2\u0129\u04d6\3\2\2\2\u012b\u04db\3\2\2\2\u012d\u04e0\3\2"+
		"\2\2\u012f\u04f8\3\2\2\2\u0131\u0505\3\2\2\2\u0133\u0507\3\2\2\2\u0135"+
		"\u051b\3\2\2\2\u0137\u0525\3\2\2\2\u0139\u0531\3\2\2\2\u013b\u0533\3\2"+
		"\2\2\u013d\u0535\3\2\2\2\u013f\u053f\3\2\2\2\u0141\u0551\3\2\2\2\u0143"+
		"\u0556\3\2\2\2\u0145\u055b\3\2\2\2\u0147\u055d\3\2\2\2\u0149\u0580\3\2"+
		"\2\2\u014b\u058c\3\2\2\2\u014d\u058e\3\2\2\2\u014f\u0591\3\2\2\2\u0151"+
		"\u0594\3\2\2\2\u0153\u0597\3\2\2\2\u0155\u05a2\3\2\2\2\u0157\u05a6\3\2"+
		"\2\2\u0159\u05b4\3\2\2\2\u015b\u0167\7%\2\2\u015c\u015e\n\2\2\2\u015d"+
		"\u015c\3\2\2\2\u015e\u0161\3\2\2\2\u015f\u0160\3\2\2\2\u015f\u015d\3\2"+
		"\2\2\u0160\u0162\3\2\2\2\u0161\u015f\3\2\2\2\u0162\u0164\7^\2\2\u0163"+
		"\u0165\7\17\2\2\u0164\u0163\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0166\3"+
		"\2\2\2\u0166\u0168\7\f\2\2\u0167\u015f\3\2\2\2\u0168\u0169\3\2\2\2\u0169"+
		"\u0167\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u016c\3\2\2\2\u016b\u016d\n\2"+
		"\2\2\u016c\u016b\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u016c\3\2\2\2\u016e"+
		"\u016f\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0171\b\2\2\2\u0171\4\3\2\2\2"+
		"\u0172\u0176\7%\2\2\u0173\u0175\n\2\2\2\u0174\u0173\3\2\2\2\u0175\u0178"+
		"\3\2\2\2\u0176\u0174\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0179\3\2\2\2\u0178"+
		"\u0176\3\2\2\2\u0179\u017a\b\3\2\2\u017a\6\3\2\2\2\u017b\u017c\7c\2\2"+
		"\u017c\u017d\7n\2\2\u017d\u017e\7k\2\2\u017e\u017f\7i\2\2\u017f\u0180"+
		"\7p\2\2\u0180\u0181\7c\2\2\u0181\u0182\7u\2\2\u0182\b\3\2\2\2\u0183\u0184"+
		"\7c\2\2\u0184\u0185\7n\2\2\u0185\u0186\7k\2\2\u0186\u0187\7i\2\2\u0187"+
		"\u0188\7p\2\2\u0188\u0189\7q\2\2\u0189\u018a\7h\2\2\u018a\n\3\2\2\2\u018b"+
		"\u018c\7c\2\2\u018c\u018d\7u\2\2\u018d\u018e\7o\2\2\u018e\f\3\2\2\2\u018f"+
		"\u0190\7c\2\2\u0190\u0191\7w\2\2\u0191\u0192\7v\2\2\u0192\u0193\7q\2\2"+
		"\u0193\16\3\2\2\2\u0194\u0195\7d\2\2\u0195\u0196\7q\2\2\u0196\u0197\7"+
		"q\2\2\u0197\u0198\7n\2\2\u0198\20\3\2\2\2\u0199\u019a\7d\2\2\u019a\u019b"+
		"\7t\2\2\u019b\u019c\7g\2\2\u019c\u019d\7c\2\2\u019d\u019e\7m\2\2\u019e"+
		"\22\3\2\2\2\u019f\u01a0\7e\2\2\u01a0\u01a1\7c\2\2\u01a1\u01a2\7u\2\2\u01a2"+
		"\u01a3\7g\2\2\u01a3\24\3\2\2\2\u01a4\u01a5\7e\2\2\u01a5\u01a6\7c\2\2\u01a6"+
		"\u01a7\7v\2\2\u01a7\u01a8\7e\2\2\u01a8\u01a9\7j\2\2\u01a9\26\3\2\2\2\u01aa"+
		"\u01ab\7e\2\2\u01ab\u01ac\7j\2\2\u01ac\u01ad\7c\2\2\u01ad\u01ae\7t\2\2"+
		"\u01ae\30\3\2\2\2\u01af\u01b0\7e\2\2\u01b0\u01b1\7j\2\2\u01b1\u01b2\7"+
		"c\2\2\u01b2\u01b3\7t\2\2\u01b3\u01b4\7\63\2\2\u01b4\u01b5\78\2\2\u01b5"+
		"\u01b6\7a\2\2\u01b6\u01b7\7v\2\2\u01b7\32\3\2\2\2\u01b8\u01b9\7e\2\2\u01b9"+
		"\u01ba\7j\2\2\u01ba\u01bb\7c\2\2\u01bb\u01bc\7t\2\2\u01bc\u01bd\7\65\2"+
		"\2\u01bd\u01be\7\64\2\2\u01be\u01bf\7a\2\2\u01bf\u01c0\7v\2\2\u01c0\34"+
		"\3\2\2\2\u01c1\u01c2\7e\2\2\u01c2\u01c3\7n\2\2\u01c3\u01c4\7c\2\2\u01c4"+
		"\u01c5\7u\2\2\u01c5\u01c6\7u\2\2\u01c6\36\3\2\2\2\u01c7\u01c8\7e\2\2\u01c8"+
		"\u01c9\7q\2\2\u01c9\u01ca\7p\2\2\u01ca\u01cb\7u\2\2\u01cb\u01cc\7v\2\2"+
		"\u01cc \3\2\2\2\u01cd\u01ce\7e\2\2\u01ce\u01cf\7q\2\2\u01cf\u01d0\7p\2"+
		"\2\u01d0\u01d1\7u\2\2\u01d1\u01d2\7v\2\2\u01d2\u01d3\7g\2\2\u01d3\u01d4"+
		"\7z\2\2\u01d4\u01d5\7r\2\2\u01d5\u01d6\7t\2\2\u01d6\"\3\2\2\2\u01d7\u01d8"+
		"\7e\2\2\u01d8\u01d9\7q\2\2\u01d9\u01da\7p\2\2\u01da\u01db\7u\2\2\u01db"+
		"\u01dc\7v\2\2\u01dc\u01dd\7a\2\2\u01dd\u01de\7e\2\2\u01de\u01df\7c\2\2"+
		"\u01df\u01e0\7u\2\2\u01e0\u01e1\7v\2\2\u01e1$\3\2\2\2\u01e2\u01e3\7e\2"+
		"\2\u01e3\u01e4\7q\2\2\u01e4\u01e5\7p\2\2\u01e5\u01e6\7v\2\2\u01e6\u01e7"+
		"\7k\2\2\u01e7\u01e8\7p\2\2\u01e8\u01e9\7w\2\2\u01e9\u01ea\7g\2\2\u01ea"+
		"&\3\2\2\2\u01eb\u01ec\7f\2\2\u01ec\u01ed\7g\2\2\u01ed\u01ee\7e\2\2\u01ee"+
		"\u01ef\7n\2\2\u01ef\u01f0\7v\2\2\u01f0\u01f1\7{\2\2\u01f1\u01f2\7r\2\2"+
		"\u01f2\u01f3\7g\2\2\u01f3(\3\2\2\2\u01f4\u01f5\7f\2\2\u01f5\u01f6\7g\2"+
		"\2\u01f6\u01f7\7h\2\2\u01f7\u01f8\7c\2\2\u01f8\u01f9\7w\2\2\u01f9\u01fa"+
		"\7n\2\2\u01fa\u01fb\7v\2\2\u01fb*\3\2\2\2\u01fc\u01fd\7f\2\2\u01fd\u01fe"+
		"\7g\2\2\u01fe\u01ff\7n\2\2\u01ff\u0200\7g\2\2\u0200\u0201\7v\2\2\u0201"+
		"\u0202\7g\2\2\u0202,\3\2\2\2\u0203\u0204\7f\2\2\u0204\u0205\7q\2\2\u0205"+
		".\3\2\2\2\u0206\u0207\7f\2\2\u0207\u0208\7q\2\2\u0208\u0209\7w\2\2\u0209"+
		"\u020a\7d\2\2\u020a\u020b\7n\2\2\u020b\u020c\7g\2\2\u020c\60\3\2\2\2\u020d"+
		"\u020e\7f\2\2\u020e\u020f\7{\2\2\u020f\u0210\7p\2\2\u0210\u0211\7c\2\2"+
		"\u0211\u0212\7o\2\2\u0212\u0213\7k\2\2\u0213\u0214\7e\2\2\u0214\u0215"+
		"\7a\2\2\u0215\u0216\7e\2\2\u0216\u0217\7c\2\2\u0217\u0218\7u\2\2\u0218"+
		"\u0219\7v\2\2\u0219\62\3\2\2\2\u021a\u021b\7g\2\2\u021b\u021c\7n\2\2\u021c"+
		"\u021d\7u\2\2\u021d\u021e\7g\2\2\u021e\64\3\2\2\2\u021f\u0220\7g\2\2\u0220"+
		"\u0221\7p\2\2\u0221\u0222\7w\2\2\u0222\u0223\7o\2\2\u0223\66\3\2\2\2\u0224"+
		"\u0225\7g\2\2\u0225\u0226\7z\2\2\u0226\u0227\7r\2\2\u0227\u0228\7n\2\2"+
		"\u0228\u0229\7k\2\2\u0229\u022a\7e\2\2\u022a\u022b\7k\2\2\u022b\u022c"+
		"\7v\2\2\u022c8\3\2\2\2\u022d\u022e\7g\2\2\u022e\u022f\7z\2\2\u022f\u0230"+
		"\7r\2\2\u0230\u0231\7q\2\2\u0231\u0232\7t\2\2\u0232\u0233\7v\2\2\u0233"+
		":\3\2\2\2\u0234\u0235\7g\2\2\u0235\u0236\7z\2\2\u0236\u0237\7v\2\2\u0237"+
		"\u0238\7g\2\2\u0238\u0239\7t\2\2\u0239\u023a\7p\2\2\u023a<\3\2\2\2\u023b"+
		"\u023c\7h\2\2\u023c\u023d\7c\2\2\u023d\u023e\7n\2\2\u023e\u023f\7u\2\2"+
		"\u023f\u0240\7g\2\2\u0240>\3\2\2\2\u0241\u0242\7h\2\2\u0242\u0243\7k\2"+
		"\2\u0243\u0244\7p\2\2\u0244\u0245\7c\2\2\u0245\u0246\7n\2\2\u0246@\3\2"+
		"\2\2\u0247\u0248\7h\2\2\u0248\u0249\7n\2\2\u0249\u024a\7q\2\2\u024a\u024b"+
		"\7c\2\2\u024b\u024c\7v\2\2\u024cB\3\2\2\2\u024d\u024e\7h\2\2\u024e\u024f"+
		"\7q\2\2\u024f\u0250\7t\2\2\u0250D\3\2\2\2\u0251\u0252\7h\2\2\u0252\u0253"+
		"\7t\2\2\u0253\u0254\7k\2\2\u0254\u0255\7g\2\2\u0255\u0256\7p\2\2\u0256"+
		"\u0257\7f\2\2\u0257F\3\2\2\2\u0258\u0259\7i\2\2\u0259\u025a\7q\2\2\u025a"+
		"\u025b\7v\2\2\u025b\u025c\7q\2\2\u025cH\3\2\2\2\u025d\u025e\7k\2\2\u025e"+
		"\u025f\7h\2\2\u025fJ\3\2\2\2\u0260\u0261\7k\2\2\u0261\u0262\7p\2\2\u0262"+
		"\u0263\7n\2\2\u0263\u0264\7k\2\2\u0264\u0265\7p\2\2\u0265\u0266\7g\2\2"+
		"\u0266L\3\2\2\2\u0267\u0268\7k\2\2\u0268\u0269\7p\2\2\u0269\u026a\7v\2"+
		"\2\u026aN\3\2\2\2\u026b\u026c\7n\2\2\u026c\u026d\7q\2\2\u026d\u026e\7"+
		"p\2\2\u026e\u026f\7i\2\2\u026fP\3\2\2\2\u0270\u0271\7o\2\2\u0271\u0272"+
		"\7w\2\2\u0272\u0273\7v\2\2\u0273\u0274\7c\2\2\u0274\u0275\7d\2\2\u0275"+
		"\u0276\7n\2\2\u0276\u0277\7g\2\2\u0277R\3\2\2\2\u0278\u0279\7p\2\2\u0279"+
		"\u027a\7c\2\2\u027a\u027b\7o\2\2\u027b\u027c\7g\2\2\u027c\u027d\7u\2\2"+
		"\u027d\u027e\7r\2\2\u027e\u027f\7c\2\2\u027f\u0280\7e\2\2\u0280\u0281"+
		"\7g\2\2\u0281T\3\2\2\2\u0282\u0283\7p\2\2\u0283\u0284\7g\2\2\u0284\u0285"+
		"\7y\2\2\u0285V\3\2\2\2\u0286\u0287\7p\2\2\u0287\u0288\7q\2\2\u0288\u0289"+
		"\7g\2\2\u0289\u028a\7z\2\2\u028a\u028b\7e\2\2\u028b\u028c\7g\2\2\u028c"+
		"\u028d\7r\2\2\u028d\u028e\7v\2\2\u028eX\3\2\2\2\u028f\u0290\7p\2\2\u0290"+
		"\u0291\7w\2\2\u0291\u0292\7n\2\2\u0292\u0293\7n\2\2\u0293\u0294\7r\2\2"+
		"\u0294\u0295\7v\2\2\u0295\u0296\7t\2\2\u0296Z\3\2\2\2\u0297\u0298\7q\2"+
		"\2\u0298\u0299\7r\2\2\u0299\u029a\7g\2\2\u029a\u029b\7t\2\2\u029b\u029c"+
		"\7c\2\2\u029c\u029d\7v\2\2\u029d\u029e\7q\2\2\u029e\u029f\7t\2\2\u029f"+
		"\\\3\2\2\2\u02a0\u02a1\7q\2\2\u02a1\u02a2\7x\2\2\u02a2\u02a3\7g\2\2\u02a3"+
		"\u02a4\7t\2\2\u02a4\u02a5\7t\2\2\u02a5\u02a6\7k\2\2\u02a6\u02a7\7f\2\2"+
		"\u02a7\u02a8\7g\2\2\u02a8^\3\2\2\2\u02a9\u02aa\7r\2\2\u02aa\u02ab\7t\2"+
		"\2\u02ab\u02ac\7k\2\2\u02ac\u02ad\7x\2\2\u02ad\u02ae\7c\2\2\u02ae\u02af"+
		"\7v\2\2\u02af\u02b0\7g\2\2\u02b0`\3\2\2\2\u02b1\u02b2\7r\2\2\u02b2\u02b3"+
		"\7t\2\2\u02b3\u02b4\7q\2\2\u02b4\u02b5\7v\2\2\u02b5\u02b6\7g\2\2\u02b6"+
		"\u02b7\7e\2\2\u02b7\u02b8\7v\2\2\u02b8\u02b9\7g\2\2\u02b9\u02ba\7f\2\2"+
		"\u02bab\3\2\2\2\u02bb\u02bc\7r\2\2\u02bc\u02bd\7w\2\2\u02bd\u02be\7d\2"+
		"\2\u02be\u02bf\7n\2\2\u02bf\u02c0\7k\2\2\u02c0\u02c1\7e\2\2\u02c1d\3\2"+
		"\2\2\u02c2\u02c3\7t\2\2\u02c3\u02c4\7g\2\2\u02c4\u02c5\7i\2\2\u02c5\u02c6"+
		"\7k\2\2\u02c6\u02c7\7u\2\2\u02c7\u02c8\7v\2\2\u02c8\u02c9\7g\2\2\u02c9"+
		"\u02ca\7t\2\2\u02caf\3\2\2\2\u02cb\u02cc\7t\2\2\u02cc\u02cd\7g\2\2\u02cd"+
		"\u02ce\7k\2\2\u02ce\u02cf\7p\2\2\u02cf\u02d0\7v\2\2\u02d0\u02d1\7g\2\2"+
		"\u02d1\u02d2\7t\2\2\u02d2\u02d3\7r\2\2\u02d3\u02d4\7t\2\2\u02d4\u02d5"+
		"\7g\2\2\u02d5\u02d6\7v\2\2\u02d6\u02d7\7a\2\2\u02d7\u02d8\7e\2\2\u02d8"+
		"\u02d9\7c\2\2\u02d9\u02da\7u\2\2\u02da\u02db\7v\2\2\u02dbh\3\2\2\2\u02dc"+
		"\u02dd\7t\2\2\u02dd\u02de\7g\2\2\u02de\u02df\7v\2\2\u02df\u02e0\7w\2\2"+
		"\u02e0\u02e1\7t\2\2\u02e1\u02e2\7p\2\2\u02e2j\3\2\2\2\u02e3\u02e4\7u\2"+
		"\2\u02e4\u02e5\7j\2\2\u02e5\u02e6\7q\2\2\u02e6\u02e7\7t\2\2\u02e7\u02e8"+
		"\7v\2\2\u02e8l\3\2\2\2\u02e9\u02ea\7u\2\2\u02ea\u02eb\7k\2\2\u02eb\u02ec"+
		"\7i\2\2\u02ec\u02ed\7p\2\2\u02ed\u02ee\7g\2\2\u02ee\u02ef\7f\2\2\u02ef"+
		"n\3\2\2\2\u02f0\u02f1\7u\2\2\u02f1\u02f2\7k\2\2\u02f2\u02f3\7|\2\2\u02f3"+
		"\u02f4\7g\2\2\u02f4\u02f5\7q\2\2\u02f5\u02f6\7h\2\2\u02f6p\3\2\2\2\u02f7"+
		"\u02f8\7u\2\2\u02f8\u02f9\7v\2\2\u02f9\u02fa\7c\2\2\u02fa\u02fb\7v\2\2"+
		"\u02fb\u02fc\7k\2\2\u02fc\u02fd\7e\2\2\u02fdr\3\2\2\2\u02fe\u02ff\7u\2"+
		"\2\u02ff\u0300\7v\2\2\u0300\u0301\7c\2\2\u0301\u0302\7v\2\2\u0302\u0303"+
		"\7k\2\2\u0303\u0304\7e\2\2\u0304\u0305\7a\2\2\u0305\u0306\7c\2\2\u0306"+
		"\u0307\7u\2\2\u0307\u0308\7u\2\2\u0308\u0309\7g\2\2\u0309\u030a\7t\2\2"+
		"\u030a\u030b\7v\2\2\u030bt\3\2\2\2\u030c\u030d\7u\2\2\u030d\u030e\7v\2"+
		"\2\u030e\u030f\7c\2\2\u030f\u0310\7v\2\2\u0310\u0311\7k\2\2\u0311\u0312"+
		"\7e\2\2\u0312\u0313\7a\2\2\u0313\u0314\7e\2\2\u0314\u0315\7c\2\2\u0315"+
		"\u0316\7u\2\2\u0316\u0317\7v\2\2\u0317v\3\2\2\2\u0318\u0319\7u\2\2\u0319"+
		"\u031a\7v\2\2\u031a\u031b\7t\2\2\u031b\u031c\7w\2\2\u031c\u031d\7e\2\2"+
		"\u031d\u031e\7v\2\2\u031ex\3\2\2\2\u031f\u0320\7u\2\2\u0320\u0321\7y\2"+
		"\2\u0321\u0322\7k\2\2\u0322\u0323\7v\2\2\u0323\u0324\7e\2\2\u0324\u0325"+
		"\7j\2\2\u0325z\3\2\2\2\u0326\u0327\7v\2\2\u0327\u0328\7g\2\2\u0328\u0329"+
		"\7o\2\2\u0329\u032a\7r\2\2\u032a\u032b\7n\2\2\u032b\u032c\7c\2\2\u032c"+
		"\u032d\7v\2\2\u032d\u032e\7g\2\2\u032e|\3\2\2\2\u032f\u0330\7v\2\2\u0330"+
		"\u0331\7j\2\2\u0331\u0332\7k\2\2\u0332\u0333\7u\2\2\u0333~\3\2\2\2\u0334"+
		"\u0335\7v\2\2\u0335\u0336\7j\2\2\u0336\u0337\7t\2\2\u0337\u0338\7g\2\2"+
		"\u0338\u0339\7c\2\2\u0339\u033a\7f\2\2\u033a\u033b\7a\2\2\u033b\u033c"+
		"\7n\2\2\u033c\u033d\7q\2\2\u033d\u033e\7e\2\2\u033e\u033f\7c\2\2\u033f"+
		"\u0340\7n\2\2\u0340\u0080\3\2\2\2\u0341\u0342\7v\2\2\u0342\u0343\7j\2"+
		"\2\u0343\u0344\7t\2\2\u0344\u0345\7q\2\2\u0345\u0346\7y\2\2\u0346\u0082"+
		"\3\2\2\2\u0347\u0348\7v\2\2\u0348\u0349\7t\2\2\u0349\u034a\7w\2\2\u034a"+
		"\u034b\7g\2\2\u034b\u0084\3\2\2\2\u034c\u034d\7v\2\2\u034d\u034e\7t\2"+
		"\2\u034e\u034f\7{\2\2\u034f\u0086\3\2\2\2\u0350\u0351\7v\2\2\u0351\u0352"+
		"\7{\2\2\u0352\u0353\7r\2\2\u0353\u0354\7g\2\2\u0354\u0355\7f\2\2\u0355"+
		"\u0356\7g\2\2\u0356\u0357\7h\2\2\u0357\u0088\3\2\2\2\u0358\u0359\7v\2"+
		"\2\u0359\u035a\7{\2\2\u035a\u035b\7r\2\2\u035b\u035c\7g\2\2\u035c\u035d"+
		"\7k\2\2\u035d\u035e\7f\2\2\u035e\u008a\3\2\2\2\u035f\u0360\7v\2\2\u0360"+
		"\u0361\7{\2\2\u0361\u0362\7r\2\2\u0362\u0363\7g\2\2\u0363\u0364\7p\2\2"+
		"\u0364\u0365\7c\2\2\u0365\u0366\7o\2\2\u0366\u0367\7g\2\2\u0367\u008c"+
		"\3\2\2\2\u0368\u0369\7w\2\2\u0369\u036a\7p\2\2\u036a\u036b\7k\2\2\u036b"+
		"\u036c\7q\2\2\u036c\u036d\7p\2\2\u036d\u008e\3\2\2\2\u036e\u036f\7w\2"+
		"\2\u036f\u0370\7p\2\2\u0370\u0371\7u\2\2\u0371\u0372\7k\2\2\u0372\u0373"+
		"\7i\2\2\u0373\u0374\7p\2\2\u0374\u0375\7g\2\2\u0375\u0376\7f\2\2\u0376"+
		"\u0090\3\2\2\2\u0377\u0378\7w\2\2\u0378\u0379\7u\2\2\u0379\u037a\7k\2"+
		"\2\u037a\u037b\7p\2\2\u037b\u037c\7i\2\2\u037c\u0092\3\2\2\2\u037d\u037e"+
		"\7x\2\2\u037e\u037f\7k\2\2\u037f\u0380\7t\2\2\u0380\u0381\7v\2\2\u0381"+
		"\u0382\7w\2\2\u0382\u0383\7c\2\2\u0383\u0384\7n\2\2\u0384\u0094\3\2\2"+
		"\2\u0385\u0386\7x\2\2\u0386\u0387\7q\2\2\u0387\u0388\7k\2\2\u0388\u0389"+
		"\7f\2\2\u0389\u0096\3\2\2\2\u038a\u038b\7x\2\2\u038b\u038c\7q\2\2\u038c"+
		"\u038d\7n\2\2\u038d\u038e\7c\2\2\u038e\u038f\7v\2\2\u038f\u0390\7k\2\2"+
		"\u0390\u0391\7n\2\2\u0391\u0392\7g\2\2\u0392\u0098\3\2\2\2\u0393\u0394"+
		"\7y\2\2\u0394\u0395\7e\2\2\u0395\u0396\7j\2\2\u0396\u0397\7c\2\2\u0397"+
		"\u0398\7t\2\2\u0398\u0399\7a\2\2\u0399\u039a\7v\2\2\u039a\u009a\3\2\2"+
		"\2\u039b\u039c\7y\2\2\u039c\u039d\7j\2\2\u039d\u039e\7k\2\2\u039e\u039f"+
		"\7n\2\2\u039f\u03a0\7g\2\2\u03a0\u009c\3\2\2\2\u03a1\u03a2\7*\2\2\u03a2"+
		"\u009e\3\2\2\2\u03a3\u03a4\7+\2\2\u03a4\u00a0\3\2\2\2\u03a5\u03a6\7]\2"+
		"\2\u03a6\u00a2\3\2\2\2\u03a7\u03a8\7_\2\2\u03a8\u00a4\3\2\2\2\u03a9\u03aa"+
		"\7}\2\2\u03aa\u00a6\3\2\2\2\u03ab\u03ac\7\177\2\2\u03ac\u00a8\3\2\2\2"+
		"\u03ad\u03ae\7-\2\2\u03ae\u00aa\3\2\2\2\u03af\u03b0\7/\2\2\u03b0\u00ac"+
		"\3\2\2\2\u03b1\u03b2\7,\2\2\u03b2\u00ae\3\2\2\2\u03b3\u03b4\7\61\2\2\u03b4"+
		"\u00b0\3\2\2\2\u03b5\u03b6\7\'\2\2\u03b6\u00b2\3\2\2\2\u03b7\u03b8\7`"+
		"\2\2\u03b8\u00b4\3\2\2\2\u03b9\u03ba\7(\2\2\u03ba\u00b6\3\2\2\2\u03bb"+
		"\u03bc\7~\2\2\u03bc\u00b8\3\2\2\2\u03bd\u03be\7\u0080\2\2\u03be\u00ba"+
		"\3\2\2\2\u03bf\u03c0\7#\2\2\u03c0\u00bc\3\2\2\2\u03c1\u03c2\7p\2\2\u03c2"+
		"\u03c3\7q\2\2\u03c3\u03c4\7v\2\2\u03c4\u00be\3\2\2\2\u03c5\u03c6\7?\2"+
		"\2\u03c6\u00c0\3\2\2\2\u03c7\u03c8\7>\2\2\u03c8\u00c2\3\2\2\2\u03c9\u03ca"+
		"\7@\2\2\u03ca\u00c4\3\2\2\2\u03cb\u03cc\7-\2\2\u03cc\u03cd\7?\2\2\u03cd"+
		"\u00c6\3\2\2\2\u03ce\u03cf\7/\2\2\u03cf\u03d0\7?\2\2\u03d0\u00c8\3\2\2"+
		"\2\u03d1\u03d2\7,\2\2\u03d2\u03d3\7?\2\2\u03d3\u00ca\3\2\2\2\u03d4\u03d5"+
		"\7\61\2\2\u03d5\u03d6\7?\2\2\u03d6\u00cc\3\2\2\2\u03d7\u03d8\7\'\2\2\u03d8"+
		"\u03d9\7?\2\2\u03d9\u00ce\3\2\2\2\u03da\u03db\7`\2\2\u03db\u03dc\7?\2"+
		"\2\u03dc\u00d0\3\2\2\2\u03dd\u03de\7(\2\2\u03de\u03df\7?\2\2\u03df\u00d2"+
		"\3\2\2\2\u03e0\u03e1\7~\2\2\u03e1\u03e2\7?\2\2\u03e2\u00d4\3\2\2\2\u03e3"+
		"\u03e4\7>\2\2\u03e4\u03e5\7>\2\2\u03e5\u00d6\3\2\2\2\u03e6\u03e7\7>\2"+
		"\2\u03e7\u03e8\7>\2\2\u03e8\u03e9\7?\2\2\u03e9\u00d8\3\2\2\2\u03ea\u03eb"+
		"\7@\2\2\u03eb\u03ec\7@\2\2\u03ec\u03ed\7?\2\2\u03ed\u00da\3\2\2\2\u03ee"+
		"\u03ef\7?\2\2\u03ef\u03f0\7?\2\2\u03f0\u00dc\3\2\2\2\u03f1\u03f2\7#\2"+
		"\2\u03f2\u03f3\7?\2\2\u03f3\u00de\3\2\2\2\u03f4\u03f5\7>\2\2\u03f5\u03f6"+
		"\7?\2\2\u03f6\u00e0\3\2\2\2\u03f7\u03f8\7@\2\2\u03f8\u03f9\7?\2\2\u03f9"+
		"\u00e2\3\2\2\2\u03fa\u03fb\7(\2\2\u03fb\u03fc\7(\2\2\u03fc\u00e4\3\2\2"+
		"\2\u03fd\u03fe\7c\2\2\u03fe\u03ff\7p\2\2\u03ff\u0400\7f\2\2\u0400\u00e6"+
		"\3\2\2\2\u0401\u0402\7~\2\2\u0402\u0403\7~\2\2\u0403\u00e8\3\2\2\2\u0404"+
		"\u0405\7q\2\2\u0405\u0406\7t\2\2\u0406\u00ea\3\2\2\2\u0407\u0408\7-\2"+
		"\2\u0408\u0409\7-\2\2\u0409\u00ec\3\2\2\2\u040a\u040b\7/\2\2\u040b\u040c"+
		"\7/\2\2\u040c\u00ee\3\2\2\2\u040d\u040e\7.\2\2\u040e\u00f0\3\2\2\2\u040f"+
		"\u0410\7/\2\2\u0410\u0411\7@\2\2\u0411\u0412\7,\2\2\u0412\u00f2\3\2\2"+
		"\2\u0413\u0414\7/\2\2\u0414\u0415\7@\2\2\u0415\u00f4\3\2\2\2\u0416\u0417"+
		"\7A\2\2\u0417\u00f6\3\2\2\2\u0418\u0419\7<\2\2\u0419\u00f8\3\2\2\2\u041a"+
		"\u041b\7<\2\2\u041b\u041c\7<\2\2\u041c\u00fa\3\2\2\2\u041d\u041e\7=\2"+
		"\2\u041e\u00fc\3\2\2\2\u041f\u0420\7\60\2\2\u0420\u00fe\3\2\2\2\u0421"+
		"\u0422\7\60\2\2\u0422\u0423\7,\2\2\u0423\u0100\3\2\2\2\u0424\u0425\7\60"+
		"\2\2\u0425\u0426\7\60\2\2\u0426\u0427\7\60\2\2\u0427\u0102\3\2\2\2\u0428"+
		"\u0429\5\u011d\u008f\2\u0429\u042a\5\u011d\u008f\2\u042a\u042b\5\u011d"+
		"\u008f\2\u042b\u042c\5\u011d\u008f\2\u042c\u0104\3\2\2\2\u042d\u042e\7"+
		"^\2\2\u042e\u042f\7w\2\2\u042f\u0430\3\2\2\2\u0430\u0438\5\u0103\u0082"+
		"\2\u0431\u0432\7^\2\2\u0432\u0433\7W\2\2\u0433\u0434\3\2\2\2\u0434\u0435"+
		"\5\u0103\u0082\2\u0435\u0436\5\u0103\u0082\2\u0436\u0438\3\2\2\2\u0437"+
		"\u042d\3\2\2\2\u0437\u0431\3\2\2\2\u0438\u0106\3\2\2\2\u0439\u043e\5\u0109"+
		"\u0085\2\u043a\u043d\5\u0109\u0085\2\u043b\u043d\5\u010d\u0087\2\u043c"+
		"\u043a\3\2\2\2\u043c\u043b\3\2\2\2\u043d\u0440\3\2\2\2\u043e\u043c\3\2"+
		"\2\2\u043e\u043f\3\2\2\2\u043f\u0108\3\2\2\2\u0440\u043e\3\2\2\2\u0441"+
		"\u0444\5\u010b\u0086\2\u0442\u0444\5\u0105\u0083\2\u0443\u0441\3\2\2\2"+
		"\u0443\u0442\3\2\2\2\u0444\u010a\3\2\2\2\u0445\u0446\t\3\2\2\u0446\u010c"+
		"\3\2\2\2\u0447\u0448\t\4\2\2\u0448\u010e\3\2\2\2\u0449\u044b\5\u0111\u0089"+
		"\2\u044a\u044c\5\u0121\u0091\2\u044b\u044a\3\2\2\2\u044b\u044c\3\2\2\2"+
		"\u044c\u045a\3\2\2\2\u044d\u044f\5\u0113\u008a\2\u044e\u0450\5\u0121\u0091"+
		"\2\u044f\u044e\3\2\2\2\u044f\u0450\3\2\2\2\u0450\u045a\3\2\2\2\u0451\u0453"+
		"\5\u0115\u008b\2\u0452\u0454\5\u0121\u0091\2\u0453\u0452\3\2\2\2\u0453"+
		"\u0454\3\2\2\2\u0454\u045a\3\2\2\2\u0455\u0457\5\u0117\u008c\2\u0456\u0458"+
		"\5\u0121\u0091\2\u0457\u0456\3\2\2\2\u0457\u0458\3\2\2\2\u0458\u045a\3"+
		"\2\2\2\u0459\u0449\3\2\2\2\u0459\u044d\3\2\2\2\u0459\u0451\3\2\2\2\u0459"+
		"\u0455\3\2\2\2\u045a\u0110\3\2\2\2\u045b\u0462\5\u0119\u008d\2\u045c\u045e"+
		"\7)\2\2\u045d\u045c\3\2\2\2\u045d\u045e\3\2\2\2\u045e\u045f\3\2\2\2\u045f"+
		"\u0461\5\u010d\u0087\2\u0460\u045d\3\2\2\2\u0461\u0464\3\2\2\2\u0462\u0460"+
		"\3\2\2\2\u0462\u0463\3\2\2\2\u0463\u0112\3\2\2\2\u0464\u0462\3\2\2\2\u0465"+
		"\u046c\7\62\2\2\u0466\u0468\7)\2\2\u0467\u0466\3\2\2\2\u0467\u0468\3\2"+
		"\2\2\u0468\u0469\3\2\2\2\u0469\u046b\5\u011b\u008e\2\u046a\u0467\3\2\2"+
		"\2\u046b\u046e\3\2\2\2\u046c\u046a\3\2\2\2\u046c\u046d\3\2\2\2\u046d\u0114"+
		"\3\2\2\2\u046e\u046c\3\2\2\2\u046f\u0470\7\62\2\2\u0470\u0474\7z\2\2\u0471"+
		"\u0472\7\62\2\2\u0472\u0474\7Z\2\2\u0473\u046f\3\2\2\2\u0473\u0471\3\2"+
		"\2\2\u0474\u0475\3\2\2\2\u0475\u047c\5\u011d\u008f\2\u0476\u0478\7)\2"+
		"\2\u0477\u0476\3\2\2\2\u0477\u0478\3\2\2\2\u0478\u0479\3\2\2\2\u0479\u047b"+
		"\5\u011d\u008f\2\u047a\u0477\3\2\2\2\u047b\u047e\3\2\2\2\u047c\u047a\3"+
		"\2\2\2\u047c\u047d\3\2\2\2\u047d\u0116\3\2\2\2\u047e\u047c\3\2\2\2\u047f"+
		"\u0480\7\62\2\2\u0480\u0484\7d\2\2\u0481\u0482\7\62\2\2\u0482\u0484\7"+
		"D\2\2\u0483\u047f\3\2\2\2\u0483\u0481\3\2\2\2\u0484\u0485\3\2\2\2\u0485"+
		"\u048c\5\u011f\u0090\2\u0486\u0488\7)\2\2\u0487\u0486\3\2\2\2\u0487\u0488"+
		"\3\2\2\2\u0488\u0489\3\2\2\2\u0489\u048b\5\u011f\u0090\2\u048a\u0487\3"+
		"\2\2\2\u048b\u048e\3\2\2\2\u048c\u048a\3\2\2\2\u048c\u048d\3\2\2\2\u048d"+
		"\u0118\3\2\2\2\u048e\u048c\3\2\2\2\u048f\u0490\t\5\2\2\u0490\u011a\3\2"+
		"\2\2\u0491\u0492\t\6\2\2\u0492\u011c\3\2\2\2\u0493\u0494\t\7\2\2\u0494"+
		"\u011e\3\2\2\2\u0495\u0496\t\b\2\2\u0496\u0120\3\2\2\2\u0497\u0499\5\u0123"+
		"\u0092\2\u0498\u049a\5\u0125\u0093\2\u0499\u0498\3\2\2\2\u0499\u049a\3"+
		"\2\2\2\u049a\u04a8\3\2\2\2\u049b\u049d\5\u0123\u0092\2\u049c\u049e\5\u0127"+
		"\u0094\2\u049d\u049c\3\2\2\2\u049d\u049e\3\2\2\2\u049e\u04a8\3\2\2\2\u049f"+
		"\u04a1\5\u0125\u0093\2\u04a0\u04a2\5\u0123\u0092\2\u04a1\u04a0\3\2\2\2"+
		"\u04a1\u04a2\3\2\2\2\u04a2\u04a8\3\2\2\2\u04a3\u04a5\5\u0127\u0094\2\u04a4"+
		"\u04a6\5\u0123\u0092\2\u04a5\u04a4\3\2\2\2\u04a5\u04a6\3\2\2\2\u04a6\u04a8"+
		"\3\2\2\2\u04a7\u0497\3\2\2\2\u04a7\u049b\3\2\2\2\u04a7\u049f\3\2\2\2\u04a7"+
		"\u04a3\3\2\2\2\u04a8\u0122\3\2\2\2\u04a9\u04aa\t\t\2\2\u04aa\u0124\3\2"+
		"\2\2\u04ab\u04ac\t\n\2\2\u04ac\u0126\3\2\2\2\u04ad\u04ae\7n\2\2\u04ae"+
		"\u04b2\7n\2\2\u04af\u04b0\7N\2\2\u04b0\u04b2\7N\2\2\u04b1\u04ad\3\2\2"+
		"\2\u04b1\u04af\3\2\2\2\u04b2\u0128\3\2\2\2\u04b3\u04b5\7)\2\2\u04b4\u04b6"+
		"\5\u012b\u0096\2\u04b5\u04b4\3\2\2\2\u04b6\u04b7\3\2\2\2\u04b7\u04b5\3"+
		"\2\2\2\u04b7\u04b8\3\2\2\2\u04b8\u04b9\3\2\2\2\u04b9\u04ba\7)\2\2\u04ba"+
		"\u04d7\3\2\2\2\u04bb\u04bc\7w\2\2\u04bc\u04be\7)\2\2\u04bd\u04bf\5\u012b"+
		"\u0096\2\u04be\u04bd\3\2\2\2\u04bf\u04c0\3\2\2\2\u04c0\u04be\3\2\2\2\u04c0"+
		"\u04c1\3\2\2\2\u04c1\u04c2\3\2\2\2\u04c2\u04c3\7)\2\2\u04c3\u04d7\3\2"+
		"\2\2\u04c4\u04c5\7W\2\2\u04c5\u04c7\7)\2\2\u04c6\u04c8\5\u012b\u0096\2"+
		"\u04c7\u04c6\3\2\2\2\u04c8\u04c9\3\2\2\2\u04c9\u04c7\3\2\2\2\u04c9\u04ca"+
		"\3\2\2\2\u04ca\u04cb\3\2\2\2\u04cb\u04cc\7)\2\2\u04cc\u04d7\3\2\2\2\u04cd"+
		"\u04ce\7N\2\2\u04ce\u04d0\7)\2\2\u04cf\u04d1\5\u012b\u0096\2\u04d0\u04cf"+
		"\3\2\2\2\u04d1\u04d2\3\2\2\2\u04d2\u04d0\3\2\2\2\u04d2\u04d3\3\2\2\2\u04d3"+
		"\u04d4\3\2\2\2\u04d4\u04d5\7)\2\2\u04d5\u04d7\3\2\2\2\u04d6\u04b3\3\2"+
		"\2\2\u04d6\u04bb\3\2\2\2\u04d6\u04c4\3\2\2\2\u04d6\u04cd\3\2\2\2\u04d7"+
		"\u012a\3\2\2\2\u04d8\u04dc\n\13\2\2\u04d9\u04dc\5\u012d\u0097\2\u04da"+
		"\u04dc\5\u0105\u0083\2\u04db\u04d8\3\2\2\2\u04db\u04d9\3\2\2\2\u04db\u04da"+
		"\3\2\2\2\u04dc\u012c\3\2\2\2\u04dd\u04e1\5\u012f\u0098\2\u04de\u04e1\5"+
		"\u0131\u0099\2\u04df\u04e1\5\u0133\u009a\2\u04e0\u04dd\3\2\2\2\u04e0\u04de"+
		"\3\2\2\2\u04e0\u04df\3\2\2\2\u04e1\u012e\3\2\2\2\u04e2\u04e3\7^\2\2\u04e3"+
		"\u04f9\7)\2\2\u04e4\u04e5\7^\2\2\u04e5\u04f9\7$\2\2\u04e6\u04e7\7^\2\2"+
		"\u04e7\u04f9\7A\2\2\u04e8\u04e9\7^\2\2\u04e9\u04f9\7^\2\2\u04ea\u04eb"+
		"\7^\2\2\u04eb\u04f9\7c\2\2\u04ec\u04ed\7^\2\2\u04ed\u04f9\7d\2\2\u04ee"+
		"\u04ef\7^\2\2\u04ef\u04f9\7h\2\2\u04f0\u04f1\7^\2\2\u04f1\u04f9\7p\2\2"+
		"\u04f2\u04f3\7^\2\2\u04f3\u04f9\7t\2\2\u04f4\u04f5\7^\2\2\u04f5\u04f9"+
		"\7v\2\2\u04f6\u04f7\7^\2\2\u04f7\u04f9\7x\2\2\u04f8\u04e2\3\2\2\2\u04f8"+
		"\u04e4\3\2\2\2\u04f8\u04e6\3\2\2\2\u04f8\u04e8\3\2\2\2\u04f8\u04ea\3\2"+
		"\2\2\u04f8\u04ec\3\2\2\2\u04f8\u04ee\3\2\2\2\u04f8\u04f0\3\2\2\2\u04f8"+
		"\u04f2\3\2\2\2\u04f8\u04f4\3\2\2\2\u04f8\u04f6\3\2\2\2\u04f9\u0130\3\2"+
		"\2\2\u04fa\u04fb\7^\2\2\u04fb\u0506\5\u011b\u008e\2\u04fc\u04fd\7^\2\2"+
		"\u04fd\u04fe\5\u011b\u008e\2\u04fe\u04ff\5\u011b\u008e\2\u04ff\u0506\3"+
		"\2\2\2\u0500\u0501\7^\2\2\u0501\u0502\5\u011b\u008e\2\u0502\u0503\5\u011b"+
		"\u008e\2\u0503\u0504\5\u011b\u008e\2\u0504\u0506\3\2\2\2\u0505\u04fa\3"+
		"\2\2\2\u0505\u04fc\3\2\2\2\u0505\u0500\3\2\2\2\u0506\u0132\3\2\2\2\u0507"+
		"\u0508\7^\2\2\u0508\u0509\7z\2\2\u0509\u050b\3\2\2\2\u050a\u050c\5\u011d"+
		"\u008f\2\u050b\u050a\3\2\2\2\u050c\u050d\3\2\2\2\u050d\u050b\3\2\2\2\u050d"+
		"\u050e\3\2\2\2\u050e\u0134\3\2\2\2\u050f\u0511\5\u0137\u009c\2\u0510\u0512"+
		"\5\u0139\u009d\2\u0511\u0510\3\2\2\2\u0511\u0512\3\2\2\2\u0512\u0514\3"+
		"\2\2\2\u0513\u0515\5\u013f\u00a0\2\u0514\u0513\3\2\2\2\u0514\u0515\3\2"+
		"\2\2\u0515\u051c\3\2\2\2\u0516\u0517\5\u013d\u009f\2\u0517\u0519\5\u0139"+
		"\u009d\2\u0518\u051a\5\u013f\u00a0\2\u0519\u0518\3\2\2\2\u0519\u051a\3"+
		"\2\2\2\u051a\u051c\3\2\2\2\u051b\u050f\3\2\2\2\u051b\u0516\3\2\2\2\u051c"+
		"\u0136\3\2\2\2\u051d\u051f\5\u013d\u009f\2\u051e\u051d\3\2\2\2\u051e\u051f"+
		"\3\2\2\2\u051f\u0520\3\2\2\2\u0520\u0521\7\60\2\2\u0521\u0526\5\u013d"+
		"\u009f\2\u0522\u0523\5\u013d\u009f\2\u0523\u0524\7\60\2\2\u0524\u0526"+
		"\3\2\2\2\u0525\u051e\3\2\2\2\u0525\u0522\3\2\2\2\u0526\u0138\3\2\2\2\u0527"+
		"\u0529\7g\2\2\u0528\u052a\5\u013b\u009e\2\u0529\u0528\3\2\2\2\u0529\u052a"+
		"\3\2\2\2\u052a\u052b\3\2\2\2\u052b\u0532\5\u013d\u009f\2\u052c\u052e\7"+
		"G\2\2\u052d\u052f\5\u013b\u009e\2\u052e\u052d\3\2\2\2\u052e\u052f\3\2"+
		"\2\2\u052f\u0530\3\2\2\2\u0530\u0532\5\u013d\u009f\2\u0531\u0527\3\2\2"+
		"\2\u0531\u052c\3\2\2\2\u0532\u013a\3\2\2\2\u0533\u0534\t\f\2\2\u0534\u013c"+
		"\3\2\2\2\u0535\u053c\5\u010d\u0087\2\u0536\u0538\7)\2\2\u0537\u0536\3"+
		"\2\2\2\u0537\u0538\3\2\2\2\u0538\u0539\3\2\2\2\u0539\u053b\5\u010d\u0087"+
		"\2\u053a\u0537\3\2\2\2\u053b\u053e\3\2\2\2\u053c\u053a\3\2\2\2\u053c\u053d"+
		"\3\2\2\2\u053d\u013e\3\2\2\2\u053e\u053c\3\2\2\2\u053f\u0540\t\r\2\2\u0540"+
		"\u0140\3\2\2\2\u0541\u0543\5\u0143\u00a2\2\u0542\u0541\3\2\2\2\u0542\u0543"+
		"\3\2\2\2\u0543\u0544\3\2\2\2\u0544\u0548\7$\2\2\u0545\u0547\5\u0145\u00a3"+
		"\2\u0546\u0545\3\2\2\2\u0547\u054a\3\2\2\2\u0548\u0546\3\2\2\2\u0548\u0549"+
		"\3\2\2\2\u0549\u054b\3\2\2\2\u054a\u0548\3\2\2\2\u054b\u0552\7$\2\2\u054c"+
		"\u054e\5\u0143\u00a2\2\u054d\u054c\3\2\2\2\u054d\u054e\3\2\2\2\u054e\u054f"+
		"\3\2\2\2\u054f\u0550\7T\2\2\u0550\u0552\5\u0147\u00a4\2\u0551\u0542\3"+
		"\2\2\2\u0551\u054d\3\2\2\2\u0552\u0142\3\2\2\2\u0553\u0554\7w\2\2\u0554"+
		"\u0557\7:\2\2\u0555\u0557\t\16\2\2\u0556\u0553\3\2\2\2\u0556\u0555\3\2"+
		"\2\2\u0557\u0144\3\2\2\2\u0558\u055c\n\17\2\2\u0559\u055c\5\u012d\u0097"+
		"\2\u055a\u055c\5\u0105\u0083\2\u055b\u0558\3\2\2\2\u055b\u0559\3\2\2\2"+
		"\u055b\u055a\3\2\2\2\u055c\u0146\3\2\2\2\u055d\u0561\7$\2\2\u055e\u0560"+
		"\13\2\2\2\u055f\u055e\3\2\2\2\u0560\u0563\3\2\2\2\u0561\u0562\3\2\2\2"+
		"\u0561\u055f\3\2\2\2\u0562\u0564\3\2\2\2\u0563\u0561\3\2\2\2\u0564\u0568"+
		"\7*\2\2\u0565\u0567\13\2\2\2\u0566\u0565\3\2\2\2\u0567\u056a\3\2\2\2\u0568"+
		"\u0569\3\2\2\2\u0568\u0566\3\2\2\2\u0569\u056b\3\2\2\2\u056a\u0568\3\2"+
		"\2\2\u056b\u056f\7+\2\2\u056c\u056e\13\2\2\2\u056d\u056c\3\2\2\2\u056e"+
		"\u0571\3\2\2\2\u056f\u0570\3\2\2\2\u056f\u056d\3\2\2\2\u0570\u0572\3\2"+
		"\2\2\u0571\u056f\3\2\2\2\u0572\u0573\7$\2\2\u0573\u0148\3\2\2\2\u0574"+
		"\u0575\5\u0111\u0089\2\u0575\u0576\5\u0151\u00a9\2\u0576\u0581\3\2\2\2"+
		"\u0577\u0578\5\u0113\u008a\2\u0578\u0579\5\u0151\u00a9\2\u0579\u0581\3"+
		"\2\2\2\u057a\u057b\5\u0115\u008b\2\u057b\u057c\5\u0151\u00a9\2\u057c\u0581"+
		"\3\2\2\2\u057d\u057e\5\u0117\u008c\2\u057e\u057f\5\u0151\u00a9\2\u057f"+
		"\u0581\3\2\2\2\u0580\u0574\3\2\2\2\u0580\u0577\3\2\2\2\u0580\u057a\3\2"+
		"\2\2\u0580\u057d\3\2\2\2\u0581\u014a\3\2\2\2\u0582\u0584\5\u0137\u009c"+
		"\2\u0583\u0585\5\u0139\u009d\2\u0584\u0583\3\2\2\2\u0584\u0585\3\2\2\2"+
		"\u0585\u0586\3\2\2\2\u0586\u0587\5\u0151\u00a9\2\u0587\u058d\3\2\2\2\u0588"+
		"\u0589\5\u013d\u009f\2\u0589\u058a\5\u0139\u009d\2\u058a\u058b\5\u0151"+
		"\u00a9\2\u058b\u058d\3\2\2\2\u058c\u0582\3\2\2\2\u058c\u0588\3\2\2\2\u058d"+
		"\u014c\3\2\2\2\u058e\u058f\5\u0141\u00a1\2\u058f\u0590\5\u0151\u00a9\2"+
		"\u0590\u014e\3\2\2\2\u0591\u0592\5\u0129\u0095\2\u0592\u0593\5\u0151\u00a9"+
		"\2\u0593\u0150\3\2\2\2\u0594\u0595\5\u0107\u0084\2\u0595\u0152\3\2\2\2"+
		"\u0596\u0598\t\20\2\2\u0597\u0596\3\2\2\2\u0598\u0599\3\2\2\2\u0599\u0597"+
		"\3\2\2\2\u0599\u059a\3\2\2\2\u059a\u059b\3\2\2\2\u059b\u059c\b\u00aa\3"+
		"\2\u059c\u0154\3\2\2\2\u059d\u059f\7\17\2\2\u059e\u05a0\7\f\2\2\u059f"+
		"\u059e\3\2\2\2\u059f\u05a0\3\2\2\2\u05a0\u05a3\3\2\2\2\u05a1\u05a3\7\f"+
		"\2\2\u05a2\u059d\3\2\2\2\u05a2\u05a1\3\2\2\2\u05a3\u05a4\3\2\2\2\u05a4"+
		"\u05a5\b\u00ab\3\2\u05a5\u0156\3\2\2\2\u05a6\u05a7\7\61\2\2\u05a7\u05a8"+
		"\7,\2\2\u05a8\u05ac\3\2\2\2\u05a9\u05ab\13\2\2\2\u05aa\u05a9\3\2\2\2\u05ab"+
		"\u05ae\3\2\2\2\u05ac\u05ad\3\2\2\2\u05ac\u05aa\3\2\2\2\u05ad\u05af\3\2"+
		"\2\2\u05ae\u05ac\3\2\2\2\u05af\u05b0\7,\2\2\u05b0\u05b1\7\61\2\2\u05b1"+
		"\u05b2\3\2\2\2\u05b2\u05b3\b\u00ac\3\2\u05b3\u0158\3\2\2\2\u05b4\u05b5"+
		"\7\61\2\2\u05b5\u05b6\7\61\2\2\u05b6\u05ba\3\2\2\2\u05b7\u05b9\n\21\2"+
		"\2\u05b8\u05b7\3\2\2\2\u05b9\u05bc\3\2\2\2\u05ba\u05b8\3\2\2\2\u05ba\u05bb"+
		"\3\2\2\2\u05bb\u05bd\3\2\2\2\u05bc\u05ba\3\2\2\2\u05bd\u05be\b\u00ad\3"+
		"\2\u05be\u015a\3\2\2\2G\2\u015f\u0164\u0169\u016e\u0176\u0437\u043c\u043e"+
		"\u0443\u044b\u044f\u0453\u0457\u0459\u045d\u0462\u0467\u046c\u0473\u0477"+
		"\u047c\u0483\u0487\u048c\u0499\u049d\u04a1\u04a5\u04a7\u04b1\u04b7\u04c0"+
		"\u04c9\u04d2\u04d6\u04db\u04e0\u04f8\u0505\u050d\u0511\u0514\u0519\u051b"+
		"\u051e\u0525\u0529\u052e\u0531\u0537\u053c\u0542\u0548\u054d\u0551\u0556"+
		"\u055b\u0561\u0568\u056f\u0580\u0584\u058c\u0599\u059f\u05a2\u05ac\u05ba"+
		"\4\2\3\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}