package biz.ostw.bottex.lexical;

public class LexemeImpl implements Lexeme
{
    private final char[] buf;

    private final Type type;

    public LexemeImpl( Type type, char[] buf )
    {
        if ( type == null || buf == null )
        {
            throw new NullPointerException();
        }

        this.buf = buf;
        this.type = type;
    }

    @Override
    public char[] asCharArray()
    {
        return this.buf;
    }

    @Override
    public Type getType()
    {
        return this.type;
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
