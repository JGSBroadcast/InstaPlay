package net.jgsb.instaplay.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;

import java.io.IOException;

/**
 * Created by Jacob on 10/12/2017.
 */
public class GuiMurderMystery extends GuiScreen {

    EntityPlayerSP p = Minecraft.getMinecraft().thePlayer;

    @Override
    public void initGui() {
        int x = this.width / 2 - 75;
        int y = this.height / 2 - 10;
        buttonList.add(new GuiButton(0, x - 95, y - 12, 150, 20, "Classic"));
        buttonList.add(new GuiButton(1, x + 95, y - 12, 150, 20, "Assassins"));
        buttonList.add(new GuiButton(2, x - 95, y + 12, 340, 20, "Hardcore"));
        super.initGui();
    }

    @Override
    protected void actionPerformed(GuiButton button) throws IOException {
        if(button.id == 0) {
            p.sendChatMessage("/play murder_Classic");
        } else if(button.id == 1) {
            p.sendChatMessage("/play murder_assassins");
        } else if(button.id == 2) {
            p.sendChatMessage("/play murder_hardcore");
        }
    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        this.drawCenteredString(mc.fontRendererObj, "Murder Mystery", this.width / 2, this.height / 2 - 42, 16777215);
        super.drawScreen(mouseX, mouseY, partialTicks);
    }

}
