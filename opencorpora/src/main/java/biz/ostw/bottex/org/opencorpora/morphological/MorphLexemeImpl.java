package biz.ostw.bottex.org.opencorpora.morphological;

import biz.ostw.bottex.lexical.LexemeImpl;
import biz.ostw.bottex.lexical.Type;
import biz.ostw.bottex.morphological.MorphLexeme;
import biz.ostw.bottex.morphological.POST;

/**
 * @author mathter
 */
public class MorphLexemeImpl extends LexemeImpl implements MorphLexeme
{
    private static final long serialVersionUID = -1980483257448983328L;

    POST post;

    CharSequence normalized;

    public MorphLexemeImpl( Type type, char[] buf )
    {
        super( type, buf );
    }

    @Override
    public POST getPost()
    {
        return post;
    }

    @Override
    public CharSequence getNormalized()
    {
        return this.normalized;
    }

    @Override
    public String toString()
    {
        return "MorphLexemeImpl [post=" + post + ", normalized=" + normalized + ", type=" + getType() + ", origin=" + super.toString()
            + "]";
    }
}
