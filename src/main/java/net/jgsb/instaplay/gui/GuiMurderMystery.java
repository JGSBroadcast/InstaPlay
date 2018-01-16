package net.jgsb.instaplay.gui;

import net.jgsb.instaplay.utils.GuiUtils;
import static net.jgsb.instaplay.utils.GuiUtils.ButtonType.*;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;

import java.io.IOException;

/**
 * Created by Jacob on 10/12/2017.
 */
public class GuiMurderMystery extends GuiGame {

    EntityPlayerSP p = Minecraft.getMinecraft().thePlayer;

    @Override
    public void initGui() {
        buttonList.add(GuiUtils.createButton(this, LEFT, 0, -1, "Classic"));
        buttonList.add(GuiUtils.createButton(this, RIGHT, 1, -1, "Assassins"));

        buttonList.add(GuiUtils.createButton(this, LEFT, 2, 0, "Infection"));
        buttonList.add(GuiUtils.createButton(this, RIGHT, 3, 0, "Showdown"));

        buttonList.add(GuiUtils.createButton(this, FULL, 4, 1, "Go to Lobby"));

        super.initGui();
    }

    @Override
    protected void actionPerformed(GuiButton button) throws IOException {
        if(button.id == 0) {
            p.sendChatMessage("/play murder_Classic");
        } else if(button.id == 1) {
            p.sendChatMessage("/play murder_assassins");
        } else if(button.id == 2) {
            p.sendChatMessage("/play murder_infection");
        } else if(button.id == 3) {
            p.sendChatMessage("/play murder_showdown");
        } else if(button.id == 4) {
            p.sendChatMessage("/lobby murder");
        } else if(button.id == 100) {
            mc.displayGuiScreen(returnScreen);
        }
    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        this.drawCenteredString(mc.fontRendererObj, "Murder Mystery", this.width / 2, GuiUtils.getPos(this, -2), 16777215);
        super.drawScreen(mouseX, mouseY, partialTicks);
    }

}
