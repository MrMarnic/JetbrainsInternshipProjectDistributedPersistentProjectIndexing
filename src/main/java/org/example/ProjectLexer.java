package org.example;// Generated from ProjectLexer.g4 by ANTLR 4.13.1

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ProjectLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PRINT=1, CURLY_OPEN=2, CURLY_CLOSE=3, EQUALS=4, SCOPE=5, TEXT=6, NUMBER=7, 
		WHITESPACE=8, NEWLINE=9;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PRINT", "CURLY_OPEN", "CURLY_CLOSE", "EQUALS", "SCOPE", "TEXT", "NUMBER", 
			"WHITESPACE", "NEWLINE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'print'", "'{'", "'}'", "'='", "'scope'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PRINT", "CURLY_OPEN", "CURLY_CLOSE", "EQUALS", "SCOPE", "TEXT", 
			"NUMBER", "WHITESPACE", "NEWLINE"
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


	public ProjectLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ProjectLexer.g4"; }

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
		"\u0004\u0000\t;\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0004\u0005\'\b\u0005\u000b"+
		"\u0005\f\u0005(\u0001\u0006\u0004\u0006,\b\u0006\u000b\u0006\f\u0006-"+
		"\u0001\u0007\u0004\u00071\b\u0007\u000b\u0007\f\u00072\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0003\b8\b\b\u0001\b\u0001\b\u0000\u0000\t\u0001\u0001"+
		"\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f"+
		"\b\u0011\t\u0001\u0000\u0003\u0003\u000009AZaz\u0001\u000009\u0003\u0000"+
		"\t\n\r\r  >\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0001\u0013\u0001\u0000\u0000\u0000"+
		"\u0003\u0019\u0001\u0000\u0000\u0000\u0005\u001b\u0001\u0000\u0000\u0000"+
		"\u0007\u001d\u0001\u0000\u0000\u0000\t\u001f\u0001\u0000\u0000\u0000\u000b"+
		"&\u0001\u0000\u0000\u0000\r+\u0001\u0000\u0000\u0000\u000f0\u0001\u0000"+
		"\u0000\u0000\u00117\u0001\u0000\u0000\u0000\u0013\u0014\u0005p\u0000\u0000"+
		"\u0014\u0015\u0005r\u0000\u0000\u0015\u0016\u0005i\u0000\u0000\u0016\u0017"+
		"\u0005n\u0000\u0000\u0017\u0018\u0005t\u0000\u0000\u0018\u0002\u0001\u0000"+
		"\u0000\u0000\u0019\u001a\u0005{\u0000\u0000\u001a\u0004\u0001\u0000\u0000"+
		"\u0000\u001b\u001c\u0005}\u0000\u0000\u001c\u0006\u0001\u0000\u0000\u0000"+
		"\u001d\u001e\u0005=\u0000\u0000\u001e\b\u0001\u0000\u0000\u0000\u001f"+
		" \u0005s\u0000\u0000 !\u0005c\u0000\u0000!\"\u0005o\u0000\u0000\"#\u0005"+
		"p\u0000\u0000#$\u0005e\u0000\u0000$\n\u0001\u0000\u0000\u0000%\'\u0007"+
		"\u0000\u0000\u0000&%\u0001\u0000\u0000\u0000\'(\u0001\u0000\u0000\u0000"+
		"(&\u0001\u0000\u0000\u0000()\u0001\u0000\u0000\u0000)\f\u0001\u0000\u0000"+
		"\u0000*,\u0007\u0001\u0000\u0000+*\u0001\u0000\u0000\u0000,-\u0001\u0000"+
		"\u0000\u0000-+\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000.\u000e"+
		"\u0001\u0000\u0000\u0000/1\u0007\u0002\u0000\u00000/\u0001\u0000\u0000"+
		"\u000012\u0001\u0000\u0000\u000020\u0001\u0000\u0000\u000023\u0001\u0000"+
		"\u0000\u000034\u0001\u0000\u0000\u000045\u0006\u0007\u0000\u00005\u0010"+
		"\u0001\u0000\u0000\u000068\u0005\r\u0000\u000076\u0001\u0000\u0000\u0000"+
		"78\u0001\u0000\u0000\u000089\u0001\u0000\u0000\u00009:\u0005\n\u0000\u0000"+
		":\u0012\u0001\u0000\u0000\u0000\u0005\u0000(-27\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}