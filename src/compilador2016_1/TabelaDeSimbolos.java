package compilador2016_1;

/**
 *
 * @author layca
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import Retornos.Retornos;
import ast.AST;

public class TabelaDeSimbolos {

    private AST ast;

    private Map<String, Retornos> declaracoes;

    private Map<String, HashMap<String, Retornos>> funcoes;

    private Map<String, String> tipo_funcaoMap;

    public TabelaDeSimbolos(AST ast) {
        this.ast = ast;
        funcoes = new HashMap<>();
        declaracoes = new HashMap<>();
        tipo_funcaoMap = new HashMap<>();
    }

    public AST getAst() {
        return ast;
    }

    public void setAst(AST ast) {
        this.ast = ast;
    }

    public Map<String, Retornos> getDeclaracoes() {
        return declaracoes;
    }

    public void setDeclaracoes(Map<String, Retornos> declaracoes) {
        this.declaracoes = declaracoes;
    }

    public Map<String, HashMap<String, Retornos>> getFuncoes() {
        return funcoes;
    }

    public void setFuncoes(Map<String, HashMap<String, Retornos>> funcoes) {
        this.funcoes = funcoes;
    }

    public void imprimeDeclaracoes() {
        for (String chave : this.declaracoes.keySet()) {
            System.out.println("chave_global:" + chave);
            System.out.println("Retornos: ");
            this.declaracoes.get(chave).imprimeRetornos();
        }
    }

    public Map<String, String> getTipo_funcaoMap() {
        return tipo_funcaoMap;
    }

    public void setTipo_funcaoMap(Map<String, String> tipo_funcaoMap) {
        this.tipo_funcaoMap = tipo_funcaoMap;
    }

    public void imprimeFuncoes() {
        for (String chave : this.funcoes.keySet()) {
            System.out.println("chave :" + chave);

            for (String valor : this.getFuncoes().get(chave).keySet()) {
                System.out.println("chave_local:" + valor);
                System.out.println("Retornos: ");
                this.getFuncoes().get(chave).get(valor).imprimeRetornos();;
            }
        }
    }

    public boolean verificaSeExisteDeclaracaoVariaveisGlobais(String nome) {
        if (this.getDeclaracoes().containsKey(nome + "_var")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean verificaSeFoiDeclaradoVariaveisLocais(String variavel, String anotacao) {
        if (this.getFuncoes().get(anotacao).containsKey(variavel + "_var")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean verificaSeExisteDeclaracaoConstantes(String nome) {
        if (this.getDeclaracoes().containsKey(nome + "_const")) {
            return true;
        } else {
            return false;
        }
    }
    public boolean verificaSeExisteDeclaracaoArrays(String nome) {
        if (this.getDeclaracoes().containsKey(nome + "_array")) {
            return true;
        } else {
            return false;
        }
    }

    public HashMap<String, Retornos> retornaDeclaracoesLocais(String anotacao) {
        return this.getFuncoes().get(anotacao);
    }

    public Retornos retornaVariavelLocal(String anotacao, String variavel) {
        return this.retornaDeclaracoesLocais(anotacao).get(variavel + "_var");
    }


    public boolean verificaSeExisteFuncaoComMesmaAnotacao(String anotacao) {
        if (this.getFuncoes().get(anotacao) != null) {
            return true;
        } else {
            return false;
        }
    }

}
