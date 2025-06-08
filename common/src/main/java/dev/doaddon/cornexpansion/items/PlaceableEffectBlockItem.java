package dev.doaddon.cornexpansion.items;

import com.mojang.datafixers.util.Pair;
import dev.doaddon.cornexpansion.blocks.EffectFoodBlock;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffectUtil;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.satisfy.farm_and_charm.core.item.food.EffectBlockItem;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class PlaceableEffectBlockItem extends EffectBlockItem {
    public PlaceableEffectBlockItem(EffectFoodBlock block, Item.Properties properties) {
        super(block, properties);
    }

    @Override
    public void appendHoverText(ItemStack itemStack, TooltipContext tooltipContext, List<Component> tooltip, TooltipFlag tooltipFlag) {
        tooltip.add(Component.translatable("tooltip.farm_and_charm.canbeplaced").withStyle(ChatFormatting.GRAY));

        for (FoodProperties.PossibleEffect statusEffectInstance : ((EffectFoodBlock) getBlock()).foodComponent.effects()) {
            MutableComponent mutableText = Component.translatable(statusEffectInstance.effect().getDescriptionId());
            MobEffect statusEffect = statusEffectInstance.effect().getEffect().value();
            if (statusEffectInstance.effect().getDuration() > 20) {
                mutableText = Component.translatable(
                        "potion.withDuration",
                        mutableText, MobEffectUtil.formatDuration(statusEffectInstance.effect(), statusEffectInstance.effect().getDuration(), 0));
            }
            tooltip.add(mutableText.withStyle(statusEffect.getCategory().getTooltipFormatting()));
        }
    }
}
