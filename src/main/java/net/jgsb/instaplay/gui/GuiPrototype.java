package net.jgsb.instaplay.gui;

import net.jgsb.instaplay.gui.ptl.GuiBattleRoyale;
import net.jgsb.instaplay.gui.ptl.GuiDuels;
import net.jgsb.instaplay.gui.ptl.GuiHideAndSeek;
import net.jgsb.instaplay.gui.ptl.GuiZombies;
import net.jgsb.instaplay.utils.GuiUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;

import java.io.IOException;

import static net.jgsb.instaplay.utils.GuiUtils.ButtonType.LEFT;
import static net.jgsb.instaplay.utils.GuiUtils.ButtonType.RIGHT;

/**
 * Created by Jacob on 10/12/2017.
 */
public class GuiPrototype extends GuiGame {

    Minecraft mc = Minecraft.getMinecraft();
    EntityPlayerSP p = mc.thePlayer;

    @Override
    public void initGui() {
        buttonList.add(GuiUtils.createButton(this, RIGHT, 0, 0, "Battle Royale"));
        buttonList.add(GuiUtils.createButton(this, LEFT, 1, -1, "Duels"));

        buttonList.add(GuiUtils.createButton(this, LEFT, 2, 0, "Hide and Seek"));
        buttonList.add(GuiUtils.createButton(this, RIGHT, 3, -1, "Zombies"));


        buttonList.add(GuiUtils.createButton(this, RIGHT, 4, 1, "Go to Lobby"));
        super.initGui();
    }

    @Override
    protected void actionPerformed(GuiButton button) throws IOException {
        if(button.id == 0) {
            mc.displayGuiScreen(new GuiBattleRoyale());
        } else if(button.id == 1) {
            mc.displayGuiScreen(new GuiDuels());
        } else if(button.id == 2) {
            mc.displayGuiScreen(new GuiHideAndSeek());
        } else if(button.id == 3) {
            mc.displayGuiScreen(new GuiZombies());
        } else if(button.id == 4) {
            p.sendChatMessage("/lobby ptl");
        } else if(button.id == 100) {
            mc.displayGuiScreen(returnScreen);
        }
    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        this.drawCenteredString(mc.fontRendererObj, "Prototype", this.width / 2, GuiUtils.getPos(this, -2), 16777215);
        super.drawScreen(mouseX, mouseY, partialTicks);
    }

}
