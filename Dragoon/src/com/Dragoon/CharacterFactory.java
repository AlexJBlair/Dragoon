package com.Dragoon;

public class CharacterFactory {
    protected int numOfCharacters = 0;

    public void promptForCharacterCreation()
    {
        System.out.print("Please enter the following information for the character that you would like to create.\n"
                +"Name, Race, Class, Level, Current Exp, Armor Class, HP, Proficiency Number, Strength, Dexterity, Constitution,"
                + "Intelligence, Wisdom, Charisma\n");
    }

    void makeCharacter(int num)
    {
        numOfCharacters = num;

        for (int i = 0; i < numOfCharacters; i++)
        {
            // Either pass in input or scan for input and sub for character parameters
            // TODO: Figure out how to pass in constructor params or scan for input.
           // Character character = new Character();
        }
    }
}
