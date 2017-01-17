package tech.bottex.lexical.simple;

import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import tech.bottex.lexical.CommonLexicalProviderFactory;
import tech.bottex.lexical.Lexeme;
import tech.bottex.lexical.LexicalAnalizer;
import tech.bottex.lexical.LexicalAnalizerBuilder;
import tech.bottex.lexical.LexicalAnalizerProvider;

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

    @Test
    public void testStreemText() throws Exception
    {
        LexicalAnalizerProvider lexicalAnalizerProvider = new CommonLexicalProviderFactory().newInstance( "SimpleAnalizerProvider" );
        LexicalAnalizerBuilder lexicalAnalizerBuilder = lexicalAnalizerProvider.getBuilder();
        LexicalAnalizer lexicalAnalizer = lexicalAnalizerBuilder
            .build( new InputStreamReader( LexicalAnalizerTest.class.getResourceAsStream( "test.txt" ) ), null );

        LineNumberReader reader = new LineNumberReader(
            new InputStreamReader( LexicalAnalizerTest.class.getResourceAsStream( "etalon.txt" ) ) );

        String line;
        List< String > lexemes = new ArrayList<>();
        lexicalAnalizer.streem().forEach( l -> lexemes.add( l.toString() ) );

        for ( int i = 0; ( line = reader.readLine() ) != null; i ++ )
        {
            Assert.assertEquals( line, lexemes.get( i ) );
        }
    }
}
