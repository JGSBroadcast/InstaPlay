package net.jgsb.instaplay.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;

import java.io.IOException;

/**
 * Created by Jacob on 10/12/2017.
 */
public class GuiTNTGames extends GuiScreen {

    EntityPlayerSP p = Minecraft.getMinecraft().thePlayer;

    @Override
    public void initGui() {
        int x = this.width / 2 - 75;
        int y = this.height / 2 - 10;
        buttonList.add(new GuiButton(0, x - 95, y - 24, 150, 20, "TNT Run"));
        buttonList.add(new GuiButton(1, x + 95, y - 24, 150, 20, "PvP Run"));
        buttonList.add(new GuiButton(2, x - 95, y, 150, 20, "Bow Spleef"));
        buttonList.add(new GuiButton(3, x + 95, y, 150, 20, "TNT Tag"));
        buttonList.add(new GuiButton(4, x - 95, y + 24, 340, 20, "Wizards"));
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
        }
    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        this.drawCenteredString(mc.fontRendererObj, "TNT Games", this.width / 2, this.height / 2 - 56, 16777215);
        super.drawScreen(mouseX, mouseY, partialTicks);
    }

}
