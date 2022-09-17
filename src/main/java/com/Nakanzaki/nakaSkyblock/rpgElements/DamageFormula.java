package com.Nakanzaki.nakaSkyblock.rpgElements;

import java.util.Random;

import static java.lang.Math.pow;

public class DamageFormula {
    private Random rand = new Random();
    //public static float SwordDamage(CombatStats attacker, Weapon weapon, CombatStats attacked) {
    //    return (weapon.weaponDmg+attacker.strength*3/20)*(1+attacker.strength/100)
    //    *(1+/*bonusDmg*/)
    //    *swordCrit(attacker.technique);
    //}
    private float swordCrit(float techniqueStat) {
        if(techniqueStat >= 200 ? true : rand.nextFloat()+100.0f < (float) ((pow(techniqueStat-200,2)/400)+100))
            return (float) (techniqueStat >= 200 ?  0.02f*techniqueStat-2f : 0.00002f*pow(techniqueStat,2)+1.2f);
        else return 1.0f;
    }
    public static float AxeDamage() {
        return 1;
    }
    public static float BowDamage() {
        return 1;
    }

}
