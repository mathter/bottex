package biz.ostw.bottex.lexical;

import java.util.Arrays;

public class LexemeImpl implements Lexeme
{
    private final char[] buf;

    public LexemeImpl( char[] buf )
    {
        if ( buf == null )
        {
            throw new NullPointerException();
        }

        this.buf = buf;
    }

    @Override
    public int length()
    {
        return this.buf.length;
    }

    @Override
    public char charAt( int index )
    {
        return this.buf[ index ];
    }

    @Override
    public CharSequence subSequence( int start, int end )
    {
        return new String( this.buf, start, end );
    }

    @Override
    public String toString()
    {
        return new String( this.buf );
    }
}
