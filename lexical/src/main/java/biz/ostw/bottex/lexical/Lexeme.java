package biz.ostw.bottex.lexical;

/**
 * @author mathter
 */
public interface Lexeme extends CharSequence
{
    public Type getType();

    public char[] asCharArray();
}
