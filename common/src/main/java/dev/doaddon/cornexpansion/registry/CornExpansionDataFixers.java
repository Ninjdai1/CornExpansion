package dev.doaddon.cornexpansion.registry;

import de.cristelknight.doapi.common.util.datafixer.DataFixers;
import de.cristelknight.doapi.common.util.datafixer.StringPairs;
import dev.doaddon.cornexpansion.CornExpansion;

public class CornExpansionDataFixers {
    public static void init() {
        StringPairs p = DataFixers.getOrCreate(CornExpansion.MOD_ID);
        p.add("grilled_corn", "grilled_corn_on_the_cob");
    }
}
