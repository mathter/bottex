package biz.ostw.bottex.lexical;

import java.util.Iterator;
import java.util.stream.Stream;

/**
 * @author mathter
 */
public interface LexicalAnalizer extends Iterator< Lexeme >
{
    public Stream< Lexeme > streem();
}
