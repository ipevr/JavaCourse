package com.iav;

public class Main {

    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("My minimum float value: " + myMinFloatValue);
        System.out.println("My maximum float value: " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("My minimum double value: " + myMinDoubleValue);
        System.out.println("My maximum double value: " + myMaxDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d;
        System.out.println("My int value: " + myIntValue);
        System.out.println("My float value: " + myFloatValue);
        System.out.println("My double value: " + myDoubleValue);
    }
}
