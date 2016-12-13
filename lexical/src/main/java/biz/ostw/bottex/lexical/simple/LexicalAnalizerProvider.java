package biz.ostw.bottex.lexical.simple;

import biz.ostw.bottex.lexical.LexicalAnalizerBuilder;

/**
 * @author mathter
 */
public class LexicalAnalizerProvider implements biz.ostw.bottex.lexical.LexicalAnalizerProvider
{
    private static final String NAME = "SimpleAnalizerProvider";

    public LexicalAnalizerBuilder getBuilder( )
    {
        return new biz.ostw.bottex.lexical.simple.LexicalAnalizerBuilder();
    }

    @Override
    public String getName()
    {
        return NAME;
    }
}
