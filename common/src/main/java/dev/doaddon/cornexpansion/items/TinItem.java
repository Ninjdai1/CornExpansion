package dev.doaddon.cornexpansion.items;

import dev.doaddon.cornexpansion.CornExpansion;
import dev.doaddon.cornexpansion.blocks.EffectFoodBlock;
import dev.doaddon.cornexpansion.blocks.TinBlock;
import net.minecraft.ChatFormatting;
import net.minecraft.core.component.DataComponents;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class TinItem extends BlockItem {
    public TinItem(TinBlock block, Properties properties) {
        super(block, properties);
    }

    @Override
    public void appendHoverText(ItemStack itemStack, TooltipContext tooltipContext, List<Component> tooltip, TooltipFlag tooltipFlag) {
        DyeColor color = itemStack.getOrDefault(DataComponents.BASE_COLOR, DyeColor.WHITE);
        tooltip.add(Component.translatable("tooltip.farm_and_charm.canbeplaced").withColor(color.getTextColor()));

        for (FoodProperties.PossibleEffect statusEffectInstance : ((EffectFoodBlock) getBlock()).foodComponent.effects()) {
            MutableComponent mutableText = Component.translatable(statusEffectInstance.effect().getDescriptionId());
            MobEffect statusEffect = statusEffectInstance.effect().getEffect().value();

            tooltip.add(mutableText.withStyle(statusEffect.getCategory().getTooltipFormatting()));
        }
    }

    @Override
    public @NotNull InteractionResult place(BlockPlaceContext context) {
        Player player = context.getPlayer();
        return player!=null && player.isShiftKeyDown() ? super.place(context) : InteractionResult.PASS;
    }

    @Override
    @Nullable
    protected BlockState getPlacementState(BlockPlaceContext blockPlaceContext) {
        BlockState blockState = this.getBlock().getStateForPlacement(blockPlaceContext);

        if(blockState!=null && this.canPlace(blockPlaceContext, blockState)) {
            DyeColor tinColor = blockPlaceContext.getItemInHand().getOrDefault(DataComponents.BASE_COLOR, DyeColor.WHITE);
            return blockState.setValue(TinBlock.COLOR, tinColor);
        }
        return null;
    }
}
