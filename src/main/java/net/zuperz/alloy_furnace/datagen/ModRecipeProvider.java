
package net.zuperz.alloy_furnace.datagen;

import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.material.Fluids;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.minecraftforge.fluids.FluidStack;
import net.zuperz.alloy_furnace.alloy_furnace;
import net.zuperz.alloy_furnace.block.ModBlocks;
import net.zuperz.alloy_furnace.datagen.custom.AlloyFurnaceRecipeBuilder;
import net.zuperz.alloy_furnace.item.ModItems;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }


    //private static final List<ItemLike> URANIUM_SMELTABLES = List.of(ModItems.RAW_URANIUM.get(),
    //        ModBlocks.URANIUM_ORE.get(), ModBlocks.DEEPSLATE_URANIUM_ORE.get());


    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {

        //nineBlockStorageRecipes(pWriter, RecipeCategory.MISC, ModItems.RAW_SILVER.get(), RecipeCategory.MISC, ModBlocks.RAW_SILVER_BLOCK.get(),
        //        "the_bog:raw_silver", "silver","the_bog:raw_silver_block", "silver");

        //nineBlockStorageRecipes(pWriter, RecipeCategory.MISC, ModItems.SILVER.get(), RecipeCategory.MISC, ModBlocks.SILVER_BLOCK.get(),
        //        "the_bog:silver", "silver","the_bog:silver_block", "silver");

        //oreSmelting(pWriter, SILVER_SMELTABLES, RecipeCategory.MISC, ModItems.SILVER.get(), 0.25f, 200, "silver");
        //oreBlasting(pWriter, SILVER_SMELTABLES, RecipeCategory.MISC, ModItems.SILVER.get(), 0.25f, 100, "silver");


        /*ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BOGGANIUM_UPGRADE_SMITHING_TEMPLATE.get())
                .pattern("CAC")
                .pattern("CBC")
                .pattern("CCC")
                .define('A', ModItems.BOGGANIUM_UPGRADE_SMITHING_TEMPLATE.get())
                .define('B', ModBlocks.MUD_STONE.get())
                .define('C', ModItems.TITANIUM.get())
                .unlockedBy("bogganium_upgrade_smithing_template", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.BOGGANIUM_UPGRADE_SMITHING_TEMPLATE.get()).build()))
                .save(pWriter, new ResourceLocation(The_Bog.MOD_ID, "bogganium_upgrade_smithing_template"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.MUD_STONE_AND_STEEL.get())
                .requires(ModItems.SILVER.get())
                .requires(ModItems.MUDSTONE_SHARD.get())
                .unlockedBy("mud_stone_and_steel", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.MUD_STONE_AND_STEEL.get()).build()))
                .save(pWriter);
       */

        new AlloyFurnaceRecipeBuilder(ModItems.RAW_COBALT.get(), (ModItems.RAW_COBALT.get()), (ModItems.RAW_COBALT.get()), ModItems.COBALT_INGOT.get(), 4, 160,
                new FluidStack(Fluids.LAVA, 2000))
                .unlockedBy("has_raw_cobalt", has(ModItems.RAW_COBALT.get())).save(pWriter);

        new AlloyFurnaceRecipeBuilder(ModItems.RAW_LEAD.get(), (ModItems.RAW_LEAD.get()), (ModItems.RAW_LEAD.get()), ModItems.LEAD_INGOT.get(), 4, 100,
                new FluidStack(Fluids.LAVA, 1000))
                .unlockedBy("has_raw_lead", has(ModItems.RAW_LEAD.get())).save(pWriter);


        new AlloyFurnaceRecipeBuilder(Items.BLAZE_ROD, (ModItems.COBALT_INGOT.get()), (Blocks.AIR), ModItems.BLAZE_COBALT_INGOT.get(), 1, 100,
                new FluidStack(Fluids.LAVA, 500))
                .unlockedBy("has_cobalt_ingot", has(ModItems.COBALT_INGOT.get())).save(pWriter);

        new AlloyFurnaceRecipeBuilder(Items.BLAZE_ROD, (ModItems.LEAD_INGOT.get()), (Blocks.AIR), ModItems.BLAZE_LEAD_INGOT.get(), 1, 100,
                new FluidStack(Fluids.LAVA, 500))
                .unlockedBy("has_lead_ingot", has(ModItems.LEAD_INGOT.get())).save(pWriter);

        new AlloyFurnaceRecipeBuilder(Items.BLAZE_ROD, (ModItems.CHROMIUM_INGOT.get()), (Blocks.AIR), ModItems.BLAZE_CHROMIUM_INGOT.get(), 1, 100,
                new FluidStack(Fluids.LAVA, 500))
                .unlockedBy("has_chromium_ingot", has(ModItems.CHROMIUM_INGOT.get())).save(pWriter);

        new AlloyFurnaceRecipeBuilder(Items.BLAZE_ROD, (ModItems.MAGNESIUM_INGOT.get()), (Blocks.AIR), ModItems.BLAZE_MAGNESIUM_INGOT.get(), 1, 100,
                new FluidStack(Fluids.LAVA, 500))
                .unlockedBy("has_magnesium_ingot", has(ModItems.MAGNESIUM_INGOT.get())).save(pWriter);

        new AlloyFurnaceRecipeBuilder(Items.BLAZE_ROD, (ModItems.MOLYBDENUM_INGOT.get()), (Blocks.AIR), ModItems.BLAZE_MOLYBDENUM_INGOT.get(), 1, 100,
                new FluidStack(Fluids.LAVA, 500))
                .unlockedBy("has_molybdenum_ingot", has(ModItems.MOLYBDENUM_INGOT.get())).save(pWriter);




        new AlloyFurnaceRecipeBuilder(ModItems.COBALT_INGOT.get(), (ModItems.LEAD_INGOT.get()), (Blocks.AIR), ModItems.COBALT_LEAD_INGOT.get(), 1, 100,
                new FluidStack(Fluids.LAVA, 500))
                .unlockedBy("has_lead_ingot", has(ModItems.LEAD_INGOT.get())).save(pWriter);

        new AlloyFurnaceRecipeBuilder(ModItems.COBALT_INGOT.get(), (ModItems.CHROMIUM_INGOT.get()), (Blocks.AIR), ModItems.COBALT_CHROMIUM_INGOT.get(), 1, 100,
                new FluidStack(Fluids.LAVA, 500))
                .unlockedBy("has_chromium_ingot", has(ModItems.CHROMIUM_INGOT.get())).save(pWriter);

        new AlloyFurnaceRecipeBuilder(ModItems.COBALT_INGOT.get(), (ModItems.MAGNESIUM_INGOT.get()), (Blocks.AIR), ModItems.COBALT_MAGNESIUM_INGOT.get(), 1, 100,
                new FluidStack(Fluids.LAVA, 500))
                .unlockedBy("has_magnesium_ingot", has(ModItems.MAGNESIUM_INGOT.get())).save(pWriter);

        new AlloyFurnaceRecipeBuilder(ModItems.COBALT_INGOT.get(), (ModItems.MOLYBDENUM_INGOT.get()), (Blocks.AIR), ModItems.COBALT_MOLYBDENUM_INGOT.get(), 1, 100,
                new FluidStack(Fluids.LAVA, 500))
                .unlockedBy("has_molybdenum_ingot", has(ModItems.MOLYBDENUM_INGOT.get())).save(pWriter);

        SmithingTransformRecipeBuilder.smithing(Ingredient.of(ModItems.COBALT_NETHERITE_UPGRADE_SMITHING_TEMPLATE.get()), Ingredient.of(Items.NETHERITE_SWORD),
                        Ingredient.of(ModItems.COBALT_INGOT.get()), RecipeCategory.COMBAT, ModItems.COBALT_NETHERITE_SWORD.get()).
                unlocks("has_cobalt_ingot", has(ModItems.COBALT_INGOT.get())).save(pWriter, new ResourceLocation(alloy_furnace.MOD_ID, "cobalt_netherite_sword"));





    }

    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult,
                pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult,
                pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer,
                                     List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime,
                            pCookingSerializer).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer, alloy_furnace.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}
