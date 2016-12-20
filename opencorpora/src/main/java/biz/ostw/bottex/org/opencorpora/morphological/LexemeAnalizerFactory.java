package biz.ostw.bottex.org.opencorpora.morphological;

import java.io.File;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Map;

import biz.ostw.bottex.morphological.LexemeAnalizer;
import biz.ostw.bottex.morphological.spi.LexemeAnalizerFactorySpi;
import biz.ostw.bottex.org.opencorpora.importer.v0_92.Lemma;

/**
 * @author mathter
 */
public class LexemeAnalizerFactory extends LexemeAnalizerFactorySpi
{
    private static final String NAME = "opencorpora";

    private static final String PROPERTY_URI = "uri";

    private URI sourceUri;

    private List< Lemma > lemmas;

    @Override
    public synchronized LexemeAnalizer newInstance()
    {
        return new biz.ostw.bottex.org.opencorpora.morphological.LexemeAnalizer( this.getLemmas() );
    }

    @Override
    public void init( Map< String, Object > properties )
    {
        if ( properties.containsKey( PROPERTY_URI ) )
        {
            Object value = properties.get( PROPERTY_URI );

            if ( ! ( value instanceof URI ) )
            {
                try
                {
                    this.sourceUri = new URI( String.valueOf( value ) );
                } catch ( URISyntaxException e )
                {
                    throw new IllegalArgumentException( e );
                }
            } else
            {
                this.sourceUri = (URI) value;
            }
        } else
        {
            this.sourceUri = this.getDefaultSourceUri();
        }
    }

    @SuppressWarnings( "unchecked" )
    synchronized List< Lemma > getLemmas()
    {
        if ( this.lemmas == null )
        {
            try
            {
                InputStream is = this.sourceUri.toURL().openStream();
                ObjectInput oi = new ObjectInputStream( is );

                this.lemmas = (List< Lemma >) oi.readObject();

                oi.close();
            } catch ( Throwable t )
            {
                throw new IllegalStateException( "Can't read data!", t );
            }
        }

        return this.lemmas;
    }

    @Override
    public String getName()
    {
        return NAME;
    }

    private URI getDefaultSourceUri()
    {
        String home = System.getProperty( "user.home" );

        if ( home != null )
        {
            return new File( home + "/" + ".bottex/" ).toURI();
        } else
        {
            throw new IllegalStateException( "user.home property not defined!" );
        }
    }
}
