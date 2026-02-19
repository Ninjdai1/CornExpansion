package dev.doaddon.cornexpansion.forge;

import dev.doaddon.cornexpansion.registry.CornExpansionItemPredicates;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod(value = "cornexpansion", dist = Dist.CLIENT)
public class CornExpansionForgeClient {
    public CornExpansionForgeClient(IEventBus eventBus) {
        eventBus.addListener(this::clientSetup);
    }

    private void clientSetup(FMLCommonSetupEvent event) {
        event.enqueueWork(CornExpansionItemPredicates::register);
    }
}
