package biz.ostw.bottex.org.opencorpora.importer.v0_92;

import java.util.ArrayList;
import java.util.List;

import biz.ostw.bottex.morphological.POST;

/**
 * @author mathter
 */
public class Lemma extends Item
{
    private static final long serialVersionUID = 1368654081679443156L;

    int id;

    int rev;

    POST post;

    public String text;

    public final List< String > forms = new ArrayList<>();
}
