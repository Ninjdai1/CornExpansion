package dev.doaddon.cornexpansion.datagen.recipes;

import dev.doaddon.cornexpansion.CornExpansion;
import dev.doaddon.cornexpansion.registry.CornExpansionObjects;
import dev.doaddon.cornexpansion.registry.CornExpansionTags;
import dev.doaddon.cornexpansion.utils.CuttingBoardAssemblyRecipeBuilder;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.*;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.satisfy.farm_and_charm.core.registry.ObjectRegistry;

import java.util.List;
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
        CuttingBoardAssemblyRecipeBuilder.cuttingBoardAssembly(CornExpansionObjects.CORN_ON_THE_COB.get())
                .requires(Ingredient.of(CornExpansionTags.CORN))
                .requires(Ingredient.of(Items.STICK))
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

        CuttingBoardAssemblyRecipeBuilder.cuttingBoardAssembly(CornExpansionObjects.CORN_SYRUP_COOKIE.get(), 8)
                .requires(CornExpansionTags.FLOUR)
                .requires(CornExpansionObjects.CORN_SYRUP.get())
                .requires(CornExpansionTags.BUTTER)
                .save(exporter);

        CuttingBoardAssemblyRecipeBuilder.cuttingBoardAssembly(CornExpansionObjects.RAW_CORN_DOG.get())
                .requires(ObjectRegistry.MINCED_BEEF.get())
                .requires(Items.EGG)
                .requires(CornExpansionObjects.CORNMEAL.get())
                .finisher(Ingredient.of(Items.STICK))
                .save(exporter);

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(CornExpansionObjects.RAW_CORN_DOG.get()), RecipeCategory.FOOD, CornExpansionObjects.CORN_DOG.get(), 0.2f, 100)
                .unlockedBy("has_corn_dog", FabricRecipeProvider.has(CornExpansionObjects.RAW_CORN_DOG.get()))
                .save(exporter, CornExpansion.id("smoking/corn_dog"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(CornExpansionObjects.RAW_CORN_DOG.get()), RecipeCategory.FOOD, CornExpansionObjects.CORN_DOG.get(), 0.2f, 120)
                .unlockedBy("has_corn_dog", FabricRecipeProvider.has(CornExpansionObjects.RAW_CORN_DOG.get()))
                .save(exporter, CornExpansion.id("smelting/corn_dog"));

        // Popcorn Tins
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, CornExpansionObjects.POPCORN_BAG.get(), 1)
                .requires(CornExpansionObjects.POPCORN.get(), 8)
                .requires(Items.PAPER)
                .unlockedBy("has_popcorn", FabricRecipeProvider.has(CornExpansionObjects.POPCORN.get()))
                .save(exporter);
        CuttingBoardAssemblyRecipeBuilder.cuttingBoardAssembly(CornExpansionObjects.POPCORN_BAG.get())
                .requires(CornExpansionObjects.POPCORN.get(), 4)
                .finisher(Ingredient.of(Items.PAPER))
                .save(exporter);

        // Variants
        RecipeElements.ELEMENTS.forEach(type -> {
            ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, type.popcorn, 3)
                    .requires(CornExpansionObjects.POPCORN.get(), 3)
                    .requires(type.ingredient)
                    .unlockedBy("has_popcorn", InventoryChangeTrigger.TriggerInstance.hasItems(CornExpansionObjects.POPCORN.get()))
                    .save(exporter);
            CuttingBoardAssemblyRecipeBuilder.cuttingBoardAssembly(type.popcorn, 3)
                    .requires(CornExpansionObjects.POPCORN.get(), 3)
                    .requires(type.ingredient)
                    .save(exporter);

            ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, type.popcorn_tin, 1)
                    .requires(type.popcorn, 8)
                    .requires(Items.PAPER)
                    .unlockedBy("has_"+type.name+"_popcorn", FabricRecipeProvider.has(type.popcorn))
                    .save(exporter);

            CuttingBoardAssemblyRecipeBuilder.cuttingBoardAssembly(type.popcorn_tin)
                    .requires(type.popcorn, 4)
                    .finisher(Ingredient.of(Items.PAPER))
                    .save(exporter);

            if (type.polenta != null) {
                ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, type.polenta)
                        .requires(CornExpansionObjects.POLENTA.get())
                        .requires(type.ingredient)
                        .unlockedBy("has_polenta", InventoryChangeTrigger.TriggerInstance.hasItems(CornExpansionObjects.POLENTA.get()))
                        .save(exporter);

                CuttingBoardAssemblyRecipeBuilder.cuttingBoardAssembly(type.polenta)
                        .requires(CornExpansionObjects.POLENTA.get())
                        .requires(type.ingredient)
                        .save(exporter);
            }
        });
    }

    private record RecipeElements(String name, TagKey<Item> ingredient, ItemLike popcorn, ItemLike popcorn_tin, ItemLike polenta){
        private static final List<RecipeElements> ELEMENTS = List.of(
                new RecipeElements("sweet",
                        CornExpansionTags.SWEET_INGREDIENT,
                        CornExpansionObjects.SWEET_POPCORN.get(),
                        CornExpansionObjects.SWEET_POPCORN_BAG.get(),
                        CornExpansionObjects.SWEET_POLENTA.get()),
                new RecipeElements("buttery",
                        CornExpansionTags.BUTTER,
                        CornExpansionObjects.BUTTERY_POPCORN.get(),
                        CornExpansionObjects.BUTTERY_POPCORN_BAG.get(),
                        CornExpansionObjects.BUTTERY_POLENTA.get()),
                new RecipeElements("cheesy",
                        CornExpansionTags.CHEESE,
                        CornExpansionObjects.CHEESY_POPCORN.get(),
                        CornExpansionObjects.CHEESY_POPCORN_BAG.get(),
                        CornExpansionObjects.CHEESY_POLENTA.get()),
                new RecipeElements("candied",
                        CornExpansionTags.CANDIED_INGREDIENT,
                        CornExpansionObjects.CANDIED_POPCORN.get(),
                        CornExpansionObjects.CANDIED_POPCORN_BAG.get(),
                        null)
        );
    }
}
