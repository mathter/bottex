package tech.bottex.org.opencorpora.morphological;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

    private Set< MorphFlag > morphFlags;

    CharSequence normalized;

    public MorphLexemeImpl( Type type, char[] buf, List< MorphFlag > morphFlags )
    {
        super( type, buf );
        this.morphFlags = new HashSet<>( morphFlags.size() );
        this.morphFlags.addAll( morphFlags );
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
