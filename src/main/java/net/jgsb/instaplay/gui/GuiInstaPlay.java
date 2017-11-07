package net.jgsb.instaplay.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;

import java.io.IOException;

/**
 * Created by Jacob on 9/12/2017.
 */
public class GuiInstaPlay extends GuiScreen {

    Minecraft mc = Minecraft.getMinecraft();

    @Override
    public void initGui() {
        int x = this.width / 2 - 75;
        int y = this.height / 2 - 10;
        buttonList.add(new GuiButton(0, x - 95, y - 72, 150, 20, "Arcade Games"));
        buttonList.add(new GuiButton(1, x + 95, y - 72, 150, 20, "Bedwars"));
        buttonList.add(new GuiButton(2, x - 95, y - 48, 150, 20, "Blitz SG"));
        buttonList.add(new GuiButton(3, x + 95, y - 48, 150, 20, "Crazy Walls"));
        buttonList.add(new GuiButton(4, x - 95, y - 24, 150, 20, "Duels"));
        buttonList.add(new GuiButton(5, x + 95, y - 24, 150, 20, "Murder Mystery"));
        buttonList.add(new GuiButton(6, x - 95, y, 150, 20, "Quakecraft"));
        buttonList.add(new GuiButton(7, x + 95, y, 150, 20, "Skyclash"));
        buttonList.add(new GuiButton(8, x - 95, y + 24, 150, 20, "Skywars"));
        buttonList.add(new GuiButton(9, x + 95, y + 24, 150, 20, "Smash Heroes"));
        buttonList.add(new GuiButton(10, x - 95, y + 48, 150, 20, "Speed UHC"));
        buttonList.add(new GuiButton(11, x + 95, y + 48, 150, 20, "TNT Games"));
        buttonList.add(new GuiButton(12, x - 95, y + 72, 150, 20, "UHC"));
        buttonList.add(new GuiButton(13, x + 95, y + 72, 150, 20, "Zombies"));
        super.initGui();
    }

    @Override
    protected void actionPerformed(GuiButton button) throws IOException {
        if(button.id == 0) {
            mc.displayGuiScreen(new GuiArcadeGames());
        } else if(button.id == 1) {
            mc.displayGuiScreen(new GuiBedwars());
        } else if(button.id == 2) {
            mc.displayGuiScreen(new GuiBlitzSG());
        } else if(button.id == 3) {
            mc.displayGuiScreen(new GuiCrazyWalls());
        } else if(button.id == 4) {
            mc.displayGuiScreen(new GuiDuels());
        } else if(button.id == 5) {
            mc.displayGuiScreen(new GuiMurderMystery());
        } else if(button.id == 6) {
            mc.displayGuiScreen(new GuiQuakecraft());
        } else if(button.id == 7) {
            mc.displayGuiScreen(new GuiSkyclash());
        } else if(button.id == 8) {
            mc.displayGuiScreen(new GuiSkywars());
        } else if(button.id == 9) {
            mc.displayGuiScreen(new GuiSmashHeroes());
        } else if(button.id == 10) {
            mc.displayGuiScreen(new GuiSpeedUHC());
        } else if(button.id == 11) {
            mc.displayGuiScreen(new GuiTNTGames());
        } else if(button.id == 12) {
            mc.displayGuiScreen(new GuiUHC());
        } else if(button.id == 13) {
            mc.displayGuiScreen(new GuiZombies());
        }
    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        this.drawCenteredString(mc.fontRendererObj, "Insta Play", this.width / 2, this.height / 2 - 102, 16777215);
        super.drawScreen(mouseX, mouseY, partialTicks);
    }
}
