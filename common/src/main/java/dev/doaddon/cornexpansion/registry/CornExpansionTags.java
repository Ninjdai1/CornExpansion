package dev.doaddon.cornexpansion.registry;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

@SuppressWarnings("unused")
public class CornExpansionTags {
    public static final TagKey<Item> BUTTERS = TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("c", "foods/butters"));
    public static final TagKey<Item> CHEESES = TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("c", "foods/cheeses"));
    public static final TagKey<Item> CORN = TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("c", "crops/corn"));

    public static final TagKey<Item> FLOURS = TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("c", "foods/flours"));
    public static final TagKey<Item> SWEET_INGREDIENTS = TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("c", "foods/sweet_ingredients"));
    public static final TagKey<Item> CANDIED_INGREDIENTS = TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("c", "foods/candied_ingredients"));

    public static final TagKey<Item> BREADS = TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("c", "foods/breads"));
    public static final TagKey<Item> DRIED_CORN = TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("c", "foods/dried_corn"));
    public static final TagKey<Item> POPCORN = TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("c", "foods/popcorn"));
}
