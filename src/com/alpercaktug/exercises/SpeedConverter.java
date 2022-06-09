package com.alpercaktug.exercises;

public class SpeedConverter {

    public static void main(String[] args) {
        printConversion(100);
    }

    public static long toMilesPerHour(double kilometersPerHour){

        if (kilometersPerHour < 0) {
            System.out.println("Invalid value");
            return -1;
        }

        return Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion(double kilometersPerHour){

        if (kilometersPerHour < 0){
            System.out.println("Invalid Value");
        }
        else{
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + "km/h" + " = " + milesPerHour + "mi/h");

        }
    }

}
