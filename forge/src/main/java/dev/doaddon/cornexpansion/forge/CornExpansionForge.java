package dev.doaddon.cornexpansion.forge;

import dev.architectury.platform.forge.EventBuses;
import dev.doaddon.cornexpansion.CornExpansion;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import dev.doaddon.cornexpansion.CornExpansion;

@Mod(CornExpansion.MOD_ID)
public final class CornExpansionForge {
    public CornExpansionForge() {
        EventBuses.registerModEventBus(CornExpansion.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());

        CornExpansion.init();
    }
}
