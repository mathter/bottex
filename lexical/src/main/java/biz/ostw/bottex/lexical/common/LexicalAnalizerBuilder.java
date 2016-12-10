package biz.ostw.bottex.lexical.common;

import java.io.Reader;
import java.util.Arrays;
import java.util.Map;

/**
 * @author mathter
 */
class LexicalAnalizerBuilder implements biz.ostw.bottex.lexical.LexicalAnalizerBuilder
{
    private static final char[] DEFAULT_DELIMITERS = new char[]
    {
        ' ', '\r', '\n', '\t'
    };

    private static final char[] DEFAULT_STOP_CHARS = new char[]
    {
        ',', '.', ':', ';', '/', '\\', '+', '-', '*', '(', ')', '#', '~', '!', '@', '#', '$', '%', '^', '&', '?'
    };

    @Override
    public biz.ostw.bottex.lexical.LexicalAnalizer build( Reader reader, Map< String, Object > properties )
    {
        return new LexicalAnalizer( reader, DEFAULT_DELIMITERS, DEFAULT_STOP_CHARS );
    }

    static
    {
        Arrays.sort( DEFAULT_DELIMITERS );
        Arrays.sort( DEFAULT_STOP_CHARS );
    }
}
