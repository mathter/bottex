package biz.ostw.bottex.org.opencorpora.morphological;

import java.util.ArrayList;
import java.util.List;

import biz.ostw.bottex.lexical.Lexeme;
import biz.ostw.bottex.lexical.Type;
import biz.ostw.bottex.morphological.MorphFlag;
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
    public List< MorphLexeme > analize( final Lexeme lexeme )
    {
        List< MorphLexeme > result = new ArrayList<>();

        if ( lexeme != null )
        {
            if ( Type.WORD == lexeme.getType() )
            {
                this.lemmas.stream().filter( l -> {

                    return l.text.equals( lexeme.toString() ) || l.forms.stream().anyMatch( f -> f.equals( lexeme.toString() ) );
                } ).forEach( l -> {

                    MorphLexemeImpl morphLexeme = new MorphLexemeImpl( lexeme.getType(), lexeme.asCharArray(), build( l.post ) );
                    morphLexeme.normalized = l.text;

                    result.add( morphLexeme );
                } );
            } else
            {
                MorphLexemeImpl morphLexeme = new MorphLexemeImpl( lexeme.getType(), lexeme.asCharArray(), build() );

                result.add( morphLexeme );
            }
        }

        return result;
    }

    private static List< MorphFlag > build( MorphFlag ... flags )
    {
        List< MorphFlag > list = new ArrayList<>( 3 );

        if ( flags != null )
        {
            for ( MorphFlag flag : flags )
            {
                list.add( flag );
            }
        }

        return list;
    }
}
