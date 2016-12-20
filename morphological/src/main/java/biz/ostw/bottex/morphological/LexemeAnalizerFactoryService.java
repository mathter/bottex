package biz.ostw.bottex.morphological;

import java.util.Map;
import java.util.ServiceLoader;

import biz.ostw.bottex.morphological.spi.LexemeAnalizerFactorySpi;

/**
 * @author mathter
 */
public class LexemeAnalizerFactoryService
{
    public LexemeAnalizerFactory newInstance( String name, Map< String, Object > properties )
    {
        ServiceLoader< LexemeAnalizerFactorySpi > serviceLoader = ServiceLoader.load( LexemeAnalizerFactorySpi.class );

        for ( LexemeAnalizerFactorySpi factory : serviceLoader )
        {
            if ( name.equals( factory.getName() ) )
            {
                factory.init( properties );
                
                return factory;
            }
        }
        return null;
    }
}
