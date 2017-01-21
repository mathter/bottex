package tech.bottex.morphological;

import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 * @author mathter
 */
public class Dump
{
    public static String toString( MorphLexeme morphLexeme )
    {
        return toString( morphLexeme, Locale.getDefault() );
    }

    public static String toString( MorphLexeme morphLexeme, Locale locale )
    {
        StringBuilder sb = new StringBuilder();

        sb.append( "----- start lexeme -----" );
        sb.append( '\n' );
        sb.append( morphLexeme.getNormalized() );
        sb.append( '\n' );
        sb.append( "------------------------" );
        sb.append( '\n' );
        morphLexeme.getMorphFlags().stream().forEach( f -> sb.append( toString( f, locale ) ).append( '\n' ) );

        sb.append( "------ end lexeme ------" );
        sb.append( '\n' );

        return sb.toString();
    }

    public static String toString( MorphFlag flag )
    {
        return toString( flag, Locale.getDefault() );
    }

    public static String toString( MorphFlag flag, Locale locale )
    {
        ResourceBundle resourceBundle;
        Class< ? > clazz = flag.getClass();
        String bundleName = clazz.getCanonicalName();

        try
        {
            resourceBundle = ResourceBundle.getBundle( bundleName, locale );
            return resourceBundle.getString( flag.toString() );
        } catch ( MissingResourceException e )
        {
            return null;
        }
    }
}
