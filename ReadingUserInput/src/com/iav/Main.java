package com.iav;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth: ");

        boolean hasNextInt = scanner.hasNextInt();

        if (hasNextInt) {
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine(); // Handle pressing Enter key after typing in the int

            int age = Calendar.getInstance().get(Calendar.YEAR) - yearOfBirth;

            if (age >= 0 && age <= 100){
                System.out.println("Enter your name: ");
                String name = scanner.nextLine();

                System.out.println("Your name is " + name + " and you are " + age + " years old.");
            } else {
                System.out.println("Invalid year of birth!");
            }
        } else {
            System.out.println("Invalid to parse year of birth!");
        }

        scanner.close();

    }
}
