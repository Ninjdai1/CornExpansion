package dev.doaddon.cornexpansion.registry;

import net.minecraft.world.level.block.ComposterBlock;

public class CornExpansionCompostables {
    public static void init() {
        ComposterBlock.COMPOSTABLES.put(CornExpansionObjects.POPCORN.get(), .2f);
        ComposterBlock.COMPOSTABLES.put(CornExpansionObjects.SWEET_POPCORN.get(), .2f);
        ComposterBlock.COMPOSTABLES.put(CornExpansionObjects.BUTTERY_POPCORN.get(), .2f);
        ComposterBlock.COMPOSTABLES.put(CornExpansionObjects.CHEESY_POPCORN.get(), .2f);
        ComposterBlock.COMPOSTABLES.put(CornExpansionObjects.CANDIED_POPCORN.get(), .2f);

        ComposterBlock.COMPOSTABLES.put(CornExpansionObjects.POLENTA.get(), .2f);
        ComposterBlock.COMPOSTABLES.put(CornExpansionObjects.SWEET_POLENTA.get(), .2f);
        ComposterBlock.COMPOSTABLES.put(CornExpansionObjects.BUTTERY_POLENTA.get(), .2f);
        ComposterBlock.COMPOSTABLES.put(CornExpansionObjects.CHEESY_POLENTA.get(), .2f);

        ComposterBlock.COMPOSTABLES.put(CornExpansionObjects.CORN_ON_THE_COB.get(), .3f);
        ComposterBlock.COMPOSTABLES.put(CornExpansionObjects.GRILLED_CORN_ON_THE_COB.get(), .3f);
        ComposterBlock.COMPOSTABLES.put(CornExpansionObjects.DRIED_KERNELS.get(), .2f);

        ComposterBlock.COMPOSTABLES.put(CornExpansionObjects.CORN_DOUGH.get(), .3f);
        ComposterBlock.COMPOSTABLES.put(CornExpansionObjects.CORN_FLOUR.get(), .3f);
        ComposterBlock.COMPOSTABLES.put(CornExpansionObjects.DRIED_CORN.get(), .2f);
        ComposterBlock.COMPOSTABLES.put(CornExpansionObjects.CORNMEAL.get(), .3f);

        ComposterBlock.COMPOSTABLES.put(CornExpansionObjects.GRANDMAS_CORNBREAD.get(), .6f);
    }
}
