package dev.doaddon.cornexpansion.datagen.advancements;

import dev.doaddon.cornexpansion.CornExpansion;
import dev.doaddon.cornexpansion.registry.CornExpansionObjects;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricAdvancementProvider;
import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.AdvancementRewards;
import net.minecraft.advancements.FrameType;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.advancements.critereon.RecipeCraftedTrigger;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.satisfy.farm_and_charm.registry.ObjectRegistry;

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
            .addCriterion("craft_popcorn", RecipeCraftedTrigger.TriggerInstance.craftedItem(CornExpansionObjects.POPCORN.getId()))
            .parent(ROOT_ADVANCEMENT)
            .build(CornExpansion.id("getpopcorn"));

    public static Advancement GET_EVERY_POPCORN_ADVANCEMENT = Advancement.Builder.advancement()
            .display(
                    CornExpansionObjects.POPCORN.get(),
                    Component.translatable("advancements.cornexpansion.geteverypopcorn.title"),
                    Component.translatable("advancements.cornexpansion.geteverypopcorn.description"),
                    new ResourceLocation("minecraft","textures/gui/advancements/backgrounds/adventure.png"),
                    FrameType.GOAL,
                    true,
                    true,
                    false
            )
            .addCriterion("get_everypopcorn_popcorn", InventoryChangeTrigger.TriggerInstance.hasItems(CornExpansionObjects.POPCORN.get()))
            .addCriterion("get_everypopcorn_sweet", InventoryChangeTrigger.TriggerInstance.hasItems(CornExpansionObjects.SWEET_POPCORN.get()))
            .addCriterion("get_everypopcorn_buttery", InventoryChangeTrigger.TriggerInstance.hasItems(CornExpansionObjects.BUTTERY_POPCORN.get()))
            .addCriterion("get_everypopcorn_cheesy", InventoryChangeTrigger.TriggerInstance.hasItems(CornExpansionObjects.CHEESY_POPCORN.get()))
            .addCriterion("get_everypopcorn_candied", InventoryChangeTrigger.TriggerInstance.hasItems(CornExpansionObjects.CANDIED_POPCORN.get()))
            .parent(GET_POPCORN_ADVANCEMENT)
            .build(CornExpansion.id("geteverypopcorn"));

    @Override
    public void generateAdvancement(Consumer<Advancement> consumer) {
        consumer.accept(ROOT_ADVANCEMENT);
        consumer.accept(GET_POPCORN_ADVANCEMENT);
        consumer.accept(GET_EVERY_POPCORN_ADVANCEMENT);
    }
}