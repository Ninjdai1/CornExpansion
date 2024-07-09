package dev.doaddon.cornexpansion.blocks;

import com.mojang.datafixers.util.Pair;
import net.minecraft.core.particles.BlockParticleOption;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.BlockHitResult;
import net.satisfy.farm_and_charm.block.FoodBlock;
import org.jetbrains.annotations.NotNull;

@SuppressWarnings("deprecation")
public class EffectFoodBlock extends FoodBlock {
    private final int maxBites;
    public final FoodProperties foodComponent;

    public EffectFoodBlock(Properties settings, int maxBites, FoodProperties foodComponent) {
        super(settings, maxBites, foodComponent);
        this.maxBites = maxBites;
        this.foodComponent = foodComponent;
    }

    @Override
    public @NotNull InteractionResult use(BlockState state, Level world, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
        ItemStack itemStack = player.getItemInHand(hand);
        if (world.isClientSide) {
            if (tryEat(world, pos, state, player).consumesAction()) {
                return InteractionResult.SUCCESS;
            }

            if (itemStack.isEmpty()) {
                return InteractionResult.CONSUME;
            }
        }
        return tryEat(world, pos, state, player);
    }

    private InteractionResult tryEat(LevelAccessor world, BlockPos pos, BlockState state, Player player) {
        if ((!player.canEat(false) && !foodComponent.canAlwaysEat()) || !(world instanceof Level level)) {
            return InteractionResult.PASS;
        } else {
            player.getFoodData().eat(foodComponent.getNutrition(), foodComponent.getSaturationModifier());
            for(Pair<MobEffectInstance, Float> effect: foodComponent.getEffects()){
                if(!level.isClientSide && effect.getFirst() != null && level.random.nextFloat() < effect.getSecond())
                    player.addEffect(new MobEffectInstance(effect.getFirst()));
            }

            for (int count = 0; count < 10; ++count) {
                double d0 = level.random.nextGaussian() * 0.02D;
                double d1 = level.random.nextGaussian() * 0.02D;
                double d2 = level.random.nextGaussian() * 0.02D;
                level.addParticle(new BlockParticleOption(ParticleTypes.BLOCK, state), pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5, d0, d1, d2);
            }

            world.playSound(null, pos, SoundEvents.GENERIC_EAT, SoundSource.PLAYERS, 0.5f, world.getRandom().nextFloat() * 0.1f + 0.9f);
            world.gameEvent(player, GameEvent.EAT, pos);

            int bites = state.getValue(BITES);

            if (bites < maxBites - 1) {
                world.setBlock(pos, state.setValue(BITES, bites + 1), 3);
            } else {
                world.destroyBlock(pos, true);
                world.gameEvent(player, GameEvent.BLOCK_DESTROY, pos);
            }
            return InteractionResult.SUCCESS;
        }
    }
}
