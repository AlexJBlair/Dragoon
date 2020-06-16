package com.Dragoon;

public class CharacterFactory {
    protected int numOfCharacters = 0;

    void instanciateCharacter(int num)
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
