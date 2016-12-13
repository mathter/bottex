package biz.ostw.bottex.lexical;

/**
 * @author mathter
 */
public class LexicalExeption extends RuntimeException
{
    private static final long serialVersionUID = 3258832905679935183L;

    public LexicalExeption()
    {
        super();
    }

    public LexicalExeption( String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace )
    {
        super( message, cause, enableSuppression, writableStackTrace );
    }

    public LexicalExeption( String message, Throwable cause )
    {
        super( message, cause );
    }

    public LexicalExeption( String message )
    {
        super( message );
    }

    public LexicalExeption( Throwable cause )
    {
        super( cause );
    }
}
