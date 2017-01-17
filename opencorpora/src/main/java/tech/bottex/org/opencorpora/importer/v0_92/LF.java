package tech.bottex.org.opencorpora.importer.v0_92;

/**
 * @author mathter
 */
public abstract class LF extends Item
{
    private static final long serialVersionUID = -2339728789523292577L;
    
    protected Lemma lemma;

    public LF( Lemma lemma )
    {
        this.lemma = lemma;
    }
}