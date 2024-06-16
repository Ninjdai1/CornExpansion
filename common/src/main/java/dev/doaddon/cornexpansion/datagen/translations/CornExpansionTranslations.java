package dev.doaddon.cornexpansion.datagen.translations;

import dev.doaddon.cornexpansion.registry.CornExpansionBlocks;
import dev.doaddon.cornexpansion.registry.CornExpansionCreativeTabs;
import dev.doaddon.cornexpansion.registry.CornExpansionObjects;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class CornExpansionTranslations extends FabricLanguageProvider {
    public CornExpansionTranslations(FabricDataOutput output) {
        super(output, "en_us");
    }

    @Override
    public void generateTranslations(TranslationBuilder tb) {
        // Items
        tb.add(CornExpansionObjects.POPCORN.get(), "Popcorn");
        tb.add(CornExpansionObjects.SWEET_POPCORN.get(), "Sweet Popcorn");
        tb.add(CornExpansionObjects.BUTTERY_POPCORN.get(), "Buttery Popcorn");
        tb.add(CornExpansionObjects.CHEESY_POPCORN.get(), "Cheesy Popcorn");
        tb.add(CornExpansionObjects.CORN_ON_THE_COB.get(), "Corn On The Cob");

        tb.add(CornExpansionObjects.POPCORN_TIN.get(), "Popcorn Tin");
        tb.add(CornExpansionObjects.SWEET_POPCORN_TIN.get(), "Sweet Popcorn Tin");
        tb.add(CornExpansionObjects.BUTTERY_POPCORN_TIN.get(), "Buttery Popcorn Tin");
        tb.add(CornExpansionObjects.CHEESY_POPCORN_TIN.get(), "Cheesy Popcorn Tin");

        // Blocks
        tb.add(CornExpansionBlocks.POPCORN_TIN_BLOCK.get(), "Popcorn Tin");
        tb.add(CornExpansionBlocks.SWEET_POPCORN_TIN_BLOCK.get(), "Sweet Popcorn Tin");
        tb.add(CornExpansionBlocks.BUTTERY_POPCORN_TIN_BLOCK.get(), "Buttery Popcorn Tin");
        tb.add(CornExpansionBlocks.CHEESY_POPCORN_TIN_BLOCK.get(), "Cheesy Popcorn Tin");

        //Creative tab
        tb.add(CornExpansionCreativeTabs.CORNEXPANSION_TAB.getKey(), "Corn Expansion");
    }
}