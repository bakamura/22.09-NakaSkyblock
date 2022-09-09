package com.Nakanzaki.nakaSkyblock;

import com.Nakanzaki.nakaSkyblock.init.BlockInit;
import com.Nakanzaki.nakaSkyblock.init.ItemInit;
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
}