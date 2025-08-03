package dev.dcv2;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = "dcv2", name = "DCV2 Addon", version = "1.0")
public class Main {
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        System.out.println("[DCV2] Addon erfolgreich geladen.");
    }
}