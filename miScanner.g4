/*
    Scanner - I Proyecto - Compiladores e Intérpretes
    Jose Ignacio Alfaro Solano - Warner Fidel Hurtado Laguna
*/

lexer grammar miScanner;

PyCOMA : ';'   ;
PIZQ   : '('   ;
PDER   : ')'   ;
KEYDER : '}'   ;
KEYIZQ : '{'   ;
ASSIGN : '='   ;
COMA   : ','   ;
UNDERS : '_'   ;
PCIZQ  : '['   ;
PCDER  : ']'   ;
PUNTO  : '.'                                                                ;
COMI   : '"'                                                                ;

SUMA        : '+'                                                           ;
RESTA       : '-'                                                           ;
ADMIRACION    : '!'                                                         ;

fragment MAYOR : '>'     ;
fragment IGUALES : '=='  ;
fragment DIFERENTE : '!=' ;
fragment MENORIGU : '<=' ;
fragment MAYORIGU : '>=' ;
fragment MENOR : '<'                                                        ;

ROPERATOR   : MENOR | MAYOR | IGUALES | DIFERENTE | MENORIGU | MAYORIGU ;

STYPE     : 'boolean' | 'char' | 'int' | 'string'                        ;
TRUE        : 'true'                                                    ;
FALSE       : 'false'                                                   ;
BTYPE     : TRUE | FALSE                        ;


AND         : '&&'                                                      ;
OR          : '||'                                                      ;
DIVISION    : '/'                                                       ;
MULTIPLI    : '*'                                                       ;

AOP       : SUMA | RESTA | OR                      ;
MOP       : MULTIPLI | DIVISION | AND              ;
UNARY      : SUMA | RESTA | ADMIRACION              ;

IF      : 'if'    ;
ELSE   : 'else'      ;
WHILE  : 'while'  ;

RETURN : 'return'  ;
PRINT  : 'print'  ;
CLASS  : 'class'    ;
NEW    : 'new'      ;
LENGTH : 'length'   ;

INTLITERAL       : DIGIT (DIGIT)* ;

REALLITERAL      : DIGIT (DIGIT)* PUNTO (DIGIT)* | PUNTO DIGIT (DIGIT)* ;

BOOLITERAL      : BTYPE ;

STRINGLITERAL    : COMI (PRINTABLE)* COMI ;


ID : (UNDERS | LETTER) (UNDERS | LETTER | DIGIT)* ;

fragment PRINTABLE :  DIGIT | LETTER | ' ' | '" "' | ADMIRACION | '#' | '$' | '%' | '&'      |
                     '\'' | PIZQ | PDER | MULTIPLI | SUMA | COMA | RESTA | PUNTO      |
                     DIVISION | ':' | PyCOMA | MENOR | ASSIGN | MAYOR | '?' | '@'     |
                     PIZQ | '\\' | PCDER | '^' | UNDERS | '`' | KEYIZQ | '|' | KEYDER |
                     '~';

fragment DIGIT : [0-9];
fragment LETTER :                           'A' | 'B' | 'C' | 'D' | 'E' | 'F'| 'G' | 'H' | 'I' | 'J' | 'K'
                                        |   'L' | 'M' | 'N' | 'O' | 'P' | 'Q' | 'R' | 'S' | 'T' | 'U' | 'V'
                                        |   'W' | 'X' | 'Y' | 'Z' | 'a' | 'b' | 'c' | 'd' | 'e' | 'f' | 'g'
                                        |   'h' | 'i' | 'j' | 'k' | 'l' | 'm' | 'n' | 'o' | 'p' | 'q' | 'r'
                                        |   's' | 't' | 'u' | 'v' | 'w' | 'x' | 'y' | 'z';
WS: [ \t\n\r]+ -> skip;