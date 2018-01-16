package net.jgsb.instaplay.gui.classic;

import net.jgsb.instaplay.gui.GuiClassic;
import net.jgsb.instaplay.gui.GuiGame;
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
public class GuiQuakecraft extends GuiGame {

    EntityPlayerSP p = Minecraft.getMinecraft().thePlayer;
    GuiScreen returnScreen = new GuiClassic();

    @Override
    public void initGui() {
        buttonList.add(GuiUtils.createButton(this, LEFT, 0, 0, "Solo"));
        buttonList.add(GuiUtils.createButton(this, RIGHT, 1, 0, "Teams"));
        super.initGui();
    }

    @Override
    protected void actionPerformed(GuiButton button) throws IOException {
        if(button.id == 0) {
            p.sendChatMessage("/play quake_solo");
        } else if(button.id == 1) {
            p.sendChatMessage("/play quake_teams");
        } else if(button.id == 100) {
            mc.displayGuiScreen(returnScreen);
        }
    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        this.drawCenteredString(mc.fontRendererObj, "Quakecraft", this.width / 2, GuiUtils.getPos(this, -1), 16777215);
        super.drawScreen(mouseX, mouseY, partialTicks);
    }

}
