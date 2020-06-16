package com.Dragoon;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Utility {

    // Utility for reading input from the CMD
    String input;
    ArrayList<String> inputStorage = new ArrayList<>();



    void readInput()
    {
        int numberOfInputs = 0;
        int maxParams = 14;
        Scanner scan = new Scanner(System.in);
        try {
            while (scan.hasNextLine() && numberOfInputs != maxParams) {
                input = scan.nextLine();
                inputStorage.add(input);
                numberOfInputs++;
            }
        } finally {
            scan.close();
        }

        // This is for testing this method
        System.out.println(input + " was just entered.");
    }

    // TODO: Finish this
//    void assignInputToParams()
//    {
//        int totalParams = 14;
//
//        for (int i = 0; i < inputStorage.size(); i++)
//        {
//            for (int j = 0; j < totalParams; j++)
//            {
//
//            }
//        }
//    }
}
