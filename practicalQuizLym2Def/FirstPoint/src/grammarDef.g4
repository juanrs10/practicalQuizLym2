

grammar grammarDef;

/*TOKENS*/

WS      : [ \t\r\n]+ -> skip ;  // Ignore whitespace
DOLLAR  : '$' ;
A       : 'a' ;
B       : 'b' ;
C       : 'c' ;

/*RULES*/

rulelist : rule+ ;

rule : start | w | v | letter ;

start : w DOLLAR v ;

w : letter+ ;

v : letter+ ;

letter : A | B | C ;

