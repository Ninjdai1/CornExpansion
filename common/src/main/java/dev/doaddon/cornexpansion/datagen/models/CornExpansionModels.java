package dev.doaddon.cornexpansion.datagen.models;

import dev.doaddon.cornexpansion.registry.CornExpansionObjects;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.models.BlockModelGenerators;
import net.minecraft.data.models.ItemModelGenerators;
import net.minecraft.data.models.model.ModelTemplates;

public class CornExpansionModels extends FabricModelProvider {
    public CornExpansionModels(FabricDataOutput generator) {
        super(generator);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerator) {
        itemModelGenerator.generateFlatItem(CornExpansionObjects.CORN_DOUGH.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(CornExpansionObjects.CORN_FLOUR.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(CornExpansionObjects.DRIED_CORN.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(CornExpansionObjects.CORNMEAL.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(CornExpansionObjects.CORN_SYRUP.get(), ModelTemplates.FLAT_ITEM);

        itemModelGenerator.generateFlatItem(CornExpansionObjects.DRIED_KERNELS.get(), ModelTemplates.FLAT_ITEM);

        itemModelGenerator.generateFlatItem(CornExpansionObjects.POPCORN.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(CornExpansionObjects.SWEET_POPCORN.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(CornExpansionObjects.BUTTERY_POPCORN.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(CornExpansionObjects.CHEESY_POPCORN.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(CornExpansionObjects.CANDIED_POPCORN.get(), ModelTemplates.FLAT_ITEM);

        itemModelGenerator.generateFlatItem(CornExpansionObjects.POLENTA.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(CornExpansionObjects.SWEET_POLENTA.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(CornExpansionObjects.BUTTERY_POLENTA.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(CornExpansionObjects.CHEESY_POLENTA.get(), ModelTemplates.FLAT_ITEM);

        itemModelGenerator.generateFlatItem(CornExpansionObjects.CORN_ON_THE_COB.get(), ModelTemplates.FLAT_ITEM);

        itemModelGenerator.generateFlatItem(CornExpansionObjects.POPCORN_TIN.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(CornExpansionObjects.SWEET_POPCORN_TIN.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(CornExpansionObjects.BUTTERY_POPCORN_TIN.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(CornExpansionObjects.CHEESY_POPCORN_TIN.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(CornExpansionObjects.CANDIED_POPCORN_TIN.get(), ModelTemplates.FLAT_ITEM);

        itemModelGenerator.generateFlatItem(CornExpansionObjects.GRILLED_CORN.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(CornExpansionObjects.GRANDMAS_CORNBREAD.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(CornExpansionObjects.CORN_SYRUP_COOKIE.get(), ModelTemplates.FLAT_ITEM);
    }
}