package com.iav;

public class Main {

    public static void main(String[] args) {
	    String numberAsString = "2018.125";
        System.out.println("Number as String = " + numberAsString);

//        int intNumber = Integer.parseInt(numberAsString);
//        System.out.println("Number as int = " + intNumber);

        double doubleNumber = Double.parseDouble(numberAsString);
        System.out.println("Number as double = " + doubleNumber);


        numberAsString += 1;
//        intNumber += 1;

        System.out.println("Number as String = " + numberAsString);
//        System.out.println("Number = " + intNumber);
    }
}
