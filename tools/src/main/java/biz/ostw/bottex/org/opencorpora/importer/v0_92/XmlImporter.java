package biz.ostw.bottex.org.opencorpora.importer.v0_92;

import java.io.FileInputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;

public class XmlImporter
{
    public static void main( String[] args ) throws Throwable
    {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document d = db.parse( new FileInputStream( args[ 0 ] ) );

        System.out.println( Runtime.getRuntime().freeMemory() );
    }
}
