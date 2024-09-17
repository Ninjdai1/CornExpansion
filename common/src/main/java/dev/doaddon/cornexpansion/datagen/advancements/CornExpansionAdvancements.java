package dev.doaddon.cornexpansion.datagen.advancements;

import dev.doaddon.cornexpansion.CornExpansion;
import dev.doaddon.cornexpansion.registry.CornExpansionObjects;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricAdvancementProvider;
import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.AdvancementHolder;
import net.minecraft.advancements.AdvancementType;
import net.minecraft.advancements.critereon.*;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.HolderSet;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Items;
import net.satisfy.farm_and_charm.registry.ObjectRegistry;

import java.util.ArrayList;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public class CornExpansionAdvancements extends FabricAdvancementProvider {
    public CornExpansionAdvancements(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(output, registryLookup);
    }

    public static AdvancementHolder ROOT_ADVANCEMENT = Advancement.Builder.advancement()
            .display(
                    ObjectRegistry.CORN.get(),
                    Component.translatable("advancements.cornexpansion.getcorn.title"),
                    Component.translatable("advancements.cornexpansion.getcorn.description"),
                    ResourceLocation.fromNamespaceAndPath("minecraft","textures/gui/advancements/backgrounds/adventure.png"),
                    AdvancementType.TASK,
                    true,
                    true,
                    true
            )
            .addCriterion("get_corn", InventoryChangeTrigger.TriggerInstance.hasItems(ObjectRegistry.CORN.get()))
            .build(CornExpansion.id("getcorn"));

    public static AdvancementHolder GET_POPCORN_ADVANCEMENT = Advancement.Builder.advancement()
            .display(
                    CornExpansionObjects.POPCORN.get(),
                    Component.translatable("advancements.cornexpansion.getpopcorn.title"),
                    Component.translatable("advancements.cornexpansion.getpopcorn.description"),
                    ResourceLocation.fromNamespaceAndPath("minecraft","textures/gui/advancements/backgrounds/adventure.png"),
                    AdvancementType.TASK,
                    true,
                    true,
                    false
            )
            .addCriterion("get_popcorn", InventoryChangeTrigger.TriggerInstance.hasItems(CornExpansionObjects.POPCORN.get()))
            .parent(ROOT_ADVANCEMENT)
            .build(CornExpansion.id("getpopcorn"));

    public static AdvancementHolder GET_EVERY_POPCORN_VARIANT_ADVANCEMENT = Advancement.Builder.advancement()
            .display(
                    CornExpansionObjects.CANDIED_POPCORN.get(),
                    Component.translatable("advancements.cornexpansion.geteverypopcornvariant.title"),
                    Component.translatable("advancements.cornexpansion.geteverypopcornvariant.description"),
                    ResourceLocation.fromNamespaceAndPath("minecraft","textures/gui/advancements/backgrounds/adventure.png"),
                    AdvancementType.GOAL,
                    true,
                    true,
                    false
            )
            .addCriterion("craft_sweet_popcorn", RecipeCraftedTrigger.TriggerInstance.craftedItem(CornExpansionObjects.SWEET_POPCORN.getId()))
            .addCriterion("craft_buttery_popcorn", RecipeCraftedTrigger.TriggerInstance.craftedItem(CornExpansionObjects.BUTTERY_POPCORN.getId()))
            .addCriterion("craft_cheesy_popcorn", RecipeCraftedTrigger.TriggerInstance.craftedItem(CornExpansionObjects.CHEESY_POPCORN.getId()))
            .addCriterion("craft_candied_popcorn", RecipeCraftedTrigger.TriggerInstance.craftedItem(CornExpansionObjects.CANDIED_POPCORN.getId()))
            .parent(GET_POPCORN_ADVANCEMENT)
            .build(CornExpansion.id("geteverypopcornvariant"));

    public static AdvancementHolder GET_POLENTA_ADVANCEMENT = Advancement.Builder.advancement()
            .display(
                    CornExpansionObjects.POLENTA.get(),
                    Component.translatable("advancements.cornexpansion.get_polenta.title"),
                    Component.translatable("advancements.cornexpansion.get_polenta.description"),
                    ResourceLocation.fromNamespaceAndPath("minecraft","textures/gui/advancements/backgrounds/adventure.png"),
                    AdvancementType.TASK,
                    true,
                    true,
                    false
            )
            .addCriterion("get_popcorn", InventoryChangeTrigger.TriggerInstance.hasItems(CornExpansionObjects.POLENTA.get()))
            .parent(ROOT_ADVANCEMENT)
            .build(CornExpansion.id("get_polenta"));

    public static AdvancementHolder GET_EVERY_POLENTA_VARIANT_ADVANCEMENT = Advancement.Builder.advancement()
            .display(
                    CornExpansionObjects.CHEESY_POLENTA.get(),
                    Component.translatable("advancements.cornexpansion.get_every_polenta_variant.title"),
                    Component.translatable("advancements.cornexpansion.get_every_polenta_variant.description"),
                    ResourceLocation.fromNamespaceAndPath("minecraft","textures/gui/advancements/backgrounds/adventure.png"),
                    AdvancementType.GOAL,
                    true,
                    true,
                    false
            )
            .addCriterion("craft_sweet_polenta", RecipeCraftedTrigger.TriggerInstance.craftedItem(CornExpansionObjects.SWEET_POLENTA.getId()))
            .addCriterion("craft_buttery_polenta", RecipeCraftedTrigger.TriggerInstance.craftedItem(CornExpansionObjects.BUTTERY_POLENTA.getId()))
            .addCriterion("craft_cheesy_polenta", RecipeCraftedTrigger.TriggerInstance.craftedItem(CornExpansionObjects.CHEESY_POLENTA.getId()))
            .parent(GET_POLENTA_ADVANCEMENT)
            .build(CornExpansion.id("get_every_polenta_variant"));

    public static AdvancementHolder DRINK_CORN_SYRUP = Advancement.Builder.advancement()
            .display(
                    CornExpansionObjects.CORN_SYRUP.get(),
                    Component.translatable("advancements.cornexpansion.drink_corn_syrup.title"),
                    Component.translatable("advancements.cornexpansion.drink_corn_syrup.description"),
                    ResourceLocation.fromNamespaceAndPath("minecraft","textures/gui/advancements/backgrounds/adventure.png"),
                    AdvancementType.TASK,
                    true,
                    true,
                    true
            )
            .addCriterion("drink_corn_syrup", ConsumeItemTrigger.TriggerInstance.usedItem(CornExpansionObjects.CORN_SYRUP.get()))
            .parent(ROOT_ADVANCEMENT)
            .build(CornExpansion.id("drink_corn_syrup"));

    public static AdvancementHolder COOK_KERNELS_ON_CAMPFIRE = Advancement.Builder.advancement()
            .display(
                    Items.CAMPFIRE,
                    Component.translatable("advancements.cornexpansion.cook_kernels_on_campfire.title"),
                    Component.translatable("advancements.cornexpansion.cook_kernels_on_campfire.description"),
                    ResourceLocation.fromNamespaceAndPath("minecraft","textures/gui/advancements/backgrounds/adventure.png"),
                    AdvancementType.TASK,
                    true,
                    true,
                    true
            )
            .addCriterion("cook_kernels_on_campfire", ItemUsedOnLocationTrigger.TriggerInstance.itemUsedOnBlock(
                    LocationPredicate.Builder.location().setBlock(BlockPredicate.Builder.block().of(BlockTags.CAMPFIRES)),
                    ItemPredicate.Builder.item().of(ObjectRegistry.KERNELS.get())
            ))
            .parent(ROOT_ADVANCEMENT)
            .build(CornExpansion.id("cook_kernels_on_campfire"));

    @Override
    public void generateAdvancement(HolderLookup.Provider provider, Consumer<AdvancementHolder> consumer) {
        consumer.accept(ROOT_ADVANCEMENT);
        consumer.accept(GET_POPCORN_ADVANCEMENT);
        consumer.accept(GET_EVERY_POPCORN_VARIANT_ADVANCEMENT);
        consumer.accept(GET_POLENTA_ADVANCEMENT);
        consumer.accept(GET_EVERY_POLENTA_VARIANT_ADVANCEMENT);
        consumer.accept(DRINK_CORN_SYRUP);
        consumer.accept(COOK_KERNELS_ON_CAMPFIRE);

    }
}