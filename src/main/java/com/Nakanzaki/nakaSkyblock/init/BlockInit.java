package com.Nakanzaki.nakaSkyblock.init;

import com.Nakanzaki.nakaSkyblock.NakaSkyblock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static com.Nakanzaki.nakaSkyblock.NakaSkyblock.TAB_COLLECTIONS;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, NakaSkyblock.MODID);

    public static final RegistryObject<Block> COMPRESSED_DIRT_BLOCK = registerBlock("compressed_dirt_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.DIRT).strength(1)),
                  new Item.Properties().tab(TAB_COLLECTIONS));
    public static final RegistryObject<Block> COMPRESSED_COBBLESTONE_BLOCK = registerBlock("compressed_cobblestone_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.DIRT).strength(4).requiresCorrectToolForDrops()),
                  new Item.Properties().tab(TAB_COLLECTIONS));
    public static final RegistryObject<Block> COMPRESSED_SAND_BLOCK = registerBlock("compressed_sand_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength(1)),
                  new Item.Properties().tab(TAB_COLLECTIONS));
    public static final RegistryObject<Block> COMPRESSED_ICE_BLOCK = registerBlock("compressed_ice_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.ICE).strength(1).requiresCorrectToolForDrops()),
                  new Item.Properties().tab(TAB_COLLECTIONS));
    public static final RegistryObject<Block> COMPRESSED_NETHERRACK_BLOCK = registerBlock("compressed_netherrack_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.DIRT).strength(0.8f)),
                  new Item.Properties().tab(TAB_COLLECTIONS));
    public static final RegistryObject<Block> COMPRESSED_END_STONE_BLOCK = registerBlock("compressed_end_stone_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.DIRT).strength(6).requiresCorrectToolForDrops()),
                  new Item.Properties().tab(TAB_COLLECTIONS));
    public static final RegistryObject<Block> COMPRESSED_OBSIDIAN_BLOCK = registerBlock("compressed_obsidian_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.DIRT).strength(100).requiresCorrectToolForDrops()),
                  new Item.Properties().tab(TAB_COLLECTIONS));

    public static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> supplier, Item.Properties properties) {
        RegistryObject<T> block = BLOCKS.register(name, supplier);
        ItemInit.ITEMS.register(name, () -> new BlockItem(block.get(), properties));
        return block;
    }
}