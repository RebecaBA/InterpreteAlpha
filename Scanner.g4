lexer grammar Scanner;

//símbolos
PyCOMA  : ';' ;
ASSIGN  : ':=';
PIZQ    : '(';
PDER    : ')';
VIR     : '~';
DOSPUN  : ':';
SUM     : '+';
SUB     : '-';
MUL     : '*';
DIV     : '/';
MAYOR   : '>';
MENOR   : '<';
IGUAL   : '==';
MAYORIGUAL : '>=';
MENORIGUAL : '<=';

//palabras reservadas
IF      : 'if' ;
WHILE   : 'while' ;
LET     : 'let';
THEN    : 'then';
ELSE    : 'else';
IN      : 'in';
DO      : 'do';
BEGIN   : 'begin';
END     : 'end';
CONST   : 'const';
VAR     : 'var';
OR      : 'or';
AND     : 'and';
PRINT   : 'print';

BOOLEAN               : 'true' | 'false';
ID                    : LETTER (LETTER|DIGIT)* ;
NUM                   : DIGIT DIGIT* ;
STRING                :   '"' ('""'|~'"')* '"' ;
SPECIAL_STRING        :   '"''\\''"' ('""'|~'"')* '\\''"''"' ;

fragment LETTER : 'a'..'z' | 'A'..'Z';
fragment DIGIT  : '0'..'9' ;

WS  :   [ \t\n\r]+ -> skip ;

