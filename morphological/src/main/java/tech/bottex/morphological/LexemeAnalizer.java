package tech.bottex.morphological;

import java.util.List;

import tech.bottex.lexical.Lexeme;

/**
 * @author mathter
 */
public interface LexemeAnalizer
{
    public List< MorphLexeme > analize( Lexeme lexeme );
}
