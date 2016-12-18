package biz.ostw.bottex.org.opencorpora.importer.v0_92;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mathter
 */
final class Grammemes extends Item
{
    private static final long serialVersionUID = -295157406560270085L;

    final List< Grammem > grammems = new ArrayList<>();

    public Grammem getGrammem( final String name )
    {
        return this.grammems.stream().filter( i -> name.equals( i.name ) ).findFirst().orElse( null );
    }
}
