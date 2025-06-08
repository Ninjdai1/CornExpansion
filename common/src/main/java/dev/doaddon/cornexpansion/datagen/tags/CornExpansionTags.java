package dev.doaddon.cornexpansion.datagen.tags;

import dev.doaddon.cornexpansion.registry.CornExpansionObjects;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.satisfy.farm_and_charm.core.registry.ObjectRegistry;

import java.util.concurrent.CompletableFuture;

public class CornExpansionTags extends FabricTagProvider.ItemTagProvider {
    public CornExpansionTags(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider arg) {
        getOrCreateTagBuilder(dev.doaddon.cornexpansion.registry.CornExpansionTags.BUTTER)
                .addOptional(ObjectRegistry.BUTTER.getId())
                .addOptionalTag(ResourceLocation.parse("c:butter"))
                .addOptionalTag(ResourceLocation.parse("forge:butter"));

        getOrCreateTagBuilder(dev.doaddon.cornexpansion.registry.CornExpansionTags.CHEESE)
                .addOptionalTag(ResourceLocation.parse("c:cheese"))
                .addOptionalTag(ResourceLocation.parse("forge:cheese"))
                .addOptionalTag(ResourceLocation.parse("c:cheeses"))
                .addOptionalTag(ResourceLocation.parse("forge:cheeses"));

        getOrCreateTagBuilder(dev.doaddon.cornexpansion.registry.CornExpansionTags.CORN)
                .addOptional(ObjectRegistry.CORN.getId())
                .addOptional(ResourceLocation.parse("brewery:corn"))
                .addOptionalTag(ResourceLocation.parse("c:corn"))
                .addOptionalTag(ResourceLocation.parse("c:crops/corn"))
                .addOptionalTag(ResourceLocation.parse("forge:corn"))
                .addOptionalTag(ResourceLocation.parse("forge:crops/corn"));

        getOrCreateTagBuilder(dev.doaddon.cornexpansion.registry.CornExpansionTags.DRIED_CORN)
                .addOptional(CornExpansionObjects.DRIED_CORN.getId())
                .addOptional(ResourceLocation.parse("brewery:dried_corn"));

        getOrCreateTagBuilder(dev.doaddon.cornexpansion.registry.CornExpansionTags.SWEET_INGREDIENT)
                .add(Items.SUGAR)
                .add(Items.HONEY_BOTTLE)
                .add(CornExpansionObjects.CORN_SYRUP.get())
                .addOptionalTag(ResourceLocation.parse("c:sugar"))
                .addOptionalTag(ResourceLocation.parse("forge:sugar"));

        getOrCreateTagBuilder(dev.doaddon.cornexpansion.registry.CornExpansionTags.CANDIED_INGREDIENT)
                .add(Items.COCOA_BEANS)
                .addOptional(ResourceLocation.parse("create:bar_of_chocolate"))
                .addOptionalTag(ResourceLocation.parse("c:chocolate"))
                .addOptionalTag(ResourceLocation.parse("forge:chocolate"));

        getOrCreateTagBuilder(dev.doaddon.cornexpansion.registry.CornExpansionTags.POPCORN)
                .add(CornExpansionObjects.POPCORN.get())
                .add(CornExpansionObjects.BUTTERY_POPCORN.get())
                .add(CornExpansionObjects.SWEET_POPCORN.get())
                .add(CornExpansionObjects.CHEESY_POPCORN.get())
                .add(CornExpansionObjects.CANDIED_POPCORN.get());


        getOrCreateTagBuilder(dev.doaddon.cornexpansion.registry.CornExpansionTags.FLOUR)
                .addTag(dev.doaddon.cornexpansion.registry.CornExpansionTags.FLOUR_FORGE)
                .addTag(dev.doaddon.cornexpansion.registry.CornExpansionTags.FLOUR_FABRIC);

        getOrCreateTagBuilder(dev.doaddon.cornexpansion.registry.CornExpansionTags.FLOUR_FABRIC)
                .add(CornExpansionObjects.CORN_FLOUR.get());
        getOrCreateTagBuilder(dev.doaddon.cornexpansion.registry.CornExpansionTags.FLOUR_FORGE)
                .add(CornExpansionObjects.CORN_FLOUR.get());

        getOrCreateTagBuilder(dev.doaddon.cornexpansion.registry.CornExpansionTags.BREAD_FABRIC)
                .add(CornExpansionObjects.GRANDMAS_CORNBREAD.get());
        getOrCreateTagBuilder(dev.doaddon.cornexpansion.registry.CornExpansionTags.BREAD_FORGE)
                .add(CornExpansionObjects.GRANDMAS_CORNBREAD.get());

        getOrCreateTagBuilder(dev.doaddon.cornexpansion.registry.CornExpansionTags.KERNELS)
                .addTag(dev.doaddon.cornexpansion.registry.CornExpansionTags.CORN_SEEDS_FABRIC)
                .addTag(dev.doaddon.cornexpansion.registry.CornExpansionTags.CORN_SEEDS_FORGE);

        getOrCreateTagBuilder(dev.doaddon.cornexpansion.registry.CornExpansionTags.CORN_SEEDS_FABRIC)
                .add(ObjectRegistry.KERNELS.get());
        getOrCreateTagBuilder(dev.doaddon.cornexpansion.registry.CornExpansionTags.CORN_SEEDS_FORGE)
                .add(ObjectRegistry.KERNELS.get());
    }
}