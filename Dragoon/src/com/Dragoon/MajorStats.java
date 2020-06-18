package com.Dragoon;

import java.util.Hashtable;
import java.util.Scanner;

public class MajorStats {
    // Stores Major stats in a hashtable

    Hashtable<String, Integer> stats = new Hashtable<String, Integer>();

    String[] keys = {
      "strength",
      "dexterity",
      "constitution",
      "intelligence",
      "wisdom",
      "charisma"
    };

    // Setters
    public void  setStrength(int val){stats.put("strength", val);}
    public void  setDexterity(int val){stats.put("dexterity", val);}
    public void  setConstitution(int val){stats.put("constitution", val);}
    public void  setIntelligence(int val){stats.put("intelligence", val);}
    public void  setWisdom(int val){stats.put("wisdom", val);}
    public void  setCharisma(int val){stats.put("charisma", val);}

    // Getters
    public int getStrength(){return stats.get("strength");}
    public int getDexterity(){return stats.get("dexterity");}
    public int getConstitution(){return stats.get("constitution");}
    public int getIntelligence(){return stats.get("intelligence");}
    public int getWisdom(){return stats.get("wisdom");}
    public int getCharisma(){return stats.get("charisma");}

    public MajorStats(Boolean create_using_prompt){
        if(!create_using_prompt){
            return;
        }
        Scanner scan = new Scanner(System.in);
        for(int key_i=0; key_i<keys.length; key_i++){
            System.out.print(
                "\n" +
                "Integer - " +
                keys[key_i] + ": "
            );
            String input = scan.nextLine();
            stats.put(keys[key_i], Integer.parseInt(input));
        }
    }
}
