/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilador2016_1;

import grammarFiles.*;
import ast.*;
import java.util.HashMap;
import java.util.Map;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 *
 * @author layca
 */
public class GrammarVisitor extends TrabalhoFinal2016_1BaseVisitor<AST> {

    AST noClass, noDeclaracaoBody, noFuncaoBody, noPrincipalBody;

    @Override
    public AST visitBody(TrabalhoFinal2016_1Parser.BodyContext ctx) {
        int i = 0;
        String classe = "class";
        noClass = new AST(classe);

        AST nomeClasse = new AST(ctx.ID().getText());
        nomeClasse.setLinha(ctx.ID().getSymbol().getLine());

        noClass.adicionaFilho(nomeClasse);

        noClass.setLinha(ctx.getStart().getLine());

        try {
            noDeclaracaoBody = visit(ctx.declaracao(i));
        } catch (NullPointerException e) {
            noDeclaracaoBody = null;
        }
        while (noDeclaracaoBody != null) {
            noClass.adicionaFilho(noDeclaracaoBody);
            i++;
            try {
                noDeclaracaoBody = visit(ctx.declaracao(i));
            } catch (NullPointerException e) {
                noDeclaracaoBody = null;
            }
        }

        i = 0;

        try {
            noFuncaoBody = visit(ctx.funcao(i));
        } catch (NullPointerException e) {
            noFuncaoBody = null;
        }

        while (noFuncaoBody != null) {
            noClass.adicionaFilho(noFuncaoBody);
            i++;
            try {
                noFuncaoBody = visit(ctx.funcao(i));
            } catch (NullPointerException e) {
                noFuncaoBody = null;
            }
        }

        noPrincipalBody = visit(ctx.principal());
        noClass.adicionaFilho(noPrincipalBody);
        return noClass;
    }

    public AST visitDeclaracaoVariaveis(TrabalhoFinal2016_1Parser.DeclaarcaoVariaveisContext ctx) {
        return visit(ctx.declaracao_var());
    }

    public AST visitVariaveis(TrabalhoFinal2016_1Parser.DeclaracaoVariavelContext ctx) {
        AST noVariavel = new AST("var");

        noVariavel.setLinha(ctx.getStart().getLine());

        AST noTipo = visit(ctx.tipo());
        noVariavel.adicionaFilho(noTipo);
        AST noListaIds = visit(ctx.var());
        noVariavel.adicionaFilho(noListaIds);

        return noVariavel;
    }

    public AST visitVar(TrabalhoFinal2016_1Parser.VariavelContext ctx) {
        return visit(ctx.lista_ids());
    }

    public AST visitListaIDs(TrabalhoFinal2016_1Parser.ListaIDsContext ctx) {
        AST noListaIDs = new AST("listaIDs");

        noListaIDs.setLinha(ctx.getStart().getLine());

        AST noID = visit(ctx.ID());
        noListaIDs.adicionaFilho(noID);
        AST noLista = visit(ctx.lista_ids());
        noListaIDs.adicionaFilho(noLista);
        return (noListaIDs);
    }

    public AST visitID(TrabalhoFinal2016_1Parser.IdentificadorContext ctx) {
        AST noListaIDs = new AST("listaIDs");

        noListaIDs.setLinha(ctx.getStart().getLine());

        AST noID = visit(ctx.ID());
        noListaIDs.adicionaFilho(noID);
        return (noListaIDs);
    }

    public AST visitDeclaracaoConstantes(TrabalhoFinal2016_1Parser.DeclaarcaoConstantesContext ctx) {
        return visit(ctx.declaracao_const());
    }

    public AST visitDeclaracaoConstante(TrabalhoFinal2016_1Parser.DeclaracaoConstanteContext ctx) {
        AST noConstante = new AST("const");

        noConstante.setLinha(ctx.getStart().getLine());

        AST noTipo = visit(ctx.tipo());
        noConstante.adicionaFilho(noTipo);
        AST noNome = visit(ctx.constante());
        noConstante.adicionaFilho(noNome);
        AST noValor = visit(ctx.valor());
        noConstante.adicionaFilho(noValor);
        return noConstante;
    }

    public AST visitConstante(TrabalhoFinal2016_1Parser.ConstanteIDContext ctx) {
        return visit(ctx.ID());
    }

    public AST visitValorInteiro(TrabalhoFinal2016_1Parser.ValorInteiroContext ctx) {
        AST noValor = new AST("valorInteiro");

        noValor.setLinha(ctx.getStart().getLine());

        AST noValorInt = visit(ctx.INT());
        noValor.adicionaFilho(noValorInt);
        return noValor;
    }

    public AST visitValorReal(TrabalhoFinal2016_1Parser.ValorRealContext ctx) {
        AST noValor = new AST("valorReal");

        noValor.setLinha(ctx.getStart().getLine());

        AST noValorReal = visit(ctx.REAL());
        noValor.adicionaFilho(noValorReal);
        return noValor;
    }

    public AST visitValorString(TrabalhoFinal2016_1Parser.ValorStringContext ctx) {
        AST noValor = new AST("valorString");

        noValor.setLinha(ctx.getStart().getLine());

        AST noValorString = visit(ctx.STRING());
        noValor.adicionaFilho(noValorString);
        return noValor;
    }

