package tech.bottex.morphological.spi;

import java.util.Map;

import tech.bottex.morphological.LexemeAnalizerFactory;

/**
 * @author mathter
 */
public abstract class LexemeAnalizerFactorySpi implements LexemeAnalizerFactory
{
    public abstract void init( Map< String, Object > properties );

    public abstract String getName();
}
