package net.jgsb.instaplay.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;

import java.io.IOException;

/**
 * Created by Jacob on 10/12/2017.
 */
public class GuiZombies extends GuiScreen {

    // skywars, duels, tnt games, zombies
    EntityPlayerSP p = Minecraft.getMinecraft().thePlayer;

    @Override
    public void initGui() {
        int x = this.width / 2 - 75;
        int y = this.height / 2 - 10;
        buttonList.add(new GuiButton(0, x - 95, y - 24, 150, 20, "Story Normal"));
        buttonList.add(new GuiButton(1, x + 95, y - 24, 150, 20, "Story Hard"));
        buttonList.add(new GuiButton(2, x - 95, y, 150, 20, "Story RIP"));
        buttonList.add(new GuiButton(3, x + 95, y, 150, 20, "Endless Normal"));
        buttonList.add(new GuiButton(4, x - 95, y + 24, 150, 20, "Endless Hard"));
        buttonList.add(new GuiButton(5, x + 95, y + 24, 150, 20, "Endless RIP"));
        super.initGui();
    }

    @Override
    protected void actionPerformed(GuiButton button) throws IOException {
        if(button.id == 0) {
            p.sendChatMessage("/play prototype_zombies_story_normal");
        } else if(button.id == 1) {
            p.sendChatMessage("/play prototype_zombies_story_hard");
        } else if(button.id == 2) {
            p.sendChatMessage("/play prototype_zombies_story_rip");
        } else if(button.id == 3) {
            p.sendChatMessage("/play prototype_zombies_endless_normal");
        } else if(button.id == 4) {
            p.sendChatMessage("/play prototype_zombies_endless_hard");
        } else if(button.id == 5) {
            p.sendChatMessage("/play prototype_zombies_endless_rip");
        }
    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        this.drawCenteredString(mc.fontRendererObj, "Zombies", this.width / 2, this.height / 2 - 54, 16777215);
        super.drawScreen(mouseX, mouseY, partialTicks);
    }

}
