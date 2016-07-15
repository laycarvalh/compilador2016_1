package compilador2016_1;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import Retornos.Retornos;
import ast.AST;
import excecoes.*;

/**
 *
 * @author layca
 */
public class AnaliseSemantica extends Exception {

    private static final long serialVersionUID = 1L;
    AST ast;
    TabelaDeSimbolos tabela;
    ChecadorDeTipos check;
    String anotacao_funcao = "";
    GeradorDeCodigo geradorDeCodigo;
    int enderecoLocal;

    /**
     * Construtor da classe Semantica que recebe a AST como parâmetro Instancia
     * a variável global tabela do tipo TabelaDeSimbolos Instancia a variável
     * check do tipo TypeChecker Instancia a variável geradorDeCodigo do tipo
     * GeradorDeCodigo
     *
     * Inicia a chamada de preencheTabelaSimbolos Imprime declarações globais de
     * tabela Imprime funcoes de tabela
     *
     * @param ast
     * @throws Exception
     */
    	public AnaliseSemantica(AST ast) throws Exception{
		this.ast = ast;
		this.tabela = new TabelaDeSimbolos(ast);//porque?
		this.geradorDeCodigo = new GeradorDeCodigo(ast.getRotulo());
		this.check = new ChecadorDeTipos(geradorDeCodigo);
		
		
		//preencheTabelaSimbolos();
		tabela.imprimeDeclaracoes();
		tabela.imprimeFuncoes();
	}
	
 
}
