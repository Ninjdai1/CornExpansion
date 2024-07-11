package dev.doaddon.cornexpansion.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;

public class TinBlock extends EffectFoodBlock{
    public TinBlock(Properties settings, int maxBites, FoodProperties foodComponent) {
        super(settings, maxBites, foodComponent);
    }

    VoxelShape voxelShape = Shapes.join(Block.box(5, 0, 5, 11, 9, 11), Block.box(4, 7, 4, 12, 9, 12), BooleanOp.OR);

    @Override
    public @NotNull VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return voxelShape;
    }
}
