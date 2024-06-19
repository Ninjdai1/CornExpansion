package dev.doaddon.cornexpansion.utils;

import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.food.FoodProperties;

public class FoodUtils {
    public static FoodProperties createFood(int nutrition, float saturationMod) {
        return createFood(nutrition, saturationMod, (MobEffect) null, 0, false, false);
    }

    public static FoodProperties createFood(int nutrition, float saturationMod, boolean alwaysEat, boolean fast) {
        return createFood(nutrition, saturationMod, (MobEffect) null, 0, alwaysEat, fast);
    }

    public static FoodProperties createFood(int nutrition, float saturationMod, MobEffect effect, int duration, boolean alwaysEat, boolean fast) {
        FoodProperties.Builder food = new FoodProperties.Builder().nutrition(nutrition).saturationMod(saturationMod);
        if (alwaysEat) food.alwaysEat();
        if (fast) food.fast();
        if (effect != null) food.arch$effect(() -> new MobEffectInstance(effect, duration), 1.0f);
        return food.build();
    }

    public static FoodProperties createFood(int nutrition, float saturationMod, RegistrySupplier<MobEffect> effect, int duration, boolean alwaysEat, boolean fast) {
        FoodProperties.Builder food = new FoodProperties.Builder().nutrition(nutrition).saturationMod(saturationMod);
        if (alwaysEat) food.alwaysEat();
        if (fast) food.fast();
        if (effect != null) food.arch$effect(() -> new MobEffectInstance(effect.get(), duration), 1.0f);
        return food.build();
    }
}
