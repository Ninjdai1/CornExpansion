package dev.doaddon.cornexpansion.registry;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class CornExpansionTags {
    public static final TagKey<Item> BUTTER = TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("c", "foods/butter"));
    public static final TagKey<Item> CHEESE = TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("c", "foods/cheese"));
    public static final TagKey<Item> DOUGH = TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("c", "foods/dough"));
    public static final TagKey<Item> CORN = TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("c", "crops/corn"));

    public static final TagKey<Item> FLOUR = TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("c", "foods/flour"));
    public static final TagKey<Item> SWEET_INGREDIENTS = TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("c", "foods/sweet_ingredients"));
    public static final TagKey<Item> CANDIED_INGREDIENTS = TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("c", "foods/candied_ingredients"));

    public static final TagKey<Item> BREAD = TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("c", "foods/bread"));
    public static final TagKey<Item> DRIED_CORN = TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("c", "foods/dried_corn"));
    public static final TagKey<Item> POPCORN = TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("c", "foods/popcorn"));
}
