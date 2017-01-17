package tech.bottex.lexical.simple;

import java.io.Reader;
import java.util.Map;

import tech.bottex.lexical.ProviderException;

/**
 * @author mathter
 */
class LexicalAnalizerBuilder implements tech.bottex.lexical.LexicalAnalizerBuilder
{
    @Override
    public tech.bottex.lexical.LexicalAnalizer build( Reader reader, Map< String, Object > properties )
    {
        try
        {
            return new LexicalAnalizer( reader );
        } catch ( Exception e )
        {
            throw new ProviderException( "Can't create lexical analizer!", e );
        }
    }
}
