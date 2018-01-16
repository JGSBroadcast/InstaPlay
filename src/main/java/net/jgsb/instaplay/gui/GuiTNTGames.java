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
public class GuiTNTGames extends GuiGame {

    EntityPlayerSP p = Minecraft.getMinecraft().thePlayer;

    @Override
    public void initGui() {
        buttonList.add(GuiUtils.createButton(this, LEFT, 0, -1.5, "TNT Run"));
        buttonList.add(GuiUtils.createButton(this, RIGHT, 1, -1.5, "PvP Run"));

        buttonList.add(GuiUtils.createButton(this, LEFT, 2, -0.5, "Bow Spleef"));
        buttonList.add(GuiUtils.createButton(this, RIGHT, 3, -0.5, "TNT Tag"));

        buttonList.add(GuiUtils.createButton(this, FULL, 4, 0.5, "Wizards"));

        buttonList.add(GuiUtils.createButton(this, FULL, 5, 1.5, "Go to Lobby"));
        super.initGui();
    }

    @Override
    protected void actionPerformed(GuiButton button) throws IOException {
        if(button.id == 0) {
            p.sendChatMessage("/play tnt_tntrun");
        } else if(button.id == 1) {
            p.sendChatMessage("/play tnt_pvprun");
        } else if(button.id == 2) {
            p.sendChatMessage("/play tnt_bowspleef");
        } else if(button.id == 3) {
            p.sendChatMessage("/play tnt_tntag");
        } else if(button.id == 4) {
            p.sendChatMessage("/play tnt_capture");
        } else if(button.id == 5) {
            p.sendChatMessage("/lobby tnt");
        } else if(button.id == 100) {
            mc.displayGuiScreen(returnScreen);
        }
    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        this.drawCenteredString(mc.fontRendererObj, "TNT Games", this.width / 2, GuiUtils.getPos(this, -2.5), 16777215);
        super.drawScreen(mouseX, mouseY, partialTicks);
    }

}
