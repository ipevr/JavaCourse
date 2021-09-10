package com.iav;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        boolean isFirstInput = true;

        while (true) {
            System.out.println("Enter a number: ");

            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();

                if (number < min) {
                    min = number;
                }

                if (number > max) {
                    max = number;
                }

                scanner.nextLine();
            } else {
                break;
            }

        }

        if (min == Integer.MAX_VALUE) {
            System.out.println("You didn't enter any number!");
        } else {
            System.out.println("Your minimum number was " + min + " and your maximum number was " + max);
        }

        scanner.close();
    }
}
