package biz.ostw.bottex.lexical.simple;

import java.io.InputStreamReader;
import java.io.LineNumberReader;

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
    public void testLexemeText() throws Exception
    {
        LexicalAnalizerProvider lexicalAnalizerProvider = new CommonLexicalProviderFactory().newInstance( "SimpleAnalizerProvider" );
        LexicalAnalizerBuilder lexicalAnalizerBuilder = lexicalAnalizerProvider.getBuilder();
        LexicalAnalizer lexicalAnalizer = lexicalAnalizerBuilder
            .build( new InputStreamReader( LexicalAnalizerTest.class.getResourceAsStream( "test.txt" ) ), null );

        LineNumberReader reader = new LineNumberReader(
            new InputStreamReader( LexicalAnalizerTest.class.getResourceAsStream( "etalon.txt" ) ) );

        String line;

        while ( ( line = reader.readLine() ) != null )
        {
            Lexeme lexeme = lexicalAnalizer.next();
            Assert.assertEquals( line, lexeme.toString() );
        }
    }
}
