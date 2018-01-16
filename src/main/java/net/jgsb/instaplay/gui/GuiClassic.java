package net.jgsb.instaplay.gui;

import net.jgsb.instaplay.gui.classic.GuiArena;
import net.jgsb.instaplay.gui.classic.GuiQuakecraft;
import net.jgsb.instaplay.gui.skywars.GuiSkywarsLabs;
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
public class GuiClassic extends GuiGame {

    EntityPlayerSP p = Minecraft.getMinecraft().thePlayer;

    @Override
    public void initGui() {
        buttonList.add(GuiUtils.createButton(this, LEFT, 0, -1.5, "Arena"));
        buttonList.add(GuiUtils.createButton(this, RIGHT, 1, -1.5, "Paintball"));

        buttonList.add(GuiUtils.createButton(this, LEFT, 2, -0.5, "Quakecraft"));
        buttonList.add(GuiUtils.createButton(this, RIGHT, 3, -0.5, "The Walls"));

        buttonList.add(GuiUtils.createButton(this, LEFT, 4, 0.5, "Turbo Kart Racers"));
        buttonList.add(GuiUtils.createButton(this, RIGHT, 5, 0.5, "VampireZ"));

        buttonList.add(GuiUtils.createButton(this, FULL, 6, 1.5, "Go to Lobby"));
        super.initGui();
    }

    @Override
    protected void actionPerformed(GuiButton button) throws IOException {
        if(button.id == 0) {
            mc.displayGuiScreen(new GuiArena());
        } else if(button.id == 1) {
            p.sendChatMessage("/play paintball");
        } else if(button.id == 2) {
            mc.displayGuiScreen(new GuiQuakecraft());
        } else if(button.id == 3) {
            p.sendChatMessage("/play walls");
        } else if(button.id == 4) {
            p.sendChatMessage("/play tkr");
        } else if(button.id == 5) {
            p.sendChatMessage("/play vampirez");
        } else if(button.id == 6) {
            p.sendChatMessage("/lobby classic");
        } else if(button.id == 100) {
            mc.displayGuiScreen(returnScreen);
        }
    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        this.drawCenteredString(mc.fontRendererObj, "Classic", this.width / 2, GuiUtils.getPos(this, -2.5), 16777215);
        super.drawScreen(mouseX, mouseY, partialTicks);
    }

}
