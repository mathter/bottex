package biz.ostw.bottex.lexical.common;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import biz.ostw.bottex.lexical.Lexeme;
import biz.ostw.bottex.lexical.LexemeImpl;

/**
 * @author mathter
 */
class LexicalAnalizer implements biz.ostw.bottex.lexical.LexicalAnalizer
{
    private final BufferedReader reader;

    private final char[] delimeterChars;

    private final char[] stopChars;

    private final List< Character > buffer;

    LexicalAnalizer( Reader reader, char[] delimiterChars, char[] stopChars )
    {
        this.reader = new BufferedReader( reader );
        this.delimeterChars = delimiterChars;
        this.stopChars = stopChars;
        this.buffer = new ArrayList<>();
    }

    public Lexeme next() throws IOException
    {
        char ch;
        int code;
        this.buffer.clear();

        while ( ( code = this.reader.read() ) != -1 )
        {

            ch = (char) code;
            if ( Arrays.binarySearch( this.delimeterChars, ch ) < 0 )
            {
                this.buffer.add( ch );
            } else
            {
                if ( this.buffer.size() > 0 )
                {
                    break;
                } else
                {
                    continue;
                }
            }
        }

        if ( this.buffer.size() > 0 )
        {

            char[] tmp = new char[ this.buffer.size() ];
            for ( int i = 0; i < tmp.length; i ++ )
            {
                tmp[ i ] = this.buffer.get( i );
            }

            return new LexemeImpl( tmp );
        } else
        {

            return null;
        }
    }
}
