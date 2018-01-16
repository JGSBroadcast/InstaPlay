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
public class GuiSpeedUHC extends GuiGame {

    EntityPlayerSP p = Minecraft.getMinecraft().thePlayer;

    @Override
    public void initGui() {
        buttonList.add(GuiUtils.createButton(this, LEFT, 0, -1, "Solo Normal"));
        buttonList.add(GuiUtils.createButton(this, RIGHT, 1, -1, "Solo Insane"));

        buttonList.add(GuiUtils.createButton(this, LEFT, 2, 0, "Teams Normal"));
        buttonList.add(GuiUtils.createButton(this, RIGHT, 3, 0, "Teams Insane"));

        buttonList.add(GuiUtils.createButton(this, FULL, 4, 1, "Go to Lobby"));
        super.initGui();
    }

    @Override
    protected void actionPerformed(GuiButton button) throws IOException {
        if(button.id == 0) {
            p.sendChatMessage("/play speed_solo_normal");
        } else if(button.id == 1) {
            p.sendChatMessage("/play speed_solo_insane ");
        } else if(button.id == 2) {
            p.sendChatMessage("/play speed_team_normal");
        } else if(button.id == 3) {
            p.sendChatMessage("/play speed_team_insane");
        } else if(button.id == 4) {
            p.sendChatMessage("/lobby speed");
        } else if(button.id == 100) {
            mc.displayGuiScreen(returnScreen);
        }
    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        this.drawCenteredString(mc.fontRendererObj, "Speed UHC", this.width / 2, GuiUtils.getPos(this, -2), 16777215);
        super.drawScreen(mouseX, mouseY, partialTicks);
    }

}
