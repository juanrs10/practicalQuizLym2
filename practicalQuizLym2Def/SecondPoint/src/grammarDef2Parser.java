// Generated from grammarDef2.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class grammarDef2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, DOLLAR=2, A=3, B=4, C=5;
	public static final String[] tokenNames = {
		"<INVALID>", "WS", "'$'", "'a'", "'b'", "'c'"
	};
	public static final int
		RULE_start = 0, RULE_w = 1, RULE_v = 2, RULE_letter = 3;
	public static final String[] ruleNames = {
		"start", "w", "v", "letter"
	};

	@Override
	public String getGrammarFileName() { return "grammarDef2.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public grammarDef2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public WContext w() {
			return getRuleContext(WContext.class,0);
		}
		public TerminalNode DOLLAR() { return getToken(grammarDef2Parser.DOLLAR, 0); }
		public VContext v() {
			return getRuleContext(VContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarDef2Listener ) ((grammarDef2Listener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarDef2Listener ) ((grammarDef2Listener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8); w();
			setState(9); match(DOLLAR);
			setState(10); v();
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

	public static class WContext extends ParserRuleContext {
		public LetterContext letter(int i) {
			return getRuleContext(LetterContext.class,i);
		}
		public List<LetterContext> letter() {
			return getRuleContexts(LetterContext.class);
		}
		public WContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_w; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarDef2Listener ) ((grammarDef2Listener)listener).enterW(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarDef2Listener ) ((grammarDef2Listener)listener).exitW(this);
		}
	}

	public final WContext w() throws RecognitionException {
		WContext _localctx = new WContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_w);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12); letter();
			setState(16); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(13); letter();
				<=4
				}
				}
				setState(18); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << A) | (1L << B) | (1L << C))) != 0) );
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

	public static class VContext extends ParserRuleContext {
		public LetterContext letter(int i) {
			return getRuleContext(LetterContext.class,i);
		}
		public List<LetterContext> letter() {
			return getRuleContexts(LetterContext.class);
		}
		public VContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_v; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarDef2Listener ) ((grammarDef2Listener)listener).enterV(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarDef2Listener ) ((grammarDef2Listener)listener).exitV(this);
		}
	}

	public final VContext v() throws RecognitionException {
		VContext _localctx = new VContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_v);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20); letter();
			setState(24); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(21); letter();
				==n
				}
				}
				setState(26); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << A) | (1L << B) | (1L << C))) != 0) );
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

	public static class LetterContext extends ParserRuleContext {
		public TerminalNode B() { return getToken(grammarDef2Parser.B, 0); }
		public TerminalNode C() { return getToken(grammarDef2Parser.C, 0); }
		public TerminalNode A() { return getToken(grammarDef2Parser.A, 0); }
		public LetterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarDef2Listener ) ((grammarDef2Listener)listener).enterLetter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarDef2Listener ) ((grammarDef2Listener)listener).exitLetter(this);
		}
	}

	public final LetterContext letter() throws RecognitionException {
		LetterContext _localctx = new LetterContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_letter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << A) | (1L << B) | (1L << C))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\7!\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\6\3\23\n\3\r\3\16\3"+
		"\24\3\4\3\4\3\4\3\4\6\4\33\n\4\r\4\16\4\34\3\5\3\5\3\5\2\2\6\2\4\6\b\2"+
		"\3\3\2\5\7\36\2\n\3\2\2\2\4\16\3\2\2\2\6\26\3\2\2\2\b\36\3\2\2\2\n\13"+
		"\5\4\3\2\13\f\7\4\2\2\f\r\5\6\4\2\r\3\3\2\2\2\16\22\5\b\5\2\17\20\5\b"+
		"\5\2\20\21\b\3\1\2\21\23\3\2\2\2\22\17\3\2\2\2\23\24\3\2\2\2\24\22\3\2"+
		"\2\2\24\25\3\2\2\2\25\5\3\2\2\2\26\32\5\b\5\2\27\30\5\b\5\2\30\31\b\4"+
		"\1\2\31\33\3\2\2\2\32\27\3\2\2\2\33\34\3\2\2\2\34\32\3\2\2\2\34\35\3\2"+
		"\2\2\35\7\3\2\2\2\36\37\t\2\2\2\37\t\3\2\2\2\4\24\34";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}