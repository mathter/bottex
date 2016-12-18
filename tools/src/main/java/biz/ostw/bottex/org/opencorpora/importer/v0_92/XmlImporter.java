package biz.ostw.bottex.org.opencorpora.importer.v0_92;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.InputSource;

/**
 * @author mathter
 */
public class XmlImporter
{
    public static void main( String[] args ) throws Throwable
    {
        SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
        SAXParser parser = saxParserFactory.newSAXParser();

        FileInputStream is = new FileInputStream( args[ 0 ] );
        InputSource inputSource = new InputSource( is );
        ContextHandler contextHandler = new ContextHandler();

        parser.parse( inputSource, contextHandler );

        FileOutputStream os = new FileOutputStream( args[ 1 ] );
        ObjectOutput oo = new ObjectOutputStream( os );

        oo.writeObject( contextHandler.getDictionary() );
    }
}
