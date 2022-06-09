package com.alpercaktug.exercises;

public class FeetAndInches {

    // Method overloading example

    public static void main(String[] args) {
        calcFeetAndInchesToCentimeters(100);
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){

        if (feet < 0 || (inches < 0 || inches > 12)){
            System.out.println("Invalid value");
            return -1;
        }

        double centimeter = (feet * 12) * 2.54;
        centimeter += inches * 2.54;

        System.out.println(feet + " feet and " + inches + " inches = " + centimeter);

        return centimeter;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){

        if (inches < 0){
            System.out.println("Invalid value");
            return -1;
        }

        double feet = (int)inches / 12;
        double remainingInches = feet % 12;

        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches);
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }
}
