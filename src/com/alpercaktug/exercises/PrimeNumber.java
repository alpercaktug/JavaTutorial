package com.alpercaktug.exercises;

public class PrimeNumber {

    public static void main(String[] args){
        PrimeNumber.findPrimeNumberInRange(100,1000);
    }

    public static boolean isPrime(int n) {

        if (n == 1)
            return false;

        for (int i = 2; i <= n/2; i++) {
            System.out.println("Looping " + i);
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void findPrimeNumberInRange(int start, int end){

        int counter = 0;

        for (int i = start; i <= end; i++){
            if (isPrime(i)){
                counter++;
                System.out.println("Found a prime number: " + i);
                if (counter == 3) break;
            }

        }

    }
}
