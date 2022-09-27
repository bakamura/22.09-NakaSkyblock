package com.Nakanzaki.nakaSkyblock.rpgElements;

import static java.lang.Math.pow;

public class CombatStats {
    public float baseVitality;
    public float bonusVitality;
    public float vitality() { return  baseVitality + bonusVitality; }
    public float maxHealth() { return vitality(); }
    public float healthRegen() { return vitality()/60; }

    public float armor;
    public float magicResist;

    public float baseStrength;
    public float bonusStrength;
    public float strength() { return  baseStrength + bonusStrength; }

    public float baseIntelligence;
    public float bonusIntelligence;
    public float intelligence() { return baseIntelligence + bonusIntelligence; }
    public float maxMana() { return  intelligence()+100; }
    public float manaRegen() { return maxMana()/60; }

    public float baseTechnique;
    public float bonusTechnique;
    public float technique()  { return baseTechnique + bonusTechnique;}
    public float abilityHaste() { return (float) ((-pow(technique()-500,2)/250000)+2); }

    public float baseAgility = 0; // BaseStats + Armor
    public float bonusAgility = 0; // Temp Buffs
    public float agility() { return baseAgility + bonusAgility; }
    public float movementSpeed() { return (float) (-0.0003*pow(agility()-1000, 2)+400); }
    public float actionSpeed() { return (float) ((-pow(agility()-500,2)/250000)+2); }

    enum Type {
        humanoid, //Player, Villager, Illagers (except ravager), Piglins
        beast, //Cows, Pig, Horses, Llama, Bears, Goat, Ravager, Hoglin
        mini, //Bat, Cats, Fox, Chicken, Rabbit, Frogs
        undead, //Zombies, Skeletons, The Wither
        insect, //Spiders, Bee, Silverfish, Endermite
        aquatic, //Fish, Squids, Turtle, Dolphin, Axolotl, Guardians, Slime
        spirit, //Phantom, SnowGolem, Allay, Vex, Ghast, Blaze, MagmaCube, Warden
        voidling //Enderman, EnderDragon
    }
    Type type;

    //

    public float currentHealth;
    public float currentPhysicalAbsorption = 0;
    public float currentMagicalAbsorption = 0;
    public float bonusDmg = 0;
    public float currentMana;

    CombatStats(float vitality, float strength, float intelligence, float technique, float agility, Type type) {
        this.baseVitality = vitality;
        this.baseStrength = strength;
        this.baseIntelligence = intelligence;
        this.baseTechnique = technique;
        this.baseAgility = agility;
        this.type = type;
    }

    void updateVitality(float vitality) { this.baseVitality = vitality; }
    void buffVitality(float vitality, float duration) {
        this.bonusVitality = vitality;
        //start duration count
    }
    void updateArmor(float armor) { this.armor = armor; }
    void updateMagicResist(float magicResist) { this.magicResist = magicResist; }
    void updateStrength(float strength) { this.baseStrength = strength; }
    void buffStrength(float strength, float duration) {
        this.bonusStrength = strength;
        //start duration count
    }
    void updateIntelligence(float intelligence) { this.baseIntelligence = intelligence; }
    void buffIntelligence(float intelligence, float duration) {
        this.bonusIntelligence = intelligence;
        //start duration count
    }
    void updateTechnique(float technique) { this.baseTechnique = technique; }
    void buffTechnique(float technique, float duration) {
        this.bonusTechnique = technique;
        //start duration count
    }
    void updateAgility(float agility) { this.baseAgility = agility; }
    void buffAgility(float agility, float duration) {
        this.bonusAgility = agility;
        //start duration count
    }

    float takeDamage(CombatStats dealer, Weapon weapon) {
        float damage = DamageFormula.swordDamage(dealer, weapon, this);
        float mitigatedDamage = damage * (100/(100+(weapon.dmgType == Weapon.DamageType.physical? armor : magicResist)))
                * (1-(weapon.dmgType == Weapon.DamageType.physical? currentPhysicalAbsorption : currentMagicalAbsorption));
        currentHealth -= mitigatedDamage;
        return mitigatedDamage;
    }
}
