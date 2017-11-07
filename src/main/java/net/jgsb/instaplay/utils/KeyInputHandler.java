package net.jgsb.instaplay.utils;

import net.jgsb.instaplay.gui.GuiInstaPlay;
import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;

/**
 * Created by Jacob on 9/12/2017.
 */
public class KeyInputHandler {

    @SubscribeEvent
    public void onKeyInput(InputEvent.KeyInputEvent e) {
        if(KeyBindings.settings.isPressed()) {
            Minecraft.getMinecraft().displayGuiScreen(new GuiInstaPlay());
        }
    }

}
