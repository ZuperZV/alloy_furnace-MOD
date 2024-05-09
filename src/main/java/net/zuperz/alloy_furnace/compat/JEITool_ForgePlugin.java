package net.zuperz.alloy_furnace.compat;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.registration.IGuiHandlerRegistration;
import mezz.jei.api.registration.IRecipeCatalystRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeManager;
import net.zuperz.alloy_furnace.alloy_furnace;
import net.zuperz.alloy_furnace.block.ModBlocks;
import net.zuperz.alloy_furnace.recipe.AlloyFurnaceRecipe;
import net.zuperz.alloy_furnace.screen.AlloyFurnaceScreen;

import java.util.List;

@JeiPlugin
public class JEITool_ForgePlugin implements IModPlugin {


    @Override
    public ResourceLocation getPluginUid() {
        return new ResourceLocation(alloy_furnace.MOD_ID, "jei_plugin");
    }

    @Override
    public void registerCategories(IRecipeCategoryRegistration registration) {
        registration.addRecipeCategories(new AlloyFurnaceRecipeCategory(
                registration.getJeiHelpers().getGuiHelper()));
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        RecipeManager recipeManager = Minecraft.getInstance().level.getRecipeManager();

        List<AlloyFurnaceRecipe> alloy_furnaceRecipes = recipeManager.getAllRecipesFor(AlloyFurnaceRecipe.Type.INSTANCE);
        registration.addRecipes(AlloyFurnaceRecipeCategory.ALLOY_FURNACE_TYPE, alloy_furnaceRecipes);
    }

    @Override
    public void registerGuiHandlers(IGuiHandlerRegistration registration) {
        registration.addRecipeClickArea(AlloyFurnaceScreen.class, 87, 36, 22, 15,
                AlloyFurnaceRecipeCategory.ALLOY_FURNACE_TYPE);
    }

    @Override
    public void registerRecipeCatalysts(IRecipeCatalystRegistration registration) {
        registration.addRecipeCatalyst(new ItemStack(ModBlocks.ALLOY_FURNACE.get()), AlloyFurnaceRecipeCategory.ALLOY_FURNACE_TYPE);
    }
}
