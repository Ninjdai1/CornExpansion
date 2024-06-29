package dev.doaddon.cornexpansion.registry;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import dev.doaddon.cornexpansion.CornExpansion;
import dev.doaddon.cornexpansion.items.StickFoodItem;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.HoneyBottleItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.satisfy.farm_and_charm.item.food.EffectBlockItem;
import net.satisfy.farm_and_charm.registry.MobEffectRegistry;
import dev.doaddon.cornexpansion.utils.FoodUtils;

public class CornExpansionObjects {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(CornExpansion.MOD_ID, Registries.ITEM);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(CornExpansion.MOD_ID, Registries.BLOCK);

    public static final RegistrySupplier<Item> CORN_DOUGH = ITEMS.register("corn_dough", () -> new Item(
            new Item.Properties().food(FoodUtils.createFood(1, 0.1F, MobEffects.HUNGER, 300, false, false)).arch$tab(CornExpansionCreativeTabs.CORNEXPANSION_TAB)));
    public static final RegistrySupplier<Item> CORN_FLOUR = ITEMS.register("corn_flour", () -> new Item(
            new Item.Properties().arch$tab(CornExpansionCreativeTabs.CORNEXPANSION_TAB)));
    public static final RegistrySupplier<Item> DRIED_CORN = ITEMS.register("dried_corn", () -> new Item(
            new Item.Properties().arch$tab(CornExpansionCreativeTabs.CORNEXPANSION_TAB)));
    public static final RegistrySupplier<Item> CORNMEAL = ITEMS.register("cornmeal", () -> new Item(
            new Item.Properties().arch$tab(CornExpansionCreativeTabs.CORNEXPANSION_TAB)));
    public static final RegistrySupplier<Item> CORN_SYRUP = ITEMS.register("corn_syrup", () -> new HoneyBottleItem(
            new Item.Properties().stacksTo(16).craftRemainder(Items.GLASS_BOTTLE).food(FoodUtils.createFood(7, 0.3F, MobEffects.MOVEMENT_SLOWDOWN, 1400, true, false)).arch$tab(CornExpansionCreativeTabs.CORNEXPANSION_TAB)));

    public static final RegistrySupplier<Item> DRIED_KERNELS = ITEMS.register("dried_kernels", () -> new Item(
            new Item.Properties().arch$tab(CornExpansionCreativeTabs.CORNEXPANSION_TAB)));
    
    public static final FoodProperties POPCORN_FOOD_PROPERTIES = FoodUtils.createFood(1, 0F, true, true);
    public static final RegistrySupplier<Item> POPCORN = ITEMS.register("popcorn", () -> new Item(
            new Item.Properties().food(POPCORN_FOOD_PROPERTIES).arch$tab(CornExpansionCreativeTabs.CORNEXPANSION_TAB))
    );
    public static final FoodProperties SWEET_POPCORN_FOOD_PROPERTIES = FoodUtils.createFood(1, 0F, MobEffects.MOVEMENT_SPEED, 200, true, true);
    public static final RegistrySupplier<Item> SWEET_POPCORN = ITEMS.register("sweet_popcorn", () -> new Item(
            new Item.Properties().food(SWEET_POPCORN_FOOD_PROPERTIES).arch$tab(CornExpansionCreativeTabs.CORNEXPANSION_TAB))
    );
    public static final FoodProperties BUTTERY_POPCORN_FOOD_PROPERTIES = FoodUtils.createFood(1, 0.1F, MobEffectRegistry.SATIATION, 1200, true, true);
    public static final RegistrySupplier<Item> BUTTERY_POPCORN = ITEMS.register("buttery_popcorn", () -> new Item(
            new Item.Properties().food(BUTTERY_POPCORN_FOOD_PROPERTIES).arch$tab(CornExpansionCreativeTabs.CORNEXPANSION_TAB))
    );
    public static final FoodProperties CHEESY_POPCORN_FOOD_PROPERTIES = FoodUtils.createFood(3, 0.3F, MobEffectRegistry.SUSTENANCE, 1200, true, true);
    public static final RegistrySupplier<Item> CHEESY_POPCORN = ITEMS.register("cheesy_popcorn", () -> new Item(
            new Item.Properties().food(CHEESY_POPCORN_FOOD_PROPERTIES).arch$tab(CornExpansionCreativeTabs.CORNEXPANSION_TAB))
    );
    public static final FoodProperties CANDIED_POPCORN_FOOD_PROPERTIES = FoodUtils.createFood(2, 0.2F, MobEffectRegistry.SWEETS,600, true, true);
    public static final RegistrySupplier<Item> CANDIED_POPCORN = ITEMS.register("candied_popcorn", () -> new Item(
            new Item.Properties().food(CANDIED_POPCORN_FOOD_PROPERTIES).arch$tab(CornExpansionCreativeTabs.CORNEXPANSION_TAB))
    );

