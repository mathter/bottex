package tech.bottex.org.opencorpora.importer.v0_92;

import java.lang.reflect.Field;

/**
 * @author mathter
 */
class FieldSetter extends Item
{
    private final Object object;

    private final Field field;

    public FieldSetter( Object object, String fieldName )
    {
        this.object = object;

        try
        {
            this.field = object.getClass().getDeclaredField( fieldName );
        } catch ( NoSuchFieldException | SecurityException e )
        {
            throw new RuntimeException( e );
        }
    }

    public < T > void set( T value )
    {
        try
        {
            this.field.set( this.object, value );
        } catch ( IllegalArgumentException | IllegalAccessException e )
        {
            throw new RuntimeException( e );
        }
    }
}
