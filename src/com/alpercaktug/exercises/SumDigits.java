package com.alpercaktug.exercises;

public class SumDigits {

    public static void main(String[] args) {

        //sumDigits(11121);
        isPalindrome(-111);
        reverseNumber(-123);
    }

    public static int sumDigits(int number){

        if (number < 10){
            System.out.println("Ivalid Value");
            return -1;
        }
        int sum = 0;

        System.out.println("Number = " + number);

        while (number > 0){
            sum += (number % 10);
            number = number / 10;
        }
        System.out.println("Digits Sum = " + sum);

        return sum;
    }

    private static int reverseNumber(int number) {

        number = Math.abs(number);

        int reverse = 0;

        while (number > 0){
            int lastDigit = number % 10;
            reverse = reverse * 10;
            reverse += lastDigit;
            number = number / 10;
        }

        //System.out.println(reverse);
        return reverse;
    }


    public static boolean isPalindrome(int number){

        number = Math.abs(number);

        if (number == reverseNumber(number)) {
            System.out.println(number + " is a Palindrome Number.");
            return true;
        }
        else {
            System.out.println(number + " is not a Palindrome Number.");
            return true;
        }
    }
}
