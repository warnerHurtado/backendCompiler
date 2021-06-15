parser grammar miParser;

options {
    tokenVocab = miScanner;
}

program  : ( statement )*                                                                               #programAST;

statement:
    variableDeclaration PyCOMA                                                                          #variableDeclStaAST
    | classDeclaration PyCOMA																			#classDeclStaAST
    | assigment PyCOMA																					#assignStaAST
    | arrayAssignment PyCOMA																			#arrAsignStaAST
    | printStatement PyCOMA																			    #printStaAST
    | ifStatement																						#ifStaAST
    | whileStatement																					#whileStaAST
    | returnStatement PyCOMA																			#returnStaAST
    | funtionDeclaration																				#functionDeclStaAST
    | block																							    #blockStaAST;

block                     : KEYIZQ ( statement )* KEYDER 												#blockAST;

funtionDeclaration        : type ID PIZQ ( formalParams )? PDER block PyCOMA 							#functionDeclAST;

formalParams
locals [int cantParams = 0 ]
     : formalParam ( COMA formalParam)* 													            #fParamsAST;

formalParam         : type ID																			#fParamAST;

whileStatement      : WHILE PIZQ expression PDER block 													#whileStmmtAST;

ifStatement         : IF PIZQ expression PDER block ( ELSE block )? 									#ifStmntAST;

returnStatement     : RETURN expression 																#returnStmntAST;

printStatement      : PRINT expression 																	#printStmntAST;

classDeclaration    : CLASS ID KEYIZQ (classVariableDeclaration)* KEYDER							    #classDelcAST;

classVariableDeclaration : stype ID (ASSIGN expression)? PyCOMA                                         #classVariableDeclAST;

variableDeclaration : type ID (ASSIGN expression)?                                       	            #variableDeclAST;


type                : stype                                                                             #stypeTypeAST
                    | arrayType                                                                         #arrtypeTypeAST
                    | ID                                                                                #idTypeAST;

stype               : BOOLEAN | CHAR | INT | STRING                                                     #stypeAST;

arrayType           : stype PCIZQ PCDER																	#arrTypeAST;

assigment           : ID (PUNTO ID)? ASSIGN expression 													#asssignAST;

arrayAssignment     : ID PCIZQ expression PCDER ASSIGN expression 									    #arrAssignAST;

expression       : simpleExpression (ROPERATOR simpleExpression)* 							         	#expressionAST;

simpleExpression : term (AOP term)* 														            #simpleExpressionAST;

term             : factor (MOP factor)* 												                #termAST;

factor           :
    literal                                                                                             #literalFactAST
    | ID (PUNTO ID)?                                                                                    #puntIdFactAST
    | funtionCall                                                                                       #funtionCallFactAST
    | arrayLookup                                                                                       #arrayLokupFactAST
    | arrayLength                                                                                       #lengthFactAST
    | subExpression                                                                                     #subExpressionFactAST
    | arrayAllocationExpression                                                                         #arrayAlloExpreFactAST
    | allocationExpression                                                                              #allocaExpreFactAST
    | unary 																						    #unaryFactAST;


unary                     : UNARY (expression)* 									                    #unaryAST;

allocationExpression      : NEW ID PIZQ PDER 															#allocationExprAST;

arrayAllocationExpression : NEW stype PCIZQ expression PCDER 											#arrAllocationExprAST;

subExpression    : PIZQ expression PDER                                                                 #subExprAST;

funtionCall      : ID PIZQ (actualParams)? PDER 														#functionCallAST;

actualParams
locals [int cantParams = 0 ]
    : expression (COMA expression)* 														            #actualParamsAST;

arrayLookup      : ID PCIZQ expression PCDER                                                            #arrLookupAST;

arrayLength      : ID PUNTO LENGTH 															            #arrLengthAST;

literal          : INTLITERAL                                                                           #intLiteralAST
                  //| REALLITERAL                                                                         #realLiteralAST
                  | booleanLiteral                                                                      #boolLiteralAST
                  | STRINGLITERAL                                                                       #stringLiteralAST
                  | CHARLITERAL                                                                         #charListeralAST;

booleanLiteral      : TRUE | FALSE                                                                      #booleanLiteralAST;
