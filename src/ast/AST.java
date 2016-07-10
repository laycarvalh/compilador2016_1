package ast;

import java.util.ArrayList;

public class AST {
	
	String rotulo;
	ArrayList<AST> filhos;
	
	public AST(String rotulo){
		this.rotulo = rotulo;
		filhos = new ArrayList<AST>();
	}
	
	public AST criarNo(String rotulo){
		AST novaAST = new AST(rotulo); 
		filhos.add(novaAST);
		return novaAST;
	}
	
	public String getRotulo() {
		return rotulo;
	}
	public ArrayList<AST> getFilhos() {
		return filhos;
	}
}