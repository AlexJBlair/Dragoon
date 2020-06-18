package com.Dragoon;

import java.util.Hashtable;
import java.util.Scanner;

public class Character {
    // Characteristics of all characters

    Hashtable<String, String> string_attributes = new Hashtable<String, String>();
    Hashtable<String, Integer> int_attributes = new Hashtable<String, Integer>();

    String[] string_attribute_keys = {
            "name",
            "race",
            "characterClass"
    };
    String[] int_attribute_keys = {
            "level",
            "experiencePoints",
            "expThreshold",
            "armorClass",
            "maxHP",
            "proficiency"
    };


    protected MajorStats majorStats;
    protected MinorStats minorStats;

    // Get stats
    public MajorStats getMajorStats(){return majorStats;}
    public MinorStats getMinorStats(){return minorStats;}

    // Set stats
    public void setMinorStats(MinorStats minorStats){this.minorStats = minorStats;}
    public void setMajorStats(MajorStats majorStats){this.majorStats = majorStats;}

    // Get characteristics
    public String getName() {return string_attributes.get("name");}
    public String getRace(){return string_attributes.get("race");}
    public String getCharacterClass(){return string_attributes.get("characterClass");}
    public int getLevel(){return int_attributes.get("level");}
    public int getExperiencePoints(){return int_attributes.get("experiencePoints");}
    public int getArmorClass(){return int_attributes.get("armorClass");}
    public int getMaxHP(){return int_attributes.get("maxHP");}
    public int getProficiency(){return int_attributes.get("proficiency");}
    public int getExpThreshold(){return int_attributes.get("expThreshold");}

    // Set characteristics
    public void setName(String name){string_attributes.put("name", name);}
    public void setRace(String Race){string_attributes.put("race", Race);}
    public void setCharacterClass(String charClass){string_attributes.put("characterClass", charClass);}
    public void setLevel(int lvl){int_attributes.put("level", lvl);}
    public void setExperiencePoints(int exp){int_attributes.put("experiencePoints", exp);}
    public void setArmorClass(int armor){int_attributes.put("armorClass", armor);}
    public void setMaxHP(int hp){int_attributes.put("maxHP", hp);}
    public void setProficiency(int prof){int_attributes.put("proficiency", prof);}
    public void setExpThreshold(int xpThreshold){int_attributes.put("expThreshold", xpThreshold);}

    // Call this whenever experience is high enough to level up
    // Da Ding!
    public void levelUp(int newHP, int newEXP)
    {
        if( getExperiencePoints() >= getExpThreshold()) {
            setMaxHP(newHP);
            setExperiencePoints(newEXP);
            setLevel(getLevel()+1);
        }
        else
            System.out.print("You cannot level up yet.");
    }

    // Call this to display all the character details. Also add to this if new details are added
    // Refactor this to take advantage of hashmap, also create a list details for MajorStats and
    // for MinorStats that can be called here
    public void listCharacterDetails()
    {
        System.out.print("=========================================================" + "\n");
        System.out.print(
                            "Name:" + getName() + "\n" +
                            "Race:" + getRace() + "\n" +
                            "Class:" + getCharacterClass() + "\n" +
                            "Level:" + getLevel() + "\n" +
                            "Current XP:" + getExperiencePoints() + "\n" +
                            "Armor:" + getArmorClass() + "\n" +
                            "MaxHP:" + getMaxHP() + "\n" +
                            "Proficiency:" + getProficiency() + "\n" +
                            "Strength:" + majorStats.getStrength() + "\n" +
                            "Dexterity:" + majorStats.getDexterity() + "\n" +
                            "Constitution:" + majorStats.getConstitution() + "\n" +
                            "Intelligence:" + majorStats.getIntelligence() + "\n" +
                            "Wisdom:" + majorStats.getWisdom() + "\n" +
                            "Charisma:" + majorStats.getCharisma() + "\n"
        );
        System.out.print("=========================================================" + "\n");
    }

    // No Arg Constructor
    //public Character(){}

    public Character(Boolean create_using_prompt){
        // TODO: Create a Has-A relationship with character and inventory
        Inventory characterInventory = new Inventory();

        if (!create_using_prompt){return;}

        Scanner scan = new Scanner(System.in);
        // Get String Characteristics
        for(int key_i=0; key_i<string_attribute_keys.length; key_i++){
            System.out.print(
                    "\n" +
                    "String - " +
                    string_attribute_keys[key_i] + ": "
            );
            String input = scan.nextLine();
            string_attributes.put(string_attribute_keys[key_i], input);
        }
        // Get integer Characteristics
        for(int key_i=0; key_i<int_attribute_keys.length; key_i++){
            System.out.print(
                    "\n" +
                    "Integer - " +
                    int_attribute_keys[key_i] + ": "
            );
            String input = scan.nextLine();
            int_attributes.put(int_attribute_keys[key_i], Integer.parseInt(input));
        }
    }
}
