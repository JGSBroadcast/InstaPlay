package net.jgsb.instaplay.utils;

import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import org.lwjgl.input.Keyboard;

/**
 * Created by Jacob on 9/12/2017.
 */
public class KeyBindings {

    public static KeyBinding settings;

    public static void init() {
        settings = new KeyBinding("Open GUI", Keyboard.KEY_G, "Insta Play");

        ClientRegistry.registerKeyBinding(settings);
    }

}
