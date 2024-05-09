package net.zuperz.alloy_furnace.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.zuperz.alloy_furnace.alloy_furnace;
import net.zuperz.alloy_furnace.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, alloy_furnace.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ALLOY_FURNACE = CREATIVE_MODE_TABS.register("alloy_furnace_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.COBALT_INGOT.get()))
                    .title(Component.translatable("creativetab.alloy_furnace_tab"))
                    .displayItems((displayParameters, output) -> {

                        output.accept(ModBlocks.ALLOY_FURNACE.get());

                        output.accept(ModItems.COBALT_MOLYBDENUM_INGOT.get());
                        output.accept(ModItems.BLAZE_MOLYBDENUM_INGOT.get());
                        output.accept(ModItems.MOLYBDENUM_INGOT.get());
                        output.accept(ModItems.RAW_MOLYBDENUM.get());
                        output.accept(ModItems.MOLYBDENUM_NUGGET.get());

                        output.accept(ModItems.COBALT_MAGNESIUM_INGOT.get());
                        output.accept(ModItems.BLAZE_MAGNESIUM_INGOT.get());
                        output.accept(ModItems.MAGNESIUM_INGOT.get());
                        output.accept(ModItems.RAW_MAGNESIUM.get());
                        output.accept(ModItems.MAGNESIUM_NUGGET.get());

                        output.accept(ModItems.COBALT_LEAD_INGOT.get());
                        output.accept(ModItems.BLAZE_LEAD_INGOT.get());
                        output.accept(ModItems.LEAD_INGOT.get());
                        output.accept(ModItems.RAW_LEAD.get());
                        output.accept(ModItems.LEAD_NUGGET.get());

                        output.accept(ModItems.BLAZE_COBALT_INGOT.get());
                        output.accept(ModItems.COBALT_INGOT.get());
                        output.accept(ModItems.RAW_COBALT.get());
                        output.accept(ModItems.COBALT_NUGGET.get());

                        output.accept(ModItems.COBALT_CHROMIUM_INGOT.get());
                        output.accept(ModItems.BLAZE_CHROMIUM_INGOT.get());
                        output.accept(ModItems.CHROMIUM_INGOT.get());
                        output.accept(ModItems.RAW_CHROMIUM.get());
                        output.accept(ModItems.CHROMIUM_NUGGET.get());

                    }).build());

    public static final RegistryObject<CreativeModeTab> ALLOY_TOOLS = CREATIVE_MODE_TABS.register("alloy_tools_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.COBALT_NETHERITE_SWORD.get()))
                    .title(Component.translatable("creativetab.alloy_tools_tab"))
                    .displayItems((displayParameters, output) -> {

                        output.accept(ModItems.COBALT_NETHERITE_SWORD.get());
                        output.accept(ModItems.COBALT_SHEARS.get());

                        output.accept(ModItems.COBALT_APPLE.get());

                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
