package com.Nakanzaki.nakaSkyblock.rpgElements;

public abstract class Weapon {
    float damage;
    enum DamageType {
        physical,
        magical,
        direct //true
    }
    DamageType dmgType;
    enum WeaponType {
        sword,
        axe,
        bow,
        scepter,
        grimoire
    }
    WeaponType weaponType;
    float atkSpeed;

    class AdditionalStatsAgainstType {
        CombatStats.Type type = CombatStats.Type.humanoid;
        float addStrength = 0;
        float addTechnique = 0;
        float addIntelligence = 0;
        float addBonusDmg = 0;

        AdditionalStatsAgainstType(CombatStats.Type type, float strength, float technique, float intelligence, float bonusDmg) {
            this.type = type;
            this.addStrength = strength;
            this.addTechnique = technique;
            this.addIntelligence = intelligence;
            this.addBonusDmg = bonusDmg;
        }
    }
    AdditionalStatsAgainstType addStats;
    abstract void leftClickAbility(CombatStats stats);
    abstract void rightClickAbility(CombatStats stats);
}
