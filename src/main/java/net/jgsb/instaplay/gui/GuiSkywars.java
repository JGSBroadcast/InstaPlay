package net.jgsb.instaplay.gui;

import net.jgsb.instaplay.gui.skywars.GuiSkywarsLabs;
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
public class GuiSkywars extends GuiGame {

    EntityPlayerSP p = Minecraft.getMinecraft().thePlayer;

    @Override
    public void initGui() {
        buttonList.add(GuiUtils.createButton(this, LEFT, 0, -2, "Solo Normal"));
        buttonList.add(GuiUtils.createButton(this, RIGHT, 1, -2, "Solo Insane"));

        buttonList.add(GuiUtils.createButton(this, LEFT, 2, -1, "Teams Normal"));
        buttonList.add(GuiUtils.createButton(this, RIGHT, 3, -1, "Teams Insane"));

        buttonList.add(GuiUtils.createButton(this, LEFT, 4, 0, "Ranked"));
        buttonList.add(GuiUtils.createButton(this, RIGHT, 5, 0, "Mega"));

        buttonList.add(GuiUtils.createButton(this, FULL, 6, 1, "Laboratories"));

        buttonList.add(GuiUtils.createButton(this, FULL, 7, 2, "Go to Lobby"));
        super.initGui();
    }

    @Override
    protected void actionPerformed(GuiButton button) throws IOException {
        if(button.id == 0) {
            p.sendChatMessage("/play solo_normal");
        } else if(button.id == 1) {
            p.sendChatMessage("/play solo_insane");
        } else if(button.id == 2) {
            p.sendChatMessage("/play teams_normal");
        } else if(button.id == 3) {
            p.sendChatMessage("/play teams_insane");
        } else if(button.id == 4) {
            p.sendChatMessage("/play ranked_normal");
        } else if(button.id == 5) {
            p.sendChatMessage("/play mega_normal");
        } else if(button.id == 6) {
            mc.displayGuiScreen(new GuiSkywarsLabs());
        } else if(button.id == 7) {
            p.sendChatMessage("/lobby skywars");
        } else if(button.id == 100) {
            mc.displayGuiScreen(returnScreen);
        }
    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        this.drawCenteredString(mc.fontRendererObj, "Skywars", this.width / 2, GuiUtils.getPos(this, -3), 16777215);
        super.drawScreen(mouseX, mouseY, partialTicks);
    }

}
