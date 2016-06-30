package grammarFiles;

// Generated from C:\Users\layca\Google Drive\UNIVERSIDADE\2016.1\Constru��o de Compiladores\Trabalho Final 2016.1\TrabalhoFinal2016_1.g4 by ANTLR 4.1
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TrabalhoFinal2016_1Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TrabalhoFinal2016_1Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TrabalhoFinal2016_1Parser#ArrayID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayID(@NotNull TrabalhoFinal2016_1Parser.ArrayIDContext ctx);

	/**
	 * Visit a parse tree produced by {@link TrabalhoFinal2016_1Parser#DeclaracaoVariavel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracaoVariavel(@NotNull TrabalhoFinal2016_1Parser.DeclaracaoVariavelContext ctx);

	/**
	 * Visit a parse tree produced by {@link TrabalhoFinal2016_1Parser#controleElse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControleElse(@NotNull TrabalhoFinal2016_1Parser.ControleElseContext ctx);

	/**
	 * Visit a parse tree produced by {@link TrabalhoFinal2016_1Parser#tipoString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoString(@NotNull TrabalhoFinal2016_1Parser.TipoStringContext ctx);

	/**
	 * Visit a parse tree produced by {@link TrabalhoFinal2016_1Parser#comandoBreak}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoBreak(@NotNull TrabalhoFinal2016_1Parser.ComandoBreakContext ctx);

	/**
	 * Visit a parse tree produced by {@link TrabalhoFinal2016_1Parser#oprelacionalBinario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOprelacionalBinario(@NotNull TrabalhoFinal2016_1Parser.OprelacionalBinarioContext ctx);

	/**
	 * Visit a parse tree produced by {@link TrabalhoFinal2016_1Parser#ValorString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValorString(@NotNull TrabalhoFinal2016_1Parser.ValorStringContext ctx);

	/**
	 * Visit a parse tree produced by {@link TrabalhoFinal2016_1Parser#DeclaarcaoArrays}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaarcaoArrays(@NotNull TrabalhoFinal2016_1Parser.DeclaarcaoArraysContext ctx);

	/**
	 * Visit a parse tree produced by {@link TrabalhoFinal2016_1Parser#DeclaracaoConstante}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracaoConstante(@NotNull TrabalhoFinal2016_1Parser.DeclaracaoConstanteContext ctx);

	/**
	 * Visit a parse tree produced by {@link TrabalhoFinal2016_1Parser#exprNegativo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprNegativo(@NotNull TrabalhoFinal2016_1Parser.ExprNegativoContext ctx);

	/**
	 * Visit a parse tree produced by {@link TrabalhoFinal2016_1Parser#comadoRead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComadoRead(@NotNull TrabalhoFinal2016_1Parser.ComadoReadContext ctx);

	/**
	 * Visit a parse tree produced by {@link TrabalhoFinal2016_1Parser#AtribuicaodeVariavel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtribuicaodeVariavel(@NotNull TrabalhoFinal2016_1Parser.AtribuicaodeVariavelContext ctx);

	/**
	 * Visit a parse tree produced by {@link TrabalhoFinal2016_1Parser#ValorInteiro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValorInteiro(@NotNull TrabalhoFinal2016_1Parser.ValorInteiroContext ctx);

	/**
	 * Visit a parse tree produced by {@link TrabalhoFinal2016_1Parser#AtributionVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtributionVar(@NotNull TrabalhoFinal2016_1Parser.AtributionVarContext ctx);

	/**
	 * Visit a parse tree produced by {@link TrabalhoFinal2016_1Parser#AtributionArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtributionArray(@NotNull TrabalhoFinal2016_1Parser.AtributionArrayContext ctx);

	/**
	 * Visit a parse tree produced by {@link TrabalhoFinal2016_1Parser#comandoChamadaFuncao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoChamadaFuncao(@NotNull TrabalhoFinal2016_1Parser.ComandoChamadaFuncaoContext ctx);

	/**
	 * Visit a parse tree produced by {@link TrabalhoFinal2016_1Parser#ConstanteID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstanteID(@NotNull TrabalhoFinal2016_1Parser.ConstanteIDContext ctx);

	/**
	 * Visit a parse tree produced by {@link TrabalhoFinal2016_1Parser#tipoBoolean}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoBoolean(@NotNull TrabalhoFinal2016_1Parser.TipoBooleanContext ctx);

	/**
	 * Visit a parse tree produced by {@link TrabalhoFinal2016_1Parser#Body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(@NotNull TrabalhoFinal2016_1Parser.BodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link TrabalhoFinal2016_1Parser#Param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(@NotNull TrabalhoFinal2016_1Parser.ParamContext ctx);

	/**
	 * Visit a parse tree produced by {@link TrabalhoFinal2016_1Parser#ArrayINT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayINT(@NotNull TrabalhoFinal2016_1Parser.ArrayINTContext ctx);

	/**
	 * Visit a parse tree produced by {@link TrabalhoFinal2016_1Parser#ListaIDs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaIDs(@NotNull TrabalhoFinal2016_1Parser.ListaIDsContext ctx);

	/**
	 * Visit a parse tree produced by {@link TrabalhoFinal2016_1Parser#ValorReal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValorReal(@NotNull TrabalhoFinal2016_1Parser.ValorRealContext ctx);

	/**
	 * Visit a parse tree produced by {@link TrabalhoFinal2016_1Parser#comandoControleFor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoControleFor(@NotNull TrabalhoFinal2016_1Parser.ComandoControleForContext ctx);

	/**
	 * Visit a parse tree produced by {@link TrabalhoFinal2016_1Parser#ListaExpressoesExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaExpressoesExpr(@NotNull TrabalhoFinal2016_1Parser.ListaExpressoesExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link TrabalhoFinal2016_1Parser#tipoReal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoReal(@NotNull TrabalhoFinal2016_1Parser.TipoRealContext ctx);

	/**
	 * Visit a parse tree produced by {@link TrabalhoFinal2016_1Parser#listaArrays}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaArrays(@NotNull TrabalhoFinal2016_1Parser.ListaArraysContext ctx);

	/**
	 * Visit a parse tree produced by {@link TrabalhoFinal2016_1Parser#numeroInteiro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeroInteiro(@NotNull TrabalhoFinal2016_1Parser.NumeroInteiroContext ctx);

	/**
	 * Visit a parse tree produced by {@link TrabalhoFinal2016_1Parser#exprID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprID(@NotNull TrabalhoFinal2016_1Parser.ExprIDContext ctx);

	/**
	 * Visit a parse tree produced by {@link TrabalhoFinal2016_1Parser#Return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn(@NotNull TrabalhoFinal2016_1Parser.ReturnContext ctx);

	/**
	 * Visit a parse tree produced by {@link TrabalhoFinal2016_1Parser#listaParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaParam(@NotNull TrabalhoFinal2016_1Parser.ListaParamContext ctx);

	/**
	 * Visit a parse tree produced by {@link TrabalhoFinal2016_1Parser#tipoInt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoInt(@NotNull TrabalhoFinal2016_1Parser.TipoIntContext ctx);

	/**
	 * Visit a parse tree produced by {@link TrabalhoFinal2016_1Parser#comandoAtribuicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoAtribuicao(@NotNull TrabalhoFinal2016_1Parser.ComandoAtribuicaoContext ctx);

	/**
	 * Visit a parse tree produced by {@link TrabalhoFinal2016_1Parser#exprArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprArray(@NotNull TrabalhoFinal2016_1Parser.ExprArrayContext ctx);

	/**
	 * Visit a parse tree produced by {@link TrabalhoFinal2016_1Parser#comandoRetorno}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoRetorno(@NotNull TrabalhoFinal2016_1Parser.ComandoRetornoContext ctx);

	/**
	 * Visit a parse tree produced by {@link TrabalhoFinal2016_1Parser#Identificador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentificador(@NotNull TrabalhoFinal2016_1Parser.IdentificadorContext ctx);

	/**
	 * Visit a parse tree produced by {@link TrabalhoFinal2016_1Parser#ValorBoolean}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValorBoolean(@NotNull TrabalhoFinal2016_1Parser.ValorBooleanContext ctx);

	/**
	 * Visit a parse tree produced by {@link TrabalhoFinal2016_1Parser#comandoControleWhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoControleWhile(@NotNull TrabalhoFinal2016_1Parser.ComandoControleWhileContext ctx);

	/**
	 * Visit a parse tree produced by {@link TrabalhoFinal2016_1Parser#chamadaFuncao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChamadaFuncao(@NotNull TrabalhoFinal2016_1Parser.ChamadaFuncaoContext ctx);

	/**
	 * Visit a parse tree produced by {@link TrabalhoFinal2016_1Parser#ListaExpressoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaExpressoes(@NotNull TrabalhoFinal2016_1Parser.ListaExpressoesContext ctx);

	/**
	 * Visit a parse tree produced by {@link TrabalhoFinal2016_1Parser#prelacionalExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrelacionalExpr(@NotNull TrabalhoFinal2016_1Parser.PrelacionalExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link TrabalhoFinal2016_1Parser#Main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(@NotNull TrabalhoFinal2016_1Parser.MainContext ctx);

	/**
	 * Visit a parse tree produced by {@link TrabalhoFinal2016_1Parser#comandoControle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoControle(@NotNull TrabalhoFinal2016_1Parser.ComandoControleContext ctx);

	/**
	 * Visit a parse tree produced by {@link TrabalhoFinal2016_1Parser#ParamVazio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamVazio(@NotNull TrabalhoFinal2016_1Parser.ParamVazioContext ctx);

	/**
	 * Visit a parse tree produced by {@link TrabalhoFinal2016_1Parser#DeclaarcaoVariaveis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaarcaoVariaveis(@NotNull TrabalhoFinal2016_1Parser.DeclaarcaoVariaveisContext ctx);

	/**
	 * Visit a parse tree produced by {@link TrabalhoFinal2016_1Parser#exprSomaSub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprSomaSub(@NotNull TrabalhoFinal2016_1Parser.ExprSomaSubContext ctx);

	/**
	 * Visit a parse tree produced by {@link TrabalhoFinal2016_1Parser#DeclaarcaoConstantes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaarcaoConstantes(@NotNull TrabalhoFinal2016_1Parser.DeclaarcaoConstantesContext ctx);

	/**
	 * Visit a parse tree produced by {@link TrabalhoFinal2016_1Parser#exprMultDiv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMultDiv(@NotNull TrabalhoFinal2016_1Parser.ExprMultDivContext ctx);

	/**
	 * Visit a parse tree produced by {@link TrabalhoFinal2016_1Parser#Parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(@NotNull TrabalhoFinal2016_1Parser.ParameterContext ctx);

	/**
	 * Visit a parse tree produced by {@link TrabalhoFinal2016_1Parser#comandoExit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoExit(@NotNull TrabalhoFinal2016_1Parser.ComandoExitContext ctx);

	/**
	 * Visit a parse tree produced by {@link TrabalhoFinal2016_1Parser#AtribuicaodeArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtribuicaodeArray(@NotNull TrabalhoFinal2016_1Parser.AtribuicaodeArrayContext ctx);

	/**
	 * Visit a parse tree produced by {@link TrabalhoFinal2016_1Parser#DeclaracaoArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracaoArray(@NotNull TrabalhoFinal2016_1Parser.DeclaracaoArrayContext ctx);

	/**
	 * Visit a parse tree produced by {@link TrabalhoFinal2016_1Parser#listaArraysArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaArraysArray(@NotNull TrabalhoFinal2016_1Parser.ListaArraysArrayContext ctx);

	/**
	 * Visit a parse tree produced by {@link TrabalhoFinal2016_1Parser#Variavel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariavel(@NotNull TrabalhoFinal2016_1Parser.VariavelContext ctx);

	/**
	 * Visit a parse tree produced by {@link TrabalhoFinal2016_1Parser#exprParenteses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprParenteses(@NotNull TrabalhoFinal2016_1Parser.ExprParentesesContext ctx);

	/**
	 * Visit a parse tree produced by {@link TrabalhoFinal2016_1Parser#comandoControleIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoControleIf(@NotNull TrabalhoFinal2016_1Parser.ComandoControleIfContext ctx);

	/**
	 * Visit a parse tree produced by {@link TrabalhoFinal2016_1Parser#Function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(@NotNull TrabalhoFinal2016_1Parser.FunctionContext ctx);

	/**
	 * Visit a parse tree produced by {@link TrabalhoFinal2016_1Parser#exprValor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprValor(@NotNull TrabalhoFinal2016_1Parser.ExprValorContext ctx);

	/**
	 * Visit a parse tree produced by {@link TrabalhoFinal2016_1Parser#numeroReal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeroReal(@NotNull TrabalhoFinal2016_1Parser.NumeroRealContext ctx);

	/**
	 * Visit a parse tree produced by {@link TrabalhoFinal2016_1Parser#CondiicoesINT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondiicoesINT(@NotNull TrabalhoFinal2016_1Parser.CondiicoesINTContext ctx);

	/**
	 * Visit a parse tree produced by {@link TrabalhoFinal2016_1Parser#comadoReadArrays}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComadoReadArrays(@NotNull TrabalhoFinal2016_1Parser.ComadoReadArraysContext ctx);

	/**
	 * Visit a parse tree produced by {@link TrabalhoFinal2016_1Parser#oprelacionalNot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOprelacionalNot(@NotNull TrabalhoFinal2016_1Parser.OprelacionalNotContext ctx);

	/**
	 * Visit a parse tree produced by {@link TrabalhoFinal2016_1Parser#comandoPrint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoPrint(@NotNull TrabalhoFinal2016_1Parser.ComandoPrintContext ctx);

	/**
	 * Visit a parse tree produced by {@link TrabalhoFinal2016_1Parser#CondicoesID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicoesID(@NotNull TrabalhoFinal2016_1Parser.CondicoesIDContext ctx);

	/**
	 * Visit a parse tree produced by {@link TrabalhoFinal2016_1Parser#NomeFuncao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNomeFuncao(@NotNull TrabalhoFinal2016_1Parser.NomeFuncaoContext ctx);
}