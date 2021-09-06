package com.iav;

public class Main {

    public static void main(String[] args) {

        double number1 = 20d;
        double number2 = 80d;

        double result = (number1 + number2) * 100d;

        double remainder = result % 40d;

        boolean isZero = remainder == 0;

        System.out.println("The remainder is zero: " + isZero);

        if (!isZero) {
            System.out.println("Got some remainder");
        }

    }
}
