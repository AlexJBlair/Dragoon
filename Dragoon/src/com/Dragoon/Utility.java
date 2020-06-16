package com.Dragoon;

import java.util.ArrayList;
import java.util.Scanner;

public class Utility {

    // Utility for reading input from the CMD
    String input;
    ArrayList<String> inputStorage = new ArrayList<>();

    void readInput()
    {
        System.out.print("Please enter the following information for the character that you would like to create.\n"
        +"Name, Race, Class, Level, Current Exp, Armor Class, HP, Proficiency Number, Strength, Dexterity, Constitution,"
        + "Intelligence, Wisdom, Charisma\n");
        Scanner scan = new Scanner(System.in);
        try {
            while (scan.hasNextLine()) {
                input = scan.nextLine();

                inputStorage.add(input);
            }
        } finally {
            scan.close();
        }

        // This is for testing this method
        System.out.println(input);
    }

    void assignInputToParams()
    {
        for (int i = 0; i < inputStorage.size(); i++)
        {
        }
    }
}
