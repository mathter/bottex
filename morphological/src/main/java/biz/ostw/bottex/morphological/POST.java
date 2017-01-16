package biz.ostw.bottex.morphological;

/**
 * @author mathter
 */
public enum POST implements MorphFlag
{
    /**
     * Имя существительное
     */
    NOUN,
    /**
     * Имя прилагательное (полное)
     */
    ADJF,
    /**
     * Имя прилагательное (краткое)
     */
    ADJS,
    /**
     * Компаратив
     */
    COMP,
    /**
     * Глагол (личная форма)
     */
    VERB,
    /**
     * Глагол (инфинитив)
     */
    INFN,
    /**
     * Причастие (полное)
     */
    PRTF,
    /**
     * Причастие (краткое)
     */
    PRTS,
    /**
     * Деепричастие
     */
    GRND,
    /**
     * числительное
     */
    NUMR,
    /**
     * Наречие
     */
    ADVB,
    /**
     * Местоимение-существительное
     */
    NPRO,
    /**
     * Предикатив
     */
    PRED,
    /**
     * Предлог
     */
    PREP,
    /**
     * Союз
     */
    CONJ,
    /**
     * Частица
     */
    PRCL,
    /**
     * Междометие
     */
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
