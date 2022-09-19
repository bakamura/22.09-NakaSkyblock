package com.Nakanzaki.nakaSkyblock.base;

import com.Nakanzaki.nakaSkyblock.NakaSkyblock;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public record ArmorMat(String name, int durability, int[] protection, int enchantability, SoundEvent equipSound, float toughness, float  knockbackResistance, Supplier<Ingredient> repairIngredient) implements ArmorMaterial {
    //private static final int[] DURABILITY_PER_SLOT = new int[] { 13, 15, 16, 11 }; //Minecraft default

    @Override
    public int getDurabilityForSlot(EquipmentSlot slot) {
        return this.durability;
    }
    @Override
    public int getDefenseForSlot(EquipmentSlot slot) { return this.protection[slot.getIndex()]; }
    @Override
    public int getEnchantmentValue() {
        return this.enchantability;
    }
    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }
    @Override
    public Ingredient getRepairIngredient() {
        return repairIngredient.get();
    }
    @Override
    public String getName() {
        return NakaSkyblock.MODID + ":" + this.name;
    }
    @Override
    public float getToughness() {
        return this.toughness;
    }
    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
