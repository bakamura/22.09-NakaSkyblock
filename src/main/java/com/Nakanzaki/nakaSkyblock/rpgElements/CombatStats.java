package com.Nakanzaki.nakaSkyblock.rpgElements;

import static java.lang.Math.pow;

public class CombatStats {
    public float vitality;
    public float maxHealth() { return vitality; }
    public float healthRegen() { return vitality/60; }

    public float strength;

    public float intelligence;
    public float maxMana() { return  intelligence+100; }
    public float manaRegen() { return maxMana()/60; }

    public float technique;
    public float abilityHaste() { return (float) ((-pow(technique-500,2)/250000)+2); }

    public float agility;
    public float movementSpeed() { return (float) (-0.0003*pow(agility-1000, 2)+400); }
    public float actionSpeed() { return (float) ((-pow(agility-500,2)/250000)+2); }
}
