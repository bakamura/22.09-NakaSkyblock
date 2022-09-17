package com.Nakanzaki.nakaSkyblock.rpgElements;

import net.minecraft.util.RandomSource;

import java.util.Random;

import static java.lang.Math.sqrt;
import static net.minecraft.util.Mth.*;

public class SkillStats {
    public CombatStats combatStats;
    private Random rand = new Random();

    //levels
    public float combatXp;
    public int combatLv() { return lvCalc(combatXp); }
    public float miningXp;
    public int miningLv() { return lvCalc(miningXp); }
    public float foragingXp;
    public int foragingLv() { return lvCalc(foragingXp); }
    public float farmingXp;
    public int farmingLv() { return lvCalc(farmingXp); }
    public float fishingXp;
    public int fishingLv() { return lvCalc(fishingXp); }
    public float smithingXp;
    public int smithingLv() { return lvCalc(smithingXp); }

    //mining
    public float miningSpeed() { return 1+ (combatStats.strength / 100)}
    public float fortune;
    public int procFortune() { return procDuplicator(fortune); }
    public float pristine;
    public int procPristine() { return procDuplicator(pristine); }

    //foraging
    public float foragingBuffBoost() { return combatStats.vitality; } //
    public float connection;
    public int procConnection() { return procDuplicator(connection); }

    //farming
    public float abundance;
    public int procAbundance() { return procDuplicator(abundance); }

    //fishing
    public float fishQualityBoost() { return combatStats.technique; } //
    public float lure;
    public float salt;


    public int lvCalc(float xp) {
        return floor(sqrt(xp/1250 + 12.25) - 3.5);
    }
    public int procDuplicator(float stat){
        int guaranteed = 1+floor(stat/100);
        return guaranteed+((rand.nextFloat()*100.0f < stat-100*guaranteed) ? 1 : 0);
    }
}
    