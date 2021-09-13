package com.iav;

public class Main {

    private static final String INVALID_VALUE_MASSAGE = "Invalid Value";

    public static void main(String[] args) {

        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945));
    }

    private static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return INVALID_VALUE_MASSAGE;
        }

        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;

        return formatToTimeFormat(hours) + "h "
                + formatToTimeFormat(remainingMinutes) + "m "
                + formatToTimeFormat(seconds) + "s";
    }

    private static String getDurationString(int seconds) {
        if (seconds < 0) {
            return INVALID_VALUE_MASSAGE;
        }

        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;

        return (getDurationString(minutes, remainingSeconds));
    }

    private static String formatToTimeFormat(int value) {
        return (value <= 9 ? "0" : "") + value;
    }
}
