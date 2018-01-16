package net.jgsb.instaplay.utils;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;

import static net.jgsb.instaplay.utils.GuiUtils.ButtonType.*;

public class GuiUtils {

    public enum ButtonType {
        LEFT, RIGHT, FULL
    }

    public static GuiButton createButton(GuiScreen gui, ButtonType type, int id, double pos,  String name) {
        int x = gui.width / 2 - 75;
        int y = gui.height / 2 - 10;
        return new GuiButton(id, type == RIGHT ? x + 95 : x - 95, (int) (y + pos * 24), type == FULL ? 340 : 150, 20, name);
    }

    public static int getPos(GuiScreen gui, double pos) {
        return (int) (gui.height / 2 + pos * 24);
    }

}
