package dev.doaddon.cornexpansion.datagen.translations;

import dev.doaddon.cornexpansion.datagen.advancements.CornExpansionAdvancements;
import dev.doaddon.cornexpansion.registry.CornExpansionCreativeTabs;
import dev.doaddon.cornexpansion.registry.CornExpansionObjects;
import dev.doaddon.cornexpansion.registry.CornExpansionTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class CornExpansionTranslations extends FabricLanguageProvider {
    public CornExpansionTranslations(FabricDataOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOutput, "en_us", registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider provider, TranslationBuilder tb) {
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
        tb.add(CornExpansionObjects.CORN_SYRUP.get(), "Corn Syrup");

        tb.add(CornExpansionObjects.GRILLED_CORN.get(), "Grilled Corn");
        tb.add(CornExpansionObjects.GRANDMAS_CORNBREAD.get(), "Grandma's Cornbread");
        tb.add(CornExpansionObjects.CORN_SYRUP_COOKIE.get(), "Corn Syrup Cookie");

        tb.add(CornExpansionObjects.POLENTA.get(), "Polenta");
        tb.add(CornExpansionObjects.SWEET_POLENTA.get(), "Sweet Polenta");
        tb.add(CornExpansionObjects.BUTTERY_POLENTA.get(), "Buttery Polenta");
        tb.add(CornExpansionObjects.CHEESY_POLENTA.get(), "Cheesy Polenta");

        // Blocks
        tb.add(CornExpansionObjects.POPCORN_TIN_BLOCK.get(), "Popcorn Tin");
        tb.add(CornExpansionObjects.SWEET_POPCORN_TIN_BLOCK.get(), "Sweet Popcorn Tin");
        tb.add(CornExpansionObjects.BUTTERY_POPCORN_TIN_BLOCK.get(), "Buttery Popcorn Tin");
        tb.add(CornExpansionObjects.CHEESY_POPCORN_TIN_BLOCK.get(), "Cheesy Popcorn Tin");
        tb.add(CornExpansionObjects.CANDIED_POPCORN_TIN_BLOCK.get(), "Candied Popcorn Tin");

        // Tags
        tb.add("tag.item." + CornExpansionTags.BUTTERS.location().toLanguageKey(), "Butter");
        tb.add("tag.item." + CornExpansionTags.CHEESES.location().toLanguageKey(), "Cheese");
        tb.add("tag.item." + CornExpansionTags.CORN.location().toLanguageKey(), "Corn");
        tb.add("tag.item." + CornExpansionTags.DRIED_CORN.location().toLanguageKey(), "Dried Corn");
        tb.add("tag.item." + CornExpansionTags.CANDIED_INGREDIENTS.location().toLanguageKey(), "Candied Ingredient");
        tb.add("tag.item." + CornExpansionTags.SWEET_INGREDIENTS.location().toLanguageKey(), "Sweet Ingredient");
        tb.add("tag.item." + CornExpansionTags.POPCORN.location().toLanguageKey(), "Popcorn");
        tb.add("tag.item." + CornExpansionTags.FLOURS.location().toLanguageKey(), "Flour");

        // Creative tab
        tb.add(CornExpansionCreativeTabs.CORNEXPANSION_TAB.getKey(), "Corn Expansion");

        // Advancements
        tb.add("advancements." + CornExpansionAdvancements.ROOT_ADVANCEMENT.id().toLanguageKey() + ".title", "Fun is Just Around the CORNer");
        tb.add("advancements." + CornExpansionAdvancements.ROOT_ADVANCEMENT.id().toLanguageKey() + ".description", "Thanks for downloading Corn Expansion !");
        tb.add("advancements." + CornExpansionAdvancements.GET_POPCORN_ADVANCEMENT.id().toLanguageKey() + ".title", "Always go out With A \"Pop\"");
        tb.add("advancements." + CornExpansionAdvancements.GET_POPCORN_ADVANCEMENT.id().toLanguageKey() + ".description", "Make Popcorn by cooking Corn Kernels");
        tb.add("advancements." + CornExpansionAdvancements.GET_EVERY_POPCORN_VARIANT_ADVANCEMENT.id().toLanguageKey() + ".title", "Now you're Popping Off !");
        tb.add("advancements." + CornExpansionAdvancements.GET_EVERY_POPCORN_VARIANT_ADVANCEMENT.id().toLanguageKey() + ".description", "Craft all four variants of Popcorn");
        tb.add("advancements." + CornExpansionAdvancements.GET_POLENTA_ADVANCEMENT.id().toLanguageKey() + ".title", "Steam-Powered Corn");
        tb.add("advancements." + CornExpansionAdvancements.GET_POLENTA_ADVANCEMENT.id().toLanguageKey() + ".description", "Boil Cornmeal in a stove to make Polenta");
        tb.add("advancements." + CornExpansionAdvancements.GET_EVERY_POLENTA_VARIANT_ADVANCEMENT.id().toLanguageKey() + ".title", "Polenta of Flavors");
        tb.add("advancements." + CornExpansionAdvancements.GET_EVERY_POLENTA_VARIANT_ADVANCEMENT.id().toLanguageKey() + ".description", "Craft all three variants of Polenta");
        tb.add("advancements." + CornExpansionAdvancements.DRINK_CORN_SYRUP.id().toLanguageKey() + ".title", "Corny Situation");
        tb.add("advancements." + CornExpansionAdvancements.DRINK_CORN_SYRUP.id().toLanguageKey() + ".description", "Drink Corn Syrup");
        tb.add("advancements." + CornExpansionAdvancements.COOK_KERNELS_ON_CAMPFIRE.id().toLanguageKey() + ".title", "These are not Marshmallows !");
        tb.add("advancements." + CornExpansionAdvancements.COOK_KERNELS_ON_CAMPFIRE.id().toLanguageKey() + ".description", "Cook Popcorn using a Campfire");
    }
}
