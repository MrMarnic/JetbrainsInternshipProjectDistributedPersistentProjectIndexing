parser grammar ProjectParser;

options { tokenVocab=ProjectLexer; }

document : expr* EOF;

expr : (printExpr | assign | scope);

printExpr : PRINT TEXT;
assign : TEXT EQUALS TEXT;
scope: SCOPE CURLY_OPEN expr* CURLY_CLOSE;