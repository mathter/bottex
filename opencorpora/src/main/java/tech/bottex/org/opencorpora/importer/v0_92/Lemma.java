package tech.bottex.org.opencorpora.importer.v0_92;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mathter
 */
public class Lemma extends Form implements Item
{
    private static final long serialVersionUID = 1368654081679443156L;

    int id;

    int rev;

    public final List< Form > forms = new ArrayList<>( 10 );

    @Override
    public String toString()
    {
        return "Lemma []";
    }
}
