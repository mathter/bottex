package biz.ostw.bottex.morphological;

import java.util.List;

import biz.ostw.bottex.lexical.Lexeme;

/**
 * @author mathter
 */
public interface LexemeAnalizer
{
    public List< MorphLexeme > analize( Lexeme lexeme );
}
