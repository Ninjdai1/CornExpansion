package dev.doaddon.cornexpansion.registry;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import dev.doaddon.cornexpansion.CornExpansion;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import dev.doaddon.cornexpansion.blocks.EffectFoodBlock;

public class CornExpansionBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(CornExpansion.MOD_ID, Registries.BLOCK);

    public static final RegistrySupplier<Block> POPCORN_TIN_BLOCK = BLOCKS.register("popcorn_tin", () -> new EffectFoodBlock(BlockBehaviour.Properties.copy(Blocks.CAKE), 8, CornExpansionObjects.POPCORN_FOOD_PROPERTIES));
    public static final RegistrySupplier<Block> SWEET_POPCORN_TIN_BLOCK = BLOCKS.register("sweet_popcorn_tin", () -> new EffectFoodBlock(BlockBehaviour.Properties.copy(Blocks.CAKE), 8, CornExpansionObjects.SWEET_POPCORN_FOOD_PROPERTIES));
    public static final RegistrySupplier<Block> BUTTERY_POPCORN_TIN_BLOCK = BLOCKS.register("buttery_popcorn_tin", () -> new EffectFoodBlock(BlockBehaviour.Properties.copy(Blocks.CAKE), 8, CornExpansionObjects.BUTTERY_POPCORN_FOOD_PROPERTIES));
    public static final RegistrySupplier<Block> CHEESY_POPCORN_TIN_BLOCK = BLOCKS.register("cheesy_popcorn_tin", () -> new EffectFoodBlock(BlockBehaviour.Properties.copy(Blocks.CAKE), 8, CornExpansionObjects.CHEESY_POPCORN_FOOD_PROPERTIES));
    public static final RegistrySupplier<Block> CANDIED_POPCORN_TIN_BLOCK = BLOCKS.register("candied_popcorn_tin", () -> new EffectFoodBlock(BlockBehaviour.Properties.copy(Blocks.CAKE), 8, CornExpansionObjects.CANDIED_POPCORN_FOOD_PROPERTIES));

    public static void init() {
        BLOCKS.register();
    }
}
