lexer grammar test;

@lexer::members
{
    boolean noun = false;
}

DESC: '{' L+ '}' {noun = true;};
L: 'NOUN';
G: {noun}? STRING {noun = false;};
STRING: [a-zA-Z]+;
