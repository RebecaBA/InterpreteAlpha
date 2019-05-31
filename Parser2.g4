parser grammar Parser2;

options {
  tokenVocab = Scanner;
}

program : singleCommand EOF                                                                     #programAST;
command : singleCommand (PyCOMA singleCommand)*                                                 #commandAST;
singleCommand : ID ASSIGN expression                                                            #assignSCAST
        |  ID PIZQ expression PDER                                                              #callSCAST
        | IF expression THEN singleCommand
                        ELSE singleCommand                                                      #ifSCAST
        | WHILE expression DO singleCommand                                                     #whileSCAST
        | LET declaration IN singleCommand                                                      #letSCAST
        | PRINT PIZQ expression PDER                                                            #printSCAST
        | BEGIN command END                                                                     #beginSCAST;
declaration  : singleDeclaration (PyCOMA singleDeclaration)*                                    #declarationAST;
singleDeclaration : CONST ID VIR expression                                                     #constDeclAST
    	   | VAR ID DOSPUN typedenoter                                                          #varDeclAST;
typedenoter : ID                                                                                #typedenoterAST;
expression : primaryExpression (operator primaryExpression)*                                    #expressionAST;
primaryExpression :   NUM                                                                       #numPEAST
                    | BOOLEAN                                                                   #booleanPEAST
                    | ID                                                                        #idPEAST
                    | (STRING | SPECIAL_STRING)                                                 #stringPEAST
                    | PIZQ expression PDER                                                      #groupPEAST;
operator : SUM | SUB | MUL | DIV | MAYOR | MENOR | IGUAL | MAYORIGUAL | MENORIGUAL | OR | AND   #operatorAST;

// 4 or 8     6 > 9 <