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

    public AST visitNomeFunction(TrabalhoFinal2016_1Parser.NomeFuncaoContext ctx) {
        AST noFuncao = new AST("NameFunction");

        noFuncao.setLinha(ctx.getStart().getLine());

        AST nomeFuncao = new AST(ctx.ID().getText());
        nomeFuncao.setLinha(ctx.ID().getSymbol().getLine());

        noFuncao.adicionaFilho(nomeFuncao);

        return noFuncao;
    }

    public AST visitListaParam(TrabalhoFinal2016_1Parser.ListaParamContext ctx) {
        AST noListaParam = new AST(",");

        noListaParam.setLinha(ctx.getStart().getLine());

        AST parametro = visit(ctx.parametro());
        AST listaParametro = visit(ctx.lista_de_parametros());
        noListaParam.adicionaFilho(parametro);
        noListaParam.adicionaFilho(listaParametro);
        return noListaParam;
    }

    public AST visitParam(TrabalhoFinal2016_1Parser.ParamContext ctx) {
        return visit(ctx.parametro());
    }

    public AST visitEmptyParam(TrabalhoFinal2016_1Parser.ParamVazioContext ctx) {
        AST noVazio = new AST("");

        noVazio.setLinha(ctx.getStart().getLine());

        return noVazio;
    }

    public AST visitParameter(TrabalhoFinal2016_1Parser.ParameterContext ctx) {
        AST noTipo = visit(ctx.tipo());
        AST noID = new AST(ctx.ID().getText());
        noID.setLinha(ctx.ID().getSymbol().getLine());
        noTipo.adicionaFilho(noID);
        return noTipo;
    }

    public AST visitComandoPrint(TrabalhoFinal2016_1Parser.ComandoPrintContext ctx) {
        AST print = new AST("print");

        print.setLinha(ctx.getStart().getLine());

        AST listaExpr = visit(ctx.lista_expr());
        print.adicionaFilho(listaExpr);
        return print;
    }

    public AST visitListaExpr(TrabalhoFinal2016_1Parser.ListaExpressoesContext ctx) {
        AST noListExpr = new AST(",");

        noListExpr.setLinha(ctx.getStart().getLine());

        AST expr = visit(ctx.expr());
        noListExpr.adicionaFilho(expr);
        AST listExpr = visit(ctx.lista_expr());
        noListExpr.adicionaFilho(listExpr);
        return noListExpr;
    }

    public AST visitListaExprExpr(TrabalhoFinal2016_1Parser.ListaExpressoesExprContext ctx) {
        return visit(ctx.expr());
    }

    public AST visitExprNeg(TrabalhoFinal2016_1Parser.ExprNegativoContext ctx) {
        AST neg = new AST("-");
        neg.setLinha(ctx.getStart().getLine());
        AST opneg = visit(ctx.expr());
        neg.adicionaFilho(opneg);
        return neg;
    }

    public AST visitExprMultDiv(TrabalhoFinal2016_1Parser.ExprMultDivContext ctx) {
        AST multdiv = new AST(ctx.m.getText()); // Alterar p m
        multdiv.setLinha(ctx.m.getLine());
        AST expr1 = visit(ctx.expr(0));
        AST expr2 = visit(ctx.expr(1));
        multdiv.adicionaFilho(expr1);
        multdiv.adicionaFilho(expr2);
        return multdiv;
    }

    public AST visitExprSomaSub(TrabalhoFinal2016_1Parser.ExprSomaSubContext ctx) {
        AST somasub = new AST(ctx.s.getText());
        somasub.setLinha(ctx.s.getLine());
        AST expr1 = visit(ctx.expr(0));
        AST expr2 = visit(ctx.expr(1));
        somasub.adicionaFilho(expr1);
        somasub.adicionaFilho(expr2);
        return somasub;
    }

    public AST visitExprValor(TrabalhoFinal2016_1Parser.ExprValorContext ctx) {
        return visit(ctx.valor());
    }

    public AST visitExprID(TrabalhoFinal2016_1Parser.ExprIDContext ctx) {
        return visit(ctx.ID());
    }

    public AST visitExprArray(TrabalhoFinal2016_1Parser.ExprArrayContext ctx) {
        return visit(ctx.array());
    }

    public AST visitExprParenteses(TrabalhoFinal2016_1Parser.ExprParentesesContext ctx) {
        return visit(ctx.expr());
    }

    public AST visitComandoAtribuicao(TrabalhoFinal2016_1Parser.ComandoAtribuicaoContext ctx) {
        return visit(ctx.cmd_atribuicao());
    }

    public AST visitComandoAtribuicaoVar(TrabalhoFinal2016_1Parser.AtributionVarContext ctx) {
        return visit(ctx.cmd_atrib_var());
    }

    public AST visitComandoAtribuicaoVariavel(TrabalhoFinal2016_1Parser.AtribuicaodeVariavelContext ctx) {
        AST atrib = new AST("=");
        atrib.setLinha(ctx.getStart().getLine());
        AST expr1 = visit(ctx.var());
        AST expr2 = visit(ctx.expr());
        atrib.adicionaFilho(expr1);
        atrib.adicionaFilho(expr2);
        return atrib;
    }

    public AST visitComandoAtribuicaoArray(TrabalhoFinal2016_1Parser.AtribuicaodeArrayContext ctx) {
        AST atrib = new AST("=");
        atrib.setLinha(ctx.getStart().getLine());
        AST expr1 = visit(ctx.array());
        AST expr2 = visit(ctx.expr());
        atrib.adicionaFilho(expr1);
        atrib.adicionaFilho(expr2);
        return atrib;
    }

    public AST visitComandoAtribuicaoArray(TrabalhoFinal2016_1Parser.AtributionArrayContext ctx) {
        return visit(ctx.cmd_atrib_array());
    }

    public AST visitComandoControle(TrabalhoFinal2016_1Parser.ComandoControleContext ctx) {
        return visit(ctx.cmd_controle());
    }

    public AST visitComandoControleIF(TrabalhoFinal2016_1Parser.ComandoControleIfContext ctx) {
        int i = 0;
        AST comandos;
        AST comando_else;
        AST noIf = new AST("if");
        noIf.setLinha(ctx.getStart().getLine());
        AST oprelacional = visit(ctx.oprelacional());
        noIf.adicionaFilho(oprelacional);

        try {
            comandos = visit(ctx.comandos(i));
        } catch (NullPointerException e) {
            comandos = null;
        }
        while (comandos != null) {
            noIf.adicionaFilho(comandos);
            i++;
            try {
                comandos = visit(ctx.comandos(i));
            } catch (NullPointerException e) {
                comandos = null;
            }
        }
        try {
            comando_else = visit(ctx.comando_else());
        } catch (Exception e) {
            comando_else = null;
        }
        if (comando_else != null) {
            noIf.adicionaFilho(comando_else);
        }
        return noIf;
    }

    public AST visitControleElse(TrabalhoFinal2016_1Parser.ControleElseContext ctx) {
        int i = 0;
        AST noElse = new AST("else");
        noElse.setLinha(ctx.getStart().getLine());
        AST comandos;

        try {
            comandos = visit(ctx.comandos(i));
        } catch (NullPointerException e) {
            comandos = null;
        }

        while (comandos != null) {
            noElse.adicionaFilho(comandos);
            i++;
            try {
                comandos = visit(ctx.comandos(i));
            } catch (NullPointerException e) {
                comandos = null;
            }
        }
        return noElse;
    }

    public AST visitComandoControleWhile(TrabalhoFinal2016_1Parser.ComandoControleWhileContext ctx) {
        int i = 0;
        AST Comandowhile = new AST("while");
        Comandowhile.setLinha(ctx.getStart().getLine());
        AST oprelacional = visit(ctx.oprelacional());
        Comandowhile.adicionaFilho(oprelacional);
        AST comandos;
        try {
            comandos = visit(ctx.comandos(i));
        } catch (NullPointerException e) {
            comandos = null;
        }
        while (comandos != null) {
            Comandowhile.adicionaFilho(comandos);
            i++;
            try {
                comandos = visit(ctx.comandos(i));
            } catch (NullPointerException e) {
                comandos = null;
            }
        }
        return Comandowhile;
    }

    public AST visitComandoControleFor(TrabalhoFinal2016_1Parser.ComandoControleForContext ctx) {
        int i = 0;
        AST noFor = new AST("for");
        noFor.setLinha(ctx.getStart().getLine());
        AST valorInicial = new AST("valor_inicial");
        valorInicial.setLinha(ctx.getStart().getLine());

        AST valorFinal = new AST("valor_final");
        valorFinal.setLinha(ctx.getStart().getLine());

        AST identificador = visit(ctx.ID());
        AST numero1 = visit(ctx.condicoes(0));
        AST numero2 = visit(ctx.condicoes(1));
        AST noStepFor;
        try {
            noStepFor = visit(ctx.condicoes(2));
        } catch (Exception e) {
            noStepFor = null;
        }

        valorInicial.adicionaFilho(identificador);
        valorInicial.adicionaFilho(numero1);

        valorFinal.adicionaFilho(numero2);

        noFor.adicionaFilho(valorInicial);
        noFor.adicionaFilho(valorFinal);
        if (noStepFor != null) {
            noFor.adicionaFilho(noStepFor);
        }
        AST comandos;
        try {
            comandos = visit(ctx.comandos(i));
        } catch (NullPointerException e) {
            comandos = null;
        }

        while (comandos != null) {
            noFor.adicionaFilho(comandos);
            i++;
            try {
                comandos = visit(ctx.comandos(i));
            } catch (NullPointerException e) {
                comandos = null;
            }
        }

        return noFor;
    }

     public AST getAST() {
        return noClass;
    }

    public AST visitCondicoesID(TrabalhoFinal2016_1Parser.CondicoesIDContext ctx) {
        return visit(ctx.ID());
    }

    public AST visitCondicoesINT(TrabalhoFinal2016_1Parser.CondiicoesINTContext ctx) {
        return visit(ctx.INT());
    }

    public AST visitComandoExit(TrabalhoFinal2016_1Parser.ComandoExitContext ctx) {
        AST noExit = new AST("exit");
        noExit.setLinha(ctx.getStart().getLine());
        return noExit;
    }

    public AST visitComadoRead(TrabalhoFinal2016_1Parser.ComadoReadContext ctx) {
        AST noRead = new AST("read");
        noRead.setLinha(ctx.getStart().getLine());
        AST listaIds = visit(ctx.lista_ids());
        noRead.adicionaFilho(listaIds);
        return noRead;
    }

    public AST visitComadoReadArrays(TrabalhoFinal2016_1Parser.ComadoReadArraysContext ctx) {
        AST noRead = new AST("readArray");
        noRead.setLinha(ctx.getStart().getLine());
        AST listaIds = visit(ctx.array());
        noRead.adicionaFilho(listaIds);
        return noRead;
    }

    public AST visitComandoRetorno(TrabalhoFinal2016_1Parser.ComandoRetornoContext ctx) {
        return visit(ctx.cmd_return());
    }

    public AST visitReturn(TrabalhoFinal2016_1Parser.ReturnContext ctx) {
        AST noRetorno = new AST("return");
        noRetorno.setLinha(ctx.getStart().getLine());
        AST expr = visit(ctx.expr());
        noRetorno.adicionaFilho(expr);
        return noRetorno;
    }

    public AST visitComandoChamadaFuncao(TrabalhoFinal2016_1Parser.ComandoChamadaFuncaoContext ctx) {
        return visit(ctx.chamada_funcao());
    }

    public AST visitChamadaFuncao(TrabalhoFinal2016_1Parser.ChamadaFuncaoContext ctx) {
        AST noChamadaFuncao = new AST("chamada_funcao");
        AST nomeFuncao = new AST(ctx.ID().getText());
        noChamadaFuncao.adicionaFilho(nomeFuncao);
        noChamadaFuncao.setLinha(ctx.ID().getSymbol().getLine());
        AST listaExpr = visit(ctx.lista_expr());
        noChamadaFuncao.adicionaFilho(listaExpr);
        return noChamadaFuncao;
    }

    public AST visitComandoBreak(TrabalhoFinal2016_1Parser.ComandoBreakContext ctx) {
        AST noBreak = new AST("Break");
        noBreak.setLinha(ctx.getStart().getLine());
        return noBreak;
    }

    public AST visitOprelacional(TrabalhoFinal2016_1Parser.OprelacionalNotContext ctx) {
        AST not = new AST("!");
        not.setLinha(ctx.getStart().getLine());
        AST opneg = visit(ctx.oprelacional());
        not.adicionaFilho(opneg);
        return not;
    }

    public AST visitOprelacionalBinario(TrabalhoFinal2016_1Parser.OprelacionalBinarioContext ctx) {
        AST oprelacional = new AST(ctx.o.getText()); // Alterar p m
        oprelacional.setLinha(ctx.o.getLine());
        AST expr1 = visit(ctx.oprelacional(0));
        AST expr2 = visit(ctx.oprelacional(1));
        oprelacional.adicionaFilho(expr1);
        oprelacional.adicionaFilho(expr2);
        return oprelacional;
    }

    public AST visitOprelacionalExpr(TrabalhoFinal2016_1Parser.PrelacionalExprContext ctx) {
        return visit(ctx.expr());
    }

    public AST visitNumeroInteiro(TrabalhoFinal2016_1Parser.NumeroInteiroContext ctx) {
        return visit(ctx.INT());
    }

    public AST visitNumeroReal(TrabalhoFinal2016_1Parser.NumeroRealContext ctx) {
        return visit(ctx.REAL());
    }

    public AST visitMain(TrabalhoFinal2016_1Parser.MainContext ctx) {
        int i = 0;
        AST noMain = new AST("main");
        noMain.setLinha(ctx.getStart().getLine());
        AST comandos;
        try {
            comandos = visit(ctx.comandos(i));
        } catch (NullPointerException e) {
            comandos = null;
        }
        while (comandos != null) {
            noMain.adicionaFilho(comandos);
            i++;
            try {
                comandos = visit(ctx.comandos(i));
            } catch (NullPointerException e) {
                comandos = null;
            }
        }
        return noMain;
    }
}
