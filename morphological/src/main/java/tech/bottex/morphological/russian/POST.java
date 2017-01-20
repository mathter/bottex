package tech.bottex.morphological.russian;

import tech.bottex.morphological.MorphFlag;

/**
 * Часть речи.
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
    INTJ
}
