package dev.doaddon.cornexpansion.datagen.recipes;

import dev.doaddon.cornexpansion.CornExpansion;
import dev.doaddon.cornexpansion.registry.CornExpansionObjects;
import dev.doaddon.cornexpansion.registry.CornExpansionTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.satisfy.farm_and_charm.registry.ObjectRegistry;

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

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, CornExpansionObjects.CORN_ON_THE_COB.get())
                .requires(Ingredient.of(CornExpansionTags.CORN))
                .requires(Items.STICK)
                .unlockedBy("has_corn", FabricRecipeProvider.has(CornExpansionTags.CORN))
                .save(exporter);
        SimpleCookingRecipeBuilder.smoking(Ingredient.of(CornExpansionObjects.CORN_ON_THE_COB.get()), RecipeCategory.FOOD, CornExpansionObjects.GRILLED_CORN.get(), 0.1F, 50)
                .unlockedBy("has_corn_on_the_cob", FabricRecipeProvider.has(CornExpansionObjects.CORN_ON_THE_COB.get()))
                .save(exporter, CornExpansion.id("smoking/corn_on_the_cob"));
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(CornExpansionObjects.CORN_ON_THE_COB.get()), RecipeCategory.FOOD, CornExpansionObjects.GRILLED_CORN.get(), 0.1F, 60)
                .unlockedBy("has_corn_on_the_cob", FabricRecipeProvider.has(CornExpansionObjects.CORN_ON_THE_COB.get()))
                .save(exporter, CornExpansion.id("campfire/corn_on_the_cob"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(CornExpansionObjects.CORN_ON_THE_COB.get()), RecipeCategory.FOOD, CornExpansionObjects.GRILLED_CORN.get(), 0.1F, 80)
                .unlockedBy("has_corn_on_the_cob", FabricRecipeProvider.has(CornExpansionObjects.CORN_ON_THE_COB.get()))
                .save(exporter, CornExpansion.id("smelting/corn_on_the_cob"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, CornExpansionObjects.CORN_SYRUP.get(), 2)
                .requires(Ingredient.of(CornExpansionTags.CORN))
                .requires(Items.SUGAR)
                .requires(Items.GLASS_BOTTLE, 2)
                .unlockedBy("has_corn", FabricRecipeProvider.has(CornExpansionTags.CORN))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, CornExpansionObjects.CORN_SYRUP_COOKIE.get(), 8)
                .pattern("WSB")
                .define('W', CornExpansionTags.FLOUR)
                .define('S', CornExpansionObjects.CORN_SYRUP.get())
                .define('B', CornExpansionTags.BUTTER)
                .unlockedBy("has_corn_syrup", FabricRecipeProvider.has(CornExpansionObjects.CORN_SYRUP.get()))
                .save(exporter);

        // Popcorn variants
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, CornExpansionObjects.SWEET_POPCORN.get(), 3)
                .requires(CornExpansionObjects.POPCORN.get(), 3)
                .requires(CornExpansionTags.SWEET_INGREDIENTS)
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
                .requires(CornExpansionTags.CANDIED_INGREDIENTS)
                .unlockedBy("has_popcorn", InventoryChangeTrigger.TriggerInstance.hasItems(CornExpansionObjects.POPCORN.get()))
                .save(exporter);

        // Polenta variants
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, CornExpansionObjects.SWEET_POLENTA.get())
                .requires(CornExpansionObjects.POLENTA.get())
                .requires(CornExpansionTags.SWEET_INGREDIENTS)
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
