package dev.doaddon.cornexpansion.datagen.tags;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.resources.ResourceLocation;

import java.util.concurrent.CompletableFuture;

public class CornExpansionTags extends FabricTagProvider.ItemTagProvider {
    public CornExpansionTags(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider arg) {
        getOrCreateTagBuilder(dev.doaddon.cornexpansion.registry.CornExpansionTags.BUTTER)
                .addOptionalTag(new ResourceLocation("c:butter"))
                .addOptionalTag(new ResourceLocation("forge:butter"));
        getOrCreateTagBuilder(dev.doaddon.cornexpansion.registry.CornExpansionTags.CHEESE)
                .addOptionalTag(new ResourceLocation("c:cheese"))
                .addOptionalTag(new ResourceLocation("forge:cheese"))
                .addOptionalTag(new ResourceLocation("c:cheeses"))
                .addOptionalTag(new ResourceLocation("forge:cheeses"));
        getOrCreateTagBuilder(dev.doaddon.cornexpansion.registry.CornExpansionTags.CORN)
                .addOptionalTag(new ResourceLocation("c:corn"))
                .addOptionalTag(new ResourceLocation("c:crops/corn"))
                .addOptionalTag(new ResourceLocation("forge:corn"))
                .addOptionalTag(new ResourceLocation("forge:crops/corn"))
                .addOptional(net.satisfy.farm_and_charm.registry.ObjectRegistry.CORN.getId())
                .addOptional(net.satisfy.brewery.registry.ObjectRegistry.CORN.getId());
    }
}