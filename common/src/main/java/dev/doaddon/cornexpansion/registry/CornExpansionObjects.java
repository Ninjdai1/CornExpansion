package dev.doaddon.cornexpansion.registry;

import de.cristelknight.doapi.Util;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.Registrar;
import dev.architectury.registry.registries.RegistrySupplier;
import dev.doaddon.cornexpansion.CornExpansion;
import dev.doaddon.cornexpansion.blocks.EffectFoodBlock;
import dev.doaddon.cornexpansion.items.EffectItem;
import dev.doaddon.cornexpansion.items.PlaceableEffectBlockItem;
import dev.doaddon.cornexpansion.items.StickFoodItem;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.HoneyBottleItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
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
            getFoodItemSettings(FoodUtils.createFood(1, 0.1F, MobEffects.HUNGER, 300, false, false))));
    public static final RegistrySupplier<Item> CORN_FLOUR = registerItem("corn_flour", () -> new Item( getDefaultItemProperties() ));
    public static final RegistrySupplier<Item> DRIED_CORN = registerItem("dried_corn", () -> new Item( getDefaultItemProperties() ));
    public static final RegistrySupplier<Item> CORNMEAL = registerItem("cornmeal", () -> new Item( getDefaultItemProperties() ));

    public static final RegistrySupplier<Item> CORN_SYRUP = registerItem("corn_syrup", () -> new HoneyBottleItem(
            getFoodItemSettings(FoodUtils.createFood(7, 0.3F, MobEffects.MOVEMENT_SLOWDOWN, CornExpansionFoodProperties.SHORT_DURATION, true, false)).stacksTo(16).craftRemainder(Items.GLASS_BOTTLE)));

    public static final RegistrySupplier<Item> DRIED_KERNELS = registerItem("dried_kernels", () -> new Item(getDefaultItemProperties()));
    
    public static final RegistrySupplier<Item> POPCORN = registerItem("popcorn", () -> new Item(
            getFoodItemSettings(CornExpansionFoodProperties.POPCORN_FOOD_PROPERTIES))
    );
    public static final RegistrySupplier<Item> SWEET_POPCORN = registerItem("sweet_popcorn", () -> new EffectItem(
            getFoodItemSettings(CornExpansionFoodProperties.SWEET_POPCORN_FOOD_PROPERTIES))
    );
    public static final RegistrySupplier<Item> BUTTERY_POPCORN = registerItem("buttery_popcorn", () -> new EffectItem(
            getFoodItemSettings(CornExpansionFoodProperties.BUTTERY_POPCORN_FOOD_PROPERTIES))
    );
    public static final RegistrySupplier<Item> CHEESY_POPCORN = registerItem("cheesy_popcorn", () -> new EffectItem(
            getFoodItemSettings(CornExpansionFoodProperties.CHEESY_POPCORN_FOOD_PROPERTIES))
    );
    public static final RegistrySupplier<Item> CANDIED_POPCORN = registerItem("candied_popcorn", () -> new EffectItem(
            getFoodItemSettings(CornExpansionFoodProperties.CANDIED_POPCORN_FOOD_PROPERTIES))
    );

    public static final RegistrySupplier<Item> CORN_ON_THE_COB = registerItem("corn_on_the_cob", () -> new StickFoodItem(
            getFoodItemSettings(FoodUtils.createFood(2, 0.2F)).stacksTo(16))
    );
    public static final RegistrySupplier<Item> GRILLED_CORN = registerItem("grilled_corn", () -> new StickFoodItem(
            getFoodItemSettings(FoodUtils.createFood(4, 0.4F)).stacksTo(16))
    );

    public static final RegistrySupplier<Block> POPCORN_TIN_BLOCK = registerWithoutItem("popcorn_tin", () -> new EffectFoodBlock(BlockBehaviour.Properties.copy(Blocks.CAKE), 8, CornExpansionFoodProperties.POPCORN_FOOD_PROPERTIES));
    public static final RegistrySupplier<Block> SWEET_POPCORN_TIN_BLOCK = registerWithoutItem("sweet_popcorn_tin", () -> new EffectFoodBlock(BlockBehaviour.Properties.copy(Blocks.CAKE), 8, CornExpansionFoodProperties.SWEET_POPCORN_FOOD_PROPERTIES));
    public static final RegistrySupplier<Block> BUTTERY_POPCORN_TIN_BLOCK = registerWithoutItem("buttery_popcorn_tin", () -> new EffectFoodBlock(BlockBehaviour.Properties.copy(Blocks.CAKE), 8, CornExpansionFoodProperties.BUTTERY_POPCORN_FOOD_PROPERTIES));
    public static final RegistrySupplier<Block> CHEESY_POPCORN_TIN_BLOCK = registerWithoutItem("cheesy_popcorn_tin", () -> new EffectFoodBlock(BlockBehaviour.Properties.copy(Blocks.CAKE), 8, CornExpansionFoodProperties.CHEESY_POPCORN_FOOD_PROPERTIES));
    public static final RegistrySupplier<Block> CANDIED_POPCORN_TIN_BLOCK = registerWithoutItem("candied_popcorn_tin", () -> new EffectFoodBlock(BlockBehaviour.Properties.copy(Blocks.CAKE), 8, CornExpansionFoodProperties.CANDIED_POPCORN_FOOD_PROPERTIES));

    public static final RegistrySupplier<Item> POPCORN_TIN = registerItem("popcorn_tin", () -> new PlaceableEffectBlockItem((EffectFoodBlock) POPCORN_TIN_BLOCK.get(), getDefaultItemProperties().stacksTo(16)));
    public static final RegistrySupplier<Item> SWEET_POPCORN_TIN = registerItem("sweet_popcorn_tin", () -> new PlaceableEffectBlockItem((EffectFoodBlock) SWEET_POPCORN_TIN_BLOCK.get(), getDefaultItemProperties().stacksTo(16)));
    public static final RegistrySupplier<Item> BUTTERY_POPCORN_TIN = registerItem("buttery_popcorn_tin", () -> new PlaceableEffectBlockItem((EffectFoodBlock) BUTTERY_POPCORN_TIN_BLOCK.get(), getDefaultItemProperties().stacksTo(16)));
    public static final RegistrySupplier<Item> CHEESY_POPCORN_TIN = registerItem("cheesy_popcorn_tin", () -> new PlaceableEffectBlockItem((EffectFoodBlock) CHEESY_POPCORN_TIN_BLOCK.get(), getDefaultItemProperties().stacksTo(16)));
    public static final RegistrySupplier<Item> CANDIED_POPCORN_TIN = registerItem("candied_popcorn_tin", () -> new PlaceableEffectBlockItem((EffectFoodBlock) CANDIED_POPCORN_TIN_BLOCK.get(), getDefaultItemProperties().stacksTo(16)));


    public static final RegistrySupplier<Item> GRANDMAS_CORNBREAD = registerItem("grandmas_cornbread", () -> new EffectItem(
            getFoodItemSettings(FoodUtils.createFood(6, 0.9F, MobEffectRegistry.GRANDMAS_BLESSING.get(), CornExpansionFoodProperties.SHORT_DURATION, false, false))));
    public static final RegistrySupplier<Item> CORN_SYRUP_COOKIE = registerItem("corn_syrup_cookie", () -> new EffectItem(
            getFoodItemSettings(FoodUtils.createFood(3, 0.2F, MobEffects.MOVEMENT_SLOWDOWN, CornExpansionFoodProperties.BRIEF_DURATION, false, false))));

    public static final RegistrySupplier<Item> POLENTA = registerItem("polenta", () -> new EffectItem(
            getFoodItemSettings(FoodUtils.createFood(3, 0.2F, false, false))));
    public static final RegistrySupplier<Item> SWEET_POLENTA = registerItem("sweet_polenta", () -> new EffectItem(
            getFoodItemSettings(FoodUtils.createFood(3, 0.2F, MobEffects.MOVEMENT_SPEED, CornExpansionFoodProperties.SHORT_DURATION, false, false))));
    public static final RegistrySupplier<Item> BUTTERY_POLENTA = registerItem("buttery_polenta", () -> new EffectItem(
            getFoodItemSettings(FoodUtils.createFood(3, 0.4F, MobEffectRegistry.SATIATION, CornExpansionFoodProperties.SHORT_DURATION, false, false))));
    public static final RegistrySupplier<Item> CHEESY_POLENTA = registerItem("cheesy_polenta", () -> new EffectItem(
            getFoodItemSettings(FoodUtils.createFood(4, 0.4F, MobEffectRegistry.SUSTENANCE, CornExpansionFoodProperties.SHORT_DURATION, false, false))));


    public static void init() {
        ITEMS.register();
        BLOCKS.register();
    }

    private static Item.Properties getDefaultItemProperties(Consumer<Item.Properties> consumer) {
        Item.Properties settings = new Item.Properties().arch$tab(CornExpansionCreativeTabs.CORNEXPANSION_TAB);
        consumer.accept(settings);
        return settings;
    }

    static Item.Properties getDefaultItemProperties() {
        return getDefaultItemProperties(settings -> {
        });
    }

    public static <T extends Block> RegistrySupplier<T> registerWithItem(String name, Supplier<T> block) {
        return Util.registerWithItem(BLOCKS, BLOCK_REGISTRAR, ITEMS, ITEM_REGISTRAR, CornExpansion.id(name), block);
    }

    public static Item.Properties getFoodItemSettings(FoodProperties foodProperties) {
        return getDefaultItemProperties().food(foodProperties);
    }

    public static <T extends Block> RegistrySupplier<T> registerWithoutItem(String path, Supplier<T> block) {
        return Util.registerWithoutItem(BLOCKS, BLOCK_REGISTRAR, CornExpansion.id(path), block);
    }

    public static <T extends Item> RegistrySupplier<T> registerItem(String path, Supplier<T> itemSupplier) {
        return Util.registerItem(ITEMS, ITEM_REGISTRAR, CornExpansion.id(path), itemSupplier);
    }
}
