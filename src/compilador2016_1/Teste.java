/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilador2016_1;

import grammarFiles.TrabalhoFinal2016_1Lexer;
import grammarFiles.TrabalhoFinal2016_1Parser;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 *
 * @author layca
 */
public class Teste {
    public static void main(String []args) throws Exception{
        String inputFile = "C:\\Users\\layca\\Google Drive\\UNIVERSIDADE\\2016.1\\Construção de Compiladores\\Trabalho Final 2016.1\\testeTF";
        File arquivo = new File(inputFile);
        InputStream is = new FileInputStream(arquivo);
        ANTLRInputStream input = new ANTLRInputStream(is);
        TrabalhoFinal2016_1Lexer lexer = new TrabalhoFinal2016_1Lexer(input); // Alterar para nome do lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        TrabalhoFinal2016_1Parser parser = new TrabalhoFinal2016_1Parser(tokens);
        ParseTree tree = parser.prog();
        System.out.println(tree.getText());
        GrammarVisitor visitor = new GrammarVisitor();
        visitor.visit(tree);
    }
}
