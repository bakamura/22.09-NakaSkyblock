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

    // Change into mining only collection?
    public static final CreativeModeTab TAB_COLLECTIONS = new CreativeModeTab(MODID) {
        @Override
        public ItemStack makeIcon() {
            return ItemInit.COMPRESSED_DIAMOND.get().getDefaultInstance();
        }
    };
}