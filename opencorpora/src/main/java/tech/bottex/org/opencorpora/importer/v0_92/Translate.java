package tech.bottex.org.opencorpora.importer.v0_92;

import java.util.Map;
import java.util.TreeMap;

import tech.bottex.morphological.MorphFlag;
import tech.bottex.morphological.russian.ANim;
import tech.bottex.morphological.russian.ASpc;
import tech.bottex.morphological.russian.CAse;
import tech.bottex.morphological.russian.COMMON;
import tech.bottex.morphological.russian.GNdr;
import tech.bottex.morphological.russian.MOod;
import tech.bottex.morphological.russian.NMbr;
import tech.bottex.morphological.russian.PErs;
import tech.bottex.morphological.russian.POST;
import tech.bottex.morphological.russian.TEns;
import tech.bottex.morphological.russian.TRns;
import tech.bottex.morphological.russian.VOic;

/**
 * @author mathter
 */
class Translate
{
    private final Map< String, MorphFlag > flagMappings = new TreeMap<>();

    public MorphFlag toMorphFlag( String value )
    {
        MorphFlag flag = flagMappings.get( value );

        return flag;
    }

    static
    {

    }

    public Translate()
    {
        this.flagMappings.put( "anim", ANim.ANIM );
        this.flagMappings.put( "inan", ANim.INAN );

        this.flagMappings.put( "impf", ASpc.IMPF );
        this.flagMappings.put( "perf", ASpc.PERF );

        this.flagMappings.put( "nomn", CAse.NOMN );
        this.flagMappings.put( "gent", CAse.GENT );
        this.flagMappings.put( "gen1", CAse.GENT );
        this.flagMappings.put( "gen2", CAse.GENT );
        this.flagMappings.put( "datv", CAse.DATV );
        this.flagMappings.put( "accs", CAse.ACCS );
        this.flagMappings.put( "acc2", CAse.ACCS );
        this.flagMappings.put( "ablt", CAse.ABLT );
        this.flagMappings.put( "loct", CAse.LOCT );
        this.flagMappings.put( "loc1", CAse.LOCT );
        this.flagMappings.put( "loc2", CAse.LOCT );
        this.flagMappings.put( "voct", CAse.VOCT );

        this.flagMappings.put( "Abbr", COMMON.ABBR );
        this.flagMappings.put( "Name", COMMON.NAME );
        this.flagMappings.put( "Surn", COMMON.SURN );
        this.flagMappings.put( "Patr", COMMON.PATR );
        this.flagMappings.put( "Geox", COMMON.GEOX );
        this.flagMappings.put( "Orgn", COMMON.ORGN );
        this.flagMappings.put( "Trad", COMMON.TRAD );
        this.flagMappings.put( "Subx", COMMON.SUBX );
        this.flagMappings.put( "Subr", COMMON.SUBR );
        this.flagMappings.put( "Qual", COMMON.QUAL );
        this.flagMappings.put( "Apro", COMMON.APRO );
        this.flagMappings.put( "Anum", COMMON.ANUM );
        this.flagMappings.put( "Poss", COMMON.POSS );
        this.flagMappings.put( "Impe", COMMON.IMPE );
        this.flagMappings.put( "Impx", COMMON.IMPX );
        this.flagMappings.put( "Mult", COMMON.MULT );
        this.flagMappings.put( "Refl", COMMON.REFL );

        this.flagMappings.put( "masc", GNdr.MASC );
        this.flagMappings.put( "femn", GNdr.FEMN );
        this.flagMappings.put( "neut", GNdr.NEUT );

        this.flagMappings.put( "indc", MOod.INDC );
        this.flagMappings.put( "impr", MOod.IMPR );

        this.flagMappings.put( "sing", NMbr.SING );
        this.flagMappings.put( "plur", NMbr.PLUR );

        this.flagMappings.put( "1per", PErs.PER1 );
        this.flagMappings.put( "2per", PErs.PER2 );
        this.flagMappings.put( "3per", PErs.PER3 );

        this.flagMappings.put( "NOUN", POST.NOUN );
        this.flagMappings.put( "ADJF", POST.ADJF );
        this.flagMappings.put( "ADJS", POST.ADJS );
        this.flagMappings.put( "COMP", POST.COMP );
        this.flagMappings.put( "VERB", POST.VERB );
        this.flagMappings.put( "INFN", POST.INFN );
        this.flagMappings.put( "PRTF", POST.PRTF );
        this.flagMappings.put( "PRTS", POST.PRTS );
        this.flagMappings.put( "GRND", POST.GRND );
        this.flagMappings.put( "NUMR", POST.NUMR );
        this.flagMappings.put( "ADVB", POST.ADVB );
        this.flagMappings.put( "NPRO", POST.NPRO );
        this.flagMappings.put( "PRED", POST.PRED );
        this.flagMappings.put( "PREP", POST.PREP );
        this.flagMappings.put( "CONJ", POST.CONJ );
        this.flagMappings.put( "PRCL", POST.PRCL );
        this.flagMappings.put( "INTJ", POST.INTJ );

        this.flagMappings.put( "pres", TEns.PRES );
        this.flagMappings.put( "past", TEns.PAST );
        this.flagMappings.put( "futr", TEns.FUTR );

        this.flagMappings.put( "tran", TRns.TRAN );
        this.flagMappings.put( "intr", TRns.INTR );

        this.flagMappings.put( "actv", VOic.ACTV );
        this.flagMappings.put( "pssv", VOic.PSSV );
    }
}
