lexer grammar simple ;

DOT
	: '.' ;

COMMA
	: ',' ;

SEMICOLON
	: ';' ;

COLON
	: ':' ;


NUMBER
	: DECIMAL_NUMBER
	| HEX_NUMBER ;

DECIMAL_NUMBER
	: [0-9]+ ;

HEX_NUMBER
	: [0-9abcdefABCDEF]+ ;

WORD
	: [a-zA-Zа-яА-Я]+ ;

WS
	: [ \n\r]+ -> skip ;

