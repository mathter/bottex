package biz.ostw.bottex.morphological;

import java.util.Collection;

import biz.ostw.bottex.lexical.Lexeme;

/**
 * @author mathter
 */
public interface MorphLexeme extends Lexeme
{
    public Collection< MorphFlag > getMorphFlags();

    public boolean contains( MorphFlag morphFlag );

    public CharSequence getNormalized();
}
