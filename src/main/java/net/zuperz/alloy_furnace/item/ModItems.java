package net.zuperz.alloy_furnace.item;

import net.minecraft.world.food.Foods;
import net.minecraft.world.item.*;
import net.minecraft.world.level.material.Fluids;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.zuperz.alloy_furnace.alloy_furnace;
import net.zuperz.alloy_furnace.item.costom.ModSmithingTemplateItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, alloy_furnace.MOD_ID);

    public static final RegistryObject<Item> MOLYBDENUM_INGOT = ITEMS.register("molybdenum_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_MOLYBDENUM = ITEMS.register("raw_molybdenum",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> MOLYBDENUM_NUGGET = ITEMS.register("molybdenum_nugget",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BLAZE_MOLYBDENUM_INGOT = ITEMS.register("blaze_molybdenum_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> COBALT_MOLYBDENUM_INGOT = ITEMS.register("cobalt_molybdenum_ingot",
            () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> MAGNESIUM_INGOT = ITEMS.register("magnesium_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_MAGNESIUM = ITEMS.register("raw_magnesium",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> MAGNESIUM_NUGGET = ITEMS.register("magnesium_nugget",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BLAZE_MAGNESIUM_INGOT = ITEMS.register("blaze_magnesium_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> COBALT_MAGNESIUM_INGOT = ITEMS.register("cobalt_magnesium_ingot",
            () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> LEAD_INGOT = ITEMS.register("lead_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_LEAD = ITEMS.register("raw_lead",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> LEAD_NUGGET = ITEMS.register("lead_nugget",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BLAZE_LEAD_INGOT = ITEMS.register("blaze_lead_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> COBALT_LEAD_INGOT = ITEMS.register("cobalt_lead_ingot",
            () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> COBALT_INGOT = ITEMS.register("cobalt_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_COBALT = ITEMS.register("raw_cobalt",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> COBALT_NUGGET = ITEMS.register("cobalt_nugget",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BLAZE_COBALT_INGOT = ITEMS.register("blaze_cobalt_ingot",
            () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> CHROMIUM_INGOT = ITEMS.register("chromium_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_CHROMIUM = ITEMS.register("raw_chromium",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CHROMIUM_NUGGET = ITEMS.register("chromium_nugget",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BLAZE_CHROMIUM_INGOT = ITEMS.register("blaze_chromium_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> COBALT_CHROMIUM_INGOT = ITEMS.register("cobalt_chromium_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> COBALT_HELMET = ITEMS.register("cobalt_helmet",
            () -> new ArmorItem(ModArmorMaterials.COBALT, ArmorItem.Type.HELMET, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> COBALT_CHESTPLATE = ITEMS.register("cobalt_chestplate",
            () -> new ArmorItem(ModArmorMaterials.COBALT, ArmorItem.Type.CHESTPLATE, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> COBALT_LEGGINGS = ITEMS.register("cobalt_leggings",
            () -> new ArmorItem(ModArmorMaterials.COBALT, ArmorItem.Type.LEGGINGS, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> COBALT_BOOTS = ITEMS.register("cobalt_boots",
            () -> new ArmorItem(ModArmorMaterials.COBALT, ArmorItem.Type.BOOTS, new Item.Properties().fireResistant()));


    public static final RegistryObject<Item> P_DIAMOND = ITEMS.register("p_diamond",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> COBALT_SHEARS = ITEMS.register("cobalt_shears",
            () -> new ShearsItem((new Item.Properties()).durability(738)));

    public static final RegistryObject<Item> COBALT_APPLE = ITEMS.register("cobalt_apple",
            () -> new Item((new Item.Properties()).rarity(Rarity.RARE).food(Foods.GOLDEN_APPLE)));

    public static final RegistryObject<Item> LEAD_SHIELD = ITEMS.register("lead_shield",
            () -> new ShieldItem((new Item.Properties()).durability(436)));

    public static final RegistryObject<Item> COBALT_NETHERITE_SWORD = ITEMS.register("cobalt_netherite_sword",
            () -> new SwordItem(Tiers.NETHERITE, 4, -2.4F, (new Item.Properties()).fireResistant()));

    public static final RegistryObject<Item> COBALT_ELYTRA = ITEMS.register("cobalt_elytra",
            () -> new ElytraItem((new Item.Properties()).durability(632).rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<Item> COBALT_NETHERITE_UPGRADE_SMITHING_TEMPLATE = ITEMS.register("cobalt_netherite_upgrade_smithing_template",
            ModSmithingTemplateItem::createCobaltNetheriteUpgradeTemplate);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
