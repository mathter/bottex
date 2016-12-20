package biz.ostw.bottex.org.opencorpora.importer.v0_92;

/**
 * @author mathter
 */
public class Dictionary extends Item
{
    private static final long serialVersionUID = 2837730765786311143L;

    final String version;

    final String revision;

    Grammemes grammemes;

    Lemmata lemmata;

    Dictionary( String version, String revision )
    {
        this.version = version;
        this.revision = revision;
    }
}
