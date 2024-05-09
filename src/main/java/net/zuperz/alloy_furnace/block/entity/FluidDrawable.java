package net.zuperz.alloy_furnace.block.entity;

import mezz.jei.api.gui.drawable.IDrawable;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.network.chat.Component;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Optional;

import static net.zuperz.alloy_furnace.screen.AlloyFurnaceScreen.isMouseAboveArea;

// Modified Version of https://github.com/terrarium-earth/Ad-Astra/blob/1.20.x/common/src/main/java/earth/terrarium/adastra/common/compat/jei/drawables/EnergyBarDrawable.java
// Under MIT License: https://github.com/terrarium-earth/Ad-Astra/blob/1.20.x/LICENSE
public class FluidDrawable implements IDrawable {
    private final int mouseX;
    private final int mouseY;
    private final int fluidNeeded; // Ændret navn for bedre forståelse
    private final int maxFluid; // Ændret navn for bedre forståelse

    public FluidDrawable(double mouseX, double mouseY, int fluidNeeded, int maxFluid) {
        this.mouseX = (int) mouseX;
        this.mouseY = (int) mouseY;
        this.fluidNeeded = fluidNeeded;
        this.maxFluid = maxFluid;
    }

    @Override
    public int getWidth() {
        return 22;
    }

    @Override
    public int getHeight() {
        return 8;
    }

    @Override
    public void draw(@NotNull GuiGraphics graphics, int xOffset, int yOffset) {
        drawFluidBar(graphics, mouseX, mouseY, xOffset, yOffset, fluidNeeded, maxFluid);
    }

    private void drawFluidBar(GuiGraphics graphics, int mouseX, int mouseY, int x, int y, int fluid, int maxFluid) {
        int fluidHeight = (int)(getHeight() * ((float) fluid / maxFluid)); // Beregn højden af væskenbjælken
        // Tegn væskenbjælken
        graphics.fillGradient(x, y + (getHeight() - fluidHeight), x + getWidth(),
                y + getHeight(), 0xFF0000FF, 0xFF0000FF); // Brug blå farve som eksempel, du kan ændre farven

        // Vis tooltips, hvis musen er over bjælken
        if (isMouseAboveArea(mouseX, mouseY, x, y, 0, 0, getWidth(), getHeight())) {
            graphics.renderTooltip(Minecraft.getInstance().font, getTooltips(),
                    Optional.empty(), mouseX - x, mouseY - y);
        }
    }

    public List<Component> getTooltips() {
        return List.of(Component.literal("Needs " + fluidNeeded + " Lava")); // Eksempeltekst for tooltip, kan tilpasses
    }
}