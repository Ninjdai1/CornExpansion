package dev.doaddon.cornexpansion.fabric;

import dev.doaddon.cornexpansion.registry.CornExpansionCompostables;
import net.fabricmc.api.ModInitializer;

import dev.doaddon.cornexpansion.CornExpansion;

public final class CornExpansionFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        CornExpansion.init();

        CornExpansionCompostables.init();
    }
}
