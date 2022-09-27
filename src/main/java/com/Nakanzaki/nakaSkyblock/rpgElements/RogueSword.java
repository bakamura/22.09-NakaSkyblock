package com.Nakanzaki.nakaSkyblock.rpgElements;

import java.util.List;
import java.util.ListIterator;

public class RogueSword extends Weapon {
    RogueSword() {
        damage = 20;
        atkSpeed = 2;
        dmgType = DamageType.physical;
        weaponType = WeaponType.sword;
        addStats = new AdditionalStatsAgainstType(CombatStats.Type.humanoid, 0, 0, 0, 0);
    }

    @Override
    void leftClickAbility(CombatStats stats) {

    }

    float buffAmount = 50f;
    float buffDuration = 15f;

    @Override
    void rightClickAbility(CombatStats stats) {
        stats.buffAgility(stats.agility() + buffAmount, buffDuration);
    }
}
