package tech.bottex.org.opencorpora.morphological;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.Collections;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import tech.bottex.lexical.CommonLexicalProviderFactory;
import tech.bottex.lexical.LexicalAnalizer;
import tech.bottex.morphological.Dump;
import tech.bottex.morphological.LexemeAnalizer;
import tech.bottex.morphological.LexemeAnalizerFactory;
import tech.bottex.morphological.LexemeAnalizerFactoryService;
import tech.bottex.org.opencorpora.importer.v0_92.XmlImporter;

/**
 * @author mathter
 */
public class LexemeAnalizerFactoryTest
{
    private static File DICT;

    @BeforeClass
    public static void init() throws Throwable
    {
        DICT = File.createTempFile( "test", ".bin" );
        DICT.deleteOnExit();

        new XmlImporter().performImport( LexemeAnalizerFactoryTest.class.getResourceAsStream( "test.dict.opencorpora.xml" ),
            new FileOutputStream( DICT ) );
    }

    @SuppressWarnings( "deprecation" )
    @Test
    public void testInitLexemeAnalizerFactory() throws Throwable
    {
        LexemeAnalizerFactory factory = new LexemeAnalizerFactoryService().newInstance( "opencorpora",
            Collections.singletonMap( "uri", DICT.toURL().toURI() ) );

        Assert.assertNotNull( factory );
    }

    @SuppressWarnings( "deprecation" )
    @Test
    public void testInitLexemeAnalizer() throws Throwable
    {
        LexemeAnalizerFactory factory = new LexemeAnalizerFactoryService().newInstance( "opencorpora",
            Collections.singletonMap( "uri", DICT.toURL().toURI() ) );

        Assert.assertNotNull( factory );

        LexemeAnalizer lexemeAnalizer = factory.newInstance();

        Assert.assertNotNull( lexemeAnalizer );

        LexicalAnalizer lexicalAnalizer = new CommonLexicalProviderFactory().newInstance( "SimpleAnalizerProvider" ).getBuilder()
            .build( new InputStreamReader( LexemeAnalizerFactoryTest.class.getResourceAsStream( "test.dict.opencorpora.txt" ) ), null );

        lexicalAnalizer.streem()
            .forEach( l -> lexemeAnalizer.analize( l ).stream().forEach( ml -> System.out.println( Dump.toString( ml ) ) ) );
    }
}
