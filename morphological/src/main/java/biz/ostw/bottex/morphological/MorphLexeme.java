package biz.ostw.bottex.morphological;

import biz.ostw.bottex.lexical.Lexeme;

/**
 * @author mathter
 */
public interface MorphLexeme extends Lexeme
{
    public POST getPost();

    public CharSequence getNormalized();
}
