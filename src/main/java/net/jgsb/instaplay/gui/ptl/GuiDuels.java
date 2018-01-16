package net.jgsb.instaplay.gui.ptl;

import net.jgsb.instaplay.gui.GuiGame;
import net.jgsb.instaplay.gui.GuiPrototype;
import net.jgsb.instaplay.gui.ptl.duels.GuiMegaWallsDuels;
import net.jgsb.instaplay.gui.ptl.duels.GuiOPDuels;
import net.jgsb.instaplay.gui.ptl.duels.GuiSkywarsDuels;
import net.jgsb.instaplay.gui.ptl.duels.GuiUHCDuels;
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
public class GuiDuels extends GuiGame {

    EntityPlayerSP p = Minecraft.getMinecraft().thePlayer;
    GuiScreen returnScreen = new GuiPrototype();

    @Override
    public void initGui() {
        buttonList.add(GuiUtils.createButton(this, LEFT, 0, -1.5, "Classic Solo"));
        buttonList.add(GuiUtils.createButton(this, RIGHT, 1, -1.5, "Bow Solo"));

        buttonList.add(GuiUtils.createButton(this, LEFT, 2, -0.5, "NoDebuff Solo"));
        buttonList.add(GuiUtils.createButton(this, RIGHT, 3, -0.5, "Combo Solo"));

        buttonList.add(GuiUtils.createButton(this, LEFT, 4, 0.5, "MegaWalls"));
        buttonList.add(GuiUtils.createButton(this, RIGHT, 5, 0.5, "OP"));

        buttonList.add(GuiUtils.createButton(this, LEFT, 6, 1.5, "Skywars"));
        buttonList.add(GuiUtils.createButton(this, RIGHT, 7, 1.5, "UHC"));
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
            p.sendChatMessage("/play prototype_duels:combo_duel");
        } else if(button.id == 4) {
            Minecraft.getMinecraft().displayGuiScreen(new GuiMegaWallsDuels());
        } else if(button.id == 5) {
            Minecraft.getMinecraft().displayGuiScreen(new GuiOPDuels());
        } else if(button.id == 6) {
            Minecraft.getMinecraft().displayGuiScreen(new GuiSkywarsDuels());
        } else if(button.id == 7) {
            Minecraft.getMinecraft().displayGuiScreen(new GuiUHCDuels());
        } else if(button.id == 100) {
            mc.displayGuiScreen(returnScreen);
        }
    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        this.drawCenteredString(mc.fontRendererObj, "Duels", this.width / 2, GuiUtils.getPos(this, -2.5), 16777215);
        super.drawScreen(mouseX, mouseY, partialTicks);
    }

}
