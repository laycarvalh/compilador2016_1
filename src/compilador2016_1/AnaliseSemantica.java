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
    public AnaliseSemantica(AST ast) throws Exception {
        this.ast = ast;
        this.tabela = new TabelaDeSimbolos(ast);//porque?
        this.geradorDeCodigo = new GeradorDeCodigo(ast.getRotulo());
        this.check = new ChecadorDeTipos(geradorDeCodigo);

        preencheTabelaSimbolos();
        tabela.imprimeDeclaracoes();
        tabela.imprimeFuncoes();
    }

    public void preencheTabelaSimbolos() throws Exception {

        for (AST filhoDoNoInicial : ast.getFilhos()) {
            String rotuloAtual = filhoDoNoInicial.getRotulo();
            if (rotuloAtual == "var") {
                adicionarVariaveisATabela(filhoDoNoInicial, "", "global");
            } else if (rotuloAtual == "const") {
                adicionarConstantesATabela(filhoDoNoInicial, "", "global");
            } else if (rotuloAtual == "array") {
                adicionarArraysATabela(filhoDoNoInicial, "", "global");
            } else if (rotuloAtual == "function") {
                preencheTabelaFuncoes(filhoDoNoInicial);
            } else if (rotuloAtual == "main") {
                preencheTabelaMain(filhoDoNoInicial);
            }
        }
    }

    public void preencheTabelaMain(AST noMain) throws Exception {
        String nome = noMain.getRotulo();
        HashMap<String, Retornos> variaveis_locais = new HashMap<>();
        tabela.getFuncoes().put(nome, variaveis_locais);
        tabela.getTipo_funcaoMap().put(nome, null);
//		adicionarDeclaracoesLocaisATabela(noMain, nome);
    }

    private void preencheTabelaFuncoes(AST noFuncao) throws Exception {

        String nome = noFuncao.getFilhos().get(0).getRotulo();
        String retorno = noFuncao.getFilhos().get(2).getRotulo();
        anotacao_funcao = nome;//acumula o nome da função retorno e seus parametros
        AST noParametros = new AST("sem parametros");
        if (!noFuncao.getFilhos().get(1).getFilhos().get(0).getRotulo().equals("")) {
            noParametros = noFuncao.getFilhos().get(1).getFilhos().get(0);
        }

        //Cria uma entrada para a função na tabela de símbolos
        enderecoLocal = 0;
        incluirParametrosEmAnotacaoFuncao(noParametros, nome, noFuncao);

        //incluir o tipo da funcao em outra hash chamada tipo funcao
        tabela.getTipo_funcaoMap().put(anotacao_funcao, retorno);

        geradorDeCodigo.criarCabecalhoNovaFuncao(tabela.retornaDeclaracoesLocais(anotacao_funcao), nome, retorno);

        if (noFuncao.getFilhos().get(0) != null) {
            for (AST noComandosDentrDaFuncao : noFuncao.getFilhos()) {

                String rotuloAtual = noComandosDentrDaFuncao.getRotulo();
                if (rotuloAtual.equals("=")) {
                    testaAtribuicao(noComandosDentrDaFuncao, anotacao_funcao);
                } else if (rotuloAtual.equals("print")) {
                    AST filhoNoPrint = noComandosDentrDaFuncao.getFilhos().get(0);
                    testaPrint(filhoNoPrint, anotacao_funcao);
                } else if (rotuloAtual.equals("read")) {
                    AST filhoNoRead = noComandosDentrDaFuncao.getFilhos().get(0);
                    if (filhoNoRead != null) {
                        testaRead(filhoNoRead, anotacao_funcao);
                    } else {
                        throw new ErroComandoReadSemParametros("O comando read sem parâmetros em :" + noComandosDentrDaFuncao.getLinha(),
                                noComandosDentrDaFuncao.getLinha());
                    }
                } else if (rotuloAtual.equals("if")) {
                    testaIf(noComandosDentrDaFuncao, anotacao_funcao);
                } else if (rotuloAtual.equals("for")) {
                    testaComandos(noComandosDentrDaFuncao, anotacao_funcao);
                } else if (rotuloAtual.equals("while")) {
                    testaComandos(noComandosDentrDaFuncao, anotacao_funcao);
                } else if (rotuloAtual.equals("chamada_funcao")) {
                    testaChamadaFuncao(noComandosDentrDaFuncao, anotacao_funcao);
                }

            }
        } else {
            throw new ErroAnotacaoDeComando("O comando " + noFuncao.getRotulo() + " com problema na anotacao em: " + noFuncao.getLinha(),
                    noFuncao.getLinha());
        }

        geradorDeCodigo.finalizarFuncao(nome);

    }

    /**
     * Método responsável por percorrer os parâmetros da anotação da função Ao
     * mesmo tempo concatena o tipo e o nome do parâmetro à Strig nome para
     * criar a chave da tabela de símbolos. Além disso criar uma instância para
     * os parâmetros na tabela de símbolos.
     *
     * @param noParametros
     * @param nome
     * @param noFuncao
     * @throws Exception
     */
    private void incluirParametrosEmAnotacaoFuncao(AST noParametros, String nome, AST noFuncao) throws Exception {

        HashMap<String, Retornos> variaveis_locais = new HashMap<>();

        //Se só existe um parâmetro
        if (noParametros.getRotulo() != "," && !noParametros.getRotulo().equals("sem parametros")) {

            String tipo = noParametros.getRotulo();
            String ID = noParametros.getFilhos().get(0).getRotulo();
            String parametro = "_" + tipo;
            anotacao_funcao += parametro;

            Retornos retornosParametros = new Retornos(); //para criar uma instância de uma variável
            //mandada como parâmetro

            //Seta o parametro da funcao como uma variavel local
            retornosParametros.setTipo(tipo);
            retornosParametros.setValor(enderecoLocal);
            retornosParametros.setParametro(true);
            enderecoLocal = enderecoLocal + 1;

            variaveis_locais.put(ID + "_var", retornosParametros);
            //return;//porque?

        } else {//Existe mais de um parâmetro
            //Ao final desta função a variável anotacao_funcao estará completa
            //passa para variaveis_locais as variaveis_locais(parâmetros) inseridas dentro do método
            //gerarAnotacaoFuncao
            variaveis_locais = gerarAnotacaoFuncao(noParametros, variaveis_locais);
        }

        if (!tabela.getFuncoes().containsKey(anotacao_funcao)) {//Não existe função semelhante

            tabela.getFuncoes().put(anotacao_funcao, variaveis_locais);//inclui na tabela de símbolos

        } else {
            throw new ErroFuncaoComMesmaAnotacao("Função "
                    + /*anotacao_funcao.substring(0, nome.length())+*/ nome
                    + " já declarada "
                    + "com a mesma anotação, linha:"
                    + noFuncao.getLinha(),
                    noFuncao.getLinha());
        }
    }

    /**
     * Método que percorre o a lista de parâmetros caso haja dois ou mais
     * parâmetros na anotação do método.
     *
     * @param param
     * @param variaveis_locais
     * @throws ErroVariavelDuplicada
     * @throws ErroFuncaoComMesmaAnotacao
     */
    public HashMap<String, Retornos> gerarAnotacaoFuncao(AST param, HashMap<String, Retornos> variaveis_locais) throws ErroVariavelDuplicada, ErroFuncaoComMesmaAnotacao {

        //Se ja encontrou um parâmetro
        if (param.getRotulo() != "," && !param.getRotulo().equals("sem parametros")) {

            String tipo = param.getRotulo();
            String ID = param.getFilhos().get(0).getRotulo();

            //verifica se já não existe uma declaração de parâmetro com o mesmo nome na tabela
            //de símbolos da
            if (!variaveis_locais.containsKey(ID)) {

                String parametro = "_" + tipo;

                anotacao_funcao += parametro;

                Retornos retornosParametros = new Retornos(); //para criar uma instância da variável
                //mandada como parâmetro

                //Seta o parametro da funcao como uma variavel local
                retornosParametros.setTipo(tipo);
                retornosParametros.setValor(enderecoLocal);
                retornosParametros.setParametro(true);

                enderecoLocal = enderecoLocal + 1;

                variaveis_locais.put(ID + "_var", retornosParametros);
                //caso contrário gerará exceção de variável já declarada
            } else {
                throw new ErroVariavelDuplicada("Já existe um parâmetro com o nome " + ID, param.getLinha());
            }

            //Se ainda não encontrou o parâmetro	
        } else if (!param.getRotulo().equals("sem parametros")) {
            //Percorre a subarvore da esquerda em busca de um parâmetro
            gerarAnotacaoFuncao(param.getFilhos().get(0), variaveis_locais);
            //Percorre a subarvore da direita em busca de uma vírgula ou outro parâmetro
            gerarAnotacaoFuncao(param.getFilhos().get(1), variaveis_locais);

        }
        return variaveis_locais;
    }

    /**
     * Recebe o nó da variavel ou constante declarada no escopo global ou local
     *
     * @param noDeclaracaoDeVariavel
     * @param chave
     * @param tipo_declaracao
     * @throws Exception
     */
    public void adicionarVariaveisATabela(AST noDeclaracaoDeVariavel, String chave, String tipo_declaracao) throws Exception {

        String rotulo;
        String tipo = "";
        Map<String, Retornos> variaveisNaTabelaDeSimbolos = null;
        Retornos var = new Retornos();

        //Verifica em qual dos dois HashMaps será inserida variável
        if (tipo_declaracao.equals("global")) {
            variaveisNaTabelaDeSimbolos = tabela.getDeclaracoes();
        } else {
            variaveisNaTabelaDeSimbolos = tabela.getFuncoes().get(chave);
        }

        //Pode ser que haja uma declaração aninhada de múltiplas variáveis
        for (AST noElementoDaDeclaracaoDeVariavel : noDeclaracaoDeVariavel.getFilhos()) {

            rotulo = noElementoDaDeclaracaoDeVariavel.getRotulo();

            if (rotulo.equals("int")
                    || rotulo.equals("real")
                    || rotulo.equals("string")
                    || rotulo.equals("boolean")) {

                tipo = rotulo;

            } else //Não é uma declaração de várias variáveis
             if (rotulo.equals(",") == false) {
                    //Não existe nenhuma chave com o nome desta variável
                    if (!variaveisNaTabelaDeSimbolos.containsKey(rotulo + "_var")
                            && !variaveisNaTabelaDeSimbolos.containsKey(rotulo + "_const")
                            && !variaveisNaTabelaDeSimbolos.containsKey(rotulo + "_array")) {

                        var.setTipo(tipo);
                        var.setValor(enderecoLocal);
                        var.setParametro(false);
                        enderecoLocal = enderecoLocal + 1;
                        tabela.getDeclaracoes().put(rotulo + "_var", var);

                    } else {

                        throw new ErroVariavelDuplicada("Variável, array ou constante \'"
                                + rotulo
                                + "\' duplicada, linha: "
                                + noElementoDaDeclaracaoDeVariavel.getLinha(),
                                noElementoDaDeclaracaoDeVariavel.getLinha());

                    }

                } else {
                    //mais de uma variável declarada na mesma linha
                    adicionaDelaracoesAninhadasATabela(noElementoDaDeclaracaoDeVariavel, tipo, chave, tipo_declaracao);
                }
        }
    }

    /**
     * Método para percorrer uma lista de declarações aninhadas em uma única
     * linha Se a declaração for global, insere as instâncias nas declarações
     * globais da tabela de símbolo Se local, insere na instância da respectiva
     * função buscando por sua anotação
     *
     * @param noParametros
     * @param tipo
     * @param chave
     * @param tipo_declaracao
     * @throws Exception
     */
    public void adicionaDelaracoesAninhadasATabela(AST noElementoDaDeclaracaoDeVariavel, String tipo, String chave, String tipo_declaracao) throws Exception {
        //variavel var para armazenar o tipo e o valor da variavel percorrida no nó
        Retornos var = new Retornos();
        Map<String, Retornos> variaveis = null;
        //se o método foi chamado em preencheTabela, onde as declarações são globais
        //armazena as declarações já existentes na tabela de símbolos em variaveis
        variaveis = tabela.getDeclaracoes();

        for (AST p : noElementoDaDeclaracaoDeVariavel.getFilhos()) {
            if (p.getRotulo() != ",") {
                //verifica se já contém a declaração da variável em declarações_globais, faz tanto para var
                //quanto para constante
                if (!variaveis.containsKey(p.getRotulo() + "_var") && !variaveis.containsKey(p.getRotulo() + "_const") && !variaveis.containsKey(p.getRotulo() + "_array")) {
                    var.setTipo(tipo);
                    if (tipo_declaracao.equals("global")) {
                        tabela.getDeclaracoes().put(p.getRotulo() + "_var", var);
                    } else {
                        tabela.getFuncoes().get(chave).put(p.getRotulo() + "_var", var);
                    }
                } else {
                    //erro de variável ou constante duplicada
                    throw new ErroVariavelDuplicada("Nome de variável, array ou constante duplicada na linha : " + p.getLinha(), p.getLinha());
                }
            } else {
                adicionaDelaracoesAninhadasATabela(p, tipo, chave, tipo_declaracao);
            }
        }
    }

    /**
     * Recebe o nó da variavel ou constante declarada no escopo global ou local
     *
     * @param noDeclaracaoDeVariavel
     * @param chave
     * @param tipo_declaracao
     * @throws Exception
     */
    public void adicionarArraysATabela(AST noArray, String chave, String tipo_declaracao) throws Exception {

        String rotulo;
        String tipo = "";
        Map<String, Retornos> arraysNaTabelaDeSimbolos = null;
        Retornos array = new Retornos();

        arraysNaTabelaDeSimbolos = tabela.getDeclaracoes();

        //Pode ser que haja uma declaração aninhada de múltiplas variáveis
        for (AST noElementoDaDeclaracaoDeVariavel : noArray.getFilhos()) {

            rotulo = noElementoDaDeclaracaoDeVariavel.getRotulo();

            if (rotulo.equals("int")
                    || rotulo.equals("real")
                    || rotulo.equals("string")
                    || rotulo.equals("boolean")) {

                tipo = rotulo;

            } else //Não é uma declaração de várias variáveis
             if (rotulo.equals(",") == false && rotulo.equals("[") == false && rotulo.equals("]") == false
                        && rotulo.equals("0") == false && rotulo.equals("1") == false && rotulo.equals("2") == false
                        && rotulo.equals("3") == false && rotulo.equals("4") == false && rotulo.equals("5") == false
                        && rotulo.equals("6") == false && rotulo.equals("7") == false && rotulo.equals("8") == false
                        && rotulo.equals("9") == false) {
                    //Não existe nenhuma chave com o nome desta variável
                    if (!arraysNaTabelaDeSimbolos.containsKey(rotulo + "_var")
                            && !arraysNaTabelaDeSimbolos.containsKey(rotulo + "_const")
                            && !arraysNaTabelaDeSimbolos.containsKey(rotulo + "_array")) {

                        array.setTipo(tipo);
                        array.setValor(enderecoLocal);
//                        array.setTamanho(tamanho);
                        array.setParametro(false);
                        enderecoLocal = enderecoLocal + 1;
                        tabela.getDeclaracoes().put(rotulo + "_array", array);

                    } else {

                        throw new ErroVariavelDuplicada("Variável, array ou constante \'"
                                + rotulo
                                + "\' duplicada, linha: "
                                + noElementoDaDeclaracaoDeVariavel.getLinha(),
                                noElementoDaDeclaracaoDeVariavel.getLinha());

                    }

                } else {
                    //mais de uma variável declarada na mesma linha
                    adicionaDelaracoesArrayAninhadasATabela(noArray, tipo, chave, tipo_declaracao);
                }
        }
    }

    /**
     * Método para percorrer uma lista de declarações aninhadas em uma única
     * linha Se a declaração for global, insere as instâncias nas declarações
     * globais da tabela de símbolo Se local, insere na instância da respectiva
     * função buscando por sua anotação
     *
     * @param noParametros
     * @param tipo
     * @param chave
     * @param tipo_declaracao
     * @throws Exception
     */
    public void adicionaDelaracoesArrayAninhadasATabela(AST noArray, String tipo, String chave, String tipo_declaracao) throws Exception {
        //variavel var para armazenar o tipo e o valor da variavel percorrida no nó
        Retornos arrays = new Retornos();
        Map<String, Retornos> variaveis = null;
        //se o método foi chamado em preencheTabela, onde as declarações são globais
        //armazena as declarações já existentes na tabela de símbolos em variaveis
        variaveis = tabela.getDeclaracoes();

        for (AST p : noArray.getFilhos()) {
            if (p.getRotulo() != ",") {
                //verifica se já contém a declaração da variável em declarações_globais, faz tanto para var
                //quanto para constante
                if (!variaveis.containsKey(p.getRotulo() + "_var") && !variaveis.containsKey(p.getRotulo() + "_const") && !variaveis.containsKey(p.getRotulo() + "_array")) {
                    arrays.setTipo(tipo);

                    tabela.getDeclaracoes().put(p.getRotulo() + "_array", arrays);

                } else {
                    //erro de variável ou constante duplicada
                    throw new ErroVariavelDuplicada("Nome de variável, array ou constante duplicada na linha : " + p.getLinha(), p.getLinha());
                }
            } else {
                adicionaDelaracoesAninhadasATabela(p, tipo, chave, tipo_declaracao);
            }
        }
    }

    /**
     * Método recebe um nó com uma declaração de uma constante local ou global e
     * adiciona na tabela de símbolos
     *
     * @param no
     * @param chave
     * @param tipo_declaracao
     * @throws Exception
     */
    public void adicionarConstantesATabela(AST noConstante, String anotacao_funcao, String tipo_declaracao) throws Exception {

        //cria instância cons do tipo dos valores das declaracoes globais da tabela
        //de símbolos
        Retornos cons = new Retornos();
        Map<String, Retornos> constantes = null;

        constantes = tabela.getDeclaracoes();

        //captura o nome, o tipo e o valor na ast
        String nome = noConstante.getFilhos().get(0).getRotulo();
        String tipo = noConstante.getFilhos().get(1).getRotulo();
        String valor = noConstante.getFilhos().get(2).getRotulo();

        //verifica se já existe esta instância em declarada como constante ou variável
        if (!constantes.containsKey(nome + "_const") && !constantes.containsKey(nome + "_var")&& !constantes.containsKey(nome + "_array")) {
            cons = check.checaTipoConstante(tipo, valor, noConstante);
            tabela.getDeclaracoes().put(nome + "_const", cons);
           

            cons.setParametro(false);
        } else {
            throw new ErroVariavelDuplicada("Nome de variável ou constante duplicada na linha : " + noConstante.getLinha(), noConstante.getLinha());
        }
    }

    private void testaAtribuicao(AST noAtribuicao, String anotacao_funcao) throws ErroVariavelNaoDelarada, 
				ErroOperadorNot, ErroDeTipo, ErroFuncaoNaoDeclarada, ErroTipoFuncaoIncompativel, IOException {
        String tipoDeclarado;//armazena o tipo declarado em escopo global ou local
        String ID = noAtribuicao.getFilhos().get(0).getRotulo();
        if(tabela.verificaSeExisteDeclaracaoVariaveisGlobais(ID)){

                Retornos variavelGlobal = tabela.getDeclaracoes().get(ID+"_var");
                tipoDeclarado = variavelGlobal.getTipo();
                AST subArvoreDireitaDaDeclaracao = noAtribuicao.getFilhos().get(1);
                verificaExpressaoEmAtribuicao(subArvoreDireitaDaDeclaracao,anotacao_funcao,tipoDeclarado);

        }else if(tabela.verificaSeExisteDeclaracaoArrays(ID)){

                Retornos variavelGlobal = tabela.getDeclaracoes().get(ID+"_array");
                tipoDeclarado = variavelGlobal.getTipo();
                AST subArvoreDireitaDaDeclaracao = noAtribuicao.getFilhos().get(1);
                verificaExpressaoEmAtribuicao(subArvoreDireitaDaDeclaracao,anotacao_funcao,tipoDeclarado);

        }else{
            throw new ErroVariavelNaoDelarada("Variavel "+
                ID+
                ""+//porque?
                " não declarada em : "+
                noAtribuicao.getLinha(),
                noAtribuicao.getLinha());
			
        }
    }
    public void verificaExpressao(AST noExpr, String anotacao_funcao,String simboloRelacional, boolean entrouEmExprAritmetica, String tipoRetorno) throws ErroOperadorNot, ErroDeTipo, ErroVariavelNaoDelarada, ErroFuncaoNaoDeclarada, ErroTipoFuncaoIncompativel{
		
		String rotuloAtual = noExpr.getRotulo();
		
		if(rotuloAtual.equals("+") ||
		   rotuloAtual.equals("-") ||
		   rotuloAtual.equals("*") ||
		   rotuloAtual.equals("/") ){
			
			AST subarvoreEsquerda = noExpr.getFilhos().get(0);
			AST subarvoreDireita = noExpr.getFilhos().get(1);
			
			verificaExpressao(subarvoreEsquerda, anotacao_funcao, simboloRelacional, true,tipoRetorno);
			verificaExpressao(subarvoreDireita, anotacao_funcao, simboloRelacional, true,tipoRetorno);
			
		}else if(rotuloAtual.equals("!")) {
			verificaOperadorRelacional(noExpr, anotacao_funcao,"boolean");
			
		}else if(rotuloAtual.equals("chamada_funcao") && !tipoRetorno.equals("")){
			//tp.checarChamadaFuncao()
			String anotacaoChamaFuncao = montarAnotacaoChamadaFuncao(noExpr, anotacao_funcao);
			if(tabela.getTipo_funcaoMap().containsKey(anotacaoChamaFuncao)){
				String tipoFuncaoChamada = tabela.getTipo_funcaoMap().get(anotacaoChamaFuncao);
				if(tipoRetorno == tipoFuncaoChamada) return;
				else if(tipoRetorno.equals("real") && tipoFuncaoChamada.equals("int")) return;
				else throw new ErroTipoFuncaoIncompativel("A funcao com a anotacao "+anotacaoChamaFuncao+
						" é do tipo "+tipoFuncaoChamada+" em :"+noExpr.getLinha(), noExpr.getLinha());
			}else throw new ErroFuncaoNaoDeclarada("A função com anotação "+anotacaoChamaFuncao
					+" não existe ou parametros de tipos incompatíveis em : "+noExpr.getLinha(),noExpr.getLinha());
		}else if(rotuloAtual.equals("chamada_funcao") && tipoRetorno.equals("")){
			//tp.checarChamadaFuncao()
			String anotacaoChamaFuncao = montarAnotacaoChamadaFuncao(noExpr, anotacao_funcao);
			if(tabela.getTipo_funcaoMap().containsKey(anotacaoChamaFuncao)){
				return;
			}else throw new ErroFuncaoNaoDeclarada("A função com anotação "+anotacaoChamaFuncao
					+" não existe ou parametros de tipos incompatíveis em : "+noExpr.getLinha(),noExpr.getLinha());
		}else if(!simboloRelacional.equals("")){
			check.checaTipoExpressaoEmRelacional(tabela, anotacao_funcao, noExpr, simboloRelacional, entrouEmExprAritmetica);
		}else{	
			
			check.checaTipoExpressaoEmPrint(tabela, anotacao_funcao, noExpr, entrouEmExprAritmetica);
				
			return;
			
		}
	}
    public void verificaOperadorRelacional(AST noOperador, String anotacao_funcao, String tipoRetoro) throws ErroOperadorNot, ErroDeTipo, ErroVariavelNaoDelarada, ErroFuncaoNaoDeclarada, ErroTipoFuncaoIncompativel{
		if(noOperador != null){
			String rotuloAtual = noOperador.getRotulo();
			AST subArvoreEsquerda, subArvoreDireita, noFilhoOperadorNot;
			if(rotuloAtual.equals("==") ||
			   rotuloAtual.equals("!=") ||
			   rotuloAtual.equals("<>") ||
			   rotuloAtual.equals(">")  ||
			   rotuloAtual.equals(">=") ||
			   rotuloAtual.equals("<")  ||
			   rotuloAtual.equals("<=")){
				subArvoreEsquerda = noOperador.getFilhos().get(0);
				subArvoreDireita = noOperador.getFilhos().get(1);
				verificaExpressao(subArvoreEsquerda, anotacao_funcao, rotuloAtual, false,tipoRetoro);
				verificaExpressao(subArvoreDireita, anotacao_funcao,  rotuloAtual, false,tipoRetoro);
				//"" significa que a expressão não está
				// vinculada a atribuição, sendo assim a 
				// a passagem do tipo do lado esquerdo de uma atribuição não é possível
				
			}else if(rotuloAtual.equals("!")){
				//se o rótulo for o operador not, então verifica se o filho dele é um
				//operador de comparação, como '==', '!=', '!', ou uma variável
				noFilhoOperadorNot = noOperador.getFilhos().get(0);
				verificaOperadorRelacional(noFilhoOperadorNot, anotacao_funcao,"boolean");
			}else if(rotuloAtual.equals("chamada_funcao")){
				String anotacao = montarAnotacaoChamadaFuncao(noOperador, anotacao_funcao);
				if(tabela.getFuncoes().containsKey(anotacao)){
					String tipo = tabela.getTipo_funcaoMap().get(anotacao);
					String nomeChamadaFuncao = noOperador.getFilhos().get(0).getRotulo();
					if(tipo == "boolean") return;
					else throw new ErroTipoFuncaoIncompativel("A funcao "+nomeChamadaFuncao+" possui tipo "+tipo+" em : "
							+noOperador.getLinha(), noOperador.getLinha());
				}
			}else{
				//se acontecer de a operação relacional tiver apenas uma variável ou 'TRUE', 'FALSE', ou
				//um valor qualquer, então checa se é boolean
				check.checaTipoValorOperacaoRelacionalBoolean(noOperador, anotacao_funcao, tabela);
			}
		}
	}
    public void verificaExpressaoEmAtribuicao(AST no, String anotacao_funcao, String tipo) throws ErroOperadorNot, ErroDeTipo, ErroVariavelNaoDelarada, ErroFuncaoNaoDeclarada, ErroTipoFuncaoIncompativel, IOException{
		
		String rotuloAtual = no.getRotulo();
		
		if(rotuloAtual.equals("+") ||
		   rotuloAtual.equals("-") ||
		   rotuloAtual.equals("*") ||
		   rotuloAtual.equals("/") ){
			
			AST subarvoreEsquerda = no.getFilhos().get(0);
			AST subarvoreDireita = no.getFilhos().get(1);
			
			// se esse passo não gerar exceção então o operando da esquerda é do tipo certo
			verificaExpressaoEmAtribuicao(subarvoreEsquerda, anotacao_funcao, tipo);
			// se esse passo não gerar exceção então o operando da direita é do tipo certo
			verificaExpressaoEmAtribuicao(subarvoreDireita, anotacao_funcao, tipo);
			
			geradorDeCodigo.criarOperacaoMatematica(rotuloAtual, tipo);
			
		}else if(rotuloAtual.equals("!")) {
			
			check.checaTipoExprNot(no, tipo);
			
			verificaOperadorRelacional(no, anotacao_funcao, "boolean");
			
			return;
			
		}else if(rotuloAtual.equals("chamada_funcao")){
			//tp.checarChamadaFuncao()
			String anotacaoChamaFuncao = montarAnotacaoChamadaFuncao(no, anotacao_funcao);
			if(tabela.getTipo_funcaoMap().containsKey(anotacaoChamaFuncao)){
				String tipoFuncaoChamada = tabela.getTipo_funcaoMap().get(anotacaoChamaFuncao);
				if(tipo == tipoFuncaoChamada) return;
				else if(tipo.equals("real") && tipoFuncaoChamada.equals("int")) return;
				else throw new ErroTipoFuncaoIncompativel("A funcao com a anotacao "+anotacaoChamaFuncao+
						" é do tipo "+tipoFuncaoChamada+" em :"+no.getLinha(), no.getLinha());
			}else throw new ErroFuncaoNaoDeclarada("A função com anotação "+anotacaoChamaFuncao
					+" não existe ou parametros de tipos incompatíveis em : "+no.getLinha(),no.getLinha());
		}else{
			check.checaTipoExpressaoAtribuicao(tabela, anotacao_funcao, no, tipo);
			return;
			
		}
	}
    public String montarAnotacaoChamadaFuncao(AST noChamadaFuncao, String anotacao) throws ErroVariavelNaoDelarada, ErroOperadorNot, ErroDeTipo, ErroFuncaoNaoDeclarada, ErroTipoFuncaoIncompativel{
		String nomeFuncao = noChamadaFuncao.getFilhos().get(0).getRotulo();
		String anotacaoMontada = "";
		AST filhoLadoDireito = noChamadaFuncao.getFilhos().get(1);
		String tipo = montarParametrosAnotacaoFuncao(filhoLadoDireito, anotacao);
		anotacaoMontada = nomeFuncao+tipo;
		return anotacaoMontada;
	}
	
	public String montarParametrosAnotacaoFuncao(AST parametroChamadaFuncao, String anotacao) throws ErroDeTipo, ErroVariavelNaoDelarada, ErroOperadorNot, ErroFuncaoNaoDeclarada, ErroTipoFuncaoIncompativel{
		AST filhoEsquerdo, filhoDireito;
		String rotulo = parametroChamadaFuncao.getRotulo(), tipo = "", anotacaoMontada = "";
		
		if(rotulo != "," && !rotulo.equals("")){
			if( !rotulo.equals("+") &&
				!rotulo.equals("-") &&
				!rotulo.equals("/") && 
				!rotulo.equals("*") &&
				!rotulo.equals("!")){
				if(tabela.verificaSeExisteDeclaracaoConstantes(rotulo)){
					tipo = tabela.getDeclaracoes().get(rotulo+"_const").getTipo();
					anotacaoMontada = "_"+tipo;
					return anotacaoMontada;
				}else if(tabela.verificaSeExisteDeclaracaoArrays(rotulo)){
					tipo = tabela.getDeclaracoes().get(rotulo+"_array").getTipo();
					anotacaoMontada = "_"+tipo;
					return anotacaoMontada;
				}else if(tabela.verificaSeExisteDeclaracaoVariaveisGlobais(rotulo)){
					tipo = tabela.getDeclaracoes().get(rotulo+"_var").getTipo();
					anotacaoMontada = "_"+tipo;
					return anotacaoMontada;
				}else if(rotulo.charAt(0)=='0' ||
						 rotulo.charAt(0)=='1' ||
						 rotulo.charAt(0)=='2' ||
						 rotulo.charAt(0)=='3' ||
						 rotulo.charAt(0)=='4' ||
						 rotulo.charAt(0)=='5' ||
						 rotulo.charAt(0)=='6' ||
						 rotulo.charAt(0)=='7' ||
						 rotulo.charAt(0)=='8' ||
						 rotulo.charAt(0)=='9'){
					if(rotulo.contains(".")){
						tipo = "real";
						anotacaoMontada = "_"+tipo;
						return anotacaoMontada;
					}else{
						tipo = "int";
						anotacaoMontada = "_"+tipo;
						return anotacaoMontada;
					}
				}else if(rotulo.charAt(0)=='"' && 
						rotulo.charAt(rotulo.length()-1)=='"'){
					tipo ="string";
					anotacaoMontada = "_"+tipo;
					return anotacaoMontada;
				}else if(rotulo.equals("TRUE") || rotulo.equals("FALSE")){
					tipo ="boolean";
					anotacaoMontada = "_"+tipo;
					return anotacaoMontada;
				}else if(rotulo.equals("chamada_funcao")){
					String anotacaoFuncaoAninhada = montarAnotacaoChamadaFuncao(parametroChamadaFuncao, anotacao);
					tipo = tabela.getTipo_funcaoMap().get(anotacaoFuncaoAninhada);
					anotacaoMontada = "_"+tipo;
					return anotacaoMontada;
				}else throw new ErroVariavelNaoDelarada("A variavel "+rotulo+" "
						+ " não foi declarada em : "+parametroChamadaFuncao.getLinha(), parametroChamadaFuncao.getLinha());
				
			}else if( rotulo.equals("+") ||
					  rotulo.equals("-") ||
					  rotulo.equals("/") || 
					  rotulo.equals("*") ||
					  rotulo.equals("!")){
				verificaExpressao(parametroChamadaFuncao, anotacao, "", false,"real");
				if(rotulo.equals("!")){
					tipo = "boolean";
					anotacaoMontada = "_"+tipo;
					return anotacaoMontada;
				}else{
					tipo = retornaTipoComumExpressaoChamadaFuncao(parametroChamadaFuncao, "", anotacao);
					anotacaoMontada = "_"+tipo;
					return anotacaoMontada;
				}
			}
		}else if(rotulo.equals(",")){
			filhoEsquerdo = parametroChamadaFuncao.getFilhos().get(0);
			filhoDireito = parametroChamadaFuncao.getFilhos().get(1);
			anotacaoMontada+= montarParametrosAnotacaoFuncao(filhoEsquerdo, anotacao);
			anotacaoMontada+= montarParametrosAnotacaoFuncao(filhoDireito, anotacao);
		}
		return anotacaoMontada;
	}
   public String retornaTipoComumExpressaoChamadaFuncao(AST expr, String tipo, String anotacao) throws ErroDeTipo, ErroVariavelNaoDelarada{
		String rotulo = expr.getRotulo();
		if(rotulo.equals("+") ||
			rotulo.equals("-")||
			rotulo.equals("/")||
			rotulo.equals("*")){
			AST filhoEsquerdo, filhoDireito;
			filhoEsquerdo = expr.getFilhos().get(0);
			filhoDireito = expr.getFilhos().get(1);
			if(!tipo.equals("real"))
				tipo = retornaTipoComumExpressaoChamadaFuncao(filhoEsquerdo, tipo, anotacao);
			if(!tipo.equals("real"))
				tipo = retornaTipoComumExpressaoChamadaFuncao(filhoDireito, tipo, anotacao);
		}else if((rotulo.charAt(0)=='0' ||
				 rotulo.charAt(0)=='1' ||
				 rotulo.charAt(0)=='2' ||
				 rotulo.charAt(0)=='3' ||
				 rotulo.charAt(0)=='4' ||
				 rotulo.charAt(0)=='5' ||
				 rotulo.charAt(0)=='6' ||
				 rotulo.charAt(0)=='7' ||
				 rotulo.charAt(0)=='8' ||
				 rotulo.charAt(0)=='9')){
			if(rotulo.contains(".")){
				tipo = "real";
				return tipo;
			}else{
				tipo ="int";
				return tipo;
			}
		}else if(!rotulo.equals("TRUE") &&
				 !rotulo.equals("FALSE")&&
				 (rotulo.charAt(0)!= '"' && rotulo.charAt(rotulo.length()-1)!='"')){
			if(tabela.verificaSeExisteDeclaracaoConstantes(rotulo)){
				tipo = tabela.getDeclaracoes().get(rotulo+"_const").getTipo();
				return tipo;
			}else if(tabela.verificaSeExisteDeclaracaoArrays(rotulo)){
				tipo = tabela.getDeclaracoes().get(rotulo+"_const").getTipo();
				return tipo;
			}else if(tabela.verificaSeExisteDeclaracaoVariaveisGlobais(rotulo)){
				tipo = tabela.getDeclaracoes().get(rotulo+"_var").getTipo();
				return tipo;
			}else throw new ErroVariavelNaoDelarada("A variável "+rotulo+" não declarada em : " 
					+expr.getLinha(), expr.getLinha());
		}else throw new ErroDeTipo("O valor "+rotulo+" com tipo incompatível para expressão em : "
				+expr.getLinha(), expr.getLinha());
		return tipo;
	}
	
	
	public void testaPrint(AST noPrint, String anotacao_funcao) throws ErroOperadorNot, ErroDeTipo, ErroVariavelNaoDelarada, ErroFuncaoNaoDeclarada, ErroTipoFuncaoIncompativel{
		String RotulofilhoDeNoPrint = noPrint.getRotulo();
		if(!RotulofilhoDeNoPrint .equals(",") && !RotulofilhoDeNoPrint.equals("")){
			verificaExpressao(noPrint, anotacao_funcao, "", false,"");
			return;
		}else if(RotulofilhoDeNoPrint.equals(",")){
			AST noExprDeNoPrintEsquerda = noPrint.getFilhos().get(0);
			AST noExprDeNoPrintDireita = noPrint.getFilhos().get(1);
			testaPrint(noExprDeNoPrintEsquerda, anotacao_funcao);
			testaPrint(noExprDeNoPrintDireita, anotacao_funcao);
		}else return;
	}
	
	public void testaReturn(AST noReturn, String anotacao) throws ErroOperadorNot, ErroDeTipo, ErroVariavelNaoDelarada, ErroFuncaoNaoDeclarada, ErroTipoFuncaoIncompativel, IOException{
		AST expr = noReturn.getFilhos().get(0);
		String tipoFuncao = tabela.getTipo_funcaoMap().get(anotacao);
		verificaExpressaoEmAtribuicao(expr, anotacao, tipoFuncao);
	}
	
	public void testaRead(AST noRead, String anotacao_funcao) throws ErroVariavelNaoDelarada {
		String rotulo = noRead.getRotulo();
		if(!rotulo .equals(",") && !rotulo.equals("")){
			check.checaRead(tabela, noRead, anotacao_funcao);
			return;
		}else if(rotulo.equals(",")){
			AST noExprDeNoPrintEsquerda = noRead.getFilhos().get(0);
			AST noExprDeNoPrintDireita = noRead.getFilhos().get(1);
			testaRead(noExprDeNoPrintEsquerda, anotacao_funcao);
			testaRead(noExprDeNoPrintDireita, anotacao_funcao);
		}else return;
		
	}
	
	public void testaElse(AST noElse, String anotacao_funcao) throws ErroOperadorNot, ErroDeTipo, ErroVariavelNaoDelarada, ErroFuncaoNaoDeclarada, ErroTipoFuncaoIncompativel, ErroComandoReadSemParametros, ErroAnotacaoDeComando, IOException{
		String rotuloAtual;
		if(noElse.getFilhos().get(0) != null){
			for(AST filhosComandoElse : noElse.getFilhos()){
				rotuloAtual = filhosComandoElse.getRotulo();
				if(rotuloAtual.equals("print")) testaPrint(filhosComandoElse.getFilhos().get(0), anotacao_funcao);
				else if(rotuloAtual.equals("read")){
					AST filhoNoRead = filhosComandoElse.getFilhos().get(0);
					if(filhoNoRead != null)
						testaRead(filhoNoRead, anotacao_funcao);
					else throw new ErroComandoReadSemParametros("O comando read sem parâmetros em :"+filhosComandoElse.getLinha(), 
							filhosComandoElse.getLinha());
				}
				else if(rotuloAtual.equals("for")) testaComandos(filhosComandoElse, anotacao_funcao);
				else if(rotuloAtual.equals("while")) testaComandos(filhosComandoElse, anotacao_funcao);
				else if(rotuloAtual.equals("if")) testaComandos(filhosComandoElse, anotacao_funcao);
				else if(rotuloAtual.equals("=")) testaAtribuicao(filhosComandoElse, anotacao_funcao);
				else if(rotuloAtual.equals("return")) testaReturn(filhosComandoElse, anotacao_funcao);
				else if(rotuloAtual.equals("exit")) continue;
				//else if(rotuloAtual.equals("else")) testaElse(filhosComandoElse, anotacao_funcao);
				else if(rotuloAtual.equals("chamada_funcao"))testaChamadaFuncao(filhosComandoElse, anotacao_funcao);
			}
		}else throw new ErroAnotacaoDeComando("O comando "+noElse.getRotulo()+" com problema na anotacao em: "+noElse.getLinha(),
				noElse.getLinha());
	}
	
	public void testaChamadaFuncao(AST noChamadaFuncao, String anotacao_funcao) throws ErroVariavelNaoDelarada, ErroOperadorNot, ErroDeTipo, ErroFuncaoNaoDeclarada, ErroTipoFuncaoIncompativel{
		String anotacaoChamaFuncao = montarAnotacaoChamadaFuncao(noChamadaFuncao, anotacao_funcao);
		if(tabela.getTipo_funcaoMap().containsKey(anotacaoChamaFuncao)){
			return;
		}else throw new ErroFuncaoNaoDeclarada("A função com anotação "+anotacaoChamaFuncao
				+" não existe ou parametros de tipos incompatíveis em : "+noChamadaFuncao.getLinha(),noChamadaFuncao.getLinha());
		
	}
	
	public void testaIf(AST noIf, String anotacao_funcao) throws ErroOperadorNot, ErroDeTipo, ErroVariavelNaoDelarada, ErroFuncaoNaoDeclarada, ErroTipoFuncaoIncompativel, ErroComandoReadSemParametros, ErroAnotacaoDeComando, IOException {
		AST noOperadorRelacional = noIf.getFilhos().get(0);
		verificaOperadorRelacional(noOperadorRelacional, anotacao_funcao, "boolean");
		String rotuloAtual;
		if(noIf.getFilhos().get(0) != null){
			for(AST filhosComandoIf : noIf.getFilhos()){
				rotuloAtual = filhosComandoIf.getRotulo();
				if(rotuloAtual.equals("print")) testaPrint(filhosComandoIf.getFilhos().get(0), anotacao_funcao);
				else if(rotuloAtual.equals("read")){
					AST filhoNoRead = filhosComandoIf.getFilhos().get(0);
					if(filhoNoRead != null)
						testaRead(filhoNoRead, anotacao_funcao);
					else throw new ErroComandoReadSemParametros("O comando read sem parâmetros em :"+filhosComandoIf.getLinha(), 
							filhosComandoIf.getLinha());
				}
				else if(rotuloAtual.equals("for")) testaComandos(filhosComandoIf, anotacao_funcao);
				else if(rotuloAtual.equals("while")) testaComandos(filhosComandoIf, anotacao_funcao);
				else if(rotuloAtual.equals("if")) testaIf(filhosComandoIf, anotacao_funcao);
				else if(rotuloAtual.equals("=")) testaAtribuicao(filhosComandoIf, anotacao_funcao);
				else if(rotuloAtual.equals("return")) testaReturn(filhosComandoIf, anotacao_funcao);
				else if(rotuloAtual.equals("exit")) continue;
				else if(rotuloAtual.equals("else")) testaElse(filhosComandoIf, anotacao_funcao);
				else if(rotuloAtual.equals("chamada_funcao")) testaChamadaFuncao(filhosComandoIf, anotacao_funcao);
			}
		}else throw new ErroAnotacaoDeComando("O comando "+noIf.getRotulo()+" com problema na anotacao em: "+noIf.getLinha(),
				noIf.getLinha());
	}
	
	public void testaComandos(AST no, String anotacao) throws ErroOperadorNot, ErroDeTipo, ErroVariavelNaoDelarada, ErroFuncaoNaoDeclarada, ErroTipoFuncaoIncompativel, ErroComandoReadSemParametros, ErroAnotacaoDeComando, IOException{
		String variavel="", valorInicial="", tipoValorInicial="", valorFinal="", passo="";
		String rotulo = no.getRotulo();
		if(rotulo.equals("while")){
			AST noOperadorRelacional = no.getFilhos().get(0);
			verificaOperadorRelacional(noOperadorRelacional, anotacao_funcao, "boolean");
		}else if(rotulo.equals("for")){
			variavel = no.getFilhos().get(0).getFilhos().get(0).getRotulo();
			valorInicial = no.getFilhos().get(0).getFilhos().get(1).getRotulo();
			valorFinal = no.getFilhos().get(1).getFilhos().get(0).getRotulo();
			if(no.getFilhos().size()>2){
				if(no.getFilhos().get(2).getRotulo().equals("step"))
					passo = no.getFilhos().get(2).getFilhos().get(0).getRotulo();
			}
			if(tabela.verificaSeFoiDeclaradoVariaveisLocais(variavel, anotacao)){
				tipoValorInicial = tabela.retornaVariavelLocal(anotacao, variavel).getTipo();
			}else if(tabela.verificaSeExisteDeclaracaoVariaveisGlobais(variavel)){
				tipoValorInicial = tabela.getDeclaracoes().get(variavel+"_var").getTipo();
			}else throw new ErroVariavelNaoDelarada("A variável "+variavel+" não foi declarada em : "
					+no.getLinha(), no.getLinha());
			if(tipoValorInicial.equals("int")){
				try{
					Integer.parseInt(valorInicial);
					//Integer.parseInt(valorFinal);
				}catch(Exception e){
					throw new ErroDeTipo("O valor "+valorInicial+" tem que ser do tipo "+tipoValorInicial
							+" em :"+no.getLinha(),no.getLinha());
				}
				
				try{
					//Integer.parseInt(valorInicial);
					Integer.parseInt(valorFinal);
				}catch(Exception e){
					throw new ErroDeTipo("O valor "+valorFinal+" tem que ser do tipo "+tipoValorInicial
							+" em :"+no.getLinha(),no.getLinha());
				}
				if(!passo.equals("")){
					try{
						Integer.parseInt(passo);
						//Integer.parseInt(valorFinal);
					}catch(Exception e){
						throw new ErroDeTipo("O valor do passo  tem que ser do tipo "+tipoValorInicial
								+" em :"+no.getLinha(),no.getLinha());
					}
				}
			}else if(tipoValorInicial.equals("real")){
				try{
					Float.parseFloat(valorInicial);
					//Integer.parseInt(valorFinal);
				}catch(Exception e){
					throw new ErroDeTipo("O valor "+valorInicial+" tem que ser do tipo "+tipoValorInicial
							+" em :"+no.getLinha(),no.getLinha());
				}
				
				try{
					//Integer.parseInt(valorInicial);
					Float.parseFloat(valorFinal);
				}catch(Exception e){
					throw new ErroDeTipo("O valor "+valorFinal+" tem que ser do tipo "+tipoValorInicial
							+" em :"+no.getLinha(),no.getLinha());
				}
				
				if(!passo.equals("")){
					try{
						Float.parseFloat(passo);
						//Integer.parseInt(valorFinal);
					}catch(Exception e){
						throw new ErroDeTipo("O valor do passo  tem que ser do tipo "+tipoValorInicial
								+" em :"+no.getLinha(),no.getLinha());
					}
				}
			}else throw new ErroDeTipo("Tipo "+tipoValorInicial+" não compatível em for em :"+no.getLinha(),
					no.getLinha());
		}
		
		String rotuloAtual;
		if(no.getFilhos().get(0) != null){
			for(AST comandos : no.getFilhos()){
				rotuloAtual = comandos.getRotulo();
				if(rotuloAtual.equals("print")) testaPrint(comandos.getFilhos().get(0), anotacao_funcao);
				else if(rotuloAtual.equals("read")){
					AST filhoNoRead = comandos.getFilhos().get(0);
					if(filhoNoRead != null)
						testaRead(filhoNoRead, anotacao_funcao);
					else throw new ErroComandoReadSemParametros("O comando read sem parâmetros em :"+comandos.getLinha(), 
								comandos.getLinha());
				}
				else if(rotuloAtual.equals("for")) testaComandos(comandos, anotacao_funcao);
				else if(rotuloAtual.equals("while")) testaComandos(comandos, anotacao_funcao);
				else if(rotuloAtual.equals("if")) testaIf(comandos, anotacao_funcao);
				else if(rotuloAtual.equals("=")) testaAtribuicao(comandos, anotacao_funcao);
				else if(rotuloAtual.equals("return")) testaReturn(comandos, anotacao_funcao);
				else if(rotuloAtual.equals("exit")) continue;
				//else if(rotuloAtual.equals("else")) testaElse(comandos, anotacao_funcao);
				else if(rotuloAtual.equals("chamada_funcao")) testaChamadaFuncao(comandos, anotacao_funcao);
			}
			
		}else throw new ErroAnotacaoDeComando("O comando "+rotulo+" com problema na anotacao em: "+no.getLinha(),
				no.getLinha());
		}
}
