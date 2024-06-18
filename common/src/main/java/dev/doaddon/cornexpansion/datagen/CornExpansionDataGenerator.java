package dev.doaddon.cornexpansion.datagen;

import dev.doaddon.cornexpansion.datagen.advancements.CornExpansionAdvancements;
import dev.doaddon.cornexpansion.datagen.loottables.CornExpansionBlockLootTable;
import dev.doaddon.cornexpansion.datagen.recipes.CornExpansionRecipes;
import dev.doaddon.cornexpansion.datagen.tags.CornExpansionTags;
import dev.doaddon.cornexpansion.datagen.translations.CornExpansionTranslations;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class CornExpansionDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator generator) {
        FabricDataGenerator.Pack pack = generator.createPack();

        pack.addProvider(CornExpansionTags::new);
        pack.addProvider(CornExpansionTranslations::new);
        pack.addProvider(CornExpansionRecipes::new);
        pack.addProvider(CornExpansionAdvancements::new);
        pack.addProvider(CornExpansionBlockLootTable::new);
    }
}