lexer grammar simple ;

HEX_21
	: '!' ;

HEX_22
	: '"' ;

HEX_23
	: '#' ;

HEX_24
	: '$' ;

HEX_25
	: '%' ;

HEX_26
	: '&' ;

HEX_27
	: '\'' ;

HEX_28
	: '(' ;

HEX_29
	: ')' ;

HEX_2A
	: '*' ;

HEX_2B
	: '+' ;

HEX_2C
	: ',' ;

HEX_2D
	: '-' ;

HEX_2E
	: '.' ;

HEX_2F
	: '/' ;

HEX_3A
	: ':' ;

HEX_3B
	: ';' ;

HEX_3C
	: '<' ;

HEX_3D
	: '=' ;

HEX_3E
	: '>' ;

HEX_3F
	: '?' ;

HEX_40
	: '@' ;

HEX_5B
	: '[' ;

HEX_5C
	: '\\' ;

HEX_5D
	: ']' ;

HEX_5E
	: '^' ;

HEX_5F
	: '_' ;

HEX_60
	: '`' ;

HEX_7E
	: '~' ;

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

