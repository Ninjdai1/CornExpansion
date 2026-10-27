package dev.doaddon.cornexpansion.registry;

import dev.architectury.registry.item.ItemPropertiesRegistry;
import dev.doaddon.cornexpansion.CornExpansion;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.item.DyeColor;

public class CornExpansionItemPredicates {
    public static void register() {
        ItemPropertiesRegistry.
                register(CornExpansionObjects.POPCORN_BAG.get(), CornExpansion.id("bag_dye"), (itemStack, clientLevel, livingEntity, i) -> {
                    int integer = itemStack.getOrDefault(DataComponents.BASE_COLOR, DyeColor.WHITE).getId();
                    return (float)integer / 16.0F;
                });
        ItemPropertiesRegistry.
                register(CornExpansionObjects.BUTTERY_POPCORN_BAG.get(), CornExpansion.id("bag_dye"), (itemStack, clientLevel, livingEntity, i) -> {
                    int integer = itemStack.getOrDefault(DataComponents.BASE_COLOR, DyeColor.WHITE).getId();
                    return (float)integer / 16.0F;
                });
        ItemPropertiesRegistry.
                register(CornExpansionObjects.CHEESY_POPCORN_BAG.get(), CornExpansion.id("bag_dye"), (itemStack, clientLevel, livingEntity, i) -> {
                    int integer = itemStack.getOrDefault(DataComponents.BASE_COLOR, DyeColor.WHITE).getId();
                    return (float)integer / 16.0F;
                });
        ItemPropertiesRegistry.
                register(CornExpansionObjects.CANDIED_POPCORN_BAG.get(), CornExpansion.id("bag_dye"), (itemStack, clientLevel, livingEntity, i) -> {
                    int integer = itemStack.getOrDefault(DataComponents.BASE_COLOR, DyeColor.WHITE).getId();
                    return (float)integer / 16.0F;
                });
        ItemPropertiesRegistry.
                register(CornExpansionObjects.SWEET_POPCORN_BAG.get(), CornExpansion.id("bag_dye"), (itemStack, clientLevel, livingEntity, i) -> {
                    int integer = itemStack.getOrDefault(DataComponents.BASE_COLOR, DyeColor.WHITE).getId();
                    return (float)integer / 16.0F;
                });
    }
}
