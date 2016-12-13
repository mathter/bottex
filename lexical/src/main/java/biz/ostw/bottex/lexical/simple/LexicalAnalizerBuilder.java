package biz.ostw.bottex.lexical.simple;

import java.io.Reader;
import java.util.Map;

import biz.ostw.bottex.lexical.ProviderException;

/**
 * @author mathter
 */
class LexicalAnalizerBuilder implements biz.ostw.bottex.lexical.LexicalAnalizerBuilder
{
    @Override
    public biz.ostw.bottex.lexical.LexicalAnalizer build( Reader reader, Map< String, Object > properties )
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
