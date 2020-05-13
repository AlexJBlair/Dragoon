package com.Dragoon;

public class Character {
    // Characteristics of all characters
    private String name;
    private String race;
    private String characterClass;
    private int level;
    private int experiencePoints;
    private int expThreshold;
    private int armorClass;
    private int maxHP;
    private int proficiency;

    // Major stats
    protected int strength;
    protected int dexterity;
    protected int constitution;
    protected int intelligence;
    protected int wisdom;
    protected int charisma;

    // Minor stats
    protected int acrobatics;
    protected int animalHandling;
    protected int arcana;
    protected int athletics;
    protected int deception;
    protected int history;
    protected int insight;
    protected int intimidation;
    protected int investigation;
    protected int medicine;
    protected int nature;
    protected int perception;
    protected int performance;
    protected int persuation;
    protected int religion;
    protected int sleightOfHand;
    protected int stealth;
    protected int survival;

    public String getName() {return name;}
    public String getRace(){return race;}
    public String getCharacterClass(){return characterClass;}
    public int getLevel(){return level;}
    public int getExperiencePoints(){return experiencePoints;}
    public int getArmorClass(){return armorClass;}
    public int getMaxHP(){return maxHP;}
    public int getProficiency(){return proficiency;}
    public int getExpThreshold(){return expThreshold;}

    public void setName(String nme){name = nme;}
    public void setRace(String Rce){race = Rce;}
    public void setCharacterClass(String charClass){characterClass = charClass;}
    public void setLevel(int lvl){level = lvl;}
    public void setExperiencePoints(int exp){experiencePoints = exp;}
    public void setArmorClass(int armor){armorClass = armor;}
    public void setMaxHP(int hp){maxHP = hp;}
    public void setProficiency(int prof){proficiency = prof;}
    public void setExpThreshold(int xpThreshold){expThreshold = xpThreshold;}

    // Call this whenever experience is high enough to level up
    // Da Ding!
    public void levelUp(int newHP, int newEXP)
    {
        if(experiencePoints >= expThreshold) {
            maxHP = newHP;
            experiencePoints = newEXP;
            level++;
        }
        else
            System.out.print("You cannot level up yet.");
    }

    public void listCharacterDetails()
    {
        System.out.print("=========================================================" + "\n");
        System.out.print("Name:" + getName() + "\n" + "Race:" + getRace() + "\n" + "Class:" + getCharacterClass() +
                "\n" + "Level:" + getLevel() + "\n" + "Current XP:" + getExperiencePoints() + "\n" + "Armor:"
                + getArmorClass() + "\n" + "MaxHP:" + getMaxHP() + "\n" + "Proficiency:" + getProficiency() + "\n" +
               "Strength:" + strength + "\n" + "Dexterity:" + dexterity + "\n" + "Constitution:" + constitution + "\n"
                + "Intelligence:" + intelligence + "\n" + "Wisdom:" + wisdom + "\n" + "Charisma:" + charisma + "\n");
        System.out.print("=========================================================" + "\n");
    }

    // No Arg Constructor
    //public Character(){}

    public Character(String name, String race, String charClass, int level, int experiencePoints,
                     int armor, int hp, int proficiency, int str, int dex, int con,int intel, int wis,
                     int charis){
        setName(name);
        setRace(race);
        setCharacterClass(charClass);
        setLevel(level);
        setExperiencePoints(experiencePoints);
        setArmorClass(armor);
        setMaxHP(hp);
        setProficiency(proficiency);
        strength = str;
        dexterity = dex;
        constitution = con;
        intelligence = intel;
        wisdom = wis;
        charisma = charis;

       // TODO: Create a Has-A relationship with character and inventory
        Inventory characterInventory = new Inventory();

    }
}
