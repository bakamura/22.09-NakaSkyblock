package com.Nakanzaki.nakaSkyblock.ItemAbilities;

import com.Nakanzaki.nakaSkyblock.NakaSkyblock;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class TeleportAbility extends SwordItem {
    public TeleportAbility(int damage, float attackSpeed, double teleportDistance, CreativeModeTab tab) {
        super(Tiers.DIAMOND, damage - 4, attackSpeed - 4f, new Item.Properties().tab(tab));
        this.teleportDistance = teleportDistance;
    }
    private static float weaponDmg;
    private static double teleportDistance;

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        //super.appendHoverText(stack, level, components, flag);

        components.add(Component.translatable(NakaSkyblock.MODID + ".weapon_dmg").append(Component.literal("\u00A7c" + (int) (getDamage() + 1))));
        if(Screen.hasShiftDown()) components.add(Component.literal("\u00A7oLore Stuff"));
        components.add(Component.translatable(NakaSkyblock.MODID + ".tier_rare").append(Component.translatable(NakaSkyblock.MODID + ".weapon_sword")));
    }

    @Override
    public boolean onLeftClickEntity(ItemStack stack, Player player, Entity entity) {
        return super.onLeftClickEntity(stack, player, entity);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        if(InteractionHand.MAIN_HAND == hand && !level.isClientSide) {
            player.teleportTo(
                    player.position().x + teleportDistance * player.getViewVector(1).x,
                    player.position().y + 1 + teleportDistance * player.getViewVector(1).y,
                    player.position().z + teleportDistance * player.getViewVector(1).z);
        }
        return super.use(level, player, hand);
    }

    @Override
    public InteractionResult useOn(UseOnContext p_41427_) {
        return super.useOn(p_41427_);
    }

    @Override
    public InteractionResult interactLivingEntity(ItemStack p_41398_, Player p_41399_, LivingEntity p_41400_, InteractionHand p_41401_) {
        return super.interactLivingEntity(p_41398_, p_41399_, p_41400_, p_41401_);
    }
}
