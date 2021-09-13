package com.iav;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int myIntValue = 10;
        int anotherIntValue = myIntValue;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        anotherIntValue++;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        int[] myIntArray = new int[5];
        int[] anotherIntArray = myIntArray;

        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherIntArray = " + Arrays.toString(anotherIntArray));

        anotherIntArray[3] = 2;

        System.out.println("after change1 myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("after change1 anotherIntArray = " + Arrays.toString(anotherIntArray));

        anotherIntArray = new int[] {4, 5, 6, 7, 8};
        modifyArray(myIntArray);

        System.out.println("after change2 myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("after change2 anotherIntArray = " + Arrays.toString(anotherIntArray));

    }

    private static void modifyArray(int[] array) {
        array[0] = 2;
        array = new int[] {1, 2, 3, 4, 5};
    }
}
