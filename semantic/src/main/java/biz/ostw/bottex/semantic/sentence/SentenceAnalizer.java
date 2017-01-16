package biz.ostw.bottex.semantic.sentence;

import biz.ostw.bottex.lexical.LexicalAnalizer;
import biz.ostw.bottex.morphological.LexemeAnalizer;

/**
 * @author mathter
 */
public interface SentenceAnalizer
{
    public DependencyTree build( LexicalAnalizer lexicalAnalizer, LexemeAnalizer lexemeAnalizer );
}
