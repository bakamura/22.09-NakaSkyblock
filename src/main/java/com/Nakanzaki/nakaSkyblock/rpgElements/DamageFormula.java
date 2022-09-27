package com.Nakanzaki.nakaSkyblock.rpgElements;

import java.util.Random;

import static java.lang.Math.pow;

public class DamageFormula {
    private static Random rand = new Random();

    public static float swordDamage(CombatStats attacker, Weapon weapon, CombatStats attacked) {
        float finalStrength = attacker.strength() + (weapon.addStats.type == attacked.type? weapon.addStats.addStrength : 0);
        float finalTechnique = attacker.technique() + (weapon.addStats.type == attacked.type? weapon.addStats.addStrength : 0);
        float finalAddDmg = attacker.bonusDmg + (weapon.addStats.type == attacked.type? weapon.addStats.addBonusDmg : 0);

        return (weapon.damage+finalStrength*3/20)*(1+finalStrength/100)
        * (1 * (finalAddDmg)) * swordCrit(finalTechnique);
    }
    private static float swordCrit(float techniqueStat) {
        if(techniqueStat >= 200 ? true : rand.nextFloat()+100.0f < (float) ((pow(techniqueStat-200,2)/400)+100))
            return (float) (techniqueStat >= 200 ?  0.02f*techniqueStat-2f : 0.00002f*pow(techniqueStat,2)+1.2f);
        else return 1.0f;
    }
    public float AxeDamage() {
        return 1;
    }
    public float BowDamage() {
        return 1;
    }

}
