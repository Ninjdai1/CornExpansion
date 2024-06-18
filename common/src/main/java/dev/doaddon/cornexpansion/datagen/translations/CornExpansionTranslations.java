package dev.doaddon.cornexpansion.datagen.translations;

import dev.doaddon.cornexpansion.CornExpansion;
import dev.doaddon.cornexpansion.datagen.advancements.CornExpansionAdvancements;
import dev.doaddon.cornexpansion.registry.CornExpansionBlocks;
import dev.doaddon.cornexpansion.registry.CornExpansionCreativeTabs;
import dev.doaddon.cornexpansion.registry.CornExpansionObjects;
import dev.doaddon.cornexpansion.registry.CornExpansionTags;
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
        tb.add(CornExpansionObjects.CANDIED_POPCORN.get(), "Candied Popcorn");
        tb.add(CornExpansionObjects.CORN_ON_THE_COB.get(), "Corn On The Cob");

        // Blocks
        tb.add(CornExpansionBlocks.POPCORN_TIN_BLOCK.get(), "Popcorn Tin");
        tb.add(CornExpansionBlocks.SWEET_POPCORN_TIN_BLOCK.get(), "Sweet Popcorn Tin");
        tb.add(CornExpansionBlocks.BUTTERY_POPCORN_TIN_BLOCK.get(), "Buttery Popcorn Tin");
        tb.add(CornExpansionBlocks.CHEESY_POPCORN_TIN_BLOCK.get(), "Cheesy Popcorn Tin");
        tb.add(CornExpansionBlocks.CANDIED_POPCORN_TIN_BLOCK.get(), "Candied Popcorn Tin");

        // Tags
        tb.add("tags." + CornExpansionTags.BUTTER.location().toLanguageKey(), "Butter");
        tb.add("tags." + CornExpansionTags.CHEESE.location().toLanguageKey(), "Cheese");

        // Creative tab
        tb.add(CornExpansionCreativeTabs.CORNEXPANSION_TAB.getKey(), "Corn Expansion");

        // Advancements
        tb.add("advancements." + CornExpansionAdvancements.ROOT_ADVANCEMENT.getId().toLanguageKey() + ".title", "Fun is Just Around the CORNer");
        tb.add("advancements." + CornExpansionAdvancements.ROOT_ADVANCEMENT.getId().toLanguageKey() + ".description", "Thanks for downloading Corn Expansion !");
        tb.add("advancements." + CornExpansionAdvancements.GET_POPCORN_ADVANCEMENT.getId().toLanguageKey() + ".title", "Always go out With A \"Pop\"");
        tb.add("advancements." + CornExpansionAdvancements.GET_POPCORN_ADVANCEMENT.getId().toLanguageKey() + ".description", "Make Popcorn by cooking Corn Kernels");
        tb.add("advancements." + CornExpansionAdvancements.GET_EVERY_POPCORN_ADVANCEMENT.getId().toLanguageKey() + ".title", "Now you're Popping Off !");
        tb.add("advancements." + CornExpansionAdvancements.GET_EVERY_POPCORN_ADVANCEMENT.getId().toLanguageKey() + ".description", "Craft all five types of Popcorn");
    }
}