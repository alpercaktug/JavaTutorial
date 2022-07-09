package com.alpercaktug.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperations {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] array = getArray(5);
        printArray(array);
        int[] reversedArray = reverseArray(array);
        printArray(reversedArray);
        //int x = minElement(array);
        //System.out.println("Min Element = " + x);

    }

    public static int[] sortArray(int[] array){

        int[] newArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;

        while (flag){
            flag = false;
            for (int i=0; i<newArray.length-1; i++){
                if (newArray[i] < newArray[i+1]){
                    temp = newArray[i];
                    newArray[i] = newArray[i+1];
                    newArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return newArray;
    }

    public static int minElement(int[] array){

        int temp = array[0];

        for (int i=0; i<array.length; i++){
            if (array[i] < temp){
                temp = array[i];
            }
        }

        return temp;
    }

    public static int[] reverseArray(int[] array){

        int maxIndex = array.length -1;
        int halfLength = array.length / 2;

        for (int i=0; i<halfLength; i++){
            int temp = array[i];
            array[i] = array[maxIndex-i];
            array[maxIndex - i] = temp;
        }

        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i< array.length; i++){
            System.out.println(i + ". value = " + array[i]);
        }
    }

    public static int[] getArray(int lenght){
        System.out.println("Enter " + lenght + " integers\r");
        int[] values = new int[lenght];

        for (int i=0; i<values.length; i++){
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static double average(int[] array){
        int sum = 0;

        for (int i=0; i<array.length; i++){
            sum += array[i];
        }

        return (double) sum / array.length;
    }

}
