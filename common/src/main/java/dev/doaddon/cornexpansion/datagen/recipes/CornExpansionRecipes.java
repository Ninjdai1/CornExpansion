package dev.doaddon.cornexpansion.datagen.recipes;

import dev.doaddon.cornexpansion.CornExpansion;
import dev.doaddon.cornexpansion.registry.CornExpansionObjects;
import dev.doaddon.cornexpansion.registry.CornExpansionTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.satisfy.farm_and_charm.core.registry.ObjectRegistry;

import java.util.concurrent.CompletableFuture;

public class CornExpansionRecipes extends FabricRecipeProvider {
    public CornExpansionRecipes(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void buildRecipes(RecipeOutput exporter) {
        SimpleCookingRecipeBuilder.smoking(Ingredient.of(ObjectRegistry.KERNELS.get()), RecipeCategory.FOOD, CornExpansionObjects.POPCORN.get(), 0.1F, 15)
                .unlockedBy("has_corn", FabricRecipeProvider.has(CornExpansionTags.CORN))
                .unlockedBy("has_kernels", FabricRecipeProvider.has(ObjectRegistry.KERNELS.get()))
                .save(exporter, CornExpansion.id("smoking/popcorn"));
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(ObjectRegistry.KERNELS.get()), RecipeCategory.FOOD, CornExpansionObjects.POPCORN.get(), 0.1F, 20)
                .unlockedBy("has_corn", FabricRecipeProvider.has(CornExpansionTags.CORN))
                .unlockedBy("has_kernels", FabricRecipeProvider.has(ObjectRegistry.KERNELS.get()))
                .save(exporter, CornExpansion.id("campfire/popcorn"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ObjectRegistry.KERNELS.get()), RecipeCategory.FOOD, CornExpansionObjects.POPCORN.get(), 0.1F, 30)
                .unlockedBy("has_corn", FabricRecipeProvider.has(CornExpansionTags.CORN))
                .unlockedBy("has_kernels", FabricRecipeProvider.has(ObjectRegistry.KERNELS.get()))
                .save(exporter, CornExpansion.id("smelting/popcorn"));

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(CornExpansionObjects.CORN_ON_THE_COB.get()), RecipeCategory.FOOD, CornExpansionObjects.GRILLED_CORN.get(), 0.1F, 50)
                .unlockedBy("has_corn_on_the_cob", FabricRecipeProvider.has(CornExpansionObjects.CORN_ON_THE_COB.get()))
                .save(exporter, CornExpansion.id("smoking/corn_on_the_cob"));
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(CornExpansionObjects.CORN_ON_THE_COB.get()), RecipeCategory.FOOD, CornExpansionObjects.GRILLED_CORN.get(), 0.1F, 60)
                .unlockedBy("has_corn_on_the_cob", FabricRecipeProvider.has(CornExpansionObjects.CORN_ON_THE_COB.get()))
                .save(exporter, CornExpansion.id("campfire/corn_on_the_cob"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(CornExpansionObjects.CORN_ON_THE_COB.get()), RecipeCategory.FOOD, CornExpansionObjects.GRILLED_CORN.get(), 0.1F, 80)
                .unlockedBy("has_corn_on_the_cob", FabricRecipeProvider.has(CornExpansionObjects.CORN_ON_THE_COB.get()))
                .save(exporter, CornExpansion.id("smelting/corn_on_the_cob"));
    }
}
