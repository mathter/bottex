package biz.ostw.bottex.org.opencorpora.importer.v0_92;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mathter
 */
class Lemma extends Item
{
    private static final long serialVersionUID = 1368654081679443156L;

    int id;

    int rev;

    POST post;

    String text;

    final List< String > forms = new ArrayList<>();
}
