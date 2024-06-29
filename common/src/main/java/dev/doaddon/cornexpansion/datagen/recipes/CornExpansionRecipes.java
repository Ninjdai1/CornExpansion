package dev.doaddon.cornexpansion.datagen.recipes;

import dev.doaddon.cornexpansion.CornExpansion;
import dev.doaddon.cornexpansion.registry.CornExpansionObjects;
import dev.doaddon.cornexpansion.registry.CornExpansionTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.satisfy.farm_and_charm.recipe.StoveRecipe;
import net.satisfy.farm_and_charm.registry.ObjectRegistry;

import java.util.function.Consumer;

public class CornExpansionRecipes extends FabricRecipeProvider {
    public CornExpansionRecipes(FabricDataOutput generator) {
        super(generator);
    }

    @Override
    public void buildRecipes(Consumer<FinishedRecipe> exporter) {
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

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, CornExpansionObjects.CORN_SYRUP.get())
                .requires(Ingredient.of(CornExpansionTags.CORN), 2)
                .requires(Items.SUGAR)
                .requires(Items.GLASS_BOTTLE)
                .unlockedBy("has_corn", FabricRecipeProvider.has(CornExpansionTags.CORN))
                .save(exporter);

        // Popcorn variants
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, CornExpansionObjects.SWEET_POPCORN.get(), 3)
                .requires(CornExpansionObjects.POPCORN.get(), 3)
                .requires(Items.SUGAR)
                .unlockedBy("has_popcorn", InventoryChangeTrigger.TriggerInstance.hasItems(CornExpansionObjects.POPCORN.get()))
                .save(exporter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, CornExpansionObjects.BUTTERY_POPCORN.get(), 3)
                .requires(CornExpansionObjects.POPCORN.get(), 3)
                .requires(CornExpansionTags.BUTTER)
                .unlockedBy("has_popcorn", InventoryChangeTrigger.TriggerInstance.hasItems(CornExpansionObjects.POPCORN.get()))
                .save(exporter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, CornExpansionObjects.CHEESY_POPCORN.get(), 3)
                .requires(CornExpansionObjects.POPCORN.get(), 3)
                .requires(CornExpansionTags.CHEESE)
                .unlockedBy("has_popcorn", InventoryChangeTrigger.TriggerInstance.hasItems(CornExpansionObjects.POPCORN.get()))
                .save(exporter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, CornExpansionObjects.CANDIED_POPCORN.get(), 3)
                .requires(CornExpansionObjects.POPCORN.get(), 3)
                .requires(CornExpansionTags.CANDIED_INGREDIENT)
                .unlockedBy("has_popcorn", InventoryChangeTrigger.TriggerInstance.hasItems(CornExpansionObjects.POPCORN.get()))
                .save(exporter);

        // Polenta variants
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, CornExpansionObjects.SWEET_POLENTA.get())
                .requires(CornExpansionObjects.POLENTA.get())
                .requires(Items.SUGAR)
                .unlockedBy("has_polenta", InventoryChangeTrigger.TriggerInstance.hasItems(CornExpansionObjects.POLENTA.get()))
                .save(exporter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, CornExpansionObjects.BUTTERY_POLENTA.get())
                .requires(CornExpansionObjects.POLENTA.get())
                .requires(CornExpansionTags.BUTTER)
                .unlockedBy("has_polenta", InventoryChangeTrigger.TriggerInstance.hasItems(CornExpansionObjects.POLENTA.get()))
                .save(exporter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, CornExpansionObjects.CHEESY_POLENTA.get())
                .requires(CornExpansionObjects.POLENTA.get())
                .requires(CornExpansionTags.CHEESE)
                .unlockedBy("has_polenta", InventoryChangeTrigger.TriggerInstance.hasItems(CornExpansionObjects.POLENTA.get()))
                .save(exporter);

        // Popcorn Tins
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, CornExpansionObjects.POPCORN_TIN.get(), 1)
                .requires(CornExpansionObjects.POPCORN.get(), 8)
                .requires(Items.BUCKET)
                .unlockedBy("has_popcorn", FabricRecipeProvider.has(CornExpansionObjects.POPCORN.get()))
                .save(exporter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, CornExpansionObjects.SWEET_POPCORN_TIN.get(), 1)
                .requires(CornExpansionObjects.SWEET_POPCORN.get(), 8)
                .requires(Items.BUCKET)
                .unlockedBy("has_sweet_popcorn", FabricRecipeProvider.has(CornExpansionObjects.SWEET_POPCORN.get()))
                .save(exporter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, CornExpansionObjects.BUTTERY_POPCORN_TIN.get(), 1)
                .requires(CornExpansionObjects.BUTTERY_POPCORN.get(), 8)
                .requires(Items.BUCKET)
                .unlockedBy("has_buttery_popcorn", FabricRecipeProvider.has(CornExpansionObjects.BUTTERY_POPCORN.get()))
                .save(exporter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, CornExpansionObjects.CHEESY_POPCORN_TIN.get(), 1)
                .requires(CornExpansionObjects.CHEESY_POPCORN.get(), 8)
                .requires(Items.BUCKET)
                .unlockedBy("has_cheesy_popcorn", FabricRecipeProvider.has(CornExpansionObjects.CHEESY_POPCORN.get()))
                .save(exporter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, CornExpansionObjects.CANDIED_POPCORN_TIN.get(), 1)
                .requires(CornExpansionObjects.CANDIED_POPCORN.get(), 8)
                .requires(Items.BUCKET)
                .unlockedBy("has_candied_popcorn", FabricRecipeProvider.has(CornExpansionObjects.CANDIED_POPCORN.get()))
                .save(exporter);
    }
}
