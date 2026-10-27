package dev.doaddon.cornexpansion.items;

import dev.doaddon.cornexpansion.blocks.BagBlock;
import net.minecraft.core.component.DataComponents;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.alchemy.PotionContents;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class BagItem extends BlockItem {
    private final List<MobEffectInstance> effects;
    public BagItem(BagBlock block, Properties properties) {
        super(block, properties);

        List<MobEffectInstance> effects = new ArrayList<>();
        for (FoodProperties.PossibleEffect possibleEffect : block.foodComponent.effects()) {
            effects.add(possibleEffect.effect());
        }
        this.effects = effects;
    }

    @Override
    public void appendHoverText(ItemStack itemStack, TooltipContext tooltipContext, List<Component> tooltip, TooltipFlag tooltipFlag) {
        PotionContents.addPotionTooltip(effects, tooltip::add, 1.0F, tooltipContext.tickRate());

        DyeColor color = itemStack.getOrDefault(DataComponents.BASE_COLOR, DyeColor.WHITE);
        tooltip.add(Component.translatable("tooltip.farm_and_charm.canbeplaced").withColor(color.getTextColor()));
        tooltip.add(Component.translatable("tooltip.cornexpansion.canbedyed"));
    }

    @Override
    @Nullable
    protected BlockState getPlacementState(BlockPlaceContext blockPlaceContext) {
        BlockState blockState = this.getBlock().getStateForPlacement(blockPlaceContext);

        if(blockState!=null && this.canPlace(blockPlaceContext, blockState)) {
            DyeColor tinColor = blockPlaceContext.getItemInHand().getOrDefault(DataComponents.BASE_COLOR, DyeColor.WHITE);
            return blockState.setValue(BagBlock.COLOR, tinColor);
        }
        return null;
    }
}
