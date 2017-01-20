package tech.bottex.morphological.russian;

import tech.bottex.morphological.MorphFlag;

/**
 * Общая категория
 * @author mathter
 */
public enum COMMON implements MorphFlag
{
    /**
     * Аббревиатура
     */
    ABBR,
    /**
     * Имя
     */
    NAME,
    /**
     * Фамилия
     */
    SURN,
    /**
     * Отчество
     */
    PATR,
    /**
     * Топоним
     */
    GEOX,
    /**
     * Организация
     */
    ORGN,
    /**
     * Торговая марка
     */
    TRAD,
    /**
     * Возможна субстантивация
     */
    SUBX,
    /**
     * Превосходная степень
     */
    SUBR,
    /**
     * Качетсвенное
     */
    QUAL,
    /**
     * Местоименное
     */
    APRO,
    /**
     * Порядковое
     */
    ANUM,
    /**
     * Притяжательное
     */
    POSS,
    /**
     * Безличный
     */
    IMPE,
    /**
     * Возможно безличное употребление
     */
    IMPX,
    /**
     * Многократный
     */
    MULT,
    /**
     * Возвратный
     */
    REFL,

}
