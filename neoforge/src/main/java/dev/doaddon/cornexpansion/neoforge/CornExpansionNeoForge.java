package dev.doaddon.cornexpansion.neoforge;

import dev.doaddon.cornexpansion.CornExpansion;
import dev.doaddon.cornexpansion.registry.CornExpansionCompostables;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;


@Mod(CornExpansion.MOD_ID)
public final class CornExpansionNeoForge {
    public CornExpansionNeoForge(IEventBus modBus) {
        CornExpansion.init();
        modBus.addListener(this::commonSetup);
    }
    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(CornExpansionCompostables::init);
    }
}
