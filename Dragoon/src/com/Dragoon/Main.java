package com.Dragoon;

///////////////////////////////////
// This section is a checklist of things that need to be developed
// TODO: Finish GUI
// TODO: Create Has-A relationship with Character and Inventory
// TODO: Figure out how to pass params to factory method
// TODO: Figure out how to create general scanning method for input on the console


public class Main {

    public static void main(String[] args) {

        CharacterSheet characterSheet = new CharacterSheet();

        characterSheet.createStatsTable("Statistics");
        characterSheet.addStatToTable("Strength", 55);
        characterSheet.createInfoTable("Info");
        characterSheet.addInfoToTable("Sword", "Stabby Stabby");


        CharacterFactory characterFactory = new CharacterFactory();
        characterFactory.promptForCharacterCreation();

//         Call the class constructor for character to test internal functions....
//         Otherwise use the prompt function above to create a new character
//         Character Alex = new Character("Magni", "Dwarf", "Paladin", 6,0,
//                15,57,3,5, 5,5,5,5,5);
//        Alex.listCharacterDetails();

        // Inventory calls
        Inventory bagOfHolding = new Inventory();
        bagOfHolding.addToInventory("Sword of smite");
        bagOfHolding.addToInventory("Shield of Zeus");
        bagOfHolding.addToInventory("Plate of the Gods");
        bagOfHolding.sortInventoryAlphabetically();
        bagOfHolding.listInventory();
        bagOfHolding.removeFromInventory("Sword of smite");
        bagOfHolding.listInventory();

    }
}
