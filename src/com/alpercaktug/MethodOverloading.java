package com.alpercaktug;

public class MethodOverloading {

    /*
    Method overloading is the feature that allows us to have more than one method with same name.

    Benefits:
        -It improves to code readabilty and and re-usability.
        -It's easier to remember one method name instead of remembering multiple names.
        -Overloaded methods give programmers the flexiblity to call a smiliar method with different types of data.
        -example: println
     */

    public static int calculateScore(String playerName, int score){
        System.out.println( playerName + "'s score = "  + score);
        return score * 100;

    }

    public static int calculateScore(int score){
        System.out.println("Score = "  + score);
        return score * 100;

    }

    public static void calculateScore(){
        System.out.println("no name, no score");

    }

}
