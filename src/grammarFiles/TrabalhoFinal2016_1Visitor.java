// Generated from C:\Users\layca\Google Drive\UNIVERSIDADE\2016.1\Construção de Compiladores\Trabalho Final 2016.1\TrabalhoFinal2016_1.g4 by ANTLR 4.1
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
	 * Visit a parse tree produced by {@link TrabalhoFinal2016_1Parser#lista_arrays}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_arrays(@NotNull TrabalhoFinal2016_1Parser.Lista_arraysContext ctx);

	/**
	 * Visit a parse tree produced by {@link TrabalhoFinal2016_1Parser#cmd_atrib_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmd_atrib_var(@NotNull TrabalhoFinal2016_1Parser.Cmd_atrib_varContext ctx);

	/**
	 * Visit a parse tree produced by {@link TrabalhoFinal2016_1Parser#cmd_atribuicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmd_atribuicao(@NotNull TrabalhoFinal2016_1Parser.Cmd_atribuicaoContext ctx);

	/**
	 * Visit a parse tree produced by {@link TrabalhoFinal2016_1Parser#condicoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicoes(@NotNull TrabalhoFinal2016_1Parser.CondicoesContext ctx);

	/**
	 * Visit a parse tree produced by {@link TrabalhoFinal2016_1Parser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(@NotNull TrabalhoFinal2016_1Parser.VarContext ctx);

	/**
	 * Visit a parse tree produced by {@link TrabalhoFinal2016_1Parser#ValorString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValorString(@NotNull TrabalhoFinal2016_1Parser.ValorStringContext ctx);

	/**
	 * Visit a parse tree produced by {@link TrabalhoFinal2016_1Parser#DeclaracaoConstante}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracaoConstante(@NotNull TrabalhoFinal2016_1Parser.DeclaracaoConstanteContext ctx);

	/**
	 * Visit a parse tree produced by {@link TrabalhoFinal2016_1Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(@NotNull TrabalhoFinal2016_1Parser.ExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link TrabalhoFinal2016_1Parser#ValorInteiro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValorInteiro(@NotNull TrabalhoFinal2016_1Parser.ValorInteiroContext ctx);

	/**
	 * Visit a parse tree produced by {@link TrabalhoFinal2016_1Parser#funcao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncao(@NotNull TrabalhoFinal2016_1Parser.FuncaoContext ctx);

	/**
	 * Visit a parse tree produced by {@link TrabalhoFinal2016_1Parser#principal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrincipal(@NotNull TrabalhoFinal2016_1Parser.PrincipalContext ctx);

	/**
	 * Visit a parse tree produced by {@link TrabalhoFinal2016_1Parser#ValorBooleano}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValorBooleano(@NotNull TrabalhoFinal2016_1Parser.ValorBooleanoContext ctx);

	/**
	 * Visit a parse tree produced by {@link TrabalhoFinal2016_1Parser#cmd_atrib_array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmd_atrib_array(@NotNull TrabalhoFinal2016_1Parser.Cmd_atrib_arrayContext ctx);

	/**
	 * Visit a parse tree produced by {@link TrabalhoFinal2016_1Parser#lista_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_expr(@NotNull TrabalhoFinal2016_1Parser.Lista_exprContext ctx);

	/**
	 * Visit a parse tree produced by {@link TrabalhoFinal2016_1Parser#cmd_controle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmd_controle(@NotNull TrabalhoFinal2016_1Parser.Cmd_controleContext ctx);

	/**
	 * Visit a parse tree produced by {@link TrabalhoFinal2016_1Parser#ListaIDsID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaIDsID(@NotNull TrabalhoFinal2016_1Parser.ListaIDsIDContext ctx);

	/**
	 * Visit a parse tree produced by {@link TrabalhoFinal2016_1Parser#cmd_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmd_return(@NotNull TrabalhoFinal2016_1Parser.Cmd_returnContext ctx);

	/**
	 * Visit a parse tree produced by {@link TrabalhoFinal2016_1Parser#comandos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandos(@NotNull TrabalhoFinal2016_1Parser.ComandosContext ctx);

	/**
	 * Visit a parse tree produced by {@link TrabalhoFinal2016_1Parser#Body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(@NotNull TrabalhoFinal2016_1Parser.BodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link TrabalhoFinal2016_1Parser#lista_de_parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_de_parametros(@NotNull TrabalhoFinal2016_1Parser.Lista_de_parametrosContext ctx);

	/**
	 * Visit a parse tree produced by {@link TrabalhoFinal2016_1Parser#constante}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstante(@NotNull TrabalhoFinal2016_1Parser.ConstanteContext ctx);

	/**
	 * Visit a parse tree produced by {@link TrabalhoFinal2016_1Parser#ListaIDs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaIDs(@NotNull TrabalhoFinal2016_1Parser.ListaIDsContext ctx);

	/**
	 * Visit a parse tree produced by {@link TrabalhoFinal2016_1Parser#parametro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametro(@NotNull TrabalhoFinal2016_1Parser.ParametroContext ctx);

	/**
	 * Visit a parse tree produced by {@link TrabalhoFinal2016_1Parser#ValorReal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValorReal(@NotNull TrabalhoFinal2016_1Parser.ValorRealContext ctx);

	/**
	 * Visit a parse tree produced by {@link TrabalhoFinal2016_1Parser#numero}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumero(@NotNull TrabalhoFinal2016_1Parser.NumeroContext ctx);

	/**
	 * Visit a parse tree produced by {@link TrabalhoFinal2016_1Parser#declaracao_Arrays}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao_Arrays(@NotNull TrabalhoFinal2016_1Parser.Declaracao_ArraysContext ctx);

	/**
	 * Visit a parse tree produced by {@link TrabalhoFinal2016_1Parser#oprelacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOprelacional(@NotNull TrabalhoFinal2016_1Parser.OprelacionalContext ctx);

	/**
	 * Visit a parse tree produced by {@link TrabalhoFinal2016_1Parser#nome_funcao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNome_funcao(@NotNull TrabalhoFinal2016_1Parser.Nome_funcaoContext ctx);

	/**
	 * Visit a parse tree produced by {@link TrabalhoFinal2016_1Parser#chamada_funcao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChamada_funcao(@NotNull TrabalhoFinal2016_1Parser.Chamada_funcaoContext ctx);

	/**
	 * Visit a parse tree produced by {@link TrabalhoFinal2016_1Parser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(@NotNull TrabalhoFinal2016_1Parser.TipoContext ctx);

	/**
	 * Visit a parse tree produced by {@link TrabalhoFinal2016_1Parser#declaracao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao(@NotNull TrabalhoFinal2016_1Parser.DeclaracaoContext ctx);

	/**
	 * Visit a parse tree produced by {@link TrabalhoFinal2016_1Parser#DeclaracaoVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracaoVar(@NotNull TrabalhoFinal2016_1Parser.DeclaracaoVarContext ctx);

	/**
	 * Visit a parse tree produced by {@link TrabalhoFinal2016_1Parser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(@NotNull TrabalhoFinal2016_1Parser.ArrayContext ctx);
}