package biz.ostw.bottex.org.opencorpora.importer.v0_92;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/**
 * @author mathter
 */
public class XmlImporter
{
    public static void main( String[] args ) throws Throwable
    {
        new XmlImporter().performImport( new FileInputStream( args[0] ), new FileOutputStream( args[1] ) );
    }

    public void performImport( InputStream is, OutputStream os ) throws ParserConfigurationException, SAXException, IOException
    {
        SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
        SAXParser parser = saxParserFactory.newSAXParser();

        InputSource inputSource = new InputSource( is );
        ContextHandler contextHandler = new ContextHandler();

        parser.parse( inputSource, contextHandler );

        ObjectOutput oo = new ObjectOutputStream( os );

        oo.writeObject( contextHandler.getDictionary().lemmata.lemmas );

        oo.close();
    }
}
