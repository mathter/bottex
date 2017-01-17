package tech.bottex.semantic.sentence;

import tech.bottex.lexical.LexicalAnalizer;
import tech.bottex.morphological.LexemeAnalizer;

/**
 * @author mathter
 */
public interface SentenceAnalizer
{
    public DependencyTree build( LexicalAnalizer lexicalAnalizer, LexemeAnalizer lexemeAnalizer );
}
