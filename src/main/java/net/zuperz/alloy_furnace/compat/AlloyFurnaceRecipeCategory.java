package net.zuperz.alloy_furnace.compat;

import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.gui.ingredient.IRecipeSlotsView;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.zuperz.alloy_furnace.alloy_furnace;
import net.zuperz.alloy_furnace.block.ModBlocks;
import net.zuperz.alloy_furnace.block.entity.FluidDrawable;
import net.zuperz.alloy_furnace.recipe.AlloyFurnaceRecipe;

public class AlloyFurnaceRecipeCategory implements IRecipeCategory<AlloyFurnaceRecipe> {
    public static final ResourceLocation UID = new ResourceLocation(alloy_furnace.MOD_ID, "alloy_furnace");
    public static final ResourceLocation TEXTURE = new ResourceLocation(alloy_furnace.MOD_ID,
            "textures/gui/alloy_furnace_gui_jei.png");

    public static final RecipeType<AlloyFurnaceRecipe> ALLOY_FURNACE_TYPE =
            new RecipeType<>(UID, AlloyFurnaceRecipe.class);

    private final IDrawable background;
    private final IDrawable icon;

    public AlloyFurnaceRecipeCategory(IGuiHelper helper) {
        this.background = helper.createDrawable(TEXTURE, 0, 0, 151, 67);
        this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(ModBlocks.ALLOY_FURNACE.get()));
    }


    @Override
    public RecipeType<AlloyFurnaceRecipe> getRecipeType() {
        return ALLOY_FURNACE_TYPE;
    }

    @Override
    public Component getTitle() {
        return Component.literal("Alloy Furnace");
    }

    @Override
    public IDrawable getBackground() {
        return this.background;
    }

    @Override
    public IDrawable getIcon() {
        return this.icon;
    }

    @Override
    public void setRecipe(IRecipeLayoutBuilder builder, AlloyFurnaceRecipe recipe, IFocusGroup focuses) {
        builder.addSlot(RecipeIngredientRole.INPUT, 5, 7).addIngredients(recipe.getIngredients().get(0));
        builder.addSlot(RecipeIngredientRole.INPUT, 27, 5).addIngredients(recipe.getIngredients().get(1));
        builder.addSlot(RecipeIngredientRole.INPUT, 49, 7).addIngredients(recipe.getIngredients().get(2));

        builder.addSlot(RecipeIngredientRole.OUTPUT, 126, 26).addItemStack(recipe.getResultItem(null));
    }

    @Override
    public void draw(AlloyFurnaceRecipe recipe, IRecipeSlotsView recipeSlotsView, GuiGraphics guiGraphics, double mouseX, double mouseY) {
        IRecipeCategory.super.draw(recipe, recipeSlotsView, guiGraphics, mouseX, mouseY);

        // 64000 hardcoded here. Note that if you make an energy storage with a different max capacity in your block entity
        // you have to change it here!
        new FluidDrawable(mouseX, mouseY, recipe.getFluidStack().getAmount(), 30000).draw(guiGraphics, 24, 33);
    }
}