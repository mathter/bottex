package biz.ostw.bottex.org.opencorpora.morphological;

import java.util.Collection;
import java.util.List;

import biz.ostw.bottex.lexical.LexemeImpl;
import biz.ostw.bottex.lexical.Type;
import biz.ostw.bottex.morphological.MorphFlag;
import biz.ostw.bottex.morphological.MorphLexeme;

/**
 * @author mathter
 */
public class MorphLexemeImpl extends LexemeImpl implements MorphLexeme
{
    private static final long serialVersionUID = -1980483257448983328L;

    private List< MorphFlag > morphFlags;

    CharSequence normalized;

    public MorphLexemeImpl( Type type, char[] buf, List< MorphFlag > morphFlags )
    {
        super( type, buf );
    }

    @Override
    public CharSequence getNormalized()
    {
        return this.normalized;
    }

    @Override
    public Collection< MorphFlag > getMorphFlags()
    {
        return this.morphFlags;
    }

    @Override
    public boolean contains( MorphFlag morphFlag )
    {
        return this.morphFlags.contains( morphFlag );
    }
}
