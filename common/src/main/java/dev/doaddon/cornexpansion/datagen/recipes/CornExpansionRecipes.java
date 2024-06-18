package dev.doaddon.cornexpansion.datagen.recipes;

import dev.doaddon.cornexpansion.registry.CornExpansionObjects;
import dev.doaddon.cornexpansion.registry.CornExpansionTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.satisfy.farm_and_charm.registry.ObjectRegistry;

import java.util.function.Consumer;

public class CornExpansionRecipes extends FabricRecipeProvider {
    public CornExpansionRecipes(FabricDataOutput generator) {
        super(generator);
    }

    @Override
    public void buildRecipes(Consumer<FinishedRecipe> exporter) {
        SimpleCookingRecipeBuilder.smoking(Ingredient.of(ObjectRegistry.KERNELS.get()), RecipeCategory.FOOD, CornExpansionObjects.POPCORN.get(), 0.1F, 40)
                .unlockedBy("has_corn", FabricRecipeProvider.has(ObjectRegistry.CORN.get()))
                .save(exporter);

        // Popcorn variants
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, CornExpansionObjects.SWEET_POPCORN.get(), 3)
                .requires(CornExpansionObjects.POPCORN.get(), 3)
                .requires(Items.SUGAR)
                .unlockedBy("has_popcorn", FabricRecipeProvider.has(CornExpansionObjects.POPCORN.get()))
                .save(exporter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, CornExpansionObjects.BUTTERY_POPCORN.get(), 3)
                .requires(CornExpansionObjects.POPCORN.get(), 3)
                .requires(CornExpansionTags.BUTTER)
                .unlockedBy("has_popcorn", FabricRecipeProvider.has(CornExpansionObjects.POPCORN.get()))
                .save(exporter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, CornExpansionObjects.CHEESY_POPCORN.get(), 3)
                .requires(CornExpansionObjects.POPCORN.get(), 3)
                .requires(CornExpansionTags.CHEESE)
                .unlockedBy("has_popcorn", FabricRecipeProvider.has(CornExpansionObjects.POPCORN.get()))
                .save(exporter);
        /*ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, CornExpansionObjects.CANDIED_POPCORN.get(), 3)
                .requires(CornExpansionObjects.POPCORN.get(), 3)
                .requires(Items.COCOA_BEANS)
                .unlockedBy("has_popcorn", FabricRecipeProvider.has(CornExpansionObjects.POPCORN.get()))
                .save(exporter);*/
    }
}
