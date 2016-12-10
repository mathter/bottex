package biz.ostw.bottex.lexical;

import java.io.IOException;

/**
 * @author mathter
 */
public interface LexicalAnalizer
{
    public Lexeme next() throws IOException;
}
