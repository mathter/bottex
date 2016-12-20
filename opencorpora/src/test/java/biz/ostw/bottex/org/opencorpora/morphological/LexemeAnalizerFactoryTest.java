package biz.ostw.bottex.org.opencorpora.morphological;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.Collections;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import biz.ostw.bottex.lexical.CommonLexicalProviderFactory;
import biz.ostw.bottex.lexical.LexicalAnalizer;
import biz.ostw.bottex.morphological.LexemeAnalizer;
import biz.ostw.bottex.morphological.LexemeAnalizerFactory;
import biz.ostw.bottex.morphological.LexemeAnalizerFactoryService;
import biz.ostw.bottex.org.opencorpora.importer.v0_92.XmlImporter;

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

        lexicalAnalizer.streem().forEach( l -> System.out.println( lexemeAnalizer.analize( l ) ) );
    }
}
