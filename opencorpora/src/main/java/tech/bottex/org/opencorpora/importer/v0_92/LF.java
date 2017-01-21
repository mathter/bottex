package tech.bottex.org.opencorpora.importer.v0_92;

import java.util.ArrayList;
import java.util.List;

import tech.bottex.morphological.MorphFlag;

/**
 * @author mathter
 */
class LF implements Item
{
    private static final long serialVersionUID = 4211080501286762216L;

    public List< MorphFlag > morphFlags = new ArrayList<>( 2 );
}