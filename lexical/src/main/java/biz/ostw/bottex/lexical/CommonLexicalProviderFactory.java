package biz.ostw.bottex.lexical;

import java.util.ServiceLoader;

/**
 * @author mathter
 */
public class CommonLexicalProviderFactory
{
    public LexicalAnalizerProvider newInstance( String name )
    {
        if ( name == null )
        {
            throw new NullPointerException( "name argument can't be null!" );
        }

        ServiceLoader< LexicalAnalizerProvider > serviceLoader = ServiceLoader.load( LexicalAnalizerProvider.class );

        for ( LexicalAnalizerProvider lexicalAnalizerProvider : serviceLoader )
        {
            if ( name.equals( lexicalAnalizerProvider.getName() ) )
            {
                return lexicalAnalizerProvider;
            }
        }

        throw new IllegalArgumentException( "There is't LexicalAnalizer for name '" + name + "'!" );
    }
}
