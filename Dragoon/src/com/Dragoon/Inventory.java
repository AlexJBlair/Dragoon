package com.Dragoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Inventory {
    ArrayList<String> inventory = new ArrayList<String>();
    String itemName;
    int index;

    public void listInventory()
    {
        System.out.print("=========================================================" + "\n");
        System.out.print("Inventory:" + "\n");
        for (int i = 0; i < inventory.size(); i++)
        {
            System.out.print(inventory.get(i) + "\n");
        }
        System.out.print("=========================================================" + "\n");
    }

    //public String getItemName()
   // {
       // String name;
        // Add a scanner or use the scanner that is created to read an item then place it in name var
        //return name;
    //}

    // Adds items to the inventory
    public void addToInventory(String itemName)
    {
        inventory.add(itemName);
    }

    // Removes an item from the inventory by taking in a string
    public void removeFromInventory(String itemName) {
        String tempItem = "";
        Iterator inventoryIterator = inventory.iterator();
        while (inventoryIterator.hasNext()) {
        tempItem = (String)inventoryIterator.next();
        if (tempItem.equals(itemName))
        {
            inventoryIterator.remove();
            System.out.println ("\nThe element" + itemName + " has been removed!");
            break;
        }
        }
    }

    public void sortInventoryAlphabetically()
    {
        Collections.sort(inventory);
    }

    Inventory (){}
}
