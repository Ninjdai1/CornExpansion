package dev.doaddon.cornexpansion.datagen.translations;

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

        tb.add(CornExpansionObjects.CORN_DOUGH.get(), "Corn Dough");
        tb.add(CornExpansionObjects.CORN_FLOUR.get(), "Corn Flour");
        tb.add(CornExpansionObjects.DRIED_CORN.get(), "Dried Corn");
        tb.add(CornExpansionObjects.CORNMEAL.get(), "Cornmeal");
        tb.add(CornExpansionObjects.DRIED_KERNELS.get(), "Dried Kernels");

        tb.add(CornExpansionObjects.GRILLED_CORN.get(), "Grilled Corn");
        tb.add(CornExpansionObjects.GRANDMAS_CORNBREAD.get(), "Grandma's Cornbread");

        // Blocks
        tb.add(CornExpansionBlocks.POPCORN_TIN_BLOCK.get(), "Popcorn Tin");
        tb.add(CornExpansionBlocks.SWEET_POPCORN_TIN_BLOCK.get(), "Sweet Popcorn Tin");
        tb.add(CornExpansionBlocks.BUTTERY_POPCORN_TIN_BLOCK.get(), "Buttery Popcorn Tin");
        tb.add(CornExpansionBlocks.CHEESY_POPCORN_TIN_BLOCK.get(), "Cheesy Popcorn Tin");
        tb.add(CornExpansionBlocks.CANDIED_POPCORN_TIN_BLOCK.get(), "Candied Popcorn Tin");

        // Tags
        tb.add("tags." + CornExpansionTags.BUTTER.location().toLanguageKey(), "Butter");
        tb.add("tags." + CornExpansionTags.CHEESE.location().toLanguageKey(), "Cheese");
        tb.add("tags." + CornExpansionTags.CORN.location().toLanguageKey(), "Corn");
        tb.add("tags." + CornExpansionTags.DRIED_CORN.location().toLanguageKey(), "Dried Corn");
        tb.add("tags." + CornExpansionTags.CANDIED_INGREDIENT.location().toLanguageKey(), "Candied Ingredient");
        tb.add("tags." + CornExpansionTags.SWEET_INGREDIENT.location().toLanguageKey(), "Sweet Ingredient");

        // Creative tab
        tb.add(CornExpansionCreativeTabs.CORNEXPANSION_TAB.getKey(), "Corn Expansion");

        // Advancements
        tb.add("advancements." + CornExpansionAdvancements.ROOT_ADVANCEMENT.getId().toLanguageKey() + ".title", "Fun is Just Around the CORNer");
        tb.add("advancements." + CornExpansionAdvancements.ROOT_ADVANCEMENT.getId().toLanguageKey() + ".description", "Thanks for downloading Corn Expansion !");
        tb.add("advancements." + CornExpansionAdvancements.GET_POPCORN_ADVANCEMENT.getId().toLanguageKey() + ".title", "Always go out With A \"Pop\"");
        tb.add("advancements." + CornExpansionAdvancements.GET_POPCORN_ADVANCEMENT.getId().toLanguageKey() + ".description", "Make Popcorn by cooking Corn Kernels");
        tb.add("advancements." + CornExpansionAdvancements.GET_EVERY_POPCORN_VARIANT_ADVANCEMENT.getId().toLanguageKey() + ".title", "Now you're Popping Off !");
        tb.add("advancements." + CornExpansionAdvancements.GET_EVERY_POPCORN_VARIANT_ADVANCEMENT.getId().toLanguageKey() + ".description", "Craft all four variants of Popcorn");
    }
}