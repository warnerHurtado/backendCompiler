parser grammar miParser;

options {
    tokenVocab = miScanner;
}

program  : ( statement )*;

statement:
  variableDeclaration PyCOMA
  | classDeclaration PyCOMA
  | assigment PyCOMA
  | arrayAssignment PyCOMA
  | printStatement PyCOMA
  | ifStatement
  | whileStatement
  | returnStatement PyCOMA
  | funtionDeclaration
  | block ;

block                     : KEYIZQ ( statement )* KEYDER ;

funtionDeclaration        : type ID PIZQ ( formalParams )? PDER block ;

formalParams        : formalParam ( COMA formalParam)* ;

formalParam         : type ID;

whileStatement      : WHILE PIZQ expression PDER block ;

ifStatement         : IF PIZQ expression PDER block ( ELSE block )? ;

returnStatement     : RETURN expression ;

printStatement      : PRINT expression ;

classDeclaration    : CLASS ID KEYIZQ (classVariableDeclaration)* KEYDER;

classVariableDeclaration : STYPE ID (ASSIGN expression)? ;

variableDeclaration : type ID (ASSIGN expression)?;

type                : STYPE | arrayType | ID;

arrayType           : STYPE PCIZQ PCDER;

assigment           : ID (PUNTO ID)? ASSIGN expression ;

arrayAssignment     : ID PCIZQ expression PCDER ASSIGN expression ;

expression       : simpleExpression (ROPERATOR simpleExpression)* ;

simpleExpression : term (AOP term)* ;

term             : factor (MOP factor)* ;

factor           :
    literal                   |
    ID (PUNTO ID)?            |
    funtionCall               |
    arrayLookup               |
    arrayLength               |
    subExpression             |
    arrayAllocationExpression |
    allocationExpression      |
    unary ;


unary                     : (UNARY) (expression)* ;

allocationExpression      : NEW ID PIZQ PDER ;

arrayAllocationExpression : NEW STYPE PCIZQ expression PCDER ;

subExpression    : PIZQ expression PDER ;

funtionCall      : ID PIZQ (actualParams)? PDER ;

actualParams     : expression (COMA expression)* ;

arrayLookup      : ID PCIZQ expression PCDER ;

arrayLength      : ID PUNTO LENGTH ;

literal          : INTLITERAL  | REALLITERAL | BOOLITERAL | STRINGLITERAL;