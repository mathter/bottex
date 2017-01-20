package tech.bottex.org.opencorpora.morphological;

import java.util.Collection;
import java.util.List;

import tech.bottex.lexical.LexemeImpl;
import tech.bottex.lexical.Type;
import tech.bottex.morphological.MorphFlag;
import tech.bottex.morphological.MorphLexeme;

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
        this.morphFlags = morphFlags;
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

    @Override
    public String toString()
    {
        return "MorphLexemeImpl [morphFlags=" + morphFlags + ", normalized=" + normalized + "]";
    }
}
