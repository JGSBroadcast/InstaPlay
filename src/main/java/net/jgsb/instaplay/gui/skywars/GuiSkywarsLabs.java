package net.jgsb.instaplay.gui.skywars;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;

import java.io.IOException;

/**
 * Created by Jacob on 10/12/2017.
 */
public class GuiSkywarsLabs extends GuiScreen {

    EntityPlayerSP p = Minecraft.getMinecraft().thePlayer;

    @Override
    public void initGui() {
        int x = this.width / 2 - 75;
        int y = this.height / 2 - 10;
        buttonList.add(new GuiButton(0, x - 95, y - 24, 150, 20, "TNT Madness Solo"));
        buttonList.add(new GuiButton(1, x + 95, y - 24, 150, 20, "TNT Madness Teams"));
        buttonList.add(new GuiButton(2, x - 95, y, 150, 20, "Rush Solo"));
        buttonList.add(new GuiButton(3, x + 95, y, 150, 20, "Rush Teams"));
        buttonList.add(new GuiButton(4, x - 95, y + 24, 150, 20, "Slime Solo"));
        buttonList.add(new GuiButton(5, x + 95, y + 24, 150, 20, "Slime Teams"));
        super.initGui();
    }

    @Override
    protected void actionPerformed(GuiButton button) throws IOException {
        if(button.id == 0) {
            p.sendChatMessage("/play solo_insane_tnt_madness");
        } else if(button.id == 1) {
            p.sendChatMessage("/play teams_insane_tnt_madness");
        } else if(button.id == 2) {
            p.sendChatMessage("/play solo_insane_rush");
        } else if(button.id == 3) {
            p.sendChatMessage("/play teams_insane_rush");
        } else if(button.id == 4) {
            p.sendChatMessage("/play solo_insane_slime");
        } else if(button.id == 5) {
            p.sendChatMessage("/play teams_insane_slime");
        }
    }

}
