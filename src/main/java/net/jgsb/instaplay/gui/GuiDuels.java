package net.jgsb.instaplay.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;

import java.io.IOException;

/**
 * Created by Jacob on 10/12/2017.
 */
public class GuiDuels extends GuiScreen {

    EntityPlayerSP p = Minecraft.getMinecraft().thePlayer;

    @Override
    public void initGui() {
        int x = this.width / 2 - 75;
        int y = this.height / 2 - 10;
        buttonList.add(new GuiButton(0, x - 95, y - 48, 150, 20, "Classic"));
        buttonList.add(new GuiButton(1, x + 95, y - 48, 150, 20, "Bow"));
        buttonList.add(new GuiButton(2, x - 95, y - 24, 150, 20, "Potion"));
        buttonList.add(new GuiButton(3, x + 95, y - 24, 150, 20, "OP"));
        buttonList.add(new GuiButton(4, x - 95, y, 150, 20, "Mega Walls 1v1"));
        buttonList.add(new GuiButton(5, x + 95, y, 150, 20, "Mega Walls 2v2"));
        buttonList.add(new GuiButton(6, x - 95, y + 24, 150, 20, "Mega Walls 4v4"));
        buttonList.add(new GuiButton(7, x + 95, y + 24, 150, 20, "UHC 1v1"));
        buttonList.add(new GuiButton(8, x - 95, y + 48, 150, 20, "UHC 2v2"));
        buttonList.add(new GuiButton(9, x + 95, y + 48, 150, 20, "UHC 4v4"));
        super.initGui();
    }

    @Override
    protected void actionPerformed(GuiButton button) throws IOException {
        if(button.id == 0) {
            p.sendChatMessage("/play prototype_duels:classic_duel");
        } else if(button.id == 1) {
            p.sendChatMessage("/play prototype_duels:bow_duel");
        } else if(button.id == 2) {
            p.sendChatMessage("/play prototype_duels:potion_duel ");
        } else if(button.id == 3) {
            p.sendChatMessage("/play prototype_duels:op_duel");
        } else if(button.id == 4) {
            p.sendChatMessage("/play prototype_duels:mw_duel");
        } else if(button.id == 5) {
            p.sendChatMessage("/play prototype_duels:mw_doubles");
        } else if(button.id == 6) {
            p.sendChatMessage("/play prototype_duels:mw_four");
        } else if(button.id == 7) {
            p.sendChatMessage("/play prototype_duels:uhc_duel");
        } else if(button.id == 8) {
            p.sendChatMessage("/play prototype_duels:uhc_doubles");
        } else if(button.id == 9) {
            p.sendChatMessage("/play prototype_duels:uhc_four");
        }
    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        this.drawCenteredString(mc.fontRendererObj, "Duels", this.width / 2, this.height / 2 - 78, 16777215);
        super.drawScreen(mouseX, mouseY, partialTicks);
    }

}
