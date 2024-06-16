package dev.doaddon.cornexpansion.blocks;

import net.minecraft.core.Direction;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.satisfy.farm_and_charm.block.EffectFoodBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;

public class EightBitesEffectFoodBlock extends EffectFoodBlock {
    public static final IntegerProperty BITES = IntegerProperty.create("bites", 0, 7);

    public EightBitesEffectFoodBlock(Properties settings, FoodProperties foodComponent) {
        super(settings, 7, foodComponent);
        this.registerDefaultState(this.stateDefinition.any().setValue(BITES, 0).setValue(FACING, Direction.NORTH));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder);
        builder.add(BITES);
    }
}
