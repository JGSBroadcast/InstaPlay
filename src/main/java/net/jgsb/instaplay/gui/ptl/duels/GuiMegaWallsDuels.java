package net.jgsb.instaplay.gui.ptl.duels;

import net.jgsb.instaplay.gui.GuiGame;
import net.jgsb.instaplay.gui.ptl.GuiDuels;
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
public class GuiMegaWallsDuels extends GuiGame {

    EntityPlayerSP p = Minecraft.getMinecraft().thePlayer;
    GuiScreen returnScreen = new GuiDuels();

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
            p.sendChatMessage("/play prototype_duels:mw_duel");
        } else if(button.id == 1) {
            p.sendChatMessage("/play prototype_duels:mw_doubles");
        } else if(button.id == 2) {
            p.sendChatMessage("/play prototype_duels:mw_four");
        } else if(button.id == 100) {
            mc.displayGuiScreen(returnScreen);
        }
    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        this.drawCenteredString(mc.fontRendererObj, "Mega Walls Duels", this.width / 2, GuiUtils.getPos(this, -1.5), 16777215);
        super.drawScreen(mouseX, mouseY, partialTicks);
    }

}
