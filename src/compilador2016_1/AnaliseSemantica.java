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

        //preencheTabelaSimbolos();
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
//                if (rotuloAtual.equals("=")) {
//                    testaAtribuicao(noComandosDentrDaFuncao, anotacao_funcao);
//                } else if (rotuloAtual.equals("print")) {
//                    AST filhoNoPrint = noComandosDentrDaFuncao.getFilhos().get(0);
//                    testaPrint(filhoNoPrint, anotacao_funcao);
//                } else if (rotuloAtual.equals("read")) {
//                    AST filhoNoRead = noComandosDentrDaFuncao.getFilhos().get(0);
//                    if (filhoNoRead != null) {
//                        testaRead(filhoNoRead, anotacao_funcao);
//                    } else {
//                        throw new ErroComandoReadSemParametros("O comando read sem parâmetros em :" + noComandosDentrDaFuncao.getLinha(),
//                                noComandosDentrDaFuncao.getLinha());
//                    }
//                } else if (rotuloAtual.equals("if")) {
//                    testaIf(noComandosDentrDaFuncao, anotacao_funcao);
//                } else if (rotuloAtual.equals("for")) {
//                    testaComandos(noComandosDentrDaFuncao, anotacao_funcao);
//                } else if (rotuloAtual.equals("while")) {
//                    testaComandos(noComandosDentrDaFuncao, anotacao_funcao);
//                } else if (rotuloAtual.equals("chamada_funcao")) {
//                    testaChamadaFuncao(noComandosDentrDaFuncao, anotacao_funcao);
//                }

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
}
