package tech.bottex.org.opencorpora.importer.v0_92;

import java.util.ArrayList;
import java.util.List;

import tech.bottex.morphological.MorphFlag;

/**
 * @author mathter
 */
public class Lemma extends Item
{
    private static final long serialVersionUID = 1368654081679443156L;

    int id;

    int rev;

    public List< MorphFlag > morphFlags = new ArrayList<>( 3 );

    public String text;

    public final List< String > forms = new ArrayList<>();

    @Override
    public String toString()
    {
        return "Lemma []";
    }
}
