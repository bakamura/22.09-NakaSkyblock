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
    public static final RegistryObject<Item> COMPRESSED_COAL = ITEMS.register("compressed_coal",
            () -> new Item(new Item.Properties().tab(NakaSkyblock.TAB_COLLECTIONS)));
    public static final RegistryObject<Item> COMPRESSED_IRON = ITEMS.register("compressed_iron",
            () -> new Item(new Item.Properties().tab(NakaSkyblock.TAB_COLLECTIONS)));
    public static final RegistryObject<Item> COMPRESSED_GOLD = ITEMS.register("compressed_gold",
            () -> new Item(new Item.Properties().tab(NakaSkyblock.TAB_COLLECTIONS)));
    public static final RegistryObject<Item> COMPRESSED_REDSTONE = ITEMS.register("compressed_redstone",
            () -> new Item(new Item.Properties().tab(NakaSkyblock.TAB_COLLECTIONS)));
    public static final RegistryObject<Item> COMPRESSED_LAPIS_LAZULI = ITEMS.register("compressed_lapis_lazuli",
            () -> new Item(new Item.Properties().tab(NakaSkyblock.TAB_COLLECTIONS)));
    public static final RegistryObject<Item> COMPRESSED_FLINT = ITEMS.register("compressed_flint",
            () -> new Item((new Item.Properties().tab(NakaSkyblock.TAB_COLLECTIONS))));
    public static final RegistryObject<Item> COMPRESSED_EMERALD = ITEMS.register("compressed_emerald",
            () -> new Item(new Item.Properties().tab(NakaSkyblock.TAB_COLLECTIONS)));
    public static final RegistryObject<Item> COMPRESSED_DIAMOND = ITEMS.register("compressed_diamond",
            () -> new Item(new Item.Properties().tab(NakaSkyblock.TAB_COLLECTIONS)));
    public static final RegistryObject<Item> COMPRESSED_GLOWSTONE_DUST = ITEMS.register("compressed_glowstone_dust",
            () -> new Item(new Item.Properties().tab(NakaSkyblock.TAB_COLLECTIONS)));
    public static final RegistryObject<Item> COMPRESSED_QUARTZ = ITEMS.register("compressed_quartz",
            () -> new Item(new Item.Properties().tab(NakaSkyblock.TAB_COLLECTIONS)));
    public static final RegistryObject<Item> COMPRESSED_NETHERITE = ITEMS.register("compressed_netherite",
            () -> new Item(new Item.Properties().tab(NakaSkyblock.TAB_COLLECTIONS)));

}
