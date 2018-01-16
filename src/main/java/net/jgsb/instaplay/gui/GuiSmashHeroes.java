package net.jgsb.instaplay.gui;

import net.jgsb.instaplay.utils.GuiUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;

import java.io.IOException;

import static net.jgsb.instaplay.utils.GuiUtils.ButtonType.FULL;
import static net.jgsb.instaplay.utils.GuiUtils.ButtonType.LEFT;
import static net.jgsb.instaplay.utils.GuiUtils.ButtonType.RIGHT;

/**
 * Created by Jacob on 10/12/2017.
 */
public class GuiSmashHeroes extends GuiGame {

    EntityPlayerSP p = Minecraft.getMinecraft().thePlayer;

    @Override
    public void initGui() {
        buttonList.add(GuiUtils.createButton(this, LEFT, 0, -1.5, "Solo"));
        buttonList.add(GuiUtils.createButton(this, RIGHT, 1, -1.5, "2v2"));

        buttonList.add(GuiUtils.createButton(this, LEFT, 2, -0.5, "2v2v2"));
        buttonList.add(GuiUtils.createButton(this, RIGHT, 3, -0.5, "Friends"));

        buttonList.add(GuiUtils.createButton(this, FULL, 4, 0.5, "1v1"));

        buttonList.add(GuiUtils.createButton(this, FULL, 5, 1.5, "Go to Lobby"));
        super.initGui();
    }

    @Override
    protected void actionPerformed(GuiButton button) throws IOException {
        if(button.id == 0) {
            p.sendChatMessage("/play super_smash_solo_normal");
        } else if(button.id == 1) {
            p.sendChatMessage("/play super_smash_2v2_normal ");
        } else if(button.id == 2) {
            p.sendChatMessage("/play super_smash_teams_normal");
        } else if(button.id == 3) {
            p.sendChatMessage("/play super_smash_friends_normal");
        } else if(button.id == 4) {
            p.sendChatMessage("/play super_smash_1v1_normal");
        } else if(button.id == 5) {
            p.sendChatMessage("/lobby smash");
        } else if(button.id == 100) {
            mc.displayGuiScreen(returnScreen);
        }
    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        this.drawCenteredString(mc.fontRendererObj, "Smash Heroes", this.width / 2, GuiUtils.getPos(this, -2.5), 16777215);
        super.drawScreen(mouseX, mouseY, partialTicks);
    }

}
