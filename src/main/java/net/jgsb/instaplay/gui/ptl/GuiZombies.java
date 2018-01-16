package net.jgsb.instaplay.gui.ptl;

import net.jgsb.instaplay.gui.GuiGame;
import net.jgsb.instaplay.gui.GuiPrototype;
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
public class GuiZombies extends GuiGame {

    EntityPlayerSP p = Minecraft.getMinecraft().thePlayer;
    GuiScreen returnScreen = new GuiPrototype();

    @Override
    public void initGui() {
        buttonList.add(GuiUtils.createButton(this, LEFT, 0, -1, "Story Normal"));
        buttonList.add(GuiUtils.createButton(this, RIGHT, 1, -1, "Story Hard"));

        buttonList.add(GuiUtils.createButton(this, LEFT, 2, 0, "Story RIP"));
        buttonList.add(GuiUtils.createButton(this, RIGHT, 3, 0, "Endless Normal"));

        buttonList.add(GuiUtils.createButton(this, LEFT, 4, 1, "Endless Hard"));
        buttonList.add(GuiUtils.createButton(this, RIGHT, 5, 1, "Endless RIP"));
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
        } else if(button.id == 100) {
            mc.displayGuiScreen(returnScreen);
        }
    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        this.drawCenteredString(mc.fontRendererObj, "Zombies", this.width / 2, GuiUtils.getPos(this, -2), 16777215);
        super.drawScreen(mouseX, mouseY, partialTicks);
    }

}
