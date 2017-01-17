package tech.bottex.lexical.simple;

import tech.bottex.lexical.Type;
import tech.bottex.lexical.simple.simple;

/**
 * @author mathter
 */
final class Translator
{
    public static Type translate( int type )
    {
        Type result;

        switch ( type )
        {
        case simple.WORD:
            result = Type.WORD;
            break;

        case simple.NUMBER:
            result = Type.NUMBER;
            break;

        case simple.HEX_21:
            result = Type.HEX_21;
            break;

        case simple.HEX_22:
            result = Type.HEX_22;
            break;

        case simple.HEX_23:
            result = Type.HEX_23;
            break;

        case simple.HEX_24:
            result = Type.HEX_24;
            break;

        case simple.HEX_25:
            result = Type.HEX_25;
            break;

        case simple.HEX_26:
            result = Type.HEX_26;
            break;

        case simple.HEX_27:
            result = Type.HEX_27;
            break;

        case simple.HEX_28:
            result = Type.HEX_28;
            break;

        case simple.HEX_29:
            result = Type.HEX_29;
            break;

        case simple.HEX_2A:
            result = Type.HEX_2A;
            break;

        case simple.HEX_2B:
            result = Type.HEX_2B;
            break;

        case simple.HEX_2C:
            result = Type.HEX_2C;
            break;

        case simple.HEX_2D:
            result = Type.HEX_2D;
            break;

        case simple.HEX_2E:
            result = Type.HEX_2E;
            break;

        case simple.HEX_2F:
            result = Type.HEX_2F;
            break;

        case simple.HEX_3A:
            result = Type.HEX_3A;
            break;

        case simple.HEX_3B:
            result = Type.HEX_3B;
            break;

        case simple.HEX_3C:
            result = Type.HEX_3C;
            break;

        case simple.HEX_3D:
            result = Type.HEX_3D;
            break;

        case simple.HEX_3E:
            result = Type.HEX_3E;
            break;

        case simple.HEX_3F:
            result = Type.HEX_3F;
            break;

        case simple.HEX_40:
            result = Type.HEX_40;
            break;

        case simple.HEX_5B:
            result = Type.HEX_5B;
            break;

        case simple.HEX_5C:
            result = Type.HEX_5C;
            break;

        case simple.HEX_5D:
            result = Type.HEX_5D;
            break;

        case simple.HEX_5E:
            result = Type.HEX_5E;
            break;

        case simple.HEX_5F:
            result = Type.HEX_5F;
            break;

        default:
            result = Type.UNKNOWN;
            break;
        }

        return result;
    }

    private Translator()
    {
    }
}
