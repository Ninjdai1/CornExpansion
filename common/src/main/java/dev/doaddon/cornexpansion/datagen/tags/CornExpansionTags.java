package dev.doaddon.cornexpansion.datagen.tags;

import dev.doaddon.cornexpansion.registry.CornExpansionObjects;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.satisfy.farm_and_charm.registry.ObjectRegistry;

import java.util.concurrent.CompletableFuture;

public class CornExpansionTags extends FabricTagProvider.ItemTagProvider {
    public CornExpansionTags(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider arg) {
        getOrCreateTagBuilder(dev.doaddon.cornexpansion.registry.CornExpansionTags.BUTTER)
                .addOptional(ObjectRegistry.BUTTER.getId());

        getOrCreateTagBuilder(dev.doaddon.cornexpansion.registry.CornExpansionTags.CHEESE)
                .addOptionalTag(ResourceLocation.parse("c:foods/cheese"));

        getOrCreateTagBuilder(dev.doaddon.cornexpansion.registry.CornExpansionTags.CORN)
                .addOptional(ObjectRegistry.CORN.getId())
                .addOptionalTag(ResourceLocation.parse("c:crops/corn"));

        getOrCreateTagBuilder(dev.doaddon.cornexpansion.registry.CornExpansionTags.DRIED_CORN)
                .addOptional(CornExpansionObjects.DRIED_CORN.getId())
                .addOptional(ResourceLocation.parse("brewery:dried_corn"));

        getOrCreateTagBuilder(dev.doaddon.cornexpansion.registry.CornExpansionTags.SWEET_INGREDIENTS)
                .add(Items.SUGAR)
                .add(Items.HONEY_BOTTLE)
                .add(CornExpansionObjects.CORN_SYRUP.get())
                .addOptionalTag(ResourceLocation.parse("c:foods/sugar"));

        getOrCreateTagBuilder(dev.doaddon.cornexpansion.registry.CornExpansionTags.CANDIED_INGREDIENTS)
                .add(Items.COCOA_BEANS)
                .addOptionalTag(ResourceLocation.parse("c:chocolate"));

        getOrCreateTagBuilder(dev.doaddon.cornexpansion.registry.CornExpansionTags.POPCORN)
                .add(CornExpansionObjects.POPCORN.get())
                .add(CornExpansionObjects.BUTTERY_POPCORN.get())
                .add(CornExpansionObjects.SWEET_POPCORN.get())
                .add(CornExpansionObjects.CHEESY_POPCORN.get())
                .add(CornExpansionObjects.CANDIED_POPCORN.get());

        getOrCreateTagBuilder(dev.doaddon.cornexpansion.registry.CornExpansionTags.FLOUR)
                .addOptional(ObjectRegistry.FLOUR.getId());

        getOrCreateTagBuilder(dev.doaddon.cornexpansion.registry.CornExpansionTags.DOUGH)
                .add(CornExpansionObjects.CORN_DOUGH.get());
    }
}
