package dev.doaddon.cornexpansion.registry;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import dev.doaddon.cornexpansion.CornExpansion;
import dev.doaddon.cornexpansion.blocks.EightBitesEffectFoodBlock;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.satisfy.farm_and_charm.block.EffectFoodBlock;

public class CornExpansionBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(CornExpansion.MOD_ID, Registries.BLOCK);

    public static final RegistrySupplier<Block> POPCORN_TIN_BLOCK = BLOCKS.register("popcorn_tin", () -> new EffectFoodBlock(BlockBehaviour.Properties.copy(Blocks.CAKE), 3, CornExpansionObjects.POPCORN_FOOD_PROPERTIES));
    public static final RegistrySupplier<Block> SWEET_POPCORN_TIN_BLOCK = BLOCKS.register("sweet_popcorn_tin", () -> new EffectFoodBlock(BlockBehaviour.Properties.copy(Blocks.CAKE), 3, CornExpansionObjects.SWEET_POPCORN_FOOD_PROPERTIES));
    public static final RegistrySupplier<Block> BUTTERY_POPCORN_TIN_BLOCK = BLOCKS.register("buttery_popcorn_tin", () -> new EffectFoodBlock(BlockBehaviour.Properties.copy(Blocks.CAKE), 3, CornExpansionObjects.BUTTERY_POPCORN_FOOD_PROPERTIES));
    public static final RegistrySupplier<Block> CHEESY_POPCORN_TIN_BLOCK = BLOCKS.register("cheesy_popcorn_tin", () -> new EffectFoodBlock(BlockBehaviour.Properties.copy(Blocks.CAKE), 3, CornExpansionObjects.CHEESY_POPCORN_FOOD_PROPERTIES));
    public static final RegistrySupplier<Block> CANDIED_POPCORN_TIN_BLOCK = BLOCKS.register("candied_popcorn_tin", () -> new EffectFoodBlock(BlockBehaviour.Properties.copy(Blocks.CAKE), 3, CornExpansionObjects.CANDIED_POPCORN_FOOD_PROPERTIES));

    public static void init() {
        BLOCKS.register();
    }
}
