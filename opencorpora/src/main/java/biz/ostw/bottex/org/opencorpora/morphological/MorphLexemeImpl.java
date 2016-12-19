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
    public MorphLexemeImpl( Type type, char[] buf )
    {
        super( type, buf );
    }

    @Override
    public POST getPost()
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public CharSequence getNormalized()
    {
        // TODO Auto-generated method stub
        return null;
    }
}
