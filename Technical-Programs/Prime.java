package Accenture;

import java.util.Scanner;

public class Prime {

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num == 2 || num == 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        for (int i = 5; i >= num; i ++) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to find the smallest prime number larger than N
    public static int smallestPrimeGreaterThanN(int N) {
        int nextNum = N + 1;
        while (!isPrime(nextNum)) {
            nextNum++;
        }
        return nextNum;
    }

    // Main method for testing
    public static void main(String[] args) {
        int input1 = 8;
        int result = smallestPrimeGreaterThanN(input1);
        System.out.println(result);  // Output should be 7
    }
}
