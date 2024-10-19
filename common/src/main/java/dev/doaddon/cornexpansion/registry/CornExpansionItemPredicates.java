package dev.doaddon.cornexpansion.registry;

import dev.architectury.registry.item.ItemPropertiesRegistry;
import dev.doaddon.cornexpansion.CornExpansion;
import net.minecraft.client.renderer.block.model.ItemOverride;
import net.minecraft.core.component.DataComponents;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.component.BlockItemStateProperties;
import net.minecraft.world.level.block.LightBlock;

public class CornExpansionItemPredicates {
    public static void register() {
        ItemPropertiesRegistry.
                register(CornExpansionObjects.POPCORN_TIN.get(), CornExpansion.id("tin_dye"), (itemStack, clientLevel, livingEntity, i) -> {
                    int integer = itemStack.getOrDefault(DataComponents.BASE_COLOR, DyeColor.WHITE).getId();
                    return (float)integer / 16.0F;
                });
        ItemPropertiesRegistry.
                register(CornExpansionObjects.BUTTERY_POPCORN_TIN.get(), CornExpansion.id("tin_dye"), (itemStack, clientLevel, livingEntity, i) -> {
                    int integer = itemStack.getOrDefault(DataComponents.BASE_COLOR, DyeColor.WHITE).getId();
                    return (float)integer / 16.0F;
                });
        ItemPropertiesRegistry.
                register(CornExpansionObjects.CHEESY_POPCORN_TIN.get(), CornExpansion.id("tin_dye"), (itemStack, clientLevel, livingEntity, i) -> {
                    int integer = itemStack.getOrDefault(DataComponents.BASE_COLOR, DyeColor.WHITE).getId();
                    return (float)integer / 16.0F;
                });
        ItemPropertiesRegistry.
                register(CornExpansionObjects.CANDIED_POPCORN_TIN.get(), CornExpansion.id("tin_dye"), (itemStack, clientLevel, livingEntity, i) -> {
                    int integer = itemStack.getOrDefault(DataComponents.BASE_COLOR, DyeColor.WHITE).getId();
                    return (float)integer / 16.0F;
                });
        ItemPropertiesRegistry.
                register(CornExpansionObjects.SWEET_POPCORN_TIN.get(), CornExpansion.id("tin_dye"), (itemStack, clientLevel, livingEntity, i) -> {
                    int integer = itemStack.getOrDefault(DataComponents.BASE_COLOR, DyeColor.WHITE).getId();
                    return (float)integer / 16.0F;
                });
    }
}
