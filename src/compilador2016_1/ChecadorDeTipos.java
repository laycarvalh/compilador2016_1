package compilador2016_1;

import java.util.HashMap;
import java.util.Map;
import Retornos.Retornos;
import ast.AST;
import excecoes.*;

/**
 *
 * @author layca
 */
public class ChecadorDeTipos {

	GeradorDeCodigo geradorDeCodigo;
	
	public ChecadorDeTipos(GeradorDeCodigo geradorDeCodigo) {
		this.geradorDeCodigo = geradorDeCodigo;
	}
        
        public Retornos checaTipoConstante(String tipo, String valor, AST noConstante){
            Retornos retorno = new Retornos();
            
            return retorno;
        }
    
}
