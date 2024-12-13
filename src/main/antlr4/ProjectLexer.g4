lexer grammar ProjectLexer;

PRINT: 'print';
CURLY_OPEN : '{' ;
CURLY_CLOSE : '}' ;
EQUALS    : '=';
SCOPE : 'scope' ;
TEXT
    : [a-zA-Z0-9]+
    ;
NUMBER   : [0-9]+ ;
WHITESPACE : [ \t\n\r]+ -> skip ;
NEWLINE :'\r'? '\n' ;