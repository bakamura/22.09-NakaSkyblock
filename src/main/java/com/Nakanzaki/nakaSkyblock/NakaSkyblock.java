package com.Nakanzaki.nakaSkyblock;

import com.Nakanzaki.nakaSkyblock.init.BlockInit;
import com.Nakanzaki.nakaSkyblock.init.ItemInit;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(NakaSkyblock.MODID)
public class NakaSkyblock {
    public static final String MODID = "nakaskyblock";

    public NakaSkyblock() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemInit.ITEMS.register(bus);
        BlockInit.BLOCKS.register(bus);
    }

    public static final CreativeModeTab TAB_COMBAT = new CreativeModeTab("combatcollection") {
        @Override
        public ItemStack makeIcon() {
            return ItemInit.ROGUE_SWORD.get().getDefaultInstance();
        }
    };
    public static final CreativeModeTab TAB_MINING = new CreativeModeTab("miningcollection") {
        @Override
        public ItemStack makeIcon() {
            return ItemInit.COMPRESSED_DIAMOND.get().getDefaultInstance();
        }
    };
    public static final CreativeModeTab TAB_FORAGING = new CreativeModeTab("foragingcollection") {
        @Override
        public ItemStack makeIcon() {
            return ItemInit.COMPRESSED_APPLE.get().getDefaultInstance();
        }
    };
    public static final CreativeModeTab TAB_FARMING = new CreativeModeTab("farmingcollection") {
        @Override
        public ItemStack makeIcon() {
            return ItemInit.SEEDY_HOE.get().getDefaultInstance();
        }
    };
    public static final CreativeModeTab TAB_FISHING = new CreativeModeTab("fishingcollection") {
        @Override
        public ItemStack makeIcon() {
            return ItemInit.COMPRESSED_LAPIS_LAZULI.get().getDefaultInstance();
        }
    };
    public static final CreativeModeTab TAB_SMITHING = new CreativeModeTab("smithingcollection") {
        @Override
        public ItemStack makeIcon() {
            return ItemInit.COMPRESSED_IRON.get().getDefaultInstance();
        }
    };
}