
grammar words;

// Regra principal
program
    : sentence* EOF
    ;

// Uma frase pode terminar de várias formas
sentence
    : phrase terminator
    | phrase ELLIPSIS           // frase incompleta (...)
    ;

// Conjunto de palavras com vírgulas opcionais
phrase
    : WORD (COMMA? WORD)*
    ;

// Terminadores normais
terminator
    : DOT
    | EXCLAMATION
    | QUESTION
    ;

// --- LEXER ---

WORD        : [a-zA-ZÀ-ÿ]+ ;
COMMA       : ',' ;
DOT         : '.' ;
EXCLAMATION : '!' ;
QUESTION    : '?' ;
ELLIPSIS    : '...' ;

// ignorar espaços
WS : [ \t\r\n]+ -> skip ;