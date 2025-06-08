package dev.doaddon.cornexpansion.forge;

import dev.doaddon.cornexpansion.CornExpansion;
import dev.doaddon.cornexpansion.registry.CornExpansionCompostables;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;

@Mod(CornExpansion.MOD_ID)
public final class CornExpansionForge {
    public CornExpansionForge(IEventBus modBus) {
        CornExpansion.init();

        modBus.addListener(this::commonSetup);
    }

    private void commonSetup(FMLCommonSetupEvent event) {
        event.enqueueWork(CornExpansionCompostables::init);
    }
}
