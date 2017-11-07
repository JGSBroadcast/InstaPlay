package net.jgsb.instaplay.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;

import java.io.IOException;

/**
 * Created by Jacob on 10/12/2017.
 */
public class GuiSmashHeroes extends GuiScreen {

    EntityPlayerSP p = Minecraft.getMinecraft().thePlayer;

    @Override
    public void initGui() {
        int x = this.width / 2 - 75;
        int y = this.height / 2 - 10;
        buttonList.add(new GuiButton(0, x - 95, y - 12, 150, 20, "Solo"));
        buttonList.add(new GuiButton(1, x + 95, y - 12, 150, 20, "2v2"));
        buttonList.add(new GuiButton(2, x - 95, y + 12, 150, 20, "2v2v2"));
        buttonList.add(new GuiButton(3, x + 95, y + 12, 150, 20, "Friends"));
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
        }
    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        this.drawCenteredString(mc.fontRendererObj, "Smash Heroes", this.width / 2, this.height / 2 - 42, 16777215);
        super.drawScreen(mouseX, mouseY, partialTicks);
    }

}
