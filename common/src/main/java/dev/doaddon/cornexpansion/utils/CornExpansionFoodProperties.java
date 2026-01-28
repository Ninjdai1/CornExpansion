package dev.doaddon.cornexpansion.utils;

import dev.architectury.platform.Platform;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.satisfy.farm_and_charm.core.registry.MobEffectRegistry;

public class CornExpansionFoodProperties {
    public static final int BRIEF_DURATION = 600;    // 30 seconds
    public static final int SHORT_DURATION = 1200;    // 1 minute
    public static final int MEDIUM_DURATION = 3600;    // 3 minutes
    public static final int LONG_DURATION = 6000;    // 5 minutes

    public static final FoodProperties POPCORN_FOOD_PROPERTIES = FoodUtils.createFood(1, 0F, true, true);
    public static final FoodProperties SWEET_POPCORN_FOOD_PROPERTIES = FoodUtils.createFood(1, 0F, MobEffects.MOVEMENT_SPEED, BRIEF_DURATION, true, true);
    public static final FoodProperties BUTTERY_POPCORN_FOOD_PROPERTIES = Platform.isNeoForge() ? FoodUtils.createFCFood(1, 0.1F, MobEffectRegistry.SATIATION, SHORT_DURATION, true, true) : FoodUtils.createFood(1, 0.1F, MobEffects.DIG_SPEED, SHORT_DURATION, true, true);
    public static final FoodProperties CHEESY_POPCORN_FOOD_PROPERTIES = Platform.isNeoForge() ? FoodUtils.createFCFood(3, 0.3F, MobEffectRegistry.SUSTENANCE, SHORT_DURATION, true, true) : FoodUtils.createFood(2, 0.1F, MobEffects.REGENERATION, SHORT_DURATION, true, true);
    public static final FoodProperties CANDIED_POPCORN_FOOD_PROPERTIES = FoodUtils.createFood(2, 0.2F, MobEffects.DAMAGE_RESISTANCE, SHORT_DURATION, true, true);
}