    public AST visitValorBoolean(TrabalhoFinal2016_1Parser.ValorBooleanContext ctx) {
        AST noValor = new AST("valorBoolean");

        noValor.setLinha(ctx.getStart().getLine());

        AST noValorBoolean = visit(ctx.BOOLEAN());
        noValor.adicionaFilho(noValorBoolean);
        return noValor;
    }

    public AST visitDeclaracaoArrays(TrabalhoFinal2016_1Parser.DeclaarcaoArraysContext ctx) {
        return visit(ctx.declaracao_Arrays());
    }

    public AST visitDeclaracaoArray(TrabalhoFinal2016_1Parser.DeclaracaoArrayContext ctx) {
        AST noArray = new AST("array");

        noArray.setLinha(ctx.getStart().getLine());

        AST noTipo = visit(ctx.tipo());
        noArray.adicionaFilho(noTipo);
        AST noLista = visit(ctx.lista_arrays());
        noArray.adicionaFilho(noLista);

        return noArray;
    }

    public AST visitListaArrays(TrabalhoFinal2016_1Parser.ListaArraysContext ctx) {
        AST noArray = new AST("listaArrays");

        noArray.setLinha(ctx.getStart().getLine());

        AST noNome = visit(ctx.ID());
        noArray.adicionaFilho(noNome);
        AST noTamanho = visit(ctx.INT());
        noArray.adicionaFilho(noTamanho);
        AST noLista = visit(ctx.lista_arrays());
        noArray.adicionaFilho(noLista);

        return noArray;
    }

    public AST visitListaArrays(TrabalhoFinal2016_1Parser.ListaArraysArrayContext ctx) {
        AST noArray = new AST("listaArrays");

        noArray.setLinha(ctx.getStart().getLine());

        AST noNome = visit(ctx.ID());
        noArray.adicionaFilho(noNome);
        AST noTamanho = visit(ctx.INT());
        noArray.adicionaFilho(noTamanho);
        return noArray;
    }

    public AST visitArrayID(TrabalhoFinal2016_1Parser.ArrayIDContext ctx) {
        AST noArray = new AST("arrayID");

        noArray.setLinha(ctx.getStart().getLine());

        AST noNome = visit(ctx.ID(0));
        noArray.adicionaFilho(noNome);
        AST noTamanho = visit(ctx.ID(1));
        noArray.adicionaFilho(noTamanho);
        return noArray;
    }

    public AST visitArrayINT(TrabalhoFinal2016_1Parser.ArrayINTContext ctx) {
        AST noArray = new AST("arrayID");

        noArray.setLinha(ctx.getStart().getLine());

        AST noNome = visit(ctx.ID());
        noArray.adicionaFilho(noNome);
        AST noTamanho = visit(ctx.INT());
        noArray.adicionaFilho(noTamanho);
        return noArray;
    }

    public AST visitTipoInt(TrabalhoFinal2016_1Parser.TipoIntContext ctx) {
        AST noTipoInt = new AST("int");

        noTipoInt.setLinha(ctx.getStart().getLine());

        return noTipoInt;
    }

    public AST visitTipoReal(TrabalhoFinal2016_1Parser.TipoRealContext ctx) {
        AST noTipoReal = new AST("real");

        noTipoReal.setLinha(ctx.getStart().getLine());

        return noTipoReal;
    }

    public AST visitTipoString(TrabalhoFinal2016_1Parser.TipoStringContext ctx) {
        AST noTipoString = new AST("string");

        noTipoString.setLinha(ctx.getStart().getLine());

        return noTipoString;
    }

    public AST visitTipoBoolean(TrabalhoFinal2016_1Parser.TipoBooleanContext ctx) {
        AST noTipoBoolean = new AST("boolean");

        noTipoBoolean.setLinha(ctx.getStart().getLine());

        return noTipoBoolean;
    }

    public AST visitFunction(TrabalhoFinal2016_1Parser.FunctionContext ctx) {
        int i = 0;
        AST comandos;

        AST noFuncao = new AST("function");

        noFuncao.setLinha(ctx.getStart().getLine());
        AST tipo = visit(ctx.tipo());
        noFuncao.adicionaFilho(tipo);
        
        AST nomeFuncao = visit(ctx.nome_funcao());
        //  nomeFuncao.setLinha(ctx.nome_funcao().getSymbol().getLine());
        noFuncao.adicionaFilho(nomeFuncao);

        AST listaParam = visit(ctx.lista_de_parametros());
        AST param = new AST("param");
        param.adicionaFilho(listaParam);
        noFuncao.adicionaFilho(param);

        try {
            comandos = visit(ctx.comandos(i));
        } catch (NullPointerException e) {
            comandos = null;
        }
        while (comandos != null) {
            noFuncao.adicionaFilho(comandos);
            i++;
            try {
                comandos = visit(ctx.comandos(i));
            } catch (NullPointerException e) {
                comandos = null;
            }
        }
        return noFuncao;
    }

}
