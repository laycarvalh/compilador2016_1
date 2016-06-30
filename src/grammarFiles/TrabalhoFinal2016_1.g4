grammar TrabalhoFinal2016_1;
// Fazer as anotações 4.2
// 
prog : 'program' ID ';' declaracao* funcao* principal #Body;

declaracao: declaracao_var 
           | declaracao_const 
           | declaracao_Arrays 
          ;

declaracao_var: tipo ':' var ';' 
               #DeclaracaoVar; 
var : lista_ids;

lista_ids : ID ',' lista_ids #ListaIDs
          | ID #ListaIDsID;

declaracao_const: 'final' tipo constante '=' valor ';' #DeclaracaoConstante;

constante: ID; 

valor: INT #ValorInteiro
      | REAL #ValorReal
      | STRING #ValorString
      | BOOLEAN #ValorBooleano
     ;
declaracao_Arrays:  tipo ':' lista_arrays ';' 
                 ;

lista_arrays: ID '['INT']' ',' lista_arrays
            | ID '['INT']' 
            ;

array: ID '['ID']'
     | ID '['INT ']'
     ;

tipo: 'int'
     | 'real'
     | 'string'
     | 'boolean'
    ;

funcao: tipo nome_funcao '(' lista_de_parametros ')' '{' comandos* '}'
      ;
nome_funcao: ID
           ;
lista_de_parametros:parametro ',' lista_de_parametros
                    | parametro
                    ;

parametro : tipo ID
          |//vazio
          ;

comandos : 'print' '('lista_expr')' ';'
         | cmd_atribuicao
         | cmd_controle
         | 'exit' ';'
         | 'read' '(' lista_ids ')'';'
         | 'read' '(' array ')'';'
         | cmd_return
         | chamada_funcao
         | 'break' ';'
         ;
cmd_return: 'return''('expr')'';'
          ;
chamada_funcao: ID '(' lista_expr? ')' ';'
              ;
lista_expr: expr ',' lista_expr
          | expr
          ;
cmd_controle : 'if' '(' oprelacional ')' 'then' '{' comandos* '}' ( 'else' '{' comandos* '}' )?
         | 'while' '(' oprelacional ')' '{' comandos* '}'
         | 'for' '(' ID '=' condicoes ':' condicoes ('step' condicoes)? ')' '{' comandos* '}'
         ;
condicoes: ID
         | INT
         ;
cmd_atribuicao: cmd_atrib_var
              | cmd_atrib_array
              ;
cmd_atrib_var : var '=' expr ';' 
           ;

cmd_atrib_array : array '=' expr ';'  
           ;


oprelacional : '!' oprelacional 
             | expr ('>'|'<'|'>='|'<='|'=='|'!='| '<>') expr 
             | expr 
    ;

expr : '-' expr
     | expr s= ('*'|'/') expr
     | expr ('+'|'-') expr
     | valor
     | ID
     | array
     | '(' expr ')'
     ;


numero : INT
       | REAL
       ;

principal: 'main' '(' ')' '{' comandos* '}'
         ;


STRING : '"'.*?'"';
BOOLEAN : 'TRUE'|'FALSE';
ID : [a-zA-Z][a-zA-Z0-9_]*;
INT : [0-9]([0-9]*);
REAL : [0-9]+('.'[0-9]+)?;
WS : [ \n\r\t]+ -> skip;
SL_COMMENT : '//' .*? '\n' -> skip ;
SL_COMMENTM : '/*' .*? '*/' -> skip ;