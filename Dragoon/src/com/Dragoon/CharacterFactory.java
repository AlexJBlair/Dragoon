package com.Dragoon;

public class CharacterFactory {
    protected int numOfCharacters = 0;

    public void promptForCharacterCreation()
    {
        Character character = new Character(true);
        MajorStats majorStats = new MajorStats(true);
        character.setMajorStats(majorStats);
        character.listCharacterDetails();
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
