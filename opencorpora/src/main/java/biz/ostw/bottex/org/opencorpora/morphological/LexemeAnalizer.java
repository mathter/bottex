package biz.ostw.bottex.org.opencorpora.morphological;

import java.util.ArrayList;
import java.util.List;

import biz.ostw.bottex.lexical.Lexeme;
import biz.ostw.bottex.morphological.MorphLexeme;
import biz.ostw.bottex.org.opencorpora.importer.v0_92.Lemma;

/**
 * @author mathter
 */
class LexemeAnalizer implements biz.ostw.bottex.morphological.LexemeAnalizer
{
    private final List< Lemma > lemmas;

    public LexemeAnalizer( List< Lemma > lemmas )
    {
        this.lemmas = lemmas;
    }

    @Override
    public List< MorphLexeme > analize( Lexeme lexeme )
    {
        List< MorphLexeme > result = new ArrayList<>();

        if ( lexeme != null )
        {
            this.lemmas.stream().filter( l -> l.text.equals( String.valueOf( lexeme ) ) ).forEach( l -> {
                result.add( new MorphLexemeImpl( lexeme.getType(), lexeme.asCharArray() ) );
            } );;
        }

        return result;
    }
}
