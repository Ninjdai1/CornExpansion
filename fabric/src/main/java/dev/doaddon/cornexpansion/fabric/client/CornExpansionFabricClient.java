package dev.doaddon.cornexpansion.fabric.client;

import dev.architectury.registry.client.rendering.RenderTypeRegistry;
import dev.doaddon.cornexpansion.registry.CornExpansionObjects;
import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.renderer.RenderType;

public final class CornExpansionFabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        RenderTypeRegistry.register(RenderType.cutout(),
                CornExpansionObjects.POPCORN_TIN_BLOCK.get(),
                CornExpansionObjects.SWEET_POPCORN_TIN_BLOCK.get(),
                CornExpansionObjects.BUTTERY_POPCORN_TIN_BLOCK.get(),
                CornExpansionObjects.CHEESY_POPCORN_TIN_BLOCK.get(),
                CornExpansionObjects.CANDIED_POPCORN_TIN_BLOCK.get()
        );
    }
}
