package biz.ostw.bottex.lexical.common;

import org.junit.Assert;
import org.junit.Test;

import biz.ostw.bottex.lexical.CommonLexicalProviderFactory;
import biz.ostw.bottex.lexical.LexicalAnalizerBuilder;
import biz.ostw.bottex.lexical.LexicalAnalizerProvider;

/**
 * @author mathter
 */
public class LexicalAnalizerProviderTest
{
    @Test
    public void testCreation()
    {
        LexicalAnalizerProvider lexicalAnalizerProvider = new CommonLexicalProviderFactory().newInstance( "RuLexicalAnalizer" );

        Assert.assertNotNull( lexicalAnalizerProvider );
        Assert.assertEquals( lexicalAnalizerProvider.getClass(), biz.ostw.bottex.lexical.common.LexicalAnalizerProvider.class );

        LexicalAnalizerBuilder lexicalAnalizerBuilder = lexicalAnalizerProvider.getBuilder();

        Assert.assertNotNull( lexicalAnalizerBuilder );
        Assert.assertEquals( lexicalAnalizerBuilder.getClass(), biz.ostw.bottex.lexical.common.LexicalAnalizerBuilder.class );
    }
}
