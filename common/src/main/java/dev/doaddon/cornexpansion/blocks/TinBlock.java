package dev.doaddon.cornexpansion.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.ItemInteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.DyeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;

public class TinBlock extends EffectFoodBlock{
    public static final EnumProperty<DyeColor> COLOR;
    public TinBlock(Properties settings, int maxBites, FoodProperties foodComponent) {
        super(settings, maxBites, foodComponent);
        this.registerDefaultState(this.defaultBlockState().setValue(COLOR, DyeColor.WHITE));
    }

    VoxelShape voxelShape = Shapes.join(Block.box(5, 0, 5, 11, 9, 11), Block.box(4, 7, 4, 12, 9, 12), BooleanOp.OR);

    @Override
    public @NotNull VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return voxelShape;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder);
        builder.add(COLOR);
    }

    @Override
    protected @NotNull ItemInteractionResult useItemOn(ItemStack itemStack, BlockState blockState, Level level, BlockPos blockPos, Player player, InteractionHand interactionHand, BlockHitResult blockHitResult) {
        if (itemStack.getItem() instanceof DyeItem dye && blockState.getValue(COLOR) != dye.getDyeColor()) {
            level.setBlock(blockPos, blockState.setValue(COLOR, dye.getDyeColor()), 3);
            level.playSound(null, blockPos, SoundEvents.DYE_USE, SoundSource.BLOCKS, 0.5f, level.getRandom().nextFloat() * 0.1f + 0.9f);
            player.awardStat(Stats.ITEM_USED.get(itemStack.getItem()));
            itemStack.consume(1, player);
            return ItemInteractionResult.SUCCESS;
        }
        return ItemInteractionResult.PASS_TO_DEFAULT_BLOCK_INTERACTION;
    }

    static {
        COLOR = EnumProperty.create("color", DyeColor.class);
    }
}
