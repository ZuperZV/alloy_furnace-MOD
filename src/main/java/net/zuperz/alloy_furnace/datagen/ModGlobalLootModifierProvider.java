package net.zuperz.alloy_furnace.datagen;

import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.zuperz.alloy_furnace.alloy_furnace;

public class ModGlobalLootModifierProvider extends GlobalLootModifierProvider {
    public ModGlobalLootModifierProvider(PackOutput output) {
        super(output, alloy_furnace.MOD_ID);
    }

    @Override
    protected void start() {
        //add("mudstone_shard_from_simple_dungeon", new AddItemModifier(new LootItemCondition[] {
        //        new LootTableIdCondition.Builder(new ResourceLocation("chests/simple_dungeon")).build(),
        //        LootItemRandomChanceCondition.randomChance(0.45f).build() }, ModItems.MUDSTONE_SHARD.get()));
    }
}