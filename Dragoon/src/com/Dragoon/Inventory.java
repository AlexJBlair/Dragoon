package com.Dragoon;

import java.util.ArrayList;
import java.util.Collections;

public class Inventory {
    ArrayList<String> inventory = new ArrayList<String>();
    String itemName;
    int index;

    void listInventory()
    {
        System.out.print("=========================================================" + "\n");
        System.out.print("Inventory:" + "\n");
        for (int i = 0; i < inventory.size(); i++)
        {
            System.out.print(inventory.get(i) + "\n");
        }
        System.out.print("=========================================================" + "\n");
    }

    void addToInventory(String itemName)
    {
        inventory.add(itemName);
    }

    void removeFromInventory(int index)
    {
        inventory.remove(index);
    }

    void sortInventoryAlphabetically()
    {
        Collections.sort(inventory);
    }

    Inventory (){}
}
