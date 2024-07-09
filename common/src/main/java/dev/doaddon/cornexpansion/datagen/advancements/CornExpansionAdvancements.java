package dev.doaddon.cornexpansion.datagen.advancements;

import dev.doaddon.cornexpansion.CornExpansion;
import dev.doaddon.cornexpansion.registry.CornExpansionObjects;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricAdvancementProvider;
import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.FrameType;
import net.minecraft.advancements.critereon.*;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Items;
import net.satisfy.farm_and_charm.registry.ObjectRegistry;

import java.util.ArrayList;
import java.util.function.Consumer;

public class CornExpansionAdvancements extends FabricAdvancementProvider {
    public CornExpansionAdvancements(FabricDataOutput dataGenerator) {
        super(dataGenerator);
    }

    public static Advancement ROOT_ADVANCEMENT = Advancement.Builder.advancement()
            .display(
                    ObjectRegistry.CORN.get(),
                    Component.translatable("advancements.cornexpansion.getcorn.title"),
                    Component.translatable("advancements.cornexpansion.getcorn.description"),
                    new ResourceLocation("minecraft","textures/gui/advancements/backgrounds/adventure.png"),
                    FrameType.TASK,
                    true,
                    true,
                    true
            )
            .addCriterion("get_corn", InventoryChangeTrigger.TriggerInstance.hasItems(ObjectRegistry.CORN.get()))
            .build(CornExpansion.id("getcorn"));

    public static Advancement GET_POPCORN_ADVANCEMENT = Advancement.Builder.advancement()
            .display(
                    CornExpansionObjects.POPCORN.get(),
                    Component.translatable("advancements.cornexpansion.getpopcorn.title"),
                    Component.translatable("advancements.cornexpansion.getpopcorn.description"),
                    new ResourceLocation("minecraft","textures/gui/advancements/backgrounds/adventure.png"),
                    FrameType.TASK,
                    true,
                    true,
                    false
            )
            .addCriterion("get_popcorn", InventoryChangeTrigger.TriggerInstance.hasItems(CornExpansionObjects.POPCORN.get()))
            .parent(ROOT_ADVANCEMENT)
            .build(CornExpansion.id("getpopcorn"));

    public static Advancement GET_EVERY_POPCORN_VARIANT_ADVANCEMENT = Advancement.Builder.advancement()
            .display(
                    CornExpansionObjects.CANDIED_POPCORN.get(),
                    Component.translatable("advancements.cornexpansion.geteverypopcornvariant.title"),
                    Component.translatable("advancements.cornexpansion.geteverypopcornvariant.description"),
                    new ResourceLocation("minecraft","textures/gui/advancements/backgrounds/adventure.png"),
                    FrameType.GOAL,
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

    public static Advancement GET_POLENTA_ADVANCEMENT = Advancement.Builder.advancement()
            .display(
                    CornExpansionObjects.POLENTA.get(),
                    Component.translatable("advancements.cornexpansion.get_polenta.title"),
                    Component.translatable("advancements.cornexpansion.get_polenta.description"),
                    new ResourceLocation("minecraft","textures/gui/advancements/backgrounds/adventure.png"),
                    FrameType.TASK,
                    true,
                    true,
                    false
            )
            .addCriterion("get_popcorn", InventoryChangeTrigger.TriggerInstance.hasItems(CornExpansionObjects.POLENTA.get()))
            .parent(ROOT_ADVANCEMENT)
            .build(CornExpansion.id("get_polenta"));

    public static Advancement GET_EVERY_POLENTA_VARIANT_ADVANCEMENT = Advancement.Builder.advancement()
            .display(
                    CornExpansionObjects.CHEESY_POLENTA.get(),
                    Component.translatable("advancements.cornexpansion.get_every_polenta_variant.title"),
                    Component.translatable("advancements.cornexpansion.get_every_polenta_variant.description"),
                    new ResourceLocation("minecraft","textures/gui/advancements/backgrounds/adventure.png"),
                    FrameType.GOAL,
                    true,
                    true,
                    false
            )
            .addCriterion("craft_sweet_polenta", RecipeCraftedTrigger.TriggerInstance.craftedItem(CornExpansionObjects.SWEET_POLENTA.getId()))
            .addCriterion("craft_buttery_polenta", RecipeCraftedTrigger.TriggerInstance.craftedItem(CornExpansionObjects.BUTTERY_POLENTA.getId()))
            .addCriterion("craft_cheesy_polenta", RecipeCraftedTrigger.TriggerInstance.craftedItem(CornExpansionObjects.CHEESY_POLENTA.getId()))
            .parent(GET_POLENTA_ADVANCEMENT)
            .build(CornExpansion.id("get_every_polenta_variant"));

    public static Advancement DRINK_CORN_SYRUP = Advancement.Builder.advancement()
            .display(
                    CornExpansionObjects.CORN_SYRUP.get(),
                    Component.translatable("advancements.cornexpansion.drink_corn_syrup.title"),
                    Component.translatable("advancements.cornexpansion.drink_corn_syrup.description"),
                    new ResourceLocation("minecraft","textures/gui/advancements/backgrounds/adventure.png"),
                    FrameType.TASK,
                    true,
                    true,
                    true
            )
            .addCriterion("drink_corn_syrup", ConsumeItemTrigger.TriggerInstance.usedItem(CornExpansionObjects.CORN_SYRUP.get()))
            .parent(ROOT_ADVANCEMENT)
            .build(CornExpansion.id("drink_corn_syrup"));

    public static Advancement COOK_KERNELS_ON_CAMPFIRE = Advancement.Builder.advancement()
            .display(
                    Items.CAMPFIRE,
                    Component.translatable("advancements.cornexpansion.cook_kernels_on_campfire.title"),
                    Component.translatable("advancements.cornexpansion.cook_kernels_on_campfire.description"),
                    new ResourceLocation("minecraft","textures/gui/advancements/backgrounds/adventure.png"),
                    FrameType.TASK,
                    true,
                    true,
                    true
            )
            .addCriterion("cook_kernels_on_campfire", ItemUsedOnLocationTrigger.TriggerInstance.itemUsedOnBlock(
                    new LocationPredicate.Builder().setBlock(new BlockPredicate(BlockTags.CAMPFIRES, null, StatePropertiesPredicate.ANY, NbtPredicate.ANY)),
                    ItemPredicate.Builder.item().of(ObjectRegistry.KERNELS.get())
            ))
            .parent(ROOT_ADVANCEMENT)
            .build(CornExpansion.id("cook_kernels_on_campfire"));

    @Override
    public void generateAdvancement(Consumer<Advancement> consumer) {
        consumer.accept(ROOT_ADVANCEMENT);
        consumer.accept(GET_POPCORN_ADVANCEMENT);
        consumer.accept(GET_EVERY_POPCORN_VARIANT_ADVANCEMENT);
        consumer.accept(GET_POLENTA_ADVANCEMENT);
        consumer.accept(GET_EVERY_POLENTA_VARIANT_ADVANCEMENT);
        consumer.accept(DRINK_CORN_SYRUP);
        consumer.accept(COOK_KERNELS_ON_CAMPFIRE);
    }
}