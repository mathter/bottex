package tech.bottex.morphological.russian;

import tech.bottex.morphological.MorphFlag;

/**
 * Категория падежа
 * @author mathter
 */
public enum CAse implements MorphFlag
{
    /**
     * Именительный падеж
     */
    NOMN,
    /**
     * Родительный падеж
     */
    GENT,
    /**
     * Дательный падеж
     */
    DATV,
    /**
     * Винительный падеж
     */
    ACCS,
    /**
     * Творительный падеж
     */
    ABLT,
    /**
     * Предложный падеж
     */
    LOCT,
    /**
     * Звательный падеж
     */
    VOCT
}
