package biz.ostw.bottex.org.opencorpora.importer.v0_92;

/**
 * @author mathter
 */
public enum POST
{
    NOUN,
    ADJF,
    ADJS,
    COMP,
    VERB,
    INFN,
    PRTF,
    PRTS,
    GRND,
    NUMR,
    ADVB,
    NPRO,
    PRED,
    PREP,
    CONJ,
    PRCL,
    INTJ;

    public static final POST get( String name )
    {
        for ( POST post : POST.values() )
        {
            if ( post.name().equals( name ) )
            {
                return post;
            }
        }

        throw new IllegalArgumentException( "'" + name + "' is not valid!" );
    }
}
