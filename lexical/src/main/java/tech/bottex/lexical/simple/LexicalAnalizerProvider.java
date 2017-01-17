package tech.bottex.lexical.simple;

import tech.bottex.lexical.LexicalAnalizerBuilder;

/**
 * @author mathter
 */
public class LexicalAnalizerProvider implements tech.bottex.lexical.LexicalAnalizerProvider
{
    private static final String NAME = "SimpleAnalizerProvider";

    public LexicalAnalizerBuilder getBuilder( )
    {
        return new tech.bottex.lexical.simple.LexicalAnalizerBuilder();
    }

    @Override
    public String getName()
    {
        return NAME;
    }
}