    public static final RegistrySupplier<Item> CORN_ON_THE_COB = ITEMS.register("corn_on_the_cob", () -> new StickFoodItem(
            new Item.Properties().food(FoodUtils.createFood(2, 0.2F)).stacksTo(16).arch$tab(CornExpansionCreativeTabs.CORNEXPANSION_TAB))
    );
    public static final RegistrySupplier<Item> GRILLED_CORN = ITEMS.register("grilled_corn", () -> new StickFoodItem(
            new Item.Properties().food(FoodUtils.createFood(4, 0.4F)).stacksTo(16).arch$tab(CornExpansionCreativeTabs.CORNEXPANSION_TAB))
    );

    public static final RegistrySupplier<Item> POPCORN_TIN = ITEMS.register("popcorn_tin", () -> new EffectBlockItem(CornExpansionBlocks.POPCORN_TIN_BLOCK.get(), new Item.Properties().arch$tab(CornExpansionCreativeTabs.CORNEXPANSION_TAB)));
    public static final RegistrySupplier<Item> SWEET_POPCORN_TIN = ITEMS.register("sweet_popcorn_tin", () -> new EffectBlockItem(CornExpansionBlocks.SWEET_POPCORN_TIN_BLOCK.get(), new Item.Properties().arch$tab(CornExpansionCreativeTabs.CORNEXPANSION_TAB)));
    public static final RegistrySupplier<Item> BUTTERY_POPCORN_TIN = ITEMS.register("buttery_popcorn_tin", () -> new EffectBlockItem(CornExpansionBlocks.BUTTERY_POPCORN_TIN_BLOCK.get(), new Item.Properties().arch$tab(CornExpansionCreativeTabs.CORNEXPANSION_TAB)));
    public static final RegistrySupplier<Item> CHEESY_POPCORN_TIN = ITEMS.register("cheesy_popcorn_tin", () -> new EffectBlockItem(CornExpansionBlocks.CHEESY_POPCORN_TIN_BLOCK.get(), new Item.Properties().arch$tab(CornExpansionCreativeTabs.CORNEXPANSION_TAB)));
    public static final RegistrySupplier<Item> CANDIED_POPCORN_TIN = ITEMS.register("candied_popcorn_tin", () -> new EffectBlockItem(CornExpansionBlocks.CANDIED_POPCORN_TIN_BLOCK.get(), new Item.Properties().arch$tab(CornExpansionCreativeTabs.CORNEXPANSION_TAB)));

    public static final RegistrySupplier<Item> GRANDMAS_CORNBREAD = ITEMS.register("grandmas_cornbread", () -> new Item(
            new Item.Properties().food(FoodUtils.createFood(6, 0.9F, MobEffectRegistry.GRANDMAS_BLESSING.get(), 1200, false, false)).arch$tab(CornExpansionCreativeTabs.CORNEXPANSION_TAB)));

    public static final RegistrySupplier<Item> POLENTA = ITEMS.register("polenta", () -> new Item(
            new Item.Properties().food(FoodUtils.createFood(3, 0.2F, false, false)).arch$tab(CornExpansionCreativeTabs.CORNEXPANSION_TAB)));
    public static final RegistrySupplier<Item> SWEET_POLENTA = ITEMS.register("sweet_polenta", () -> new Item(
            new Item.Properties().food(FoodUtils.createFood(3, 0.2F, MobEffects.MOVEMENT_SPEED, 1200, false, false)).arch$tab(CornExpansionCreativeTabs.CORNEXPANSION_TAB)));
    public static final RegistrySupplier<Item> BUTTERY_POLENTA = ITEMS.register("buttery_polenta", () -> new Item(
            new Item.Properties().food(FoodUtils.createFood(3, 0.4F, MobEffectRegistry.SATIATION, 1200, false, false)).arch$tab(CornExpansionCreativeTabs.CORNEXPANSION_TAB)));
    public static final RegistrySupplier<Item> CHEESY_POLENTA = ITEMS.register("cheesy_polenta", () -> new Item(
            new Item.Properties().food(FoodUtils.createFood(4, 0.4F, MobEffectRegistry.SUSTENANCE, 1200, false, false)).arch$tab(CornExpansionCreativeTabs.CORNEXPANSION_TAB)));

    public static void init() {
        ITEMS.register();
    }
}
