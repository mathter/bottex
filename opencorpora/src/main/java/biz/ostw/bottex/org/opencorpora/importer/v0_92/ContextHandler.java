package biz.ostw.bottex.org.opencorpora.importer.v0_92;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Set;
import java.util.TreeSet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.ext.DefaultHandler2;

import biz.ostw.bottex.morphological.POST;

/**
 * @author mathter
 */
final class ContextHandler extends DefaultHandler2
{
    private static final Logger LOGGER = LoggerFactory.getLogger( ContextHandler.class );

    private static final Set< String > POST;

    private static final String TAG_DICTIONARY = "dictionary";

    private static final String TAG_GRAMMEMES = "grammemes";

    private static final String TAG_GRAMMEME = "grammeme";

    private static final String TAG_NAME = "name";

    private static final String TAG_ALIAS = "alias";

    private static final String TAG_DESCRIPTION = "description";

    private static final String TAG_LEMMATA = "lemmata";

    private static final String TAG_LEMMA = "lemma";

    private static final String TAG_L = "l";

    private static final String TAG_F = "f";

    private static final String TAG_G = "g";

    private static final Item UNKNOWN = new UnknownItem();

    private Deque< Item > stack = new ArrayDeque<>();

    private Dictionary dictionary;

    @Override
    public void startDocument() throws SAXException
    {
        super.startDocument();

        LOGGER.info( "Start parsing ..." );
    }

    @Override
    public void endDocument() throws SAXException
    {
        super.endDocument();

        LOGGER.info( "Parsing completed." );
    }

    @Override
    public void startElement( String uri, String localName, String qName, Attributes attributes ) throws SAXException
    {
        LOGGER.debug( "Parsing '{}' element...", qName, attributes.getLength() );

        Item item;

        switch ( qName )
        {
        case TAG_DICTIONARY:
            item = this.dictionary = new Dictionary( attributes.getValue( "verstion" ), attributes.getValue( "revistion" ) );
            break;

        case TAG_GRAMMEMES:
            item = new Grammemes();
            ( (Dictionary) this.stack.peek() ).grammemes = (Grammemes) item;
            break;

        case TAG_GRAMMEME:
            item = new Grammem();
            Grammemes grammemes = (Grammemes) this.stack.peek();
            ( (Grammem) item ).parent = grammemes.getGrammem( attributes.getValue( "parent" ) );

            grammemes.grammems.add( (Grammem) item );
            break;

        case TAG_NAME:
            item = new FieldSetter( this.stack.peek(), TAG_NAME );
            break;

        case TAG_ALIAS:
            item = new FieldSetter( this.stack.peek(), TAG_ALIAS );
            break;

        case TAG_DESCRIPTION:
            item = new FieldSetter( this.stack.peek(), TAG_DESCRIPTION );
            break;

        case TAG_LEMMATA:
            item = new Lemmata();
            ( (Dictionary) this.stack.peek() ).lemmata = (Lemmata) item;
            break;

        case TAG_LEMMA:
            item = new Lemma();
            ( (Lemmata) this.stack.peek() ).lemmas.add( (Lemma) item );
            break;

        case TAG_L:
            ( (Lemma) this.stack.peek() ).text = attributes.getValue( "t" );
            item = new L( (Lemma) this.stack.peek() );
            break;

        case TAG_F:
            ( (Lemma) this.stack.peek() ).forms.add( attributes.getValue( "t" ) );
            item = new F( (Lemma) this.stack.peek() );
            break;

        case TAG_G:
            String v = attributes.getValue( "v" );

            if ( POST.contains( v ) )
            {
                ( (LF) this.stack.peek() ).lemma.post = biz.ostw.bottex.morphological.POST.get( v );
            }

            item = UNKNOWN;
            break;

        default:
            LOGGER.warn( "Skip '{}' element!", qName );
            item = UNKNOWN;
            break;
        }

        if ( item != null )
        {
            this.stack.push( item );
        }
    }

    @Override
    public void characters( char[] ch, int start, int length ) throws SAXException
    {
        Item prev = this.stack.peek();

        if ( prev instanceof FieldSetter )
        {
            String value = new String( ch, start, length );
            ( (FieldSetter) prev ).set( value );
        }
    }

    @Override
    public void endElement( String uri, String localName, String qName ) throws SAXException
    {
        this.stack.pop();
    }

    public Dictionary getDictionary()
    {
        return this.dictionary;
    }

    static
    {
        Set< String > tmp = new TreeSet<>();
        for ( POST post : biz.ostw.bottex.morphological.POST.values() )
        {
            tmp.add( post.name() );
        }

        POST = Collections.unmodifiableSet( tmp );
    }
}
