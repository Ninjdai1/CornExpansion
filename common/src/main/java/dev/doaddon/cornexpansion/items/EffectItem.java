package dev.doaddon.cornexpansion.items;


import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import net.minecraft.ChatFormatting;
import net.minecraft.core.component.DataComponentType;
import net.minecraft.core.component.DataComponents;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffectUtil;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.food.FoodData;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Map;

public class EffectItem extends Item {
    public EffectItem(Properties properties) {
        super(properties);
    }

    @Override
    public void appendHoverText(ItemStack itemStack, TooltipContext tooltipContext, List<Component> list, TooltipFlag tooltipFlag) {
        List<FoodProperties.PossibleEffect> list2 = itemStack.getComponents().get(DataComponents.FOOD) != null ? itemStack.getComponents().get(DataComponents.FOOD).effects() : Lists.newArrayList();
        if (list2.isEmpty()) {
            list.add(Component.translatable("effect.none").withStyle(ChatFormatting.GRAY));
        } else {
            for (FoodProperties.PossibleEffect statusEffectInstance : list2) {
                MutableComponent mutableText = Component.translatable(statusEffectInstance.effect().getDescriptionId());
                MobEffect statusEffect = statusEffectInstance.effect().getEffect().value();

                list.add(mutableText.withStyle(statusEffect.getCategory().getTooltipFormatting()));
            }
        }
    }
}