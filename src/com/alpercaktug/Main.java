package com.alpercaktug;

import com.alpercaktug.datastructures.GroceryList;
import com.alpercaktug.oop.encapsulation.EnhancedPlayer;
import com.alpercaktug.oop.encapsulation.Player;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        GroceryList groceryList = new GroceryList();

        groceryList.addItem("ekmek");
        groceryList.addItem("su");

        groceryList.printGroceryList();
    }

}
