package com.alpercaktug;

public class SpeedConverter {

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

    public static void printMegaBytesAndKiloBytes(int kiloBytes){

        if (kiloBytes < 0){
            System.out.println("Invalid value");
        }
        else {
            int megaBytes = kiloBytes / 1024;
            int remainingKilobytes = kiloBytes % 1024;

            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainingKilobytes + " KB");
        }


    }
}
