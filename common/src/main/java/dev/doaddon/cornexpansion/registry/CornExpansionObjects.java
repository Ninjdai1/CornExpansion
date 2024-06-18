package dev.doaddon.cornexpansion.registry;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import dev.doaddon.cornexpansion.CornExpansion;
import dev.doaddon.cornexpansion.items.StickFoodItem;
import dev.doaddon.cornexpansion.registry.CornExpansionBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.satisfy.farm_and_charm.block.FoodBlock;
import net.satisfy.farm_and_charm.item.food.EffectBlockItem;
import net.satisfy.farm_and_charm.item.registry.MobEffectRegistry;

public class CornExpansionObjects {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(CornExpansion.MOD_ID, Registries.ITEM);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(CornExpansion.MOD_ID, Registries.BLOCK);

    public static final FoodProperties POPCORN_FOOD_PROPERTIES = createFood(1, 0F, true, true);
    public static final RegistrySupplier<Item> POPCORN = ITEMS.register("popcorn", () -> new Item(
            new Item.Properties().food(POPCORN_FOOD_PROPERTIES).arch$tab(CornExpansionCreativeTabs.CORNEXPANSION_TAB))
    );
    public static final FoodProperties SWEET_POPCORN_FOOD_PROPERTIES = createFood(1, 0F, MobEffects.MOVEMENT_SPEED, 200, true, true);
    public static final RegistrySupplier<Item> SWEET_POPCORN = ITEMS.register("sweet_popcorn", () -> new Item(
            new Item.Properties().food(SWEET_POPCORN_FOOD_PROPERTIES).arch$tab(CornExpansionCreativeTabs.CORNEXPANSION_TAB))
    );
    public static final FoodProperties BUTTERY_POPCORN_FOOD_PROPERTIES = createFood(1, 0.1F, MobEffectRegistry.SATIATION, 1200, true, true);
    public static final RegistrySupplier<Item> BUTTERY_POPCORN = ITEMS.register("buttery_popcorn", () -> new Item(
            new Item.Properties().food(BUTTERY_POPCORN_FOOD_PROPERTIES).arch$tab(CornExpansionCreativeTabs.CORNEXPANSION_TAB))
    );
    public static final FoodProperties CHEESY_POPCORN_FOOD_PROPERTIES = createFood(3, 0.3F, MobEffectRegistry.SUSTENANCE, 1200, true, true);
    public static final RegistrySupplier<Item> CHEESY_POPCORN = ITEMS.register("cheesy_popcorn", () -> new Item(
            new Item.Properties().food(CHEESY_POPCORN_FOOD_PROPERTIES).arch$tab(CornExpansionCreativeTabs.CORNEXPANSION_TAB))
    );
    public static final FoodProperties CANDIED_POPCORN_FOOD_PROPERTIES = createFood(2, 0.2F, MobEffectRegistry.SWEETS,600, true, true);
    public static final RegistrySupplier<Item> CANDIED_POPCORN = ITEMS.register("candied_popcorn", () -> new Item(
            new Item.Properties().food(CANDIED_POPCORN_FOOD_PROPERTIES).arch$tab(CornExpansionCreativeTabs.CORNEXPANSION_TAB))
    );

    public static final RegistrySupplier<Item> CORN_ON_THE_COB = ITEMS.register("corn_on_the_cob", () -> new StickFoodItem(
            new Item.Properties().food(createFood(2, 0.2F, false, true)).stacksTo(16).arch$tab(CornExpansionCreativeTabs.CORNEXPANSION_TAB))
    );
    public static final RegistrySupplier<Item> GRILLED_CORN = ITEMS.register("grilled_corn", () -> new StickFoodItem(
            new Item.Properties().food(createFood(4, 0.4F, false, true)).stacksTo(16).arch$tab(CornExpansionCreativeTabs.CORNEXPANSION_TAB))
    );

    public static final RegistrySupplier<Item> POPCORN_TIN = ITEMS.register("popcorn_tin", () -> new EffectBlockItem(CornExpansionBlocks.POPCORN_TIN_BLOCK.get(), new Item.Properties().arch$tab(CornExpansionCreativeTabs.CORNEXPANSION_TAB)));
    public static final RegistrySupplier<Item> SWEET_POPCORN_TIN = ITEMS.register("sweet_popcorn_tin", () -> new EffectBlockItem(CornExpansionBlocks.SWEET_POPCORN_TIN_BLOCK.get(), new Item.Properties().arch$tab(CornExpansionCreativeTabs.CORNEXPANSION_TAB)));
    public static final RegistrySupplier<Item> BUTTERY_POPCORN_TIN = ITEMS.register("buttery_popcorn_tin", () -> new EffectBlockItem(CornExpansionBlocks.BUTTERY_POPCORN_TIN_BLOCK.get(), new Item.Properties().arch$tab(CornExpansionCreativeTabs.CORNEXPANSION_TAB)));
    public static final RegistrySupplier<Item> CHEESY_POPCORN_TIN = ITEMS.register("cheesy_popcorn_tin", () -> new EffectBlockItem(CornExpansionBlocks.CHEESY_POPCORN_TIN_BLOCK.get(), new Item.Properties().arch$tab(CornExpansionCreativeTabs.CORNEXPANSION_TAB)));
    public static final RegistrySupplier<Item> CANDIED_POPCORN_TIN = ITEMS.register("candied_popcorn_tin", () -> new EffectBlockItem(CornExpansionBlocks.CANDIED_POPCORN_TIN_BLOCK.get(), new Item.Properties().arch$tab(CornExpansionCreativeTabs.CORNEXPANSION_TAB)));


    private static FoodProperties createFood(int nutrition, float saturationMod, boolean alwaysEat, boolean fast) {
        return createFood(nutrition, saturationMod, null, 0, alwaysEat, fast);
    }

    private static FoodProperties createFood(int nutrition, float saturationMod, MobEffect effect, int duration, boolean alwaysEat, boolean fast) {
        FoodProperties.Builder food = new FoodProperties.Builder().nutrition(nutrition).saturationMod(saturationMod);
        if (alwaysEat) food.alwaysEat();
        if (fast) food.fast();
        if (effect != null) food.effect(new MobEffectInstance(effect, duration), 1.0f);
        return food.build();
    }

    public static void init() {
        ITEMS.register();
    }
}
