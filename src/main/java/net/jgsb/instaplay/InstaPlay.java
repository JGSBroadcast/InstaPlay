package net.jgsb.instaplay;

import net.jgsb.instaplay.utils.KeyBindings;
import net.jgsb.instaplay.utils.KeyInputHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Jacob on 10/11/2017.
 */
@Mod(modid=Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.VERSION, updateJSON=Reference.UPDATE_JSON)
public class InstaPlay {

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e) {
        MinecraftForge.EVENT_BUS.register(new KeyInputHandler());
        KeyBindings.init();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
    }
}