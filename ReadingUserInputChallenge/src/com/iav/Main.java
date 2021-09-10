package com.iav;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 1;
        int sum = 0;

        while (counter <= 10) {
            System.out.println("Enter number #" + counter + ":");
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                counter++;
                sum += number;
            } else {
                System.out.println("Invalid Input");
            }

            scanner.nextLine();
        }

        System.out.println("The sum of your inputs is: " + sum);

        scanner.close();
    }

}
