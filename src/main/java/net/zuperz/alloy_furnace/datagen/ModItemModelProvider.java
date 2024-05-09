package net.zuperz.alloy_furnace.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.zuperz.alloy_furnace.alloy_furnace;
import net.zuperz.alloy_furnace.item.ModItems;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, alloy_furnace.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        simpleItem(ModItems.COBALT_NETHERITE_UPGRADE_SMITHING_TEMPLATE);

        simpleItem(ModItems.MOLYBDENUM_INGOT);
        simpleItem(ModItems.RAW_MOLYBDENUM);
        simpleItem(ModItems.MOLYBDENUM_NUGGET);
        blazeSimpleItem(ModItems.BLAZE_MOLYBDENUM_INGOT);
        cobaltSimpleItem(ModItems.COBALT_MOLYBDENUM_INGOT);

        simpleItem(ModItems.MAGNESIUM_INGOT);
        simpleItem(ModItems.RAW_MAGNESIUM);
        simpleItem(ModItems.MAGNESIUM_NUGGET);
        blazeSimpleItem(ModItems.BLAZE_MAGNESIUM_INGOT);
        cobaltSimpleItem(ModItems.COBALT_MAGNESIUM_INGOT);

        simpleItem(ModItems.LEAD_INGOT);
        simpleItem(ModItems.RAW_LEAD);
        simpleItem(ModItems.LEAD_NUGGET);
        blazeSimpleItem(ModItems.BLAZE_LEAD_INGOT);
        cobaltSimpleItem(ModItems.COBALT_LEAD_INGOT);

        simpleItem(ModItems.COBALT_INGOT);
        simpleItem(ModItems.RAW_COBALT);
        simpleItem(ModItems.COBALT_NUGGET);
        blazeSimpleItem(ModItems.BLAZE_COBALT_INGOT);

        simpleItem(ModItems.CHROMIUM_INGOT);
        simpleItem(ModItems.RAW_CHROMIUM);
        simpleItem(ModItems.CHROMIUM_NUGGET);
        blazeSimpleItem(ModItems.BLAZE_CHROMIUM_INGOT);
        cobaltSimpleItem(ModItems.COBALT_CHROMIUM_INGOT);

        simpleItem(ModItems.P_DIAMOND);
        simpleItem(ModItems.COBALT_SHEARS);
        handheldItem(ModItems.COBALT_NETHERITE_SWORD);

        simpleItem(ModItems.COBALT_APPLE);

    }

    public void fenceItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
                .texture("texture",  new ResourceLocation(alloy_furnace.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void wallItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  new ResourceLocation(alloy_furnace.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void buttonItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/button_inventory"))
                .texture("texture",  new ResourceLocation(alloy_furnace.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    private ItemModelBuilder saplingItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(alloy_furnace.MOD_ID,"block/" + item.getId().getPath()));
    }

    private ItemModelBuilder complexBlock(Block block) {
        return withExistingParent(ForgeRegistries.BLOCKS.getKey(block).getPath(), new ResourceLocation(alloy_furnace.MOD_ID,
                "block/" + ForgeRegistries.BLOCKS.getKey(block).getPath()));
    }
    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(alloy_furnace.MOD_ID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleBlockItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(alloy_furnace.MOD_ID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(alloy_furnace.MOD_ID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder blazeSimpleItem(RegistryObject<Item> item) {
        String itemName = item.getId().getPath();

        // Fjern "blaze_"
        itemName = itemName.replace("blaze_", "");

        return withExistingParent(item.getId().getPath(), new ResourceLocation("item/generated"))
                .texture("layer0", new ResourceLocation(alloy_furnace.MOD_ID, "item/" + itemName))
                .texture("layer1", new ResourceLocation(alloy_furnace.MOD_ID, "item/blaze")); // blaze
    }

    private ItemModelBuilder cobaltSimpleItem(RegistryObject<Item> item) {
        String itemName = item.getId().getPath();

        // Fjern "blaze_"
        itemName = itemName.replace("cobalt_", "");

        return withExistingParent(item.getId().getPath(), new ResourceLocation("item/generated"))
                .texture("layer0", new ResourceLocation(alloy_furnace.MOD_ID, "item/" + itemName))
                .texture("layer1", new ResourceLocation(alloy_furnace.MOD_ID, "item/cobalt")); // blaze
    }
}