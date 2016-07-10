grammar TrabalhoFinal2016_1;
// Fazer as anotações 4.2
// 
prog : 'program' ID ';' declaracao* funcao* principal #Body;

declaracao: declaracao_var #DeclaarcaoVariaveis
           | declaracao_const #DeclaarcaoConstantes
           | declaracao_Arrays #DeclaarcaoArrays;

declaracao_var: tipo ':' var ';' #DeclaracaoVariavel
; 
var : lista_ids #Variavel
    ;

lista_ids : ID ',' lista_ids  #ListaIDs
          | ID  #Identificador 
          ;

declaracao_const: 'final' tipo constante '=' valor ';' #DeclaracaoConstante 
                ;

constante: ID #ConstanteID ; 

valor: INT #ValorInteiro
      | REAL #ValorReal 
      | STRING  #ValorString
      | BOOLEAN #ValorBoolean
     ;
declaracao_Arrays:  tipo ':' lista_arrays ';' #DeclaracaoArray
                 ;

lista_arrays: ID '['INT']' ',' lista_arrays #listaArrays
            | ID '['INT']' #listaArraysArray
            ;

array: ID '['ID']' #ArrayID
     | ID '['INT ']' #ArrayINT
     ;

tipo: 'int' #tipoInt
     | 'real' #tipoReal
     | 'string' #tipoString
     | 'boolean' #tipoBoolean
    ;

funcao: tipo nome_funcao '(' lista_de_parametros ')' '{' comandos* '}' #Function
      ;
nome_funcao: ID #NomeFuncao
           ;
lista_de_parametros:parametro ',' lista_de_parametros #listaParam
                    | parametro #Param
                    |/*vazio*/ #ParamVazio
                    ;

parametro : tipo ID #Parameter
          ;

comandos : 'print' '('lista_expr')' ';' #comandoPrint
         | cmd_atribuicao #comandoAtribuicao
         | cmd_controle #comandoControle
         | 'exit' ';' #comandoExit
         | 'read' '(' lista_ids ')'';' #comadoRead
         | 'read' '(' array ')'';' #comadoReadArrays
         | cmd_return #comandoRetorno
         | chamada_funcao #comandoChamadaFuncao
         | 'break' ';' #comandoBreak
         ;
cmd_return: 'return''('expr')'';' #Return
          ;
chamada_funcao: ID '(' lista_expr? ')' ';' #chamadaFuncao
              ;

// chamada_de_funcao_aninhada : ID '(' lista_de_expr ')' #chamadaFuncaoAninhada; 

lista_expr: expr ',' lista_expr #ListaExpressoes
          | expr #ListaExpressoesExpr
          ;

comando_else : 'else' '{' comandos* '}'  #controleElse;

cmd_controle : 'if' '(' oprelacional ')' 'then' '{' comandos* '}' (comando_else)? #comandoControleIf
         | 'while' '(' oprelacional ')' '{' comandos* '}' #comandoControleWhile
         | 'for' '(' ID '=' condicoes ':' condicoes ('step' condicoes)? ')' '{' comandos* '}' #comandoControleFor
         ;
condicoes: ID #CondicoesID
         | INT #CondiicoesINT
         ;
cmd_atribuicao: cmd_atrib_var #AtributionVar
              | cmd_atrib_array #AtributionArray
              ;
cmd_atrib_var : var '=' expr ';' #AtribuicaodeVariavel
           ;

cmd_atrib_array : array '=' expr ';'  #AtribuicaodeArray
           ;


oprelacional : '!' oprelacional  #oprelacionalNot
             | oprelacional o= ('>'|'<'|'>='|'<='|'=='|'!='| '<>') oprelacional #oprelacionalBinario
             | expr #prelacionalExpr
    ;

expr : '-' expr #exprNegativo
     | expr m= ('*'|'/') expr #exprMultDiv
     | expr s= ('+'|'-') expr #exprSomaSub
     | valor #exprValor
     | ID #exprID
     | array #exprArray
     | '(' expr ')' #exprParenteses
     ;


numero : INT #numeroInteiro
       | REAL #numeroReal
       ;

principal: 'main' '(' ')' '{' comandos* '}' #Main;


STRING : '"'.*?'"';
BOOLEAN : 'TRUE'|'FALSE';
ID : [a-zA-Z][a-zA-Z0-9_]*;
INT : [0-9]([0-9]*);
REAL : [0-9]+('.'[0-9]+)?;
WS : [ \n\r\t]+ -> skip;
SL_COMMENT : '//' .*? '\n' -> skip ;
SL_COMMENTM : '/*' .*? '*/' -> skip ;