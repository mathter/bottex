package biz.ostw.bottex.lexical.common;

import biz.ostw.bottex.lexical.LexicalAnalizerBuilder;

/**
 * @author mathter
 */
public class LexicalAnalizerProvider implements biz.ostw.bottex.lexical.LexicalAnalizerProvider
{
    private static final String NAME = "RuLexicalAnalizer";

    public LexicalAnalizerBuilder getBuilder( )
    {
        return new biz.ostw.bottex.lexical.common.LexicalAnalizerBuilder();
    }

    @Override
    public String getName()
    {
        return NAME;
    }
}
