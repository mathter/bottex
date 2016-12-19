package biz.ostw.bottex.org.opencorpora.importer.v0_92;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.InputSource;

/**
 * @author mathter
 */
public class XmlImporter2
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

        List< Lemma > tmp = new ArrayList<>();
        Collections.sort( tmp, new Comparator< Lemma >()
        {
            @Override
            public int compare( Lemma o1, Lemma o2 )
            {
                return o1.text.compareTo( o2.text );
            }
        } );

        contextHandler.getDictionary().lemmata.lemmas.stream().limit( 100 ).forEach( tmp::add );;

        oo.writeObject( tmp );
        
        oo.close();
    }
}
