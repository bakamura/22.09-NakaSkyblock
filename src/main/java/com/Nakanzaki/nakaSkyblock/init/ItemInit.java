package com.Nakanzaki.nakaSkyblock.init;

import com.Nakanzaki.nakaSkyblock.NakaSkyblock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, NakaSkyblock.MODID);

    // //Items

    //Mining
    public static final RegistryObject<Item> COMPRESSED_COAL = ITEMS.register("compressed_coal", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> COMPRESSED_IRON = ITEMS.register("compressed_iron", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> COMPRESSED_GOLD = ITEMS.register("compressed_gold", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> COMPRESSED_REDSTONE = ITEMS.register("compressed_redstone", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> COMPRESSED_LAPIS_LAZULI = ITEMS.register("compressed_lapis_lazuli", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> COMPRESSED_EMERALD = ITEMS.register("compressed_emerald", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> COMPRESSED_DIAMOND = ITEMS.register("compressed_diamond", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> COMPRESSED_GLOWSTONE = ITEMS.register("compressed_glowstone", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> COMPRESSED_QUARTZ = ITEMS.register("compressed_quartz", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> COMPRESSED_NETHERITE = ITEMS.register("compressed_netherite", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));

    // //Blocks - Can be automatized?

    //Mining
    public static final RegistryObject<BlockItem> COMPRESSED_DIRT_BLOCK_ITEM = ITEMS.register("compressed_dirt_block", () -> new BlockItem(BlockInit.COMPRESSED_DIRT_BLOCK.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> COMPRESSED_COBBLESTONE_BLOCK_ITEM = ITEMS.register("compressed_cobblestone_block", () -> new BlockItem(BlockInit.COMPRESSED_COBBLESTONE_BLOCK.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> COMPRESSED_SAND_BLOCK_ITEM = ITEMS.register("compressed_sand_block", () -> new BlockItem(BlockInit.COMPRESSED_SAND_BLOCK.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> COMPRESSED_GRAVEL_BLOCK_ITEM = ITEMS.register("compressed_gravel_block", () -> new BlockItem(BlockInit.COMPRESSED_GRAVEL_BLOCK.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> COMPRESSED_ICE_BLOCK_ITEM = ITEMS.register("compressed_ice_block", () -> new BlockItem(BlockInit.COMPRESSED_ICE_BLOCK.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> COMPRESSED_NETHERRACK_BLOCK_ITEM = ITEMS.register("compressed_netherrack_block", () -> new BlockItem(BlockInit.COMPRESSED_NETHERRACK_BLOCK.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> COMPRESSED_ENDSTONE_BLOCK_ITEM = ITEMS.register("compressed_endstone_block", () -> new BlockItem(BlockInit.COMPRESSED_ENDSTONE_BLOCK.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> COMPRESSED_OBSIDIAN_BLOCK_ITEM = ITEMS.register("compressed_obsidian_block", () -> new BlockItem(BlockInit.COMPRESSED_OBSIDIAN_BLOCK.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
}
