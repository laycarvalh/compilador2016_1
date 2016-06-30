// Generated from C:\Users\layca\Google Drive\UNIVERSIDADE\2016.1\Construção de Compiladores\Trabalho Final 2016.1\TrabalhoFinal2016_1.g4 by ANTLR 4.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TrabalhoFinal2016_1Parser extends Parser {
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
	public static final String[] tokenNames = {
		"<INVALID>", "'read'", "']'", "','", "'exit'", "'['", "'while'", "'-'", 
		"'*'", "'('", "':'", "'if'", "'program'", "'int'", "'<'", "'main'", "'!='", 
		"'<='", "'{'", "'break'", "'final'", "'else'", "'}'", "'boolean'", "')'", 
		"'step'", "'+'", "'print'", "'for'", "'<>'", "'return'", "'='", "';'", 
		"'>'", "'then'", "'string'", "'=='", "'/'", "'>='", "'!'", "'real'", "STRING", 
		"BOOLEAN", "ID", "INT", "REAL", "WS", "SL_COMMENT", "SL_COMMENTM"
	};
	public static final int
		RULE_prog = 0, RULE_declaracao = 1, RULE_declaracao_var = 2, RULE_var = 3, 
		RULE_lista_ids = 4, RULE_declaracao_const = 5, RULE_constante = 6, RULE_valor = 7, 
		RULE_declaracao_Arrays = 8, RULE_lista_arrays = 9, RULE_array = 10, RULE_tipo = 11, 
		RULE_funcao = 12, RULE_nome_funcao = 13, RULE_lista_de_parametros = 14, 
		RULE_parametro = 15, RULE_comandos = 16, RULE_cmd_return = 17, RULE_chamada_funcao = 18, 
		RULE_lista_expr = 19, RULE_cmd_controle = 20, RULE_condicoes = 21, RULE_cmd_atribuicao = 22, 
		RULE_cmd_atrib_var = 23, RULE_cmd_atrib_array = 24, RULE_oprelacional = 25, 
		RULE_expr = 26, RULE_numero = 27, RULE_principal = 28;
	public static final String[] ruleNames = {
		"prog", "declaracao", "declaracao_var", "var", "lista_ids", "declaracao_const", 
		"constante", "valor", "declaracao_Arrays", "lista_arrays", "array", "tipo", 
		"funcao", "nome_funcao", "lista_de_parametros", "parametro", "comandos", 
		"cmd_return", "chamada_funcao", "lista_expr", "cmd_controle", "condicoes", 
		"cmd_atribuicao", "cmd_atrib_var", "cmd_atrib_array", "oprelacional", 
		"expr", "numero", "principal"
	};

	@Override
	public String getGrammarFileName() { return "TrabalhoFinal2016_1.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public TrabalhoFinal2016_1Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	 
		public ProgContext() { }
		public void copyFrom(ProgContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BodyContext extends ProgContext {
		public DeclaracaoContext declaracao(int i) {
			return getRuleContext(DeclaracaoContext.class,i);
		}
		public FuncaoContext funcao(int i) {
			return getRuleContext(FuncaoContext.class,i);
		}
		public List<DeclaracaoContext> declaracao() {
			return getRuleContexts(DeclaracaoContext.class);
		}
		public TerminalNode ID() { return getToken(TrabalhoFinal2016_1Parser.ID, 0); }
		public List<FuncaoContext> funcao() {
			return getRuleContexts(FuncaoContext.class);
		}
		public PrincipalContext principal() {
			return getRuleContext(PrincipalContext.class,0);
		}
		public BodyContext(ProgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrabalhoFinal2016_1Visitor ) return ((TrabalhoFinal2016_1Visitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			int _alt;
			_localctx = new BodyContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(58); match(12);
			setState(59); match(ID);
			setState(60); match(32);
			setState(64);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(61); declaracao();
					}
					} 
				}
				setState(66);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 13) | (1L << 23) | (1L << 35) | (1L << 40))) != 0)) {
				{
				{
				setState(67); funcao();
				}
				}
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(73); principal();
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

	public static class DeclaracaoContext extends ParserRuleContext {
		public Declaracao_ArraysContext declaracao_Arrays() {
			return getRuleContext(Declaracao_ArraysContext.class,0);
		}
		public Declaracao_constContext declaracao_const() {
			return getRuleContext(Declaracao_constContext.class,0);
		}
		public Declaracao_varContext declaracao_var() {
			return getRuleContext(Declaracao_varContext.class,0);
		}
		public DeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).enterDeclaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).exitDeclaracao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrabalhoFinal2016_1Visitor ) return ((TrabalhoFinal2016_1Visitor<? extends T>)visitor).visitDeclaracao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracaoContext declaracao() throws RecognitionException {
		DeclaracaoContext _localctx = new DeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaracao);
		try {
			setState(78);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(75); declaracao_var();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(76); declaracao_const();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(77); declaracao_Arrays();
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

	public static class Declaracao_varContext extends ParserRuleContext {
		public Declaracao_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_var; }
	 
		public Declaracao_varContext() { }
		public void copyFrom(Declaracao_varContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeclaracaoVarContext extends Declaracao_varContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public DeclaracaoVarContext(Declaracao_varContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).enterDeclaracaoVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).exitDeclaracaoVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrabalhoFinal2016_1Visitor ) return ((TrabalhoFinal2016_1Visitor<? extends T>)visitor).visitDeclaracaoVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracao_varContext declaracao_var() throws RecognitionException {
		Declaracao_varContext _localctx = new Declaracao_varContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracao_var);
		try {
			_localctx = new DeclaracaoVarContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(80); tipo();
			setState(81); match(10);
			setState(82); var();
			setState(83); match(32);
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

	public static class VarContext extends ParserRuleContext {
		public Lista_idsContext lista_ids() {
			return getRuleContext(Lista_idsContext.class,0);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrabalhoFinal2016_1Visitor ) return ((TrabalhoFinal2016_1Visitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85); lista_ids();
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

	public static class Lista_idsContext extends ParserRuleContext {
		public Lista_idsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_ids; }
	 
		public Lista_idsContext() { }
		public void copyFrom(Lista_idsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ListaIDsContext extends Lista_idsContext {
		public Lista_idsContext lista_ids() {
			return getRuleContext(Lista_idsContext.class,0);
		}
		public TerminalNode ID() { return getToken(TrabalhoFinal2016_1Parser.ID, 0); }
		public ListaIDsContext(Lista_idsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).enterListaIDs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).exitListaIDs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrabalhoFinal2016_1Visitor ) return ((TrabalhoFinal2016_1Visitor<? extends T>)visitor).visitListaIDs(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ListaIDsIDContext extends Lista_idsContext {
		public TerminalNode ID() { return getToken(TrabalhoFinal2016_1Parser.ID, 0); }
		public ListaIDsIDContext(Lista_idsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).enterListaIDsID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).exitListaIDsID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrabalhoFinal2016_1Visitor ) return ((TrabalhoFinal2016_1Visitor<? extends T>)visitor).visitListaIDsID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista_idsContext lista_ids() throws RecognitionException {
		Lista_idsContext _localctx = new Lista_idsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_lista_ids);
		try {
			setState(91);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new ListaIDsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(87); match(ID);
				setState(88); match(3);
				setState(89); lista_ids();
				}
				break;

			case 2:
				_localctx = new ListaIDsIDContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(90); match(ID);
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

	public static class Declaracao_constContext extends ParserRuleContext {
		public Declaracao_constContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_const; }
	 
		public Declaracao_constContext() { }
		public void copyFrom(Declaracao_constContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeclaracaoConstanteContext extends Declaracao_constContext {
		public ConstanteContext constante() {
			return getRuleContext(ConstanteContext.class,0);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public DeclaracaoConstanteContext(Declaracao_constContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).enterDeclaracaoConstante(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).exitDeclaracaoConstante(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrabalhoFinal2016_1Visitor ) return ((TrabalhoFinal2016_1Visitor<? extends T>)visitor).visitDeclaracaoConstante(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracao_constContext declaracao_const() throws RecognitionException {
		Declaracao_constContext _localctx = new Declaracao_constContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declaracao_const);
		try {
			_localctx = new DeclaracaoConstanteContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(93); match(20);
			setState(94); tipo();
			setState(95); constante();
			setState(96); match(31);
			setState(97); valor();
			setState(98); match(32);
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

	public static class ConstanteContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TrabalhoFinal2016_1Parser.ID, 0); }
		public ConstanteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constante; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).enterConstante(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).exitConstante(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrabalhoFinal2016_1Visitor ) return ((TrabalhoFinal2016_1Visitor<? extends T>)visitor).visitConstante(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstanteContext constante() throws RecognitionException {
		ConstanteContext _localctx = new ConstanteContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_constante);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100); match(ID);
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

	public static class ValorContext extends ParserRuleContext {
		public ValorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor; }
	 
		public ValorContext() { }
		public void copyFrom(ValorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ValorInteiroContext extends ValorContext {
		public TerminalNode INT() { return getToken(TrabalhoFinal2016_1Parser.INT, 0); }
		public ValorInteiroContext(ValorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).enterValorInteiro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).exitValorInteiro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrabalhoFinal2016_1Visitor ) return ((TrabalhoFinal2016_1Visitor<? extends T>)visitor).visitValorInteiro(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValorRealContext extends ValorContext {
		public TerminalNode REAL() { return getToken(TrabalhoFinal2016_1Parser.REAL, 0); }
		public ValorRealContext(ValorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).enterValorReal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).exitValorReal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrabalhoFinal2016_1Visitor ) return ((TrabalhoFinal2016_1Visitor<? extends T>)visitor).visitValorReal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValorStringContext extends ValorContext {
		public TerminalNode STRING() { return getToken(TrabalhoFinal2016_1Parser.STRING, 0); }
		public ValorStringContext(ValorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).enterValorString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).exitValorString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrabalhoFinal2016_1Visitor ) return ((TrabalhoFinal2016_1Visitor<? extends T>)visitor).visitValorString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValorBooleanoContext extends ValorContext {
		public TerminalNode BOOLEAN() { return getToken(TrabalhoFinal2016_1Parser.BOOLEAN, 0); }
		public ValorBooleanoContext(ValorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).enterValorBooleano(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).exitValorBooleano(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrabalhoFinal2016_1Visitor ) return ((TrabalhoFinal2016_1Visitor<? extends T>)visitor).visitValorBooleano(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValorContext valor() throws RecognitionException {
		ValorContext _localctx = new ValorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_valor);
		try {
			setState(106);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new ValorInteiroContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(102); match(INT);
				}
				break;
			case REAL:
				_localctx = new ValorRealContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(103); match(REAL);
				}
				break;
			case STRING:
				_localctx = new ValorStringContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(104); match(STRING);
				}
				break;
			case BOOLEAN:
				_localctx = new ValorBooleanoContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(105); match(BOOLEAN);
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

	public static class Declaracao_ArraysContext extends ParserRuleContext {
		public Lista_arraysContext lista_arrays() {
			return getRuleContext(Lista_arraysContext.class,0);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public Declaracao_ArraysContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_Arrays; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).enterDeclaracao_Arrays(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).exitDeclaracao_Arrays(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrabalhoFinal2016_1Visitor ) return ((TrabalhoFinal2016_1Visitor<? extends T>)visitor).visitDeclaracao_Arrays(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracao_ArraysContext declaracao_Arrays() throws RecognitionException {
		Declaracao_ArraysContext _localctx = new Declaracao_ArraysContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_declaracao_Arrays);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108); tipo();
			setState(109); match(10);
			setState(110); lista_arrays();
			setState(111); match(32);
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

	public static class Lista_arraysContext extends ParserRuleContext {
		public Lista_arraysContext lista_arrays() {
			return getRuleContext(Lista_arraysContext.class,0);
		}
		public TerminalNode INT() { return getToken(TrabalhoFinal2016_1Parser.INT, 0); }
		public TerminalNode ID() { return getToken(TrabalhoFinal2016_1Parser.ID, 0); }
		public Lista_arraysContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_arrays; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).enterLista_arrays(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).exitLista_arrays(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrabalhoFinal2016_1Visitor ) return ((TrabalhoFinal2016_1Visitor<? extends T>)visitor).visitLista_arrays(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista_arraysContext lista_arrays() throws RecognitionException {
		Lista_arraysContext _localctx = new Lista_arraysContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_lista_arrays);
		try {
			setState(123);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(113); match(ID);
				setState(114); match(5);
				setState(115); match(INT);
				setState(116); match(2);
				setState(117); match(3);
				setState(118); lista_arrays();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(119); match(ID);
				setState(120); match(5);
				setState(121); match(INT);
				setState(122); match(2);
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

	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(TrabalhoFinal2016_1Parser.INT, 0); }
		public List<TerminalNode> ID() { return getTokens(TrabalhoFinal2016_1Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TrabalhoFinal2016_1Parser.ID, i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrabalhoFinal2016_1Visitor ) return ((TrabalhoFinal2016_1Visitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_array);
		try {
			setState(133);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(125); match(ID);
				setState(126); match(5);
				setState(127); match(ID);
				setState(128); match(2);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(129); match(ID);
				setState(130); match(5);
				setState(131); match(INT);
				setState(132); match(2);
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

	public static class TipoContext extends ParserRuleContext {
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).exitTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrabalhoFinal2016_1Visitor ) return ((TrabalhoFinal2016_1Visitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 13) | (1L << 23) | (1L << 35) | (1L << 40))) != 0)) ) {
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

	public static class FuncaoContext extends ParserRuleContext {
		public ComandosContext comandos(int i) {
			return getRuleContext(ComandosContext.class,i);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public Nome_funcaoContext nome_funcao() {
			return getRuleContext(Nome_funcaoContext.class,0);
		}
		public List<ComandosContext> comandos() {
			return getRuleContexts(ComandosContext.class);
		}
		public Lista_de_parametrosContext lista_de_parametros() {
			return getRuleContext(Lista_de_parametrosContext.class,0);
		}
		public FuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).enterFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).exitFuncao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrabalhoFinal2016_1Visitor ) return ((TrabalhoFinal2016_1Visitor<? extends T>)visitor).visitFuncao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncaoContext funcao() throws RecognitionException {
		FuncaoContext _localctx = new FuncaoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_funcao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137); tipo();
			setState(138); nome_funcao();
			setState(139); match(9);
			setState(140); lista_de_parametros();
			setState(141); match(24);
			setState(142); match(18);
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 4) | (1L << 6) | (1L << 11) | (1L << 19) | (1L << 27) | (1L << 28) | (1L << 30) | (1L << ID))) != 0)) {
				{
				{
				setState(143); comandos();
				}
				}
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(149); match(22);
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

	public static class Nome_funcaoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TrabalhoFinal2016_1Parser.ID, 0); }
		public Nome_funcaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nome_funcao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).enterNome_funcao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).exitNome_funcao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrabalhoFinal2016_1Visitor ) return ((TrabalhoFinal2016_1Visitor<? extends T>)visitor).visitNome_funcao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nome_funcaoContext nome_funcao() throws RecognitionException {
		Nome_funcaoContext _localctx = new Nome_funcaoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_nome_funcao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151); match(ID);
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

	public static class Lista_de_parametrosContext extends ParserRuleContext {
		public ParametroContext parametro() {
			return getRuleContext(ParametroContext.class,0);
		}
		public Lista_de_parametrosContext lista_de_parametros() {
			return getRuleContext(Lista_de_parametrosContext.class,0);
		}
		public Lista_de_parametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_de_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).enterLista_de_parametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).exitLista_de_parametros(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrabalhoFinal2016_1Visitor ) return ((TrabalhoFinal2016_1Visitor<? extends T>)visitor).visitLista_de_parametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista_de_parametrosContext lista_de_parametros() throws RecognitionException {
		Lista_de_parametrosContext _localctx = new Lista_de_parametrosContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_lista_de_parametros);
		try {
			setState(158);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(153); parametro();
				setState(154); match(3);
				setState(155); lista_de_parametros();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(157); parametro();
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

	public static class ParametroContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TrabalhoFinal2016_1Parser.ID, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).enterParametro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).exitParametro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrabalhoFinal2016_1Visitor ) return ((TrabalhoFinal2016_1Visitor<? extends T>)visitor).visitParametro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_parametro);
		try {
			setState(164);
			switch (_input.LA(1)) {
			case 13:
			case 23:
			case 35:
			case 40:
				enterOuterAlt(_localctx, 1);
				{
				setState(160); tipo();
				setState(161); match(ID);
				}
				break;
			case 3:
			case 24:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ComandosContext extends ParserRuleContext {
		public Lista_idsContext lista_ids() {
			return getRuleContext(Lista_idsContext.class,0);
		}
		public Cmd_returnContext cmd_return() {
			return getRuleContext(Cmd_returnContext.class,0);
		}
		public Cmd_controleContext cmd_controle() {
			return getRuleContext(Cmd_controleContext.class,0);
		}
		public Cmd_atribuicaoContext cmd_atribuicao() {
			return getRuleContext(Cmd_atribuicaoContext.class,0);
		}
		public Lista_exprContext lista_expr() {
			return getRuleContext(Lista_exprContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public Chamada_funcaoContext chamada_funcao() {
			return getRuleContext(Chamada_funcaoContext.class,0);
		}
		public ComandosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).enterComandos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).exitComandos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrabalhoFinal2016_1Visitor ) return ((TrabalhoFinal2016_1Visitor<? extends T>)visitor).visitComandos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandosContext comandos() throws RecognitionException {
		ComandosContext _localctx = new ComandosContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_comandos);
		try {
			setState(192);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(166); match(27);
				setState(167); match(9);
				setState(168); lista_expr();
				setState(169); match(24);
				setState(170); match(32);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(172); cmd_atribuicao();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(173); cmd_controle();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(174); match(4);
				setState(175); match(32);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(176); match(1);
				setState(177); match(9);
				setState(178); lista_ids();
				setState(179); match(24);
				setState(180); match(32);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(182); match(1);
				setState(183); match(9);
				setState(184); array();
				setState(185); match(24);
				setState(186); match(32);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(188); cmd_return();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(189); chamada_funcao();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(190); match(19);
				setState(191); match(32);
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

	public static class Cmd_returnContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Cmd_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).enterCmd_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).exitCmd_return(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrabalhoFinal2016_1Visitor ) return ((TrabalhoFinal2016_1Visitor<? extends T>)visitor).visitCmd_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cmd_returnContext cmd_return() throws RecognitionException {
		Cmd_returnContext _localctx = new Cmd_returnContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_cmd_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194); match(30);
			setState(195); match(9);
			setState(196); expr(0);
			setState(197); match(24);
			setState(198); match(32);
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

	public static class Chamada_funcaoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TrabalhoFinal2016_1Parser.ID, 0); }
		public Lista_exprContext lista_expr() {
			return getRuleContext(Lista_exprContext.class,0);
		}
		public Chamada_funcaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamada_funcao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).enterChamada_funcao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).exitChamada_funcao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrabalhoFinal2016_1Visitor ) return ((TrabalhoFinal2016_1Visitor<? extends T>)visitor).visitChamada_funcao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Chamada_funcaoContext chamada_funcao() throws RecognitionException {
		Chamada_funcaoContext _localctx = new Chamada_funcaoContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_chamada_funcao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200); match(ID);
			setState(201); match(9);
			setState(203);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 7) | (1L << 9) | (1L << STRING) | (1L << BOOLEAN) | (1L << ID) | (1L << INT) | (1L << REAL))) != 0)) {
				{
				setState(202); lista_expr();
				}
			}

			setState(205); match(24);
			setState(206); match(32);
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

	public static class Lista_exprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Lista_exprContext lista_expr() {
			return getRuleContext(Lista_exprContext.class,0);
		}
		public Lista_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).enterLista_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).exitLista_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrabalhoFinal2016_1Visitor ) return ((TrabalhoFinal2016_1Visitor<? extends T>)visitor).visitLista_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista_exprContext lista_expr() throws RecognitionException {
		Lista_exprContext _localctx = new Lista_exprContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_lista_expr);
		try {
			setState(213);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(208); expr(0);
				setState(209); match(3);
				setState(210); lista_expr();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(212); expr(0);
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

	public static class Cmd_controleContext extends ParserRuleContext {
		public ComandosContext comandos(int i) {
			return getRuleContext(ComandosContext.class,i);
		}
		public TerminalNode ID() { return getToken(TrabalhoFinal2016_1Parser.ID, 0); }
		public List<ComandosContext> comandos() {
			return getRuleContexts(ComandosContext.class);
		}
		public OprelacionalContext oprelacional() {
			return getRuleContext(OprelacionalContext.class,0);
		}
		public CondicoesContext condicoes(int i) {
			return getRuleContext(CondicoesContext.class,i);
		}
		public List<CondicoesContext> condicoes() {
			return getRuleContexts(CondicoesContext.class);
		}
		public Cmd_controleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_controle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).enterCmd_controle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).exitCmd_controle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrabalhoFinal2016_1Visitor ) return ((TrabalhoFinal2016_1Visitor<? extends T>)visitor).visitCmd_controle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cmd_controleContext cmd_controle() throws RecognitionException {
		Cmd_controleContext _localctx = new Cmd_controleContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_cmd_controle);
		int _la;
		try {
			setState(273);
			switch (_input.LA(1)) {
			case 11:
				enterOuterAlt(_localctx, 1);
				{
				setState(215); match(11);
				setState(216); match(9);
				setState(217); oprelacional();
				setState(218); match(24);
				setState(219); match(34);
				setState(220); match(18);
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 4) | (1L << 6) | (1L << 11) | (1L << 19) | (1L << 27) | (1L << 28) | (1L << 30) | (1L << ID))) != 0)) {
					{
					{
					setState(221); comandos();
					}
					}
					setState(226);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(227); match(22);
				setState(237);
				_la = _input.LA(1);
				if (_la==21) {
					{
					setState(228); match(21);
					setState(229); match(18);
					setState(233);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 4) | (1L << 6) | (1L << 11) | (1L << 19) | (1L << 27) | (1L << 28) | (1L << 30) | (1L << ID))) != 0)) {
						{
						{
						setState(230); comandos();
						}
						}
						setState(235);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(236); match(22);
					}
				}

				}
				break;
			case 6:
				enterOuterAlt(_localctx, 2);
				{
				setState(239); match(6);
				setState(240); match(9);
				setState(241); oprelacional();
				setState(242); match(24);
				setState(243); match(18);
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 4) | (1L << 6) | (1L << 11) | (1L << 19) | (1L << 27) | (1L << 28) | (1L << 30) | (1L << ID))) != 0)) {
					{
					{
					setState(244); comandos();
					}
					}
					setState(249);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(250); match(22);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 3);
				{
				setState(252); match(28);
				setState(253); match(9);
				setState(254); match(ID);
				setState(255); match(31);
				setState(256); condicoes();
				setState(257); match(10);
				setState(258); condicoes();
				setState(261);
				_la = _input.LA(1);
				if (_la==25) {
					{
					setState(259); match(25);
					setState(260); condicoes();
					}
				}

				setState(263); match(24);
				setState(264); match(18);
				setState(268);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 4) | (1L << 6) | (1L << 11) | (1L << 19) | (1L << 27) | (1L << 28) | (1L << 30) | (1L << ID))) != 0)) {
					{
					{
					setState(265); comandos();
					}
					}
					setState(270);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(271); match(22);
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

	public static class CondicoesContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(TrabalhoFinal2016_1Parser.INT, 0); }
		public TerminalNode ID() { return getToken(TrabalhoFinal2016_1Parser.ID, 0); }
		public CondicoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).enterCondicoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).exitCondicoes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrabalhoFinal2016_1Visitor ) return ((TrabalhoFinal2016_1Visitor<? extends T>)visitor).visitCondicoes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicoesContext condicoes() throws RecognitionException {
		CondicoesContext _localctx = new CondicoesContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_condicoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==INT) ) {
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

	public static class Cmd_atribuicaoContext extends ParserRuleContext {
		public Cmd_atrib_varContext cmd_atrib_var() {
			return getRuleContext(Cmd_atrib_varContext.class,0);
		}
		public Cmd_atrib_arrayContext cmd_atrib_array() {
			return getRuleContext(Cmd_atrib_arrayContext.class,0);
		}
		public Cmd_atribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_atribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).enterCmd_atribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).exitCmd_atribuicao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrabalhoFinal2016_1Visitor ) return ((TrabalhoFinal2016_1Visitor<? extends T>)visitor).visitCmd_atribuicao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cmd_atribuicaoContext cmd_atribuicao() throws RecognitionException {
		Cmd_atribuicaoContext _localctx = new Cmd_atribuicaoContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_cmd_atribuicao);
		try {
			setState(279);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(277); cmd_atrib_var();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(278); cmd_atrib_array();
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

	public static class Cmd_atrib_varContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public Cmd_atrib_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_atrib_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).enterCmd_atrib_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).exitCmd_atrib_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrabalhoFinal2016_1Visitor ) return ((TrabalhoFinal2016_1Visitor<? extends T>)visitor).visitCmd_atrib_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cmd_atrib_varContext cmd_atrib_var() throws RecognitionException {
		Cmd_atrib_varContext _localctx = new Cmd_atrib_varContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_cmd_atrib_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281); var();
			setState(282); match(31);
			setState(283); expr(0);
			setState(284); match(32);
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

	public static class Cmd_atrib_arrayContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public Cmd_atrib_arrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_atrib_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).enterCmd_atrib_array(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).exitCmd_atrib_array(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrabalhoFinal2016_1Visitor ) return ((TrabalhoFinal2016_1Visitor<? extends T>)visitor).visitCmd_atrib_array(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cmd_atrib_arrayContext cmd_atrib_array() throws RecognitionException {
		Cmd_atrib_arrayContext _localctx = new Cmd_atrib_arrayContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_cmd_atrib_array);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286); array();
			setState(287); match(31);
			setState(288); expr(0);
			setState(289); match(32);
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

	public static class OprelacionalContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OprelacionalContext oprelacional() {
			return getRuleContext(OprelacionalContext.class,0);
		}
		public OprelacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oprelacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).enterOprelacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).exitOprelacional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrabalhoFinal2016_1Visitor ) return ((TrabalhoFinal2016_1Visitor<? extends T>)visitor).visitOprelacional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OprelacionalContext oprelacional() throws RecognitionException {
		OprelacionalContext _localctx = new OprelacionalContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_oprelacional);
		int _la;
		try {
			setState(298);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(291); match(39);
				setState(292); oprelacional();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(293); expr(0);
				setState(294);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 14) | (1L << 16) | (1L << 17) | (1L << 29) | (1L << 33) | (1L << 36) | (1L << 38))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(295); expr(0);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(297); expr(0);
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

	public static class ExprContext extends ParserRuleContext {
		public int _p;
		public Token s;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode ID() { return getToken(TrabalhoFinal2016_1Parser.ID, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExprContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrabalhoFinal2016_1Visitor ) return ((TrabalhoFinal2016_1Visitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState, _p);
		ExprContext _prevctx = _localctx;
		int _startState = 52;
		enterRecursionRule(_localctx, RULE_expr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(301); match(7);
				setState(302); expr(7);
				}
				break;

			case 2:
				{
				setState(303); valor();
				}
				break;

			case 3:
				{
				setState(304); match(ID);
				}
				break;

			case 4:
				{
				setState(305); array();
				}
				break;

			case 5:
				{
				setState(306); match(9);
				setState(307); expr(0);
				setState(308); match(24);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(320);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(318);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(312);
						if (!(6 >= _localctx._p)) throw new FailedPredicateException(this, "6 >= $_p");
						setState(313);
						((ExprContext)_localctx).s = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==8 || _la==37) ) {
							((ExprContext)_localctx).s = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(314); expr(7);
						}
						break;

					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(315);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(316);
						_la = _input.LA(1);
						if ( !(_la==7 || _la==26) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(317); expr(6);
						}
						break;
					}
					} 
				}
				setState(322);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class NumeroContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(TrabalhoFinal2016_1Parser.INT, 0); }
		public TerminalNode REAL() { return getToken(TrabalhoFinal2016_1Parser.REAL, 0); }
		public NumeroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).enterNumero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).exitNumero(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrabalhoFinal2016_1Visitor ) return ((TrabalhoFinal2016_1Visitor<? extends T>)visitor).visitNumero(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumeroContext numero() throws RecognitionException {
		NumeroContext _localctx = new NumeroContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_numero);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==REAL) ) {
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

	public static class PrincipalContext extends ParserRuleContext {
		public ComandosContext comandos(int i) {
			return getRuleContext(ComandosContext.class,i);
		}
		public List<ComandosContext> comandos() {
			return getRuleContexts(ComandosContext.class);
		}
		public PrincipalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_principal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).enterPrincipal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).exitPrincipal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrabalhoFinal2016_1Visitor ) return ((TrabalhoFinal2016_1Visitor<? extends T>)visitor).visitPrincipal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrincipalContext principal() throws RecognitionException {
		PrincipalContext _localctx = new PrincipalContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_principal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325); match(15);
			setState(326); match(9);
			setState(327); match(24);
			setState(328); match(18);
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 4) | (1L << 6) | (1L << 11) | (1L << 19) | (1L << 27) | (1L << 28) | (1L << 30) | (1L << ID))) != 0)) {
				{
				{
				setState(329); comandos();
				}
				}
				setState(334);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(335); match(22);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 26: return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 6 >= _localctx._p;

		case 1: return 5 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\62\u0154\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\3\2\7\2"+
		"A\n\2\f\2\16\2D\13\2\3\2\7\2G\n\2\f\2\16\2J\13\2\3\2\3\2\3\3\3\3\3\3\5"+
		"\3Q\n\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\5\6^\n\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\5\tm\n\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13~\n\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0088\n\f\3\r\3\r\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\7\16\u0093\n\16\f\16\16\16\u0096\13\16\3\16\3\16\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\3\20\5\20\u00a1\n\20\3\21\3\21\3\21\3\21\5\21"+
		"\u00a7\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\5\22\u00c3\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\5\24\u00ce"+
		"\n\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\5\25\u00d8\n\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\7\26\u00e1\n\26\f\26\16\26\u00e4\13\26\3\26"+
		"\3\26\3\26\3\26\7\26\u00ea\n\26\f\26\16\26\u00ed\13\26\3\26\5\26\u00f0"+
		"\n\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u00f8\n\26\f\26\16\26\u00fb\13"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0108"+
		"\n\26\3\26\3\26\3\26\7\26\u010d\n\26\f\26\16\26\u0110\13\26\3\26\3\26"+
		"\5\26\u0114\n\26\3\27\3\27\3\30\3\30\5\30\u011a\n\30\3\31\3\31\3\31\3"+
		"\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5"+
		"\33\u012d\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34"+
		"\u0139\n\34\3\34\3\34\3\34\3\34\3\34\3\34\7\34\u0141\n\34\f\34\16\34\u0144"+
		"\13\34\3\35\3\35\3\36\3\36\3\36\3\36\3\36\7\36\u014d\n\36\f\36\16\36\u0150"+
		"\13\36\3\36\3\36\3\36\2\37\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$"+
		"&(*,.\60\62\64\668:\2\b\6\2\17\17\31\31%%**\3\2-.\b\2\20\20\22\23\37\37"+
		"##&&((\4\2\n\n\'\'\4\2\t\t\34\34\3\2./\u015f\2<\3\2\2\2\4P\3\2\2\2\6R"+
		"\3\2\2\2\bW\3\2\2\2\n]\3\2\2\2\f_\3\2\2\2\16f\3\2\2\2\20l\3\2\2\2\22n"+
		"\3\2\2\2\24}\3\2\2\2\26\u0087\3\2\2\2\30\u0089\3\2\2\2\32\u008b\3\2\2"+
		"\2\34\u0099\3\2\2\2\36\u00a0\3\2\2\2 \u00a6\3\2\2\2\"\u00c2\3\2\2\2$\u00c4"+
		"\3\2\2\2&\u00ca\3\2\2\2(\u00d7\3\2\2\2*\u0113\3\2\2\2,\u0115\3\2\2\2."+
		"\u0119\3\2\2\2\60\u011b\3\2\2\2\62\u0120\3\2\2\2\64\u012c\3\2\2\2\66\u0138"+
		"\3\2\2\28\u0145\3\2\2\2:\u0147\3\2\2\2<=\7\16\2\2=>\7-\2\2>B\7\"\2\2?"+
		"A\5\4\3\2@?\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2CH\3\2\2\2DB\3\2\2\2"+
		"EG\5\32\16\2FE\3\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2IK\3\2\2\2JH\3\2\2"+
		"\2KL\5:\36\2L\3\3\2\2\2MQ\5\6\4\2NQ\5\f\7\2OQ\5\22\n\2PM\3\2\2\2PN\3\2"+
		"\2\2PO\3\2\2\2Q\5\3\2\2\2RS\5\30\r\2ST\7\f\2\2TU\5\b\5\2UV\7\"\2\2V\7"+
		"\3\2\2\2WX\5\n\6\2X\t\3\2\2\2YZ\7-\2\2Z[\7\5\2\2[^\5\n\6\2\\^\7-\2\2]"+
		"Y\3\2\2\2]\\\3\2\2\2^\13\3\2\2\2_`\7\26\2\2`a\5\30\r\2ab\5\16\b\2bc\7"+
		"!\2\2cd\5\20\t\2de\7\"\2\2e\r\3\2\2\2fg\7-\2\2g\17\3\2\2\2hm\7.\2\2im"+
		"\7/\2\2jm\7+\2\2km\7,\2\2lh\3\2\2\2li\3\2\2\2lj\3\2\2\2lk\3\2\2\2m\21"+
		"\3\2\2\2no\5\30\r\2op\7\f\2\2pq\5\24\13\2qr\7\"\2\2r\23\3\2\2\2st\7-\2"+
		"\2tu\7\7\2\2uv\7.\2\2vw\7\4\2\2wx\7\5\2\2x~\5\24\13\2yz\7-\2\2z{\7\7\2"+
		"\2{|\7.\2\2|~\7\4\2\2}s\3\2\2\2}y\3\2\2\2~\25\3\2\2\2\177\u0080\7-\2\2"+
		"\u0080\u0081\7\7\2\2\u0081\u0082\7-\2\2\u0082\u0088\7\4\2\2\u0083\u0084"+
		"\7-\2\2\u0084\u0085\7\7\2\2\u0085\u0086\7.\2\2\u0086\u0088\7\4\2\2\u0087"+
		"\177\3\2\2\2\u0087\u0083\3\2\2\2\u0088\27\3\2\2\2\u0089\u008a\t\2\2\2"+
		"\u008a\31\3\2\2\2\u008b\u008c\5\30\r\2\u008c\u008d\5\34\17\2\u008d\u008e"+
		"\7\13\2\2\u008e\u008f\5\36\20\2\u008f\u0090\7\32\2\2\u0090\u0094\7\24"+
		"\2\2\u0091\u0093\5\"\22\2\u0092\u0091\3\2\2\2\u0093\u0096\3\2\2\2\u0094"+
		"\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0097\3\2\2\2\u0096\u0094\3\2"+
		"\2\2\u0097\u0098\7\30\2\2\u0098\33\3\2\2\2\u0099\u009a\7-\2\2\u009a\35"+
		"\3\2\2\2\u009b\u009c\5 \21\2\u009c\u009d\7\5\2\2\u009d\u009e\5\36\20\2"+
		"\u009e\u00a1\3\2\2\2\u009f\u00a1\5 \21\2\u00a0\u009b\3\2\2\2\u00a0\u009f"+
		"\3\2\2\2\u00a1\37\3\2\2\2\u00a2\u00a3\5\30\r\2\u00a3\u00a4\7-\2\2\u00a4"+
		"\u00a7\3\2\2\2\u00a5\u00a7\3\2\2\2\u00a6\u00a2\3\2\2\2\u00a6\u00a5\3\2"+
		"\2\2\u00a7!\3\2\2\2\u00a8\u00a9\7\35\2\2\u00a9\u00aa\7\13\2\2\u00aa\u00ab"+
		"\5(\25\2\u00ab\u00ac\7\32\2\2\u00ac\u00ad\7\"\2\2\u00ad\u00c3\3\2\2\2"+
		"\u00ae\u00c3\5.\30\2\u00af\u00c3\5*\26\2\u00b0\u00b1\7\6\2\2\u00b1\u00c3"+
		"\7\"\2\2\u00b2\u00b3\7\3\2\2\u00b3\u00b4\7\13\2\2\u00b4\u00b5\5\n\6\2"+
		"\u00b5\u00b6\7\32\2\2\u00b6\u00b7\7\"\2\2\u00b7\u00c3\3\2\2\2\u00b8\u00b9"+
		"\7\3\2\2\u00b9\u00ba\7\13\2\2\u00ba\u00bb\5\26\f\2\u00bb\u00bc\7\32\2"+
		"\2\u00bc\u00bd\7\"\2\2\u00bd\u00c3\3\2\2\2\u00be\u00c3\5$\23\2\u00bf\u00c3"+
		"\5&\24\2\u00c0\u00c1\7\25\2\2\u00c1\u00c3\7\"\2\2\u00c2\u00a8\3\2\2\2"+
		"\u00c2\u00ae\3\2\2\2\u00c2\u00af\3\2\2\2\u00c2\u00b0\3\2\2\2\u00c2\u00b2"+
		"\3\2\2\2\u00c2\u00b8\3\2\2\2\u00c2\u00be\3\2\2\2\u00c2\u00bf\3\2\2\2\u00c2"+
		"\u00c0\3\2\2\2\u00c3#\3\2\2\2\u00c4\u00c5\7 \2\2\u00c5\u00c6\7\13\2\2"+
		"\u00c6\u00c7\5\66\34\2\u00c7\u00c8\7\32\2\2\u00c8\u00c9\7\"\2\2\u00c9"+
		"%\3\2\2\2\u00ca\u00cb\7-\2\2\u00cb\u00cd\7\13\2\2\u00cc\u00ce\5(\25\2"+
		"\u00cd\u00cc\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0"+
		"\7\32\2\2\u00d0\u00d1\7\"\2\2\u00d1\'\3\2\2\2\u00d2\u00d3\5\66\34\2\u00d3"+
		"\u00d4\7\5\2\2\u00d4\u00d5\5(\25\2\u00d5\u00d8\3\2\2\2\u00d6\u00d8\5\66"+
		"\34\2\u00d7\u00d2\3\2\2\2\u00d7\u00d6\3\2\2\2\u00d8)\3\2\2\2\u00d9\u00da"+
		"\7\r\2\2\u00da\u00db\7\13\2\2\u00db\u00dc\5\64\33\2\u00dc\u00dd\7\32\2"+
		"\2\u00dd\u00de\7$\2\2\u00de\u00e2\7\24\2\2\u00df\u00e1\5\"\22\2\u00e0"+
		"\u00df\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2"+
		"\2\2\u00e3\u00e5\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00ef\7\30\2\2\u00e6"+
		"\u00e7\7\27\2\2\u00e7\u00eb\7\24\2\2\u00e8\u00ea\5\"\22\2\u00e9\u00e8"+
		"\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec"+
		"\u00ee\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00f0\7\30\2\2\u00ef\u00e6\3"+
		"\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u0114\3\2\2\2\u00f1\u00f2\7\b\2\2\u00f2"+
		"\u00f3\7\13\2\2\u00f3\u00f4\5\64\33\2\u00f4\u00f5\7\32\2\2\u00f5\u00f9"+
		"\7\24\2\2\u00f6\u00f8\5\"\22\2\u00f7\u00f6\3\2\2\2\u00f8\u00fb\3\2\2\2"+
		"\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fc\3\2\2\2\u00fb\u00f9"+
		"\3\2\2\2\u00fc\u00fd\7\30\2\2\u00fd\u0114\3\2\2\2\u00fe\u00ff\7\36\2\2"+
		"\u00ff\u0100\7\13\2\2\u0100\u0101\7-\2\2\u0101\u0102\7!\2\2\u0102\u0103"+
		"\5,\27\2\u0103\u0104\7\f\2\2\u0104\u0107\5,\27\2\u0105\u0106\7\33\2\2"+
		"\u0106\u0108\5,\27\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0109"+
		"\3\2\2\2\u0109\u010a\7\32\2\2\u010a\u010e\7\24\2\2\u010b\u010d\5\"\22"+
		"\2\u010c\u010b\3\2\2\2\u010d\u0110\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f"+
		"\3\2\2\2\u010f\u0111\3\2\2\2\u0110\u010e\3\2\2\2\u0111\u0112\7\30\2\2"+
		"\u0112\u0114\3\2\2\2\u0113\u00d9\3\2\2\2\u0113\u00f1\3\2\2\2\u0113\u00fe"+
		"\3\2\2\2\u0114+\3\2\2\2\u0115\u0116\t\3\2\2\u0116-\3\2\2\2\u0117\u011a"+
		"\5\60\31\2\u0118\u011a\5\62\32\2\u0119\u0117\3\2\2\2\u0119\u0118\3\2\2"+
		"\2\u011a/\3\2\2\2\u011b\u011c\5\b\5\2\u011c\u011d\7!\2\2\u011d\u011e\5"+
		"\66\34\2\u011e\u011f\7\"\2\2\u011f\61\3\2\2\2\u0120\u0121\5\26\f\2\u0121"+
		"\u0122\7!\2\2\u0122\u0123\5\66\34\2\u0123\u0124\7\"\2\2\u0124\63\3\2\2"+
		"\2\u0125\u0126\7)\2\2\u0126\u012d\5\64\33\2\u0127\u0128\5\66\34\2\u0128"+
		"\u0129\t\4\2\2\u0129\u012a\5\66\34\2\u012a\u012d\3\2\2\2\u012b\u012d\5"+
		"\66\34\2\u012c\u0125\3\2\2\2\u012c\u0127\3\2\2\2\u012c\u012b\3\2\2\2\u012d"+
		"\65\3\2\2\2\u012e\u012f\b\34\1\2\u012f\u0130\7\t\2\2\u0130\u0139\5\66"+
		"\34\2\u0131\u0139\5\20\t\2\u0132\u0139\7-\2\2\u0133\u0139\5\26\f\2\u0134"+
		"\u0135\7\13\2\2\u0135\u0136\5\66\34\2\u0136\u0137\7\32\2\2\u0137\u0139"+
		"\3\2\2\2\u0138\u012e\3\2\2\2\u0138\u0131\3\2\2\2\u0138\u0132\3\2\2\2\u0138"+
		"\u0133\3\2\2\2\u0138\u0134\3\2\2\2\u0139\u0142\3\2\2\2\u013a\u013b\6\34"+
		"\2\3\u013b\u013c\t\5\2\2\u013c\u0141\5\66\34\2\u013d\u013e\6\34\3\3\u013e"+
		"\u013f\t\6\2\2\u013f\u0141\5\66\34\2\u0140\u013a\3\2\2\2\u0140\u013d\3"+
		"\2\2\2\u0141\u0144\3\2\2\2\u0142\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143"+
		"\67\3\2\2\2\u0144\u0142\3\2\2\2\u0145\u0146\t\7\2\2\u01469\3\2\2\2\u0147"+
		"\u0148\7\21\2\2\u0148\u0149\7\13\2\2\u0149\u014a\7\32\2\2\u014a\u014e"+
		"\7\24\2\2\u014b\u014d\5\"\22\2\u014c\u014b\3\2\2\2\u014d\u0150\3\2\2\2"+
		"\u014e\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0151\3\2\2\2\u0150\u014e"+
		"\3\2\2\2\u0151\u0152\7\30\2\2\u0152;\3\2\2\2\34BHP]l}\u0087\u0094\u00a0"+
		"\u00a6\u00c2\u00cd\u00d7\u00e2\u00eb\u00ef\u00f9\u0107\u010e\u0113\u0119"+
		"\u012c\u0138\u0140\u0142\u014e";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}