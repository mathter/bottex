package biz.ostw.bottex.lexical.common;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.io.Reader;

import org.junit.Assert;
import org.junit.Test;

import biz.ostw.bottex.lexical.CommonLexicalProviderFactory;
import biz.ostw.bottex.lexical.Lexeme;
import biz.ostw.bottex.lexical.LexicalAnalizer;
import biz.ostw.bottex.lexical.LexicalAnalizerBuilder;
import biz.ostw.bottex.lexical.LexicalAnalizerProvider;

/**
 * @author mathter
 */
public class LexicalAnalizerTest
{
    @Test
    public void testCreation() throws IOException
    {
        LexicalAnalizerProvider lexicalAnalizerProvider = new CommonLexicalProviderFactory().newInstance( "RuLexicalAnalizer" );

        Assert.assertNotNull( lexicalAnalizerProvider );
        Assert.assertEquals( lexicalAnalizerProvider.getClass(), biz.ostw.bottex.lexical.common.LexicalAnalizerProvider.class );

        LexicalAnalizerBuilder lexicalAnalizerBuilder = lexicalAnalizerProvider.getBuilder();
        Reader reader = new InputStreamReader( LexicalAnalizerTest.class.getResourceAsStream( "testtext.txt" ) );
        LexicalAnalizer analizer = lexicalAnalizerBuilder.build( reader, null );
        LineNumberReader lineNumberReader = new LineNumberReader(
            new InputStreamReader( LexicalAnalizerTest.class.getResourceAsStream( "testtext_answer.txt" ) ) );

        String line;

        while ( ( line = lineNumberReader.readLine() ) != null )
        {
            Lexeme lexeme = analizer.next();
            Assert.assertEquals( line, lexeme.toString() );
        }
    }
}
