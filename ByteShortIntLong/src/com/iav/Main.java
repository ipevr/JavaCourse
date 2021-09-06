package com.iav;

public class Main {

    public static void main(String[] args) {

        int myValue = 10_000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("My Value: " + myValue);
        System.out.println("Min int Value: " + myMinIntValue);
        System.out.println("Max int Value: " + myMaxIntValue);
        System.out.println("Max int Value + 1: " + (myMaxIntValue + 1));

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;

        System.out.println("Min byte Value: " + myMinByteValue);
        System.out.println("Max byte Value: " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;

        System.out.println("Min short Value: " + myMinShortValue);
        System.out.println("Max short Value: " + myMaxShortValue);

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        long myLongValue = 100L;

        System.out.println("Min long Value: " + myMinLongValue);
        System.out.println("Max long Value: " + myMaxLongValue);
        System.out.println("My long Value: " + myLongValue);

        int myTotal = (myMinIntValue / 2);

        byte myNewByteValue = (byte) (myMinByteValue / 2);
        System.out.println("My new byte value: " + myNewByteValue);

        byte myByte = 50;
        short myShort = 2000;
        int myInt = 24000;
        long myLong = 50000L + 10L * (myByte + myShort + myInt);
        System.out.println("My long result: " + myLong);
    }
}
