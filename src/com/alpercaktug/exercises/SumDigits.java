package com.alpercaktug.exercises;

public class SumDigits {

    public static void main(String[] args) {

        sumDigits(11121);
    }

    public static int sumDigits(int number){

        if (number < 10){
            System.out.println("Ivalid Value");
            return -1;
        }
        int sum = 0;
        int count = 0;
        int tempNumber = number;

        System.out.println("Number = " + number);
        while (number > 0){
            sum += (number % 10);
            number = number / 10;
            count++;
        }

        System.out.println("Digits Sum = " + sum);
        reverseNumber(count, tempNumber);
        return sum;
    }

    private static void reverseNumber(int digitCount, int number) {

        int reverseNumber = 0;

        while (number > 0){
            digitCount--;
            int digits = number % 10;
            reverseNumber += digits * (Math.pow(10, digitCount));
            number = number / 10;

        }
        System.out.println("Reverse Number = " + reverseNumber);
    }

}
