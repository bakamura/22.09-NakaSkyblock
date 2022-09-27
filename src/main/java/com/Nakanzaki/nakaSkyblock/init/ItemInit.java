package com.Nakanzaki.nakaSkyblock.init;

import com.Nakanzaki.nakaSkyblock.ItemAbilities.TeleportAbility;
import com.Nakanzaki.nakaSkyblock.NakaSkyblock;
import com.Nakanzaki.nakaSkyblock.base.ArmorMat;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, NakaSkyblock.MODID);

    // // Collections

    //Mining
    public static final RegistryObject<Item> COMPRESSED_COAL = ITEMS.register("compressed_coal",
            () -> new Item(new Item.Properties().tab(NakaSkyblock.TAB_MINING)));
    public static final RegistryObject<Item> COMPRESSED_IRON = ITEMS.register("compressed_iron",
            () -> new Item(new Item.Properties().tab(NakaSkyblock.TAB_MINING)));
    public static final RegistryObject<Item> COMPRESSED_GOLD = ITEMS.register("compressed_gold",
            () -> new Item(new Item.Properties().tab(NakaSkyblock.TAB_MINING)));
    public static final RegistryObject<Item> COMPRESSED_REDSTONE = ITEMS.register("compressed_redstone",
            () -> new Item(new Item.Properties().tab(NakaSkyblock.TAB_MINING)));
    public static final RegistryObject<Item> COMPRESSED_LAPIS_LAZULI = ITEMS.register("compressed_lapis_lazuli",
            () -> new Item(new Item.Properties().tab(NakaSkyblock.TAB_MINING)));
    public static final RegistryObject<Item> COMPRESSED_FLINT = ITEMS.register("compressed_flint",
            () -> new Item((new Item.Properties().tab(NakaSkyblock.TAB_MINING))));
    public static final RegistryObject<Item> COMPRESSED_EMERALD = ITEMS.register("compressed_emerald",
            () -> new Item(new Item.Properties().tab(NakaSkyblock.TAB_MINING)));
    public static final RegistryObject<Item> COMPRESSED_DIAMOND = ITEMS.register("compressed_diamond",
            () -> new Item(new Item.Properties().tab(NakaSkyblock.TAB_MINING)));
    public static final RegistryObject<Item> COMPRESSED_GLOWSTONE_DUST = ITEMS.register("compressed_glowstone_dust",
            () -> new Item(new Item.Properties().tab(NakaSkyblock.TAB_MINING)));
    public static final RegistryObject<Item> COMPRESSED_QUARTZ = ITEMS.register("compressed_quartz",
            () -> new Item(new Item.Properties().tab(NakaSkyblock.TAB_MINING)));
    public static final RegistryObject<Item> COMPRESSED_NETHERITE = ITEMS.register("compressed_netherite",
            () -> new Item(new Item.Properties().tab(NakaSkyblock.TAB_MINING)));

    // //Tools

    //Swords
    public static final RegistryObject<SwordItem> ROGUE_SWORD = ITEMS.register("rogue_sword",
            () -> new SwordItem(ToolTiers.MITHRIL_TOOL, 10, 0.4f, new Item.Properties().tab(NakaSkyblock.TAB_COMBAT)));
    public static final RegistryObject<SwordItem> ASPECT_OF_THE_END = ITEMS.register("aspect_of_the_end",
            () -> new TeleportAbility(50, 2, 5, NakaSkyblock.TAB_COMBAT));

    //Pickaxes
    public static final RegistryObject<PickaxeItem> ZOMBIE_PICKAXE = ITEMS.register("zombie_pickaxe",
            () -> new PickaxeItem(ToolTiers.MITHRIL_TOOL, 10, 0.4f, new Item.Properties().tab(NakaSkyblock.TAB_COMBAT)));

    //Shovels
    public static final RegistryObject<ShovelItem> FLINT_SHOVEL = ITEMS.register("flint_shovel",
            () -> new ShovelItem(ToolTiers.MITHRIL_TOOL, 10, 0.4f, new Item.Properties().tab(NakaSkyblock.TAB_MINING)));

    //Axes
    public static final RegistryObject<AxeItem> JUNGLE_AXE = ITEMS.register("jungle_axe",
            () -> new AxeItem(ToolTiers.MITHRIL_TOOL, 10, 0.4f, new Item.Properties().tab(NakaSkyblock.TAB_FORAGING)));

    //Hoes
    public static final RegistryObject<HoeItem> SEEDY_HOE = ITEMS.register("seedy_hoe",
            () -> new HoeItem(ToolTiers.MITHRIL_TOOL, 10, 0.4f, new Item.Properties().tab(NakaSkyblock.TAB_FARMING)));

    //Tool Tiers
    public static class ToolTiers {
        public static final Tier MITHRIL_TOOL = new ForgeTier(
                5,
                2048,
                1.0f,
                0,
                350,
                null,
                () -> Ingredient.EMPTY);
    }

    // //Armors

    //Foraging
    public  static final RegistryObject<ArmorItem> LEAFLET_HELMET = ITEMS.register("leaflet_helmet",
            () -> new ArmorItem(ArmorSets.LEAFLET_ARMOR, EquipmentSlot.HEAD, new Item.Properties().tab(NakaSkyblock.TAB_FORAGING)));
    public  static final RegistryObject<ArmorItem> LEAFLET_CHESTPLATE = ITEMS.register("leaflet_chestplate",
            () -> new ArmorItem(ArmorSets.LEAFLET_ARMOR, EquipmentSlot.CHEST, new Item.Properties().tab(NakaSkyblock.TAB_FORAGING)));
    public  static final RegistryObject<ArmorItem> LEAFLET_LEGGINGS = ITEMS.register("leaflet_leggings",
            () -> new ArmorItem(ArmorSets.LEAFLET_ARMOR, EquipmentSlot.LEGS, new Item.Properties().tab(NakaSkyblock.TAB_FORAGING)));
    public  static final RegistryObject<ArmorItem> LEAFLET_BOOTS = ITEMS.register("leaflet_boots",
            () -> new ArmorItem(ArmorSets.LEAFLET_ARMOR, EquipmentSlot.FEET, new Item.Properties().tab(NakaSkyblock.TAB_FORAGING)));

    //Armor Tiers
    public static class ArmorSets {
        public static final ArmorMaterial LEAFLET_ARMOR = new ArmorMat(
                "leaflet",
                1000,
                new int[] { 5, 8, 7, 4 },
                300,
                SoundEvents.ARMOR_EQUIP_LEATHER,
                0f,
                1f,
                () -> Ingredient.EMPTY
        );
    }

    // //Foods
    public static final RegistryObject<Item> COMPRESSED_APPLE = ITEMS.register("compressed_apple",
            () -> new Item(new Item.Properties().tab(NakaSkyblock.TAB_FORAGING).food(FoodProperty.COMPRESSED_APPLE)));

    public static class FoodProperty {
        public static final FoodProperties COMPRESSED_APPLE = new FoodProperties.Builder()
                .alwaysEat()
                .fast()
                .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1200, 1), 1.0f)
                .build();
    }
}
