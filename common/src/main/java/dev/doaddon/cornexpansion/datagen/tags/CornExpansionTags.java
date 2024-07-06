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
                .addOptional(ObjectRegistry.BUTTER.getId())
                .addOptionalTag(new ResourceLocation("c:butter"))
                .addOptionalTag(new ResourceLocation("forge:butter"));

        getOrCreateTagBuilder(dev.doaddon.cornexpansion.registry.CornExpansionTags.CHEESE)
                .addOptionalTag(new ResourceLocation("c:cheese"))
                .addOptionalTag(new ResourceLocation("forge:cheese"))
                .addOptionalTag(new ResourceLocation("c:cheeses"))
                .addOptionalTag(new ResourceLocation("forge:cheeses"));

        getOrCreateTagBuilder(dev.doaddon.cornexpansion.registry.CornExpansionTags.CORN)
                .addOptional(ObjectRegistry.CORN.getId())
                .addOptional(new ResourceLocation("brewery:corn"))
                .addOptionalTag(new ResourceLocation("c:corn"))
                .addOptionalTag(new ResourceLocation("c:crops/corn"))
                .addOptionalTag(new ResourceLocation("forge:corn"))
                .addOptionalTag(new ResourceLocation("forge:crops/corn"));

        getOrCreateTagBuilder(dev.doaddon.cornexpansion.registry.CornExpansionTags.DRIED_CORN)
                .addOptional(CornExpansionObjects.DRIED_CORN.getId())
                .addOptional(new ResourceLocation("brewery:dried_corn"));

        getOrCreateTagBuilder(dev.doaddon.cornexpansion.registry.CornExpansionTags.SWEET_INGREDIENT)
                .add(Items.SUGAR)
                .add(Items.HONEY_BOTTLE)
                .add(CornExpansionObjects.CORN_SYRUP.get())
                .addOptionalTag(new ResourceLocation("c:sugar"))
                .addOptionalTag(new ResourceLocation("forge:sugar"));

        getOrCreateTagBuilder(dev.doaddon.cornexpansion.registry.CornExpansionTags.CANDIED_INGREDIENT)
                .add(Items.COCOA_BEANS)
                .addOptional(new ResourceLocation("create:bar_of_chocolate"))
                .addOptionalTag(new ResourceLocation("c:chocolate"))
                .addOptionalTag(new ResourceLocation("forge:chocolate"));

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
    }
}