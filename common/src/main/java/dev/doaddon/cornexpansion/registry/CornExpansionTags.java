package dev.doaddon.cornexpansion.registry;

import dev.doaddon.cornexpansion.CornExpansion;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

@SuppressWarnings("unused")
public class CornExpansionTags {
    public static final TagKey<Item> BUTTER = TagKey.create(Registries.ITEM, CornExpansion.id("butter"));
    public static final TagKey<Item> CHEESE = TagKey.create(Registries.ITEM, CornExpansion.id("cheese"));
}