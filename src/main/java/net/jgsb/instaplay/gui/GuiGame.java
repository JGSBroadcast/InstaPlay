package net.jgsb.instaplay.gui;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;

public class GuiGame extends GuiScreen {

    public GuiScreen returnScreen = new GuiInstaPlay();

    @Override
    public void initGui() {
        buttonList.add(new GuiButton(100, 0, 0, 150, 20, "Back"));
    }
}
