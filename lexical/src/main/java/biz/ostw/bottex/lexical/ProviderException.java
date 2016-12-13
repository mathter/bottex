package biz.ostw.bottex.lexical;

public class ProviderException extends LexicalExeption
{
    private static final long serialVersionUID = -8925857767081291306L;

    public ProviderException( String message, Throwable cause )
    {
        super( message, cause );
    }

    public ProviderException( Throwable cause )
    {
        super( cause );
    }
}
