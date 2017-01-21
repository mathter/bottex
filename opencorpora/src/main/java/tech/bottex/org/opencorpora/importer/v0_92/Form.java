package tech.bottex.org.opencorpora.importer.v0_92;

import java.io.Serializable;

/**
 * @author mathter
 */
public class Form extends LF implements Serializable
{
    private static final long serialVersionUID = 8577050381932445330L;

    public String text;

    @Override
    public String toString()
    {
        return "Form []";
    }
}
