package grammarFiles;
// Generated from C:\Users\layca\Google Drive\UNIVERSIDADE\2016.1\Constru��o de Compiladores\Trabalho Final 2016.1\TrabalhoFinal2016_1.g4 by ANTLR 4.1
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
		RULE_lista_expr = 19, RULE_comando_else = 20, RULE_cmd_controle = 21, 
		RULE_condicoes = 22, RULE_cmd_atribuicao = 23, RULE_cmd_atrib_var = 24, 
		RULE_cmd_atrib_array = 25, RULE_oprelacional = 26, RULE_expr = 27, RULE_numero = 28, 
		RULE_principal = 29;
	public static final String[] ruleNames = {
		"prog", "declaracao", "declaracao_var", "var", "lista_ids", "declaracao_const", 
		"constante", "valor", "declaracao_Arrays", "lista_arrays", "array", "tipo", 
		"funcao", "nome_funcao", "lista_de_parametros", "parametro", "comandos", 
		"cmd_return", "chamada_funcao", "lista_expr", "comando_else", "cmd_controle", 
		"condicoes", "cmd_atribuicao", "cmd_atrib_var", "cmd_atrib_array", "oprelacional", 
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
			setState(60); match(12);
			setState(61); match(ID);
			setState(62); match(32);
			setState(66);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(63); declaracao();
					}
					} 
				}
				setState(68);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 13) | (1L << 23) | (1L << 35) | (1L << 40))) != 0)) {
				{
				{
				setState(69); funcao();
				}
				}
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(75); principal();
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
		public DeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao; }
	 
		public DeclaracaoContext() { }
		public void copyFrom(DeclaracaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeclaarcaoVariaveisContext extends DeclaracaoContext {
		public Declaracao_varContext declaracao_var() {
			return getRuleContext(Declaracao_varContext.class,0);
		}
		public DeclaarcaoVariaveisContext(DeclaracaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).enterDeclaarcaoVariaveis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).exitDeclaarcaoVariaveis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrabalhoFinal2016_1Visitor ) return ((TrabalhoFinal2016_1Visitor<? extends T>)visitor).visitDeclaarcaoVariaveis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclaarcaoArraysContext extends DeclaracaoContext {
		public Declaracao_ArraysContext declaracao_Arrays() {
			return getRuleContext(Declaracao_ArraysContext.class,0);
		}
		public DeclaarcaoArraysContext(DeclaracaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).enterDeclaarcaoArrays(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).exitDeclaarcaoArrays(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrabalhoFinal2016_1Visitor ) return ((TrabalhoFinal2016_1Visitor<? extends T>)visitor).visitDeclaarcaoArrays(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclaarcaoConstantesContext extends DeclaracaoContext {
		public Declaracao_constContext declaracao_const() {
			return getRuleContext(Declaracao_constContext.class,0);
		}
		public DeclaarcaoConstantesContext(DeclaracaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).enterDeclaarcaoConstantes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).exitDeclaarcaoConstantes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrabalhoFinal2016_1Visitor ) return ((TrabalhoFinal2016_1Visitor<? extends T>)visitor).visitDeclaarcaoConstantes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracaoContext declaracao() throws RecognitionException {
		DeclaracaoContext _localctx = new DeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaracao);
		try {
			setState(80);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new DeclaarcaoVariaveisContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(77); declaracao_var();
				}
				break;

			case 2:
				_localctx = new DeclaarcaoConstantesContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(78); declaracao_const();
				}
				break;

			case 3:
				_localctx = new DeclaarcaoArraysContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(79); declaracao_Arrays();
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
	public static class DeclaracaoVariavelContext extends Declaracao_varContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public DeclaracaoVariavelContext(Declaracao_varContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).enterDeclaracaoVariavel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).exitDeclaracaoVariavel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrabalhoFinal2016_1Visitor ) return ((TrabalhoFinal2016_1Visitor<? extends T>)visitor).visitDeclaracaoVariavel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracao_varContext declaracao_var() throws RecognitionException {
		Declaracao_varContext _localctx = new Declaracao_varContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracao_var);
		try {
			_localctx = new DeclaracaoVariavelContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(82); tipo();
			setState(83); match(10);
			setState(84); var();
			setState(85); match(32);
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
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
	 
		public VarContext() { }
		public void copyFrom(VarContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VariavelContext extends VarContext {
		public Lista_idsContext lista_ids() {
			return getRuleContext(Lista_idsContext.class,0);
		}
		public VariavelContext(VarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).enterVariavel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).exitVariavel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrabalhoFinal2016_1Visitor ) return ((TrabalhoFinal2016_1Visitor<? extends T>)visitor).visitVariavel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_var);
		try {
			_localctx = new VariavelContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(87); lista_ids();
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
	public static class IdentificadorContext extends Lista_idsContext {
		public TerminalNode ID() { return getToken(TrabalhoFinal2016_1Parser.ID, 0); }
		public IdentificadorContext(Lista_idsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).enterIdentificador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).exitIdentificador(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrabalhoFinal2016_1Visitor ) return ((TrabalhoFinal2016_1Visitor<? extends T>)visitor).visitIdentificador(this);
			else return visitor.visitChildren(this);
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

	public final Lista_idsContext lista_ids() throws RecognitionException {
		Lista_idsContext _localctx = new Lista_idsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_lista_ids);
		try {
			setState(93);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new ListaIDsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(89); match(ID);
				setState(90); match(3);
				setState(91); lista_ids();
				}
				break;

			case 2:
				_localctx = new IdentificadorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(92); match(ID);
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
			setState(95); match(20);
			setState(96); tipo();
			setState(97); constante();
			setState(98); match(31);
			setState(99); valor();
			setState(100); match(32);
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
		public ConstanteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constante; }
	 
		public ConstanteContext() { }
		public void copyFrom(ConstanteContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ConstanteIDContext extends ConstanteContext {
		public TerminalNode ID() { return getToken(TrabalhoFinal2016_1Parser.ID, 0); }
		public ConstanteIDContext(ConstanteContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).enterConstanteID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).exitConstanteID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrabalhoFinal2016_1Visitor ) return ((TrabalhoFinal2016_1Visitor<? extends T>)visitor).visitConstanteID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstanteContext constante() throws RecognitionException {
		ConstanteContext _localctx = new ConstanteContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_constante);
		try {
			_localctx = new ConstanteIDContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(102); match(ID);
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
	public static class ValorBooleanContext extends ValorContext {
		public TerminalNode BOOLEAN() { return getToken(TrabalhoFinal2016_1Parser.BOOLEAN, 0); }
		public ValorBooleanContext(ValorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).enterValorBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).exitValorBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrabalhoFinal2016_1Visitor ) return ((TrabalhoFinal2016_1Visitor<? extends T>)visitor).visitValorBoolean(this);
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

	public final ValorContext valor() throws RecognitionException {
		ValorContext _localctx = new ValorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_valor);
		try {
			setState(108);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new ValorInteiroContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(104); match(INT);
				}
				break;
			case REAL:
				_localctx = new ValorRealContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(105); match(REAL);
				}
				break;
			case STRING:
				_localctx = new ValorStringContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(106); match(STRING);
				}
				break;
			case BOOLEAN:
				_localctx = new ValorBooleanContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(107); match(BOOLEAN);
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
		public Declaracao_ArraysContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_Arrays; }
	 
		public Declaracao_ArraysContext() { }
		public void copyFrom(Declaracao_ArraysContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeclaracaoArrayContext extends Declaracao_ArraysContext {
		public Lista_arraysContext lista_arrays() {
			return getRuleContext(Lista_arraysContext.class,0);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public DeclaracaoArrayContext(Declaracao_ArraysContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).enterDeclaracaoArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).exitDeclaracaoArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrabalhoFinal2016_1Visitor ) return ((TrabalhoFinal2016_1Visitor<? extends T>)visitor).visitDeclaracaoArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracao_ArraysContext declaracao_Arrays() throws RecognitionException {
		Declaracao_ArraysContext _localctx = new Declaracao_ArraysContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_declaracao_Arrays);
		try {
			_localctx = new DeclaracaoArrayContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(110); tipo();
			setState(111); match(10);
			setState(112); lista_arrays();
			setState(113); match(32);
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
		public Lista_arraysContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_arrays; }
	 
		public Lista_arraysContext() { }
		public void copyFrom(Lista_arraysContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ListaArraysContext extends Lista_arraysContext {
		public Lista_arraysContext lista_arrays() {
			return getRuleContext(Lista_arraysContext.class,0);
		}
		public TerminalNode INT() { return getToken(TrabalhoFinal2016_1Parser.INT, 0); }
		public TerminalNode ID() { return getToken(TrabalhoFinal2016_1Parser.ID, 0); }
		public ListaArraysContext(Lista_arraysContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).enterListaArrays(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).exitListaArrays(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrabalhoFinal2016_1Visitor ) return ((TrabalhoFinal2016_1Visitor<? extends T>)visitor).visitListaArrays(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ListaArraysArrayContext extends Lista_arraysContext {
		public TerminalNode INT() { return getToken(TrabalhoFinal2016_1Parser.INT, 0); }
		public TerminalNode ID() { return getToken(TrabalhoFinal2016_1Parser.ID, 0); }
		public ListaArraysArrayContext(Lista_arraysContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).enterListaArraysArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).exitListaArraysArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrabalhoFinal2016_1Visitor ) return ((TrabalhoFinal2016_1Visitor<? extends T>)visitor).visitListaArraysArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista_arraysContext lista_arrays() throws RecognitionException {
		Lista_arraysContext _localctx = new Lista_arraysContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_lista_arrays);
		try {
			setState(125);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new ListaArraysContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(115); match(ID);
				setState(116); match(5);
				setState(117); match(INT);
				setState(118); match(2);
				setState(119); match(3);
				setState(120); lista_arrays();
				}
				break;

			case 2:
				_localctx = new ListaArraysArrayContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(121); match(ID);
				setState(122); match(5);
				setState(123); match(INT);
				setState(124); match(2);
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
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
	 
		public ArrayContext() { }
		public void copyFrom(ArrayContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayIDContext extends ArrayContext {
		public List<TerminalNode> ID() { return getTokens(TrabalhoFinal2016_1Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TrabalhoFinal2016_1Parser.ID, i);
		}
		public ArrayIDContext(ArrayContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).enterArrayID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).exitArrayID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrabalhoFinal2016_1Visitor ) return ((TrabalhoFinal2016_1Visitor<? extends T>)visitor).visitArrayID(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayINTContext extends ArrayContext {
		public TerminalNode INT() { return getToken(TrabalhoFinal2016_1Parser.INT, 0); }
		public TerminalNode ID() { return getToken(TrabalhoFinal2016_1Parser.ID, 0); }
		public ArrayINTContext(ArrayContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).enterArrayINT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).exitArrayINT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrabalhoFinal2016_1Visitor ) return ((TrabalhoFinal2016_1Visitor<? extends T>)visitor).visitArrayINT(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_array);
		try {
			setState(135);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new ArrayIDContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(127); match(ID);
				setState(128); match(5);
				setState(129); match(ID);
				setState(130); match(2);
				}
				break;

			case 2:
				_localctx = new ArrayINTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(131); match(ID);
				setState(132); match(5);
				setState(133); match(INT);
				setState(134); match(2);
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
	 
		public TipoContext() { }
		public void copyFrom(TipoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TipoRealContext extends TipoContext {
		public TipoRealContext(TipoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).enterTipoReal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).exitTipoReal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrabalhoFinal2016_1Visitor ) return ((TrabalhoFinal2016_1Visitor<? extends T>)visitor).visitTipoReal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TipoBooleanContext extends TipoContext {
		public TipoBooleanContext(TipoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).enterTipoBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).exitTipoBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrabalhoFinal2016_1Visitor ) return ((TrabalhoFinal2016_1Visitor<? extends T>)visitor).visitTipoBoolean(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TipoStringContext extends TipoContext {
		public TipoStringContext(TipoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).enterTipoString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).exitTipoString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrabalhoFinal2016_1Visitor ) return ((TrabalhoFinal2016_1Visitor<? extends T>)visitor).visitTipoString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TipoIntContext extends TipoContext {
		public TipoIntContext(TipoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).enterTipoInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).exitTipoInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrabalhoFinal2016_1Visitor ) return ((TrabalhoFinal2016_1Visitor<? extends T>)visitor).visitTipoInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_tipo);
		try {
			setState(141);
			switch (_input.LA(1)) {
			case 13:
				_localctx = new TipoIntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(137); match(13);
				}
				break;
			case 40:
				_localctx = new TipoRealContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(138); match(40);
				}
				break;
			case 35:
				_localctx = new TipoStringContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(139); match(35);
				}
				break;
			case 23:
				_localctx = new TipoBooleanContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(140); match(23);
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

	public static class FuncaoContext extends ParserRuleContext {
		public FuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcao; }
	 
		public FuncaoContext() { }
		public void copyFrom(FuncaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FunctionContext extends FuncaoContext {
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
		public FunctionContext(FuncaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrabalhoFinal2016_1Visitor ) return ((TrabalhoFinal2016_1Visitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncaoContext funcao() throws RecognitionException {
		FuncaoContext _localctx = new FuncaoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_funcao);
		int _la;
		try {
			_localctx = new FunctionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(143); tipo();
			setState(144); nome_funcao();
			setState(145); match(9);
			setState(146); lista_de_parametros();
			setState(147); match(24);
			setState(148); match(18);
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 4) | (1L << 6) | (1L << 11) | (1L << 19) | (1L << 27) | (1L << 28) | (1L << 30) | (1L << ID))) != 0)) {
				{
				{
				setState(149); comandos();
				}
				}
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(155); match(22);
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
		public Nome_funcaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nome_funcao; }
	 
		public Nome_funcaoContext() { }
		public void copyFrom(Nome_funcaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NomeFuncaoContext extends Nome_funcaoContext {
		public TerminalNode ID() { return getToken(TrabalhoFinal2016_1Parser.ID, 0); }
		public NomeFuncaoContext(Nome_funcaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).enterNomeFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).exitNomeFuncao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrabalhoFinal2016_1Visitor ) return ((TrabalhoFinal2016_1Visitor<? extends T>)visitor).visitNomeFuncao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nome_funcaoContext nome_funcao() throws RecognitionException {
		Nome_funcaoContext _localctx = new Nome_funcaoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_nome_funcao);
		try {
			_localctx = new NomeFuncaoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(157); match(ID);
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
		public Lista_de_parametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_de_parametros; }
	 
		public Lista_de_parametrosContext() { }
		public void copyFrom(Lista_de_parametrosContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParamContext extends Lista_de_parametrosContext {
		public ParametroContext parametro() {
			return getRuleContext(ParametroContext.class,0);
		}
		public ParamContext(Lista_de_parametrosContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).exitParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrabalhoFinal2016_1Visitor ) return ((TrabalhoFinal2016_1Visitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParamVazioContext extends Lista_de_parametrosContext {
		public ParamVazioContext(Lista_de_parametrosContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).enterParamVazio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).exitParamVazio(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrabalhoFinal2016_1Visitor ) return ((TrabalhoFinal2016_1Visitor<? extends T>)visitor).visitParamVazio(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ListaParamContext extends Lista_de_parametrosContext {
		public ParametroContext parametro() {
			return getRuleContext(ParametroContext.class,0);
		}
		public Lista_de_parametrosContext lista_de_parametros() {
			return getRuleContext(Lista_de_parametrosContext.class,0);
		}
		public ListaParamContext(Lista_de_parametrosContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).enterListaParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).exitListaParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrabalhoFinal2016_1Visitor ) return ((TrabalhoFinal2016_1Visitor<? extends T>)visitor).visitListaParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista_de_parametrosContext lista_de_parametros() throws RecognitionException {
		Lista_de_parametrosContext _localctx = new Lista_de_parametrosContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_lista_de_parametros);
		try {
			setState(165);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new ListaParamContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(159); parametro();
				setState(160); match(3);
				setState(161); lista_de_parametros();
				}
				break;

			case 2:
				_localctx = new ParamContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(163); parametro();
				}
				break;

			case 3:
				_localctx = new ParamVazioContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
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
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
	 
		public ParametroContext() { }
		public void copyFrom(ParametroContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParameterContext extends ParametroContext {
		public TerminalNode ID() { return getToken(TrabalhoFinal2016_1Parser.ID, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public ParameterContext(ParametroContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrabalhoFinal2016_1Visitor ) return ((TrabalhoFinal2016_1Visitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_parametro);
		try {
			_localctx = new ParameterContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(167); tipo();
			setState(168); match(ID);
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
		public ComandosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandos; }
	 
		public ComandosContext() { }
		public void copyFrom(ComandosContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ComadoReadContext extends ComandosContext {
		public Lista_idsContext lista_ids() {
			return getRuleContext(Lista_idsContext.class,0);
		}
		public ComadoReadContext(ComandosContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).enterComadoRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).exitComadoRead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrabalhoFinal2016_1Visitor ) return ((TrabalhoFinal2016_1Visitor<? extends T>)visitor).visitComadoRead(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComadoReadArraysContext extends ComandosContext {
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ComadoReadArraysContext(ComandosContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).enterComadoReadArrays(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).exitComadoReadArrays(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrabalhoFinal2016_1Visitor ) return ((TrabalhoFinal2016_1Visitor<? extends T>)visitor).visitComadoReadArrays(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComandoControleContext extends ComandosContext {
		public Cmd_controleContext cmd_controle() {
			return getRuleContext(Cmd_controleContext.class,0);
		}
		public ComandoControleContext(ComandosContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).enterComandoControle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).exitComandoControle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrabalhoFinal2016_1Visitor ) return ((TrabalhoFinal2016_1Visitor<? extends T>)visitor).visitComandoControle(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComandoRetornoContext extends ComandosContext {
		public Cmd_returnContext cmd_return() {
			return getRuleContext(Cmd_returnContext.class,0);
		}
		public ComandoRetornoContext(ComandosContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).enterComandoRetorno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).exitComandoRetorno(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrabalhoFinal2016_1Visitor ) return ((TrabalhoFinal2016_1Visitor<? extends T>)visitor).visitComandoRetorno(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComandoBreakContext extends ComandosContext {
		public ComandoBreakContext(ComandosContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).enterComandoBreak(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).exitComandoBreak(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrabalhoFinal2016_1Visitor ) return ((TrabalhoFinal2016_1Visitor<? extends T>)visitor).visitComandoBreak(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComandoPrintContext extends ComandosContext {
		public Lista_exprContext lista_expr() {
			return getRuleContext(Lista_exprContext.class,0);
		}
		public ComandoPrintContext(ComandosContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).enterComandoPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).exitComandoPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrabalhoFinal2016_1Visitor ) return ((TrabalhoFinal2016_1Visitor<? extends T>)visitor).visitComandoPrint(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComandoChamadaFuncaoContext extends ComandosContext {
		public Chamada_funcaoContext chamada_funcao() {
			return getRuleContext(Chamada_funcaoContext.class,0);
		}
		public ComandoChamadaFuncaoContext(ComandosContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).enterComandoChamadaFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).exitComandoChamadaFuncao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrabalhoFinal2016_1Visitor ) return ((TrabalhoFinal2016_1Visitor<? extends T>)visitor).visitComandoChamadaFuncao(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComandoExitContext extends ComandosContext {
		public ComandoExitContext(ComandosContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).enterComandoExit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).exitComandoExit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrabalhoFinal2016_1Visitor ) return ((TrabalhoFinal2016_1Visitor<? extends T>)visitor).visitComandoExit(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComandoAtribuicaoContext extends ComandosContext {
		public Cmd_atribuicaoContext cmd_atribuicao() {
			return getRuleContext(Cmd_atribuicaoContext.class,0);
		}
		public ComandoAtribuicaoContext(ComandosContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).enterComandoAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).exitComandoAtribuicao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrabalhoFinal2016_1Visitor ) return ((TrabalhoFinal2016_1Visitor<? extends T>)visitor).visitComandoAtribuicao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandosContext comandos() throws RecognitionException {
		ComandosContext _localctx = new ComandosContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_comandos);
		try {
			setState(196);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new ComandoPrintContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(170); match(27);
				setState(171); match(9);
				setState(172); lista_expr();
				setState(173); match(24);
				setState(174); match(32);
				}
				break;

			case 2:
				_localctx = new ComandoAtribuicaoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(176); cmd_atribuicao();
				}
				break;

			case 3:
				_localctx = new ComandoControleContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(177); cmd_controle();
				}
				break;

			case 4:
				_localctx = new ComandoExitContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(178); match(4);
				setState(179); match(32);
				}
				break;

			case 5:
				_localctx = new ComadoReadContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(180); match(1);
				setState(181); match(9);
				setState(182); lista_ids();
				setState(183); match(24);
				setState(184); match(32);
				}
				break;

			case 6:
				_localctx = new ComadoReadArraysContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(186); match(1);
				setState(187); match(9);
				setState(188); array();
				setState(189); match(24);
				setState(190); match(32);
				}
				break;

			case 7:
				_localctx = new ComandoRetornoContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(192); cmd_return();
				}
				break;

			case 8:
				_localctx = new ComandoChamadaFuncaoContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(193); chamada_funcao();
				}
				break;

			case 9:
				_localctx = new ComandoBreakContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(194); match(19);
				setState(195); match(32);
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
		public Cmd_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_return; }
	 
		public Cmd_returnContext() { }
		public void copyFrom(Cmd_returnContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ReturnContext extends Cmd_returnContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnContext(Cmd_returnContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).enterReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).exitReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrabalhoFinal2016_1Visitor ) return ((TrabalhoFinal2016_1Visitor<? extends T>)visitor).visitReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cmd_returnContext cmd_return() throws RecognitionException {
		Cmd_returnContext _localctx = new Cmd_returnContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_cmd_return);
		try {
			_localctx = new ReturnContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(198); match(30);
			setState(199); match(9);
			setState(200); expr(0);
			setState(201); match(24);
			setState(202); match(32);
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
		public Chamada_funcaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamada_funcao; }
	 
		public Chamada_funcaoContext() { }
		public void copyFrom(Chamada_funcaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ChamadaFuncaoContext extends Chamada_funcaoContext {
		public TerminalNode ID() { return getToken(TrabalhoFinal2016_1Parser.ID, 0); }
		public Lista_exprContext lista_expr() {
			return getRuleContext(Lista_exprContext.class,0);
		}
		public ChamadaFuncaoContext(Chamada_funcaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).enterChamadaFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).exitChamadaFuncao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrabalhoFinal2016_1Visitor ) return ((TrabalhoFinal2016_1Visitor<? extends T>)visitor).visitChamadaFuncao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Chamada_funcaoContext chamada_funcao() throws RecognitionException {
		Chamada_funcaoContext _localctx = new Chamada_funcaoContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_chamada_funcao);
		int _la;
		try {
			_localctx = new ChamadaFuncaoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(204); match(ID);
			setState(205); match(9);
			setState(207);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 7) | (1L << 9) | (1L << STRING) | (1L << BOOLEAN) | (1L << ID) | (1L << INT) | (1L << REAL))) != 0)) {
				{
				setState(206); lista_expr();
				}
			}

			setState(209); match(24);
			setState(210); match(32);
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
		public Lista_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_expr; }
	 
		public Lista_exprContext() { }
		public void copyFrom(Lista_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ListaExpressoesExprContext extends Lista_exprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ListaExpressoesExprContext(Lista_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).enterListaExpressoesExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).exitListaExpressoesExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrabalhoFinal2016_1Visitor ) return ((TrabalhoFinal2016_1Visitor<? extends T>)visitor).visitListaExpressoesExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ListaExpressoesContext extends Lista_exprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Lista_exprContext lista_expr() {
			return getRuleContext(Lista_exprContext.class,0);
		}
		public ListaExpressoesContext(Lista_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).enterListaExpressoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).exitListaExpressoes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrabalhoFinal2016_1Visitor ) return ((TrabalhoFinal2016_1Visitor<? extends T>)visitor).visitListaExpressoes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista_exprContext lista_expr() throws RecognitionException {
		Lista_exprContext _localctx = new Lista_exprContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_lista_expr);
		try {
			setState(217);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new ListaExpressoesContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(212); expr(0);
				setState(213); match(3);
				setState(214); lista_expr();
				}
				break;

			case 2:
				_localctx = new ListaExpressoesExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(216); expr(0);
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

	public static class Comando_elseContext extends ParserRuleContext {
		public Comando_elseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando_else; }
	 
		public Comando_elseContext() { }
		public void copyFrom(Comando_elseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ControleElseContext extends Comando_elseContext {
		public ComandosContext comandos(int i) {
			return getRuleContext(ComandosContext.class,i);
		}
		public List<ComandosContext> comandos() {
			return getRuleContexts(ComandosContext.class);
		}
		public ControleElseContext(Comando_elseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).enterControleElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).exitControleElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrabalhoFinal2016_1Visitor ) return ((TrabalhoFinal2016_1Visitor<? extends T>)visitor).visitControleElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comando_elseContext comando_else() throws RecognitionException {
		Comando_elseContext _localctx = new Comando_elseContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_comando_else);
		int _la;
		try {
			_localctx = new ControleElseContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(219); match(21);
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
		public Cmd_controleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_controle; }
	 
		public Cmd_controleContext() { }
		public void copyFrom(Cmd_controleContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ComandoControleIfContext extends Cmd_controleContext {
		public ComandosContext comandos(int i) {
			return getRuleContext(ComandosContext.class,i);
		}
		public Comando_elseContext comando_else() {
			return getRuleContext(Comando_elseContext.class,0);
		}
		public List<ComandosContext> comandos() {
			return getRuleContexts(ComandosContext.class);
		}
		public OprelacionalContext oprelacional() {
			return getRuleContext(OprelacionalContext.class,0);
		}
		public ComandoControleIfContext(Cmd_controleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).enterComandoControleIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).exitComandoControleIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrabalhoFinal2016_1Visitor ) return ((TrabalhoFinal2016_1Visitor<? extends T>)visitor).visitComandoControleIf(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComandoControleForContext extends Cmd_controleContext {
		public ComandosContext comandos(int i) {
			return getRuleContext(ComandosContext.class,i);
		}
		public TerminalNode ID() { return getToken(TrabalhoFinal2016_1Parser.ID, 0); }
		public List<ComandosContext> comandos() {
			return getRuleContexts(ComandosContext.class);
		}
		public CondicoesContext condicoes(int i) {
			return getRuleContext(CondicoesContext.class,i);
		}
		public List<CondicoesContext> condicoes() {
			return getRuleContexts(CondicoesContext.class);
		}
		public ComandoControleForContext(Cmd_controleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).enterComandoControleFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).exitComandoControleFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrabalhoFinal2016_1Visitor ) return ((TrabalhoFinal2016_1Visitor<? extends T>)visitor).visitComandoControleFor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComandoControleWhileContext extends Cmd_controleContext {
		public ComandosContext comandos(int i) {
			return getRuleContext(ComandosContext.class,i);
		}
		public List<ComandosContext> comandos() {
			return getRuleContexts(ComandosContext.class);
		}
		public OprelacionalContext oprelacional() {
			return getRuleContext(OprelacionalContext.class,0);
		}
		public ComandoControleWhileContext(Cmd_controleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).enterComandoControleWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).exitComandoControleWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrabalhoFinal2016_1Visitor ) return ((TrabalhoFinal2016_1Visitor<? extends T>)visitor).visitComandoControleWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cmd_controleContext cmd_controle() throws RecognitionException {
		Cmd_controleContext _localctx = new Cmd_controleContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_cmd_controle);
		int _la;
		try {
			setState(279);
			switch (_input.LA(1)) {
			case 11:
				_localctx = new ComandoControleIfContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(229); match(11);
				setState(230); match(9);
				setState(231); oprelacional(0);
				setState(232); match(24);
				setState(233); match(34);
				setState(234); match(18);
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 4) | (1L << 6) | (1L << 11) | (1L << 19) | (1L << 27) | (1L << 28) | (1L << 30) | (1L << ID))) != 0)) {
					{
					{
					setState(235); comandos();
					}
					}
					setState(240);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(241); match(22);
				setState(243);
				_la = _input.LA(1);
				if (_la==21) {
					{
					setState(242); comando_else();
					}
				}

				}
				break;
			case 6:
				_localctx = new ComandoControleWhileContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(245); match(6);
				setState(246); match(9);
				setState(247); oprelacional(0);
				setState(248); match(24);
				setState(249); match(18);
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 4) | (1L << 6) | (1L << 11) | (1L << 19) | (1L << 27) | (1L << 28) | (1L << 30) | (1L << ID))) != 0)) {
					{
					{
					setState(250); comandos();
					}
					}
					setState(255);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(256); match(22);
				}
				break;
			case 28:
				_localctx = new ComandoControleForContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(258); match(28);
				setState(259); match(9);
				setState(260); match(ID);
				setState(261); match(31);
				setState(262); condicoes();
				setState(263); match(10);
				setState(264); condicoes();
				setState(267);
				_la = _input.LA(1);
				if (_la==25) {
					{
					setState(265); match(25);
					setState(266); condicoes();
					}
				}

				setState(269); match(24);
				setState(270); match(18);
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 4) | (1L << 6) | (1L << 11) | (1L << 19) | (1L << 27) | (1L << 28) | (1L << 30) | (1L << ID))) != 0)) {
					{
					{
					setState(271); comandos();
					}
					}
					setState(276);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(277); match(22);
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
		public CondicoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicoes; }
	 
		public CondicoesContext() { }
		public void copyFrom(CondicoesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CondicoesIDContext extends CondicoesContext {
		public TerminalNode ID() { return getToken(TrabalhoFinal2016_1Parser.ID, 0); }
		public CondicoesIDContext(CondicoesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).enterCondicoesID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).exitCondicoesID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrabalhoFinal2016_1Visitor ) return ((TrabalhoFinal2016_1Visitor<? extends T>)visitor).visitCondicoesID(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondiicoesINTContext extends CondicoesContext {
		public TerminalNode INT() { return getToken(TrabalhoFinal2016_1Parser.INT, 0); }
		public CondiicoesINTContext(CondicoesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).enterCondiicoesINT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).exitCondiicoesINT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrabalhoFinal2016_1Visitor ) return ((TrabalhoFinal2016_1Visitor<? extends T>)visitor).visitCondiicoesINT(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicoesContext condicoes() throws RecognitionException {
		CondicoesContext _localctx = new CondicoesContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_condicoes);
		try {
			setState(283);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new CondicoesIDContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(281); match(ID);
				}
				break;
			case INT:
				_localctx = new CondiicoesINTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(282); match(INT);
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

	public static class Cmd_atribuicaoContext extends ParserRuleContext {
		public Cmd_atribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_atribuicao; }
	 
		public Cmd_atribuicaoContext() { }
		public void copyFrom(Cmd_atribuicaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AtributionVarContext extends Cmd_atribuicaoContext {
		public Cmd_atrib_varContext cmd_atrib_var() {
			return getRuleContext(Cmd_atrib_varContext.class,0);
		}
		public AtributionVarContext(Cmd_atribuicaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).enterAtributionVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).exitAtributionVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrabalhoFinal2016_1Visitor ) return ((TrabalhoFinal2016_1Visitor<? extends T>)visitor).visitAtributionVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtributionArrayContext extends Cmd_atribuicaoContext {
		public Cmd_atrib_arrayContext cmd_atrib_array() {
			return getRuleContext(Cmd_atrib_arrayContext.class,0);
		}
		public AtributionArrayContext(Cmd_atribuicaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).enterAtributionArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).exitAtributionArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrabalhoFinal2016_1Visitor ) return ((TrabalhoFinal2016_1Visitor<? extends T>)visitor).visitAtributionArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cmd_atribuicaoContext cmd_atribuicao() throws RecognitionException {
		Cmd_atribuicaoContext _localctx = new Cmd_atribuicaoContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_cmd_atribuicao);
		try {
			setState(287);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				_localctx = new AtributionVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(285); cmd_atrib_var();
				}
				break;

			case 2:
				_localctx = new AtributionArrayContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(286); cmd_atrib_array();
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
		public Cmd_atrib_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_atrib_var; }
	 
		public Cmd_atrib_varContext() { }
		public void copyFrom(Cmd_atrib_varContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AtribuicaodeVariavelContext extends Cmd_atrib_varContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public AtribuicaodeVariavelContext(Cmd_atrib_varContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).enterAtribuicaodeVariavel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).exitAtribuicaodeVariavel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrabalhoFinal2016_1Visitor ) return ((TrabalhoFinal2016_1Visitor<? extends T>)visitor).visitAtribuicaodeVariavel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cmd_atrib_varContext cmd_atrib_var() throws RecognitionException {
		Cmd_atrib_varContext _localctx = new Cmd_atrib_varContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_cmd_atrib_var);
		try {
			_localctx = new AtribuicaodeVariavelContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(289); var();
			setState(290); match(31);
			setState(291); expr(0);
			setState(292); match(32);
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
		public Cmd_atrib_arrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_atrib_array; }
	 
		public Cmd_atrib_arrayContext() { }
		public void copyFrom(Cmd_atrib_arrayContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AtribuicaodeArrayContext extends Cmd_atrib_arrayContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public AtribuicaodeArrayContext(Cmd_atrib_arrayContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).enterAtribuicaodeArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).exitAtribuicaodeArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrabalhoFinal2016_1Visitor ) return ((TrabalhoFinal2016_1Visitor<? extends T>)visitor).visitAtribuicaodeArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cmd_atrib_arrayContext cmd_atrib_array() throws RecognitionException {
		Cmd_atrib_arrayContext _localctx = new Cmd_atrib_arrayContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_cmd_atrib_array);
		try {
			_localctx = new AtribuicaodeArrayContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(294); array();
			setState(295); match(31);
			setState(296); expr(0);
			setState(297); match(32);
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
		public int _p;
		public OprelacionalContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public OprelacionalContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_oprelacional; }
	 
		public OprelacionalContext() { }
		public void copyFrom(OprelacionalContext ctx) {
			super.copyFrom(ctx);
			this._p = ctx._p;
		}
	}
	public static class OprelacionalNotContext extends OprelacionalContext {
		public OprelacionalContext oprelacional() {
			return getRuleContext(OprelacionalContext.class,0);
		}
		public OprelacionalNotContext(OprelacionalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).enterOprelacionalNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).exitOprelacionalNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrabalhoFinal2016_1Visitor ) return ((TrabalhoFinal2016_1Visitor<? extends T>)visitor).visitOprelacionalNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OprelacionalBinarioContext extends OprelacionalContext {
		public Token o;
		public OprelacionalContext oprelacional(int i) {
			return getRuleContext(OprelacionalContext.class,i);
		}
		public List<OprelacionalContext> oprelacional() {
			return getRuleContexts(OprelacionalContext.class);
		}
		public OprelacionalBinarioContext(OprelacionalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).enterOprelacionalBinario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).exitOprelacionalBinario(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrabalhoFinal2016_1Visitor ) return ((TrabalhoFinal2016_1Visitor<? extends T>)visitor).visitOprelacionalBinario(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrelacionalExprContext extends OprelacionalContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrelacionalExprContext(OprelacionalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).enterPrelacionalExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).exitPrelacionalExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrabalhoFinal2016_1Visitor ) return ((TrabalhoFinal2016_1Visitor<? extends T>)visitor).visitPrelacionalExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OprelacionalContext oprelacional(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		OprelacionalContext _localctx = new OprelacionalContext(_ctx, _parentState, _p);
		OprelacionalContext _prevctx = _localctx;
		int _startState = 52;
		enterRecursionRule(_localctx, RULE_oprelacional);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			switch (_input.LA(1)) {
			case 39:
				{
				_localctx = new OprelacionalNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(300); match(39);
				setState(301); oprelacional(3);
				}
				break;
			case 7:
			case 9:
			case STRING:
			case BOOLEAN:
			case ID:
			case INT:
			case REAL:
				{
				_localctx = new PrelacionalExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(302); expr(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(310);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OprelacionalBinarioContext(new OprelacionalContext(_parentctx, _parentState, _p));
					pushNewRecursionContext(_localctx, _startState, RULE_oprelacional);
					setState(305);
					if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
					setState(306);
					((OprelacionalBinarioContext)_localctx).o = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 14) | (1L << 16) | (1L << 17) | (1L << 29) | (1L << 33) | (1L << 36) | (1L << 38))) != 0)) ) {
						((OprelacionalBinarioContext)_localctx).o = (Token)_errHandler.recoverInline(this);
					}
					consume();
					setState(307); oprelacional(3);
					}
					} 
				}
				setState(312);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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

	public static class ExprContext extends ParserRuleContext {
		public int _p;
		public ExprContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExprContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
			this._p = ctx._p;
		}
	}
	public static class ExprArrayContext extends ExprContext {
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ExprArrayContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).enterExprArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).exitExprArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrabalhoFinal2016_1Visitor ) return ((TrabalhoFinal2016_1Visitor<? extends T>)visitor).visitExprArray(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprIDContext extends ExprContext {
		public TerminalNode ID() { return getToken(TrabalhoFinal2016_1Parser.ID, 0); }
		public ExprIDContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).enterExprID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).exitExprID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrabalhoFinal2016_1Visitor ) return ((TrabalhoFinal2016_1Visitor<? extends T>)visitor).visitExprID(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprParentesesContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprParentesesContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).enterExprParenteses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).exitExprParenteses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrabalhoFinal2016_1Visitor ) return ((TrabalhoFinal2016_1Visitor<? extends T>)visitor).visitExprParenteses(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprSomaSubContext extends ExprContext {
		public Token s;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprSomaSubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).enterExprSomaSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).exitExprSomaSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrabalhoFinal2016_1Visitor ) return ((TrabalhoFinal2016_1Visitor<? extends T>)visitor).visitExprSomaSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprValorContext extends ExprContext {
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public ExprValorContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).enterExprValor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).exitExprValor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrabalhoFinal2016_1Visitor ) return ((TrabalhoFinal2016_1Visitor<? extends T>)visitor).visitExprValor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprMultDivContext extends ExprContext {
		public Token m;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprMultDivContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).enterExprMultDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).exitExprMultDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrabalhoFinal2016_1Visitor ) return ((TrabalhoFinal2016_1Visitor<? extends T>)visitor).visitExprMultDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprNegativoContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprNegativoContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).enterExprNegativo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).exitExprNegativo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrabalhoFinal2016_1Visitor ) return ((TrabalhoFinal2016_1Visitor<? extends T>)visitor).visitExprNegativo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState, _p);
		ExprContext _prevctx = _localctx;
		int _startState = 54;
		enterRecursionRule(_localctx, RULE_expr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				_localctx = new ExprNegativoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(314); match(7);
				setState(315); expr(7);
				}
				break;

			case 2:
				{
				_localctx = new ExprValorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(316); valor();
				}
				break;

			case 3:
				{
				_localctx = new ExprIDContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(317); match(ID);
				}
				break;

			case 4:
				{
				_localctx = new ExprArrayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(318); array();
				}
				break;

			case 5:
				{
				_localctx = new ExprParentesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(319); match(9);
				setState(320); expr(0);
				setState(321); match(24);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(333);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(331);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						_localctx = new ExprMultDivContext(new ExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(325);
						if (!(6 >= _localctx._p)) throw new FailedPredicateException(this, "6 >= $_p");
						setState(326);
						((ExprMultDivContext)_localctx).m = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==8 || _la==37) ) {
							((ExprMultDivContext)_localctx).m = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(327); expr(7);
						}
						break;

					case 2:
						{
						_localctx = new ExprSomaSubContext(new ExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(328);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(329);
						((ExprSomaSubContext)_localctx).s = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==7 || _la==26) ) {
							((ExprSomaSubContext)_localctx).s = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(330); expr(6);
						}
						break;
					}
					} 
				}
				setState(335);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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
		public NumeroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero; }
	 
		public NumeroContext() { }
		public void copyFrom(NumeroContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NumeroInteiroContext extends NumeroContext {
		public TerminalNode INT() { return getToken(TrabalhoFinal2016_1Parser.INT, 0); }
		public NumeroInteiroContext(NumeroContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).enterNumeroInteiro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).exitNumeroInteiro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrabalhoFinal2016_1Visitor ) return ((TrabalhoFinal2016_1Visitor<? extends T>)visitor).visitNumeroInteiro(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumeroRealContext extends NumeroContext {
		public TerminalNode REAL() { return getToken(TrabalhoFinal2016_1Parser.REAL, 0); }
		public NumeroRealContext(NumeroContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).enterNumeroReal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).exitNumeroReal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrabalhoFinal2016_1Visitor ) return ((TrabalhoFinal2016_1Visitor<? extends T>)visitor).visitNumeroReal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumeroContext numero() throws RecognitionException {
		NumeroContext _localctx = new NumeroContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_numero);
		try {
			setState(338);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new NumeroInteiroContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(336); match(INT);
				}
				break;
			case REAL:
				_localctx = new NumeroRealContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(337); match(REAL);
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

	public static class PrincipalContext extends ParserRuleContext {
		public PrincipalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_principal; }
	 
		public PrincipalContext() { }
		public void copyFrom(PrincipalContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MainContext extends PrincipalContext {
		public ComandosContext comandos(int i) {
			return getRuleContext(ComandosContext.class,i);
		}
		public List<ComandosContext> comandos() {
			return getRuleContexts(ComandosContext.class);
		}
		public MainContext(PrincipalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrabalhoFinal2016_1Listener ) ((TrabalhoFinal2016_1Listener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrabalhoFinal2016_1Visitor ) return ((TrabalhoFinal2016_1Visitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrincipalContext principal() throws RecognitionException {
		PrincipalContext _localctx = new PrincipalContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_principal);
		int _la;
		try {
			_localctx = new MainContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(340); match(15);
			setState(341); match(9);
			setState(342); match(24);
			setState(343); match(18);
			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 4) | (1L << 6) | (1L << 11) | (1L << 19) | (1L << 27) | (1L << 28) | (1L << 30) | (1L << ID))) != 0)) {
				{
				{
				setState(344); comandos();
				}
				}
				setState(349);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(350); match(22);
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
		case 26: return oprelacional_sempred((OprelacionalContext)_localctx, predIndex);

		case 27: return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean oprelacional_sempred(OprelacionalContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 2 >= _localctx._p;
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return 6 >= _localctx._p;

		case 2: return 5 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\62\u0163\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\3"+
		"\2\3\2\7\2C\n\2\f\2\16\2F\13\2\3\2\7\2I\n\2\f\2\16\2L\13\2\3\2\3\2\3\3"+
		"\3\3\3\3\5\3S\n\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\5\6`\n\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\5\to\n\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0080"+
		"\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u008a\n\f\3\r\3\r\3\r\3\r\5"+
		"\r\u0090\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u0099\n\16\f\16\16"+
		"\16\u009c\13\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20"+
		"\u00a8\n\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\5\22\u00c7\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\5\24\u00d2\n\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\5\25\u00dc"+
		"\n\25\3\26\3\26\3\26\7\26\u00e1\n\26\f\26\16\26\u00e4\13\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u00ef\n\27\f\27\16\27\u00f2\13"+
		"\27\3\27\3\27\5\27\u00f6\n\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u00fe"+
		"\n\27\f\27\16\27\u0101\13\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\5\27\u010e\n\27\3\27\3\27\3\27\7\27\u0113\n\27\f\27\16\27"+
		"\u0116\13\27\3\27\3\27\5\27\u011a\n\27\3\30\3\30\5\30\u011e\n\30\3\31"+
		"\3\31\5\31\u0122\n\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\34\3\34\3\34\3\34\5\34\u0132\n\34\3\34\3\34\3\34\7\34\u0137\n\34\f"+
		"\34\16\34\u013a\13\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\5\35\u0146\n\35\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u014e\n\35\f\35\16"+
		"\35\u0151\13\35\3\36\3\36\5\36\u0155\n\36\3\37\3\37\3\37\3\37\3\37\7\37"+
		"\u015c\n\37\f\37\16\37\u015f\13\37\3\37\3\37\3\37\2 \2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<\2\5\b\2\20\20\22\23\37\37"+
		"##&&((\4\2\n\n\'\'\4\2\t\t\34\34\u0172\2>\3\2\2\2\4R\3\2\2\2\6T\3\2\2"+
		"\2\bY\3\2\2\2\n_\3\2\2\2\fa\3\2\2\2\16h\3\2\2\2\20n\3\2\2\2\22p\3\2\2"+
		"\2\24\177\3\2\2\2\26\u0089\3\2\2\2\30\u008f\3\2\2\2\32\u0091\3\2\2\2\34"+
		"\u009f\3\2\2\2\36\u00a7\3\2\2\2 \u00a9\3\2\2\2\"\u00c6\3\2\2\2$\u00c8"+
		"\3\2\2\2&\u00ce\3\2\2\2(\u00db\3\2\2\2*\u00dd\3\2\2\2,\u0119\3\2\2\2."+
		"\u011d\3\2\2\2\60\u0121\3\2\2\2\62\u0123\3\2\2\2\64\u0128\3\2\2\2\66\u0131"+
		"\3\2\2\28\u0145\3\2\2\2:\u0154\3\2\2\2<\u0156\3\2\2\2>?\7\16\2\2?@\7-"+
		"\2\2@D\7\"\2\2AC\5\4\3\2BA\3\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2EJ\3\2"+
		"\2\2FD\3\2\2\2GI\5\32\16\2HG\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2KM\3"+
		"\2\2\2LJ\3\2\2\2MN\5<\37\2N\3\3\2\2\2OS\5\6\4\2PS\5\f\7\2QS\5\22\n\2R"+
		"O\3\2\2\2RP\3\2\2\2RQ\3\2\2\2S\5\3\2\2\2TU\5\30\r\2UV\7\f\2\2VW\5\b\5"+
		"\2WX\7\"\2\2X\7\3\2\2\2YZ\5\n\6\2Z\t\3\2\2\2[\\\7-\2\2\\]\7\5\2\2]`\5"+
		"\n\6\2^`\7-\2\2_[\3\2\2\2_^\3\2\2\2`\13\3\2\2\2ab\7\26\2\2bc\5\30\r\2"+
		"cd\5\16\b\2de\7!\2\2ef\5\20\t\2fg\7\"\2\2g\r\3\2\2\2hi\7-\2\2i\17\3\2"+
		"\2\2jo\7.\2\2ko\7/\2\2lo\7+\2\2mo\7,\2\2nj\3\2\2\2nk\3\2\2\2nl\3\2\2\2"+
		"nm\3\2\2\2o\21\3\2\2\2pq\5\30\r\2qr\7\f\2\2rs\5\24\13\2st\7\"\2\2t\23"+
		"\3\2\2\2uv\7-\2\2vw\7\7\2\2wx\7.\2\2xy\7\4\2\2yz\7\5\2\2z\u0080\5\24\13"+
		"\2{|\7-\2\2|}\7\7\2\2}~\7.\2\2~\u0080\7\4\2\2\177u\3\2\2\2\177{\3\2\2"+
		"\2\u0080\25\3\2\2\2\u0081\u0082\7-\2\2\u0082\u0083\7\7\2\2\u0083\u0084"+
		"\7-\2\2\u0084\u008a\7\4\2\2\u0085\u0086\7-\2\2\u0086\u0087\7\7\2\2\u0087"+
		"\u0088\7.\2\2\u0088\u008a\7\4\2\2\u0089\u0081\3\2\2\2\u0089\u0085\3\2"+
		"\2\2\u008a\27\3\2\2\2\u008b\u0090\7\17\2\2\u008c\u0090\7*\2\2\u008d\u0090"+
		"\7%\2\2\u008e\u0090\7\31\2\2\u008f\u008b\3\2\2\2\u008f\u008c\3\2\2\2\u008f"+
		"\u008d\3\2\2\2\u008f\u008e\3\2\2\2\u0090\31\3\2\2\2\u0091\u0092\5\30\r"+
		"\2\u0092\u0093\5\34\17\2\u0093\u0094\7\13\2\2\u0094\u0095\5\36\20\2\u0095"+
		"\u0096\7\32\2\2\u0096\u009a\7\24\2\2\u0097\u0099\5\"\22\2\u0098\u0097"+
		"\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b"+
		"\u009d\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u009e\7\30\2\2\u009e\33\3\2\2"+
		"\2\u009f\u00a0\7-\2\2\u00a0\35\3\2\2\2\u00a1\u00a2\5 \21\2\u00a2\u00a3"+
		"\7\5\2\2\u00a3\u00a4\5\36\20\2\u00a4\u00a8\3\2\2\2\u00a5\u00a8\5 \21\2"+
		"\u00a6\u00a8\3\2\2\2\u00a7\u00a1\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a6"+
		"\3\2\2\2\u00a8\37\3\2\2\2\u00a9\u00aa\5\30\r\2\u00aa\u00ab\7-\2\2\u00ab"+
		"!\3\2\2\2\u00ac\u00ad\7\35\2\2\u00ad\u00ae\7\13\2\2\u00ae\u00af\5(\25"+
		"\2\u00af\u00b0\7\32\2\2\u00b0\u00b1\7\"\2\2\u00b1\u00c7\3\2\2\2\u00b2"+
		"\u00c7\5\60\31\2\u00b3\u00c7\5,\27\2\u00b4\u00b5\7\6\2\2\u00b5\u00c7\7"+
		"\"\2\2\u00b6\u00b7\7\3\2\2\u00b7\u00b8\7\13\2\2\u00b8\u00b9\5\n\6\2\u00b9"+
		"\u00ba\7\32\2\2\u00ba\u00bb\7\"\2\2\u00bb\u00c7\3\2\2\2\u00bc\u00bd\7"+
		"\3\2\2\u00bd\u00be\7\13\2\2\u00be\u00bf\5\26\f\2\u00bf\u00c0\7\32\2\2"+
		"\u00c0\u00c1\7\"\2\2\u00c1\u00c7\3\2\2\2\u00c2\u00c7\5$\23\2\u00c3\u00c7"+
		"\5&\24\2\u00c4\u00c5\7\25\2\2\u00c5\u00c7\7\"\2\2\u00c6\u00ac\3\2\2\2"+
		"\u00c6\u00b2\3\2\2\2\u00c6\u00b3\3\2\2\2\u00c6\u00b4\3\2\2\2\u00c6\u00b6"+
		"\3\2\2\2\u00c6\u00bc\3\2\2\2\u00c6\u00c2\3\2\2\2\u00c6\u00c3\3\2\2\2\u00c6"+
		"\u00c4\3\2\2\2\u00c7#\3\2\2\2\u00c8\u00c9\7 \2\2\u00c9\u00ca\7\13\2\2"+
		"\u00ca\u00cb\58\35\2\u00cb\u00cc\7\32\2\2\u00cc\u00cd\7\"\2\2\u00cd%\3"+
		"\2\2\2\u00ce\u00cf\7-\2\2\u00cf\u00d1\7\13\2\2\u00d0\u00d2\5(\25\2\u00d1"+
		"\u00d0\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\7\32"+
		"\2\2\u00d4\u00d5\7\"\2\2\u00d5\'\3\2\2\2\u00d6\u00d7\58\35\2\u00d7\u00d8"+
		"\7\5\2\2\u00d8\u00d9\5(\25\2\u00d9\u00dc\3\2\2\2\u00da\u00dc\58\35\2\u00db"+
		"\u00d6\3\2\2\2\u00db\u00da\3\2\2\2\u00dc)\3\2\2\2\u00dd\u00de\7\27\2\2"+
		"\u00de\u00e2\7\24\2\2\u00df\u00e1\5\"\22\2\u00e0\u00df\3\2\2\2\u00e1\u00e4"+
		"\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e5\3\2\2\2\u00e4"+
		"\u00e2\3\2\2\2\u00e5\u00e6\7\30\2\2\u00e6+\3\2\2\2\u00e7\u00e8\7\r\2\2"+
		"\u00e8\u00e9\7\13\2\2\u00e9\u00ea\5\66\34\2\u00ea\u00eb\7\32\2\2\u00eb"+
		"\u00ec\7$\2\2\u00ec\u00f0\7\24\2\2\u00ed\u00ef\5\"\22\2\u00ee\u00ed\3"+
		"\2\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1"+
		"\u00f3\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3\u00f5\7\30\2\2\u00f4\u00f6\5"+
		"*\26\2\u00f5\u00f4\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u011a\3\2\2\2\u00f7"+
		"\u00f8\7\b\2\2\u00f8\u00f9\7\13\2\2\u00f9\u00fa\5\66\34\2\u00fa\u00fb"+
		"\7\32\2\2\u00fb\u00ff\7\24\2\2\u00fc\u00fe\5\"\22\2\u00fd\u00fc\3\2\2"+
		"\2\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0102"+
		"\3\2\2\2\u0101\u00ff\3\2\2\2\u0102\u0103\7\30\2\2\u0103\u011a\3\2\2\2"+
		"\u0104\u0105\7\36\2\2\u0105\u0106\7\13\2\2\u0106\u0107\7-\2\2\u0107\u0108"+
		"\7!\2\2\u0108\u0109\5.\30\2\u0109\u010a\7\f\2\2\u010a\u010d\5.\30\2\u010b"+
		"\u010c\7\33\2\2\u010c\u010e\5.\30\2\u010d\u010b\3\2\2\2\u010d\u010e\3"+
		"\2\2\2\u010e\u010f\3\2\2\2\u010f\u0110\7\32\2\2\u0110\u0114\7\24\2\2\u0111"+
		"\u0113\5\"\22\2\u0112\u0111\3\2\2\2\u0113\u0116\3\2\2\2\u0114\u0112\3"+
		"\2\2\2\u0114\u0115\3\2\2\2\u0115\u0117\3\2\2\2\u0116\u0114\3\2\2\2\u0117"+
		"\u0118\7\30\2\2\u0118\u011a\3\2\2\2\u0119\u00e7\3\2\2\2\u0119\u00f7\3"+
		"\2\2\2\u0119\u0104\3\2\2\2\u011a-\3\2\2\2\u011b\u011e\7-\2\2\u011c\u011e"+
		"\7.\2\2\u011d\u011b\3\2\2\2\u011d\u011c\3\2\2\2\u011e/\3\2\2\2\u011f\u0122"+
		"\5\62\32\2\u0120\u0122\5\64\33\2\u0121\u011f\3\2\2\2\u0121\u0120\3\2\2"+
		"\2\u0122\61\3\2\2\2\u0123\u0124\5\b\5\2\u0124\u0125\7!\2\2\u0125\u0126"+
		"\58\35\2\u0126\u0127\7\"\2\2\u0127\63\3\2\2\2\u0128\u0129\5\26\f\2\u0129"+
		"\u012a\7!\2\2\u012a\u012b\58\35\2\u012b\u012c\7\"\2\2\u012c\65\3\2\2\2"+
		"\u012d\u012e\b\34\1\2\u012e\u012f\7)\2\2\u012f\u0132\5\66\34\2\u0130\u0132"+
		"\58\35\2\u0131\u012d\3\2\2\2\u0131\u0130\3\2\2\2\u0132\u0138\3\2\2\2\u0133"+
		"\u0134\6\34\2\3\u0134\u0135\t\2\2\2\u0135\u0137\5\66\34\2\u0136\u0133"+
		"\3\2\2\2\u0137\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139"+
		"\67\3\2\2\2\u013a\u0138\3\2\2\2\u013b\u013c\b\35\1\2\u013c\u013d\7\t\2"+
		"\2\u013d\u0146\58\35\2\u013e\u0146\5\20\t\2\u013f\u0146\7-\2\2\u0140\u0146"+
		"\5\26\f\2\u0141\u0142\7\13\2\2\u0142\u0143\58\35\2\u0143\u0144\7\32\2"+
		"\2\u0144\u0146\3\2\2\2\u0145\u013b\3\2\2\2\u0145\u013e\3\2\2\2\u0145\u013f"+
		"\3\2\2\2\u0145\u0140\3\2\2\2\u0145\u0141\3\2\2\2\u0146\u014f\3\2\2\2\u0147"+
		"\u0148\6\35\3\3\u0148\u0149\t\3\2\2\u0149\u014e\58\35\2\u014a\u014b\6"+
		"\35\4\3\u014b\u014c\t\4\2\2\u014c\u014e\58\35\2\u014d\u0147\3\2\2\2\u014d"+
		"\u014a\3\2\2\2\u014e\u0151\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2"+
		"\2\2\u01509\3\2\2\2\u0151\u014f\3\2\2\2\u0152\u0155\7.\2\2\u0153\u0155"+
		"\7/\2\2\u0154\u0152\3\2\2\2\u0154\u0153\3\2\2\2\u0155;\3\2\2\2\u0156\u0157"+
		"\7\21\2\2\u0157\u0158\7\13\2\2\u0158\u0159\7\32\2\2\u0159\u015d\7\24\2"+
		"\2\u015a\u015c\5\"\22\2\u015b\u015a\3\2\2\2\u015c\u015f\3\2\2\2\u015d"+
		"\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u0160\3\2\2\2\u015f\u015d\3\2"+
		"\2\2\u0160\u0161\7\30\2\2\u0161=\3\2\2\2\37DJR_n\177\u0089\u008f\u009a"+
		"\u00a7\u00c6\u00d1\u00db\u00e2\u00f0\u00f5\u00ff\u010d\u0114\u0119\u011d"+
		"\u0121\u0131\u0138\u0145\u014d\u014f\u0154\u015d";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}