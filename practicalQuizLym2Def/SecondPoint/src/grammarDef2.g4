
grammar grammarDef2;

/* TOKENS */
WS      : [ \t\r\n]+ -> skip ;  // Ignore whitespace
DOLLAR  : '$' ;
A       : 'a' ;
B       : 'b' ;
C       : 'c' ;

/* RULES */

start : w DOLLAR v ;

w : letter (letter {<=4})+ ;

v : letter (letter {==n})+ ;

letter : A | B | C ;