package biz.ostw.bottex.lexical;

/**
 * @author mathter
 */
public interface LexicalAnalizerProvider
{
    public LexicalAnalizerBuilder getBuilder( );

    public String getName();
}
