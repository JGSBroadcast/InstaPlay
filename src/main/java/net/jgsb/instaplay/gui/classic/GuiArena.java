package net.jgsb.instaplay.gui.classic;

import net.jgsb.instaplay.gui.GuiClassic;
import net.jgsb.instaplay.gui.GuiGame;
import net.jgsb.instaplay.utils.GuiUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;

import java.io.IOException;

import static net.jgsb.instaplay.utils.GuiUtils.ButtonType.*;

/**
 * Created by Jacob on 10/12/2017.
 */
public class GuiArena extends GuiGame {

    EntityPlayerSP p = Minecraft.getMinecraft().thePlayer;
    GuiScreen returnScreen = new GuiClassic();

    @Override
    public void initGui() {
        buttonList.add(GuiUtils.createButton(this, LEFT, 0, -0.5, "1v1"));
        buttonList.add(GuiUtils.createButton(this, RIGHT, 1, -0.5, "2v2"));

        buttonList.add(GuiUtils.createButton(this, FULL, 2, 0.5, "4v4"));
        super.initGui();
    }

    @Override
    protected void actionPerformed(GuiButton button) throws IOException {
        if(button.id == 0) {
            p.sendChatMessage("/play arena_1v1");
        } else if(button.id == 1) {
            p.sendChatMessage("/play arena_2v2");
        } else if(button.id == 2) {
            p.sendChatMessage("/play arena_4v4");
        } else if(button.id == 100) {
            mc.displayGuiScreen(returnScreen);
        }
    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        this.drawCenteredString(mc.fontRendererObj, "Arena", this.width / 2, GuiUtils.getPos(this, -1.5), 16777215);
        super.drawScreen(mouseX, mouseY, partialTicks);
    }

}
