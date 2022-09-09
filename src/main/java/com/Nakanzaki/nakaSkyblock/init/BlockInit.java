package com.Nakanzaki.nakaSkyblock.init;

import com.Nakanzaki.nakaSkyblock.NakaSkyblock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, NakaSkyblock.MODID);

    public static final RegistryObject<Block> COMPRESSED_DIRT_BLOCK = BLOCKS.register("compressed_dirt_block", () -> new Block(BlockBehaviour.Properties.of(Material.FROGLIGHT).friction(0.5f)));
    public static final RegistryObject<Block> COMPRESSED_COBBLESTONE_BLOCK = BLOCKS.register("compressed_cobblestone_block", () -> new Block(BlockBehaviour.Properties.of(Material.FROGLIGHT).friction(0.5f)));
    public static final RegistryObject<Block> COMPRESSED_SAND_BLOCK = BLOCKS.register("compressed_sand_block", () -> new Block(BlockBehaviour.Properties.of(Material.FROGLIGHT).friction(0.5f)));
    public static final RegistryObject<Block> COMPRESSED_GRAVEL_BLOCK = BLOCKS.register("compressed_gravel_block", () -> new Block(BlockBehaviour.Properties.of(Material.FROGLIGHT).friction(0.5f)));
    public static final RegistryObject<Block> COMPRESSED_ICE_BLOCK = BLOCKS.register("compressed_ice_block", () -> new Block(BlockBehaviour.Properties.of(Material.FROGLIGHT).friction(0.5f)));
    public static final RegistryObject<Block> COMPRESSED_NETHERRACK_BLOCK = BLOCKS.register("compressed_netherrack_block", () -> new Block(BlockBehaviour.Properties.of(Material.FROGLIGHT).friction(0.5f)));
    public static final RegistryObject<Block> COMPRESSED_ENDSTONE_BLOCK = BLOCKS.register("compressed_endstone_block", () -> new Block(BlockBehaviour.Properties.of(Material.FROGLIGHT).friction(0.5f)));
    public static final RegistryObject<Block> COMPRESSED_OBSIDIAN_BLOCK = BLOCKS.register("compressed_obsidian_block", () -> new Block(BlockBehaviour.Properties.of(Material.FROGLIGHT).friction(0.5f)));
}
