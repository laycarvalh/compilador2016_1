/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilador2016_1;

import grammarFiles.*;
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
public class GrammarVisitor extends TrabalhoFinal2016_1BaseVisitor<String>{

   
    @Override
    public String visitBody(TrabalhoFinal2016_1Parser.BodyContext ctx) {
        String id = ctx.ID().getText();
        System.out.println("ID: " + id);
        
//        visit(ctx.declaracao(0));
//        visit(ctx.funcao(0));
//        visit(ctx.principal());
        return id;
    }
//    @Override
//    public String visitDeclaracaoVariaveis(TrabalhoFinal2016_1Parser.DeclaracaoVariaveisContext ctx) {
//        String id = ctx.ID().getText();
//        System.out.println("ID: " + id);
//        //Criar uma label pra por exemplo armazenar uma tabela de simbolos
//        visit(ctx.declaracao(0));
//        visit(ctx.funcao(0));
//        visit(ctx.principal());
//        return id;
//    }

}
