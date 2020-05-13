package com.Dragoon;

import java.util.ArrayList;
import java.util.Scanner;

public class Utility {

    // Utility for reading input from the CMD
    String input;
    ArrayList<String> inputStorage = new ArrayList<>();

    void readInput()
    {
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
}
