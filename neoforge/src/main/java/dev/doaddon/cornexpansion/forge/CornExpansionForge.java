package dev.doaddon.cornexpansion.forge;

import dev.architectury.platform.forge.EventBuses;
import dev.doaddon.cornexpansion.CornExpansion;
import dev.doaddon.cornexpansion.registry.CornExpansionCompostables;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import dev.doaddon.cornexpansion.CornExpansion;

@Mod(CornExpansion.MOD_ID)
public final class CornExpansionForge {
    public CornExpansionForge() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        EventBuses.registerModEventBus(CornExpansion.MOD_ID, eventBus);

        CornExpansion.init();
        eventBus.addListener(this::commonSetup);
    }
    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(CornExpansionCompostables::init);
    }
}
