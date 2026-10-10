package dev.doaddon.cornexpansion.utils;

import net.minecraft.advancements.Criterion;
import net.minecraft.core.NonNullList;
import net.minecraft.data.recipes.RecipeBuilder;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.satisfy.farm_and_charm.core.recipe.CuttingBoardAssemblyRecipe;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.*;

//@SuppressWarnings("unused")
public class CuttingBoardAssemblyRecipeBuilder implements RecipeBuilder {
    private final Item result;
    private final int count;
    private boolean ordered = false;
    private Ingredient finisher;
    private final NonNullList<Ingredient> ingredients = NonNullList.create();

    public CuttingBoardAssemblyRecipeBuilder(ItemLike itemLike, int i) {
        this.result = itemLike.asItem();
        this.count = i;
    }

    public static CuttingBoardAssemblyRecipeBuilder cuttingBoardAssembly(ItemLike itemLike) {
        return new CuttingBoardAssemblyRecipeBuilder(itemLike, 1);
    }

    public static CuttingBoardAssemblyRecipeBuilder cuttingBoardAssembly(ItemLike itemLike, int i) {
        return new CuttingBoardAssemblyRecipeBuilder(itemLike, i);
    }

    public CuttingBoardAssemblyRecipeBuilder requires(TagKey<Item> tagKey) {
        return this.requires(Ingredient.of(tagKey));
    }

    public CuttingBoardAssemblyRecipeBuilder requires(ItemLike itemLike) {
        return this.requires(itemLike, 1);
    }

    public CuttingBoardAssemblyRecipeBuilder requires(ItemLike itemLike, int i) {
        for(int j = 0; j < i; ++j) {
            this.requires(Ingredient.of(itemLike));
        }

        return this;
    }

    public CuttingBoardAssemblyRecipeBuilder requires(Ingredient ingredient) {
        return this.requires(ingredient, 1);
    }

    public CuttingBoardAssemblyRecipeBuilder requires(Ingredient ingredient, int i) {
        for(int j = 0; j < i; ++j) {
            this.ingredients.add(ingredient);
        }

        return this;
    }

    public CuttingBoardAssemblyRecipeBuilder finisher(Ingredient ingredient) {
        this.finisher = ingredient;
        return this;
    }

    public CuttingBoardAssemblyRecipeBuilder ordered(boolean ordered) {
        this.ordered = ordered;
        return this;
    }

    public @NotNull CuttingBoardAssemblyRecipeBuilder unlockedBy(String string, Criterion<?> criterion) {
        return this;
    }

    @Override
    public @NotNull RecipeBuilder group(@Nullable String string) {
        return this;
    }

    public @NotNull Item getResult() {
        return this.result;
    }

    public void save(RecipeOutput recipeOutput, ResourceLocation resourceLocation) {
        CuttingBoardAssemblyRecipe recipe = new CuttingBoardAssemblyRecipe(this.ingredients, Optional.ofNullable(this.finisher), new ItemStack(this.result, this.count), this.ordered);
        recipeOutput.accept(resourceLocation, recipe, null);
    }

    @Override
    public void save(RecipeOutput recipeOutput) {
        save(recipeOutput, ResourceLocation.fromNamespaceAndPath("cornexpansion",
                "cutting_board_assembly/"+result.toString().replace("cornexpansion:", "")));
    }
}
