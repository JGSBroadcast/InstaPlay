package net.jgsb.instaplay.gui.skywars;

import net.jgsb.instaplay.gui.GuiGame;
import net.jgsb.instaplay.gui.GuiSkywars;
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
public class GuiSkywarsLabs extends GuiGame {

    EntityPlayerSP p = Minecraft.getMinecraft().thePlayer;
    GuiScreen returnScreen = new GuiSkywars();

    @Override
    public void initGui() {
        buttonList.add(GuiUtils.createButton(this, LEFT, 0, -2, "TNT Madness Solo"));
        buttonList.add(GuiUtils.createButton(this, RIGHT, 1, -2, "TNT Madness Teams"));

        buttonList.add(GuiUtils.createButton(this, LEFT, 2, -1, "Rush Solo"));
        buttonList.add(GuiUtils.createButton(this, RIGHT, 3, -1, "Rush Teams"));

        buttonList.add(GuiUtils.createButton(this, LEFT, 4, 0, "Slime Solo"));
        buttonList.add(GuiUtils.createButton(this, RIGHT, 5, 0, "Slime Teams"));

        buttonList.add(GuiUtils.createButton(this, LEFT, 6, 1, "Lucky Blocks Solo"));
        buttonList.add(GuiUtils.createButton(this, RIGHT, 7, 1, "Lucky Blocks Teams"));

        buttonList.add(GuiUtils.createButton(this, FULL, 8, 2, "Go to Lobby"));
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
        } else if(button.id == 6) {
            p.sendChatMessage("/play solo_insane_lucky");
        } else if(button.id == 7) {
            p.sendChatMessage("/play teams_insane_lucky");
        } else if(button.id == 8) {
            p.sendChatMessage("/lobby skywars");
        } else if(button.id == 100) {
            mc.displayGuiScreen(returnScreen);
        }
    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        this.drawCenteredString(mc.fontRendererObj, "Skywars Labs", this.width / 2, GuiUtils.getPos(this, -3), 16777215);
        super.drawScreen(mouseX, mouseY, partialTicks);
    }

}
