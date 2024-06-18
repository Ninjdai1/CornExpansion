package dev.doaddon.cornexpansion.datagen.loottables;

import dev.doaddon.cornexpansion.registry.CornExpansionBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.storage.loot.LootTable;

public class CornExpansionBlockLootTable extends FabricBlockLootTableProvider {
    public CornExpansionBlockLootTable(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        dropOther(CornExpansionBlocks.POPCORN_TIN_BLOCK.get(), Items.BUCKET);
        dropOther(CornExpansionBlocks.SWEET_POPCORN_TIN_BLOCK.get(), Items.BUCKET);
        dropOther(CornExpansionBlocks.BUTTERY_POPCORN_TIN_BLOCK.get(), Items.BUCKET);
        dropOther(CornExpansionBlocks.CHEESY_POPCORN_TIN_BLOCK.get(), Items.BUCKET);
        dropOther(CornExpansionBlocks.CANDIED_POPCORN_TIN_BLOCK.get(), Items.BUCKET);
    }
}
