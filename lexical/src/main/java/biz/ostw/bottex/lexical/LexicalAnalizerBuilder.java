package biz.ostw.bottex.lexical;

import java.io.Reader;
import java.util.Map;

/**
 * @author mathter
 */
public interface LexicalAnalizerBuilder
{
    public LexicalAnalizer build( Reader reader, Map< String, Object > properties );
}
