package tech.bottex.org.opencorpora.morphological;

import java.util.ArrayList;
import java.util.List;

import tech.bottex.lexical.Lexeme;
import tech.bottex.lexical.Type;
import tech.bottex.morphological.MorphLexeme;
import tech.bottex.org.opencorpora.importer.v0_92.Lemma;

/**
 * @author mathter
 */
class LexemeAnalizer implements tech.bottex.morphological.LexemeAnalizer
{
    private final List< Lemma > lemmas;

    public LexemeAnalizer( List< Lemma > lemmas )
    {
        this.lemmas = lemmas;
    }

    @Override
    public List< MorphLexeme > analize( final Lexeme lexeme )
    {
        List< MorphLexeme > result = new ArrayList<>();

        if ( lexeme != null )
        {
            if ( Type.WORD == lexeme.getType() )
            {
                this.lemmas.stream().filter( l -> {

                    return l.text.equals( lexeme.toString() ) || l.forms.stream().anyMatch( f -> f.text.equals( lexeme.toString() ) );
                } ).forEach( l -> {

                    MorphLexemeImpl morphLexeme = new MorphLexemeImpl( lexeme.getType(), lexeme.asCharArray(), l.morphFlags );
                    morphLexeme.normalized = l.text;

                    result.add( morphLexeme );
                } );
            } else
            {
                MorphLexemeImpl morphLexeme = new MorphLexemeImpl( lexeme.getType(), lexeme.asCharArray(), new ArrayList<>( 0 ) );
                morphLexeme.normalized = new String( lexeme.asCharArray() );

                result.add( morphLexeme );
            }
        }

        return result;
    }
}
