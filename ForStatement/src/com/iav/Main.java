package com.iav;

public class Main {

    public static void main(String[] args) {

        for (int i = 8; i >= 2; i--) {
            System.out.println("10,000 at " + i + "% interest = " +
                    String.format("%.2f", calculateInterest(10000.0, i)));
        }

        int counter = 0;

        for (int i = 0; i < 1000; i++) {
            if (isPrime(i)) {
                counter++;
                System.out.println("Found prime number: " + i + " Total prime numbers found: " + counter);
                if (counter >= 20) {
                    break;
                }
            }
        }
    }

    private static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= n / 2 ; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    private static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

}
