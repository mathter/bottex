package biz.ostw.bottex.morphological.spi;

import java.util.Map;

import biz.ostw.bottex.morphological.LexemeAnalizerFactory;

/**
 * @author mathter
 */
public abstract class LexemeAnalizerFactorySpi implements LexemeAnalizerFactory
{
    public abstract void init( Map< String, Object > properties );

    public abstract String getName();
}
