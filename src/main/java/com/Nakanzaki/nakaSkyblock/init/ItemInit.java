package com.Nakanzaki.nakaSkyblock.init;

import com.Nakanzaki.nakaSkyblock.NakaSkyblock;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
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

    // //Tools

    //Swords
    public static final RegistryObject<SwordItem> ROGUE_SWORD = ITEMS.register("rogue_sword",
            () -> new SwordItem(Tiers.ADAMANTIUM, 10, 0.4f, new Item.Properties().tab(NakaSkyblock.TAB_COLLECTIONS)));

    //Pickaxes
    public static final RegistryObject<PickaxeItem> ZOMBIE_PICKAXE = ITEMS.register("zombie_pickaxe",
            () -> new PickaxeItem(Tiers.ADAMANTIUM, 10, 0.4f, new Item.Properties().tab(NakaSkyblock.TAB_COLLECTIONS)));

    //Shovels
    public static final RegistryObject<ShovelItem> FLINT_SHOVEL = ITEMS.register("flint_shovel",
            () -> new ShovelItem(Tiers.ADAMANTIUM, 10, 0.4f, new Item.Properties().tab(NakaSkyblock.TAB_COLLECTIONS)));

    //Axes
    public static final RegistryObject<AxeItem> JUNGLE_AXE = ITEMS.register("jungle_axe",
            () -> new AxeItem(Tiers.ADAMANTIUM, 10, 0.4f, new Item.Properties().tab(NakaSkyblock.TAB_COLLECTIONS)));

    //Hoes
    public static final RegistryObject<HoeItem> SEEDY_HOE = ITEMS.register("seedy_hoe",
            () -> new HoeItem(Tiers.ADAMANTIUM, 10, 0.4f, new Item.Properties().tab(NakaSkyblock.TAB_COLLECTIONS)));

    //
    public static class Tiers {
        public static final Tier ADAMANTIUM = new ForgeTier(5, 2048,2.0f, 0,350, null,
                () -> Ingredient.EMPTY);
    }

    // //Foods
    public static final RegistryObject<Item> COMPRESSED_APPLE = ITEMS.register("compressed_apple",
            () -> new Item(new Item.Properties().tab(NakaSkyblock.TAB_COLLECTIONS).food(FoodProperty.COMPRESSED_APPLE)));

    public static class FoodProperty {
        public static final FoodProperties COMPRESSED_APPLE = new FoodProperties.Builder()
                .alwaysEat()
                .fast()
                .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1200, 1), 1.0f)
                .build();
    }
}
