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
public class GuiBedwars extends GuiGame {

    EntityPlayerSP p = Minecraft.getMinecraft().thePlayer;

    @Override
    public void initGui() {
        buttonList.add(GuiUtils.createButton(this, LEFT, 0, -1, "Solo"));
        buttonList.add(GuiUtils.createButton(this, RIGHT, 1, -1, "Doubles"));

        buttonList.add(GuiUtils.createButton(this, LEFT, 2, 0, "3v3v3v3"));
        buttonList.add(GuiUtils.createButton(this, RIGHT, 3, 0, "4v4v4v4"));

        buttonList.add(GuiUtils.createButton(this, FULL, 4, 1, "Go to Lobby"));
        super.initGui();
    }

    @Override
    protected void actionPerformed(GuiButton button) throws IOException {
        if(button.id == 0) {
            p.sendChatMessage("/play bedwars_eight_one");
        } else if(button.id == 1) {
            p.sendChatMessage("/play bedwars_eight_two");
        } else if(button.id == 2) {
            p.sendChatMessage("/play bedwars_four_three");
        } else if(button.id == 3) {
            p.sendChatMessage("/play bedwars_four_four");
        } else if(button.id == 4) {
            p.sendChatMessage("/lobby bedwars");
        } else if(button.id == 100) {
            mc.displayGuiScreen(returnScreen);
        }
    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        this.drawCenteredString(mc.fontRendererObj, "Bedwars", this.width / 2, GuiUtils.getPos(this, -2), 16777215);
        super.drawScreen(mouseX, mouseY, partialTicks);
    }

}
