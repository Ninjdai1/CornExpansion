package dev.doaddon.cornexpansion.registry;

import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import dev.doaddon.cornexpansion.CornExpansion;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class CornExpansionCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(CornExpansion.MOD_ID, Registries.CREATIVE_MODE_TAB);

    public static final RegistrySupplier<CreativeModeTab> CORNEXPANSION_TAB = TABS.register(
            "cornexpansion", // Tab ID
            () -> CreativeTabRegistry.create(
                    Component.translatable("creativetab.cornexpansion.tab"), // Tab Name
                    () -> new ItemStack(CornExpansionObjects.POPCORN.get()) // Icon
            )
    );

    public static void init() {
        TABS.register();
    }
}
