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
    public static final TagKey<Item> CORN = TagKey.create(Registries.ITEM, CornExpansion.id("corn"));
    public static final TagKey<Item> DRIED_CORN = TagKey.create(Registries.ITEM, CornExpansion.id("dried_corn"));
    public static final TagKey<Item> SWEET_INGREDIENT = TagKey.create(Registries.ITEM, CornExpansion.id("sweet_ingredient"));
    public static final TagKey<Item> CANDIED_INGREDIENT = TagKey.create(Registries.ITEM, CornExpansion.id("candied_ingredient"));

    public static final TagKey<Item> FLOUR_FABRIC = TagKey.create(Registries.ITEM, new ResourceLocation("c", "flour"));
    public static final TagKey<Item> FLOUR_FORGE = TagKey.create(Registries.ITEM, new ResourceLocation("forge", "flour"));
}