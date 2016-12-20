package biz.ostw.bottex.lexical;

import java.io.Serializable;

/**
 * @author mathter
 */
public interface Lexeme extends CharSequence, Serializable
{
    public Type getType();

    public char[] asCharArray();
}
