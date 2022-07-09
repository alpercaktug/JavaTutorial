package com.alpercaktug.datastructures;

import java.util.ArrayList;

/* methods
addItem
printGroceryList
modifyGroceryList
removeGroceryItem
findItem
 */

public class GroceryList {

    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addItem(String item){
        groceryList.add(item);
    }

    public void printGroceryList(){
        System.out.println("You have " + groceryList.size() + " item");
        /*
        for (String item : groceryList) {
            System.out.println(item);
        }
         */
        for (int i = 0; i<groceryList.size(); i++){
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }

    public void modifyGroceryList(int position, String newItem){
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position+1) + " has been modified");
    }

    public void removeGroceryItem(int index){
        String theItem = groceryList.get(index);
        groceryList.remove(index);
    }

    public String findItem(String searchItem){
        int position = groceryList.indexOf(searchItem);
        if (position >= 0) {
            return groceryList.get(position);
        }
        return null;

    }
}
