package dev.doaddon.cornexpansion.registry;

import de.cristelknight.doapi.Util;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.Registrar;
import dev.architectury.registry.registries.RegistrySupplier;
import dev.doaddon.cornexpansion.CornExpansion;
import dev.doaddon.cornexpansion.blocks.EffectFoodBlock;
import dev.doaddon.cornexpansion.items.StickFoodItem;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.HoneyBottleItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.satisfy.farm_and_charm.item.food.EffectBlockItem;
import net.satisfy.farm_and_charm.registry.MobEffectRegistry;
import dev.doaddon.cornexpansion.utils.CornExpansionFoodProperties;
import dev.doaddon.cornexpansion.utils.FoodUtils;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class CornExpansionObjects {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(CornExpansion.MOD_ID, Registries.ITEM);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(CornExpansion.MOD_ID, Registries.BLOCK);
    public static final Registrar<Item> ITEM_REGISTRAR = ITEMS.getRegistrar();
    public static final Registrar<Block> BLOCK_REGISTRAR = BLOCKS.getRegistrar();

    public static final RegistrySupplier<Item> CORN_DOUGH = registerItem("corn_dough", () -> new Item(
            new Item.Properties().food(FoodUtils.createFood(1, 0.1F, MobEffects.HUNGER, 300, false, false)).arch$tab(CornExpansionCreativeTabs.CORNEXPANSION_TAB)));
    public static final RegistrySupplier<Item> CORN_FLOUR = registerItem("corn_flour", () -> new Item(
            new Item.Properties().arch$tab(CornExpansionCreativeTabs.CORNEXPANSION_TAB)));
    public static final RegistrySupplier<Item> DRIED_CORN = registerItem("dried_corn", () -> new Item(
            new Item.Properties().arch$tab(CornExpansionCreativeTabs.CORNEXPANSION_TAB)));
    public static final RegistrySupplier<Item> CORNMEAL = registerItem("cornmeal", () -> new Item(
            new Item.Properties().arch$tab(CornExpansionCreativeTabs.CORNEXPANSION_TAB)));
    public static final RegistrySupplier<Item> CORN_SYRUP = registerItem("corn_syrup", () -> new HoneyBottleItem(
            new Item.Properties().stacksTo(16).craftRemainder(Items.GLASS_BOTTLE).food(FoodUtils.createFood(7, 0.3F, MobEffects.MOVEMENT_SLOWDOWN, 1400, true, false)).arch$tab(CornExpansionCreativeTabs.CORNEXPANSION_TAB)));

    public static final RegistrySupplier<Item> DRIED_KERNELS = registerItem("dried_kernels", () -> new Item(
            new Item.Properties().arch$tab(CornExpansionCreativeTabs.CORNEXPANSION_TAB)));
    
    public static final RegistrySupplier<Item> POPCORN = registerItem("popcorn", () -> new Item(
            getFoodItemSettings(CornExpansionFoodProperties.POPCORN_FOOD_PROPERTIES))
    );
    public static final RegistrySupplier<Item> SWEET_POPCORN = registerItem("sweet_popcorn", () -> new Item(
            getFoodItemSettings(CornExpansionFoodProperties.SWEET_POPCORN_FOOD_PROPERTIES))
    );
    public static final RegistrySupplier<Item> BUTTERY_POPCORN = registerItem("buttery_popcorn", () -> new Item(
            getFoodItemSettings(CornExpansionFoodProperties.BUTTERY_POPCORN_FOOD_PROPERTIES))
    );
    public static final RegistrySupplier<Item> CHEESY_POPCORN = registerItem("cheesy_popcorn", () -> new Item(
            getFoodItemSettings(CornExpansionFoodProperties.CHEESY_POPCORN_FOOD_PROPERTIES))
    );
    public static final RegistrySupplier<Item> CANDIED_POPCORN = registerItem("candied_popcorn", () -> new Item(
            getFoodItemSettings(CornExpansionFoodProperties.CANDIED_POPCORN_FOOD_PROPERTIES))
    );

    public static final RegistrySupplier<Item> CORN_ON_THE_COB = registerItem("corn_on_the_cob", () -> new StickFoodItem(
            new Item.Properties().food(FoodUtils.createFood(2, 0.2F)).stacksTo(16).arch$tab(CornExpansionCreativeTabs.CORNEXPANSION_TAB))
    );
    public static final RegistrySupplier<Item> GRILLED_CORN = registerItem("grilled_corn", () -> new StickFoodItem(
            new Item.Properties().food(FoodUtils.createFood(4, 0.4F)).stacksTo(16).arch$tab(CornExpansionCreativeTabs.CORNEXPANSION_TAB))
    );

    public static final RegistrySupplier<Block> POPCORN_TIN_BLOCK = registerWithoutItem("popcorn_tin", () -> new EffectFoodBlock(BlockBehaviour.Properties.copy(Blocks.CAKE), 8, CornExpansionFoodProperties.POPCORN_FOOD_PROPERTIES));
    public static final RegistrySupplier<Block> SWEET_POPCORN_TIN_BLOCK = registerWithoutItem("sweet_popcorn_tin", () -> new EffectFoodBlock(BlockBehaviour.Properties.copy(Blocks.CAKE), 8, CornExpansionFoodProperties.SWEET_POPCORN_FOOD_PROPERTIES));
    public static final RegistrySupplier<Block> BUTTERY_POPCORN_TIN_BLOCK = registerWithoutItem("buttery_popcorn_tin", () -> new EffectFoodBlock(BlockBehaviour.Properties.copy(Blocks.CAKE), 8, CornExpansionFoodProperties.BUTTERY_POPCORN_FOOD_PROPERTIES));
    public static final RegistrySupplier<Block> CHEESY_POPCORN_TIN_BLOCK = registerWithoutItem("cheesy_popcorn_tin", () -> new EffectFoodBlock(BlockBehaviour.Properties.copy(Blocks.CAKE), 8, CornExpansionFoodProperties.CHEESY_POPCORN_FOOD_PROPERTIES));
    public static final RegistrySupplier<Block> CANDIED_POPCORN_TIN_BLOCK = registerWithoutItem("candied_popcorn_tin", () -> new EffectFoodBlock(BlockBehaviour.Properties.copy(Blocks.CAKE), 8, CornExpansionFoodProperties.CANDIED_POPCORN_FOOD_PROPERTIES));

    public static final RegistrySupplier<Item> POPCORN_TIN = registerItem("popcorn_tin", () -> new EffectBlockItem(POPCORN_TIN_BLOCK.get(), new Item.Properties().arch$tab(CornExpansionCreativeTabs.CORNEXPANSION_TAB)));
    public static final RegistrySupplier<Item> SWEET_POPCORN_TIN = registerItem("sweet_popcorn_tin", () -> new EffectBlockItem(SWEET_POPCORN_TIN_BLOCK.get(), new Item.Properties().arch$tab(CornExpansionCreativeTabs.CORNEXPANSION_TAB)));
    public static final RegistrySupplier<Item> BUTTERY_POPCORN_TIN = registerItem("buttery_popcorn_tin", () -> new EffectBlockItem(BUTTERY_POPCORN_TIN_BLOCK.get(), new Item.Properties().arch$tab(CornExpansionCreativeTabs.CORNEXPANSION_TAB)));
    public static final RegistrySupplier<Item> CHEESY_POPCORN_TIN = registerItem("cheesy_popcorn_tin", () -> new EffectBlockItem(CHEESY_POPCORN_TIN_BLOCK.get(), new Item.Properties().arch$tab(CornExpansionCreativeTabs.CORNEXPANSION_TAB)));
    public static final RegistrySupplier<Item> CANDIED_POPCORN_TIN = registerItem("candied_popcorn_tin", () -> new EffectBlockItem(CANDIED_POPCORN_TIN_BLOCK.get(), new Item.Properties().arch$tab(CornExpansionCreativeTabs.CORNEXPANSION_TAB)));


    public static final RegistrySupplier<Item> GRANDMAS_CORNBREAD = registerItem("grandmas_cornbread", () -> new Item(
            new Item.Properties().food(FoodUtils.createFood(6, 0.9F, MobEffectRegistry.GRANDMAS_BLESSING.get(), 1200, false, false)).arch$tab(CornExpansionCreativeTabs.CORNEXPANSION_TAB)));

    public static final RegistrySupplier<Item> POLENTA = registerItem("polenta", () -> new Item(
            new Item.Properties().food(FoodUtils.createFood(3, 0.2F, false, false)).arch$tab(CornExpansionCreativeTabs.CORNEXPANSION_TAB)));
    public static final RegistrySupplier<Item> SWEET_POLENTA = registerItem("sweet_polenta", () -> new Item(
            new Item.Properties().food(FoodUtils.createFood(3, 0.2F, MobEffects.MOVEMENT_SPEED, 1200, false, false)).arch$tab(CornExpansionCreativeTabs.CORNEXPANSION_TAB)));
    public static final RegistrySupplier<Item> BUTTERY_POLENTA = registerItem("buttery_polenta", () -> new Item(
            new Item.Properties().food(FoodUtils.createFood(3, 0.4F, MobEffectRegistry.SATIATION, 1200, false, false)).arch$tab(CornExpansionCreativeTabs.CORNEXPANSION_TAB)));
    public static final RegistrySupplier<Item> CHEESY_POLENTA = registerItem("cheesy_polenta", () -> new Item(
            new Item.Properties().food(FoodUtils.createFood(4, 0.4F, MobEffectRegistry.SUSTENANCE, 1200, false, false)).arch$tab(CornExpansionCreativeTabs.CORNEXPANSION_TAB)));


    public static void init() {
        ITEMS.register();
        BLOCKS.register();
    }

    private static Item.Properties getSettings(Consumer<Item.Properties> consumer) {
        Item.Properties settings = new Item.Properties().arch$tab(CornExpansionCreativeTabs.CORNEXPANSION_TAB);
        consumer.accept(settings);
        return settings;
    }

    private static Item.Properties getSettingsWithoutTab(Consumer<Item.Properties> consumer) {
        Item.Properties settings = new Item.Properties();
        consumer.accept(settings);
        return settings;
    }

    static Item.Properties getSettings() {
        return getSettings(settings -> {
        });
    }

    private static Item.Properties getSettingsWithoutTab() {
        return getSettingsWithoutTab(settings -> {
        });
    }

    public static <T extends Block> RegistrySupplier<T> registerWithItem(String name, Supplier<T> block) {
        return Util.registerWithItem(BLOCKS, BLOCK_REGISTRAR, ITEMS, ITEM_REGISTRAR, CornExpansion.id(name), block);
    }

    public static Item.Properties getFoodItemSettings(int nutrition, float saturationMod, MobEffect effect, int duration, boolean alwaysEat, boolean fast) {
        return getSettings().food(FoodUtils.createFood(nutrition, saturationMod, effect, duration, alwaysEat, fast));
    }
    public static Item.Properties getFoodItemSettings(FoodProperties foodProperties) {
        return getSettings().food(foodProperties);
    }

//    private static FoodProperties createFood(int nutrition, float saturationMod, MobEffect effect, int duration, boolean alwaysEat, boolean fast) {
//        FoodProperties.Builder food = new FoodProperties.Builder().nutrition(nutrition).saturationMod(saturationMod);
//        if (alwaysEat) food.alwaysEat();
//        if (fast) food.fast();
//        if (effect != null) food.effect(new MobEffectInstance(effect, duration), 1.0f);
//        return food.build();
//    }


    public static <T extends Block> RegistrySupplier<T> registerWithoutItem(String path, Supplier<T> block) {
        return Util.registerWithoutItem(BLOCKS, BLOCK_REGISTRAR, CornExpansion.id(path), block);
    }

    public static <T extends Item> RegistrySupplier<T> registerItem(String path, Supplier<T> itemSupplier) {
        return Util.registerItem(ITEMS, ITEM_REGISTRAR, CornExpansion.id(path), itemSupplier);
    }
}
