package net.jgsb.instaplay.gui;

import net.jgsb.instaplay.utils.GuiUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;

import java.io.IOException;

import static net.jgsb.instaplay.utils.GuiUtils.ButtonType.LEFT;
import static net.jgsb.instaplay.utils.GuiUtils.ButtonType.RIGHT;

/**
 * Created by Jacob on 10/13/2018.
 */
public class GuiInstaPlay extends GuiScreen {

    Minecraft mc = Minecraft.getMinecraft();
    EntityPlayerSP p = mc.thePlayer;

    @Override
    public void initGui() {
        buttonList.add(GuiUtils.createButton(this, LEFT, 0, -4, "Arcade Games"));
        buttonList.add(GuiUtils.createButton(this, RIGHT, 1, -4, "Bedwars"));

        buttonList.add(GuiUtils.createButton(this, LEFT, 2, -3, "Blitz SG"));
        buttonList.add(GuiUtils.createButton(this, RIGHT, 3, -3, "Build Battle"));

        buttonList.add(GuiUtils.createButton(this, LEFT, 4, -2, "Classic"));
        buttonList.add(GuiUtils.createButton(this, RIGHT, 5, -2, "Crazy Walls"));

        buttonList.add(GuiUtils.createButton(this, LEFT, 6, -1, "Cops and Crims"));
        buttonList.add(GuiUtils.createButton(this, RIGHT, 7, -1, "Housing"));

        buttonList.add(GuiUtils.createButton(this, LEFT, 8, 0, "Mega Walls"));
        buttonList.add(GuiUtils.createButton(this, RIGHT, 9, 0, "Murder Mystery"));

        buttonList.add(GuiUtils.createButton(this, LEFT, 10, 1, "Prototype"));
        buttonList.add(GuiUtils.createButton(this, RIGHT, 11, 1, "Skyclash"));

        buttonList.add(GuiUtils.createButton(this, LEFT, 12, 2, "Skywars"));
        buttonList.add(GuiUtils.createButton(this, RIGHT, 13, 2, "Smash Heroes"));

        buttonList.add(GuiUtils.createButton(this, LEFT, 14, 3, "Speed UHC"));
        buttonList.add(GuiUtils.createButton(this, RIGHT, 15, 3, "TNT Games"));

        buttonList.add(GuiUtils.createButton(this, LEFT, 16, 4, "UHC"));
        buttonList.add(GuiUtils.createButton(this, RIGHT, 17, 4, "Warlords"));
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
            mc.displayGuiScreen(new GuiBuildBattle());
        } else if(button.id == 4) {
            mc.displayGuiScreen(new GuiClassic());
        } else if(button.id == 5) {
            mc.displayGuiScreen(new GuiCrazyWalls());
        } else if(button.id == 6) {
            mc.displayGuiScreen(new GuiCopsAndCrims());
        } else if(button.id == 7) {
            p.sendChatMessage("/home");
        } else if(button.id == 8) {
            p.sendChatMessage("/lobby megawalls");
        } else if(button.id == 9) {
            mc.displayGuiScreen(new GuiMurderMystery());
        } else if(button.id == 10) {
            mc.displayGuiScreen(new GuiPrototype());
        } else if(button.id == 11) {
            mc.displayGuiScreen(new GuiSkyclash());
        } else if(button.id == 12) {
            mc.displayGuiScreen(new GuiSkywars());
        } else if(button.id == 13) {
            mc.displayGuiScreen(new GuiSmashHeroes());
        } else if(button.id == 14) {
            mc.displayGuiScreen(new GuiSpeedUHC());
        } else if(button.id == 15) {
            mc.displayGuiScreen(new GuiTNTGames());
        } else if(button.id == 16) {
            mc.displayGuiScreen(new GuiUHC());
        } else if(button.id == 17) {
            p.sendChatMessage("/lobby warlords");
        }
    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        this.drawCenteredString(mc.fontRendererObj, "Insta Play", this.width / 2, GuiUtils.getPos(this, -5), 16777215);
        super.drawScreen(mouseX, mouseY, partialTicks);
    }
}
