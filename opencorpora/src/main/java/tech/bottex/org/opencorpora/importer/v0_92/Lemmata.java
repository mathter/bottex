package tech.bottex.org.opencorpora.importer.v0_92;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mathter
 */
class Lemmata implements Item
{
    private static final long serialVersionUID = -6747028050916345080L;

    final List< Lemma > lemmas = new ArrayList<>();

    @Override
    public String toString()
    {
        return "Lemmata []";
    }
}
