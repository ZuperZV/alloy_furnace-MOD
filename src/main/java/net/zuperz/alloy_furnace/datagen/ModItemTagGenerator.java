package net.zuperz.alloy_furnace.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.zuperz.alloy_furnace.alloy_furnace;
import net.zuperz.alloy_furnace.item.ModItems;
import net.zuperz.alloy_furnace.util.ModTags;
import org.jetbrains.annotations.Nullable;

import java.util.Arrays;
import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> future,
                               CompletableFuture<TagLookup<Block>> completableFuture, @Nullable ExistingFileHelper existingFileHelper) {
        super(packOutput, future, completableFuture, alloy_furnace.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {

        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.COBALT_HELMET.get())
                .add(ModItems.COBALT_CHESTPLATE.get())
                .add(ModItems.COBALT_LEGGINGS.get())
                .add(ModItems.COBALT_BOOTS.get());


        builder(ModTags.Items.INGOTS_COBALT, ModItems.COBALT_INGOT.get());
        tag(Tags.Items.INGOTS)
                .addTag(ModTags.Items.INGOTS_COBALT);
    }

    @Override
    public String getName() {
        return "Item Tags";
    }

    private void builder(TagKey<Item> tag, ItemLike... items) {
        tag(tag).add(Arrays.stream(items).map(ItemLike::asItem).toArray(Item[]::new));
    }
}