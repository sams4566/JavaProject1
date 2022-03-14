package com.sparta.ss.week1.basics;

public class Loops {
    private static int getDayNumberIf(String dayOfWeek) {
        // Stacked if statement
        if ("Monday".equals(dayOfWeek)) {
            return 1;
        } else if ("Tuesday".equals(dayOfWeek)) {
            return 2;
        } else if ("Wednesday".equals(dayOfWeek)) {
            return 3;
        } else if ("Thursday".equals(dayOfWeek)) {
            return 4;
        } else if ("Friday".equals(dayOfWeek)) {
            return 5;
        } else if ("Saturday".equals(dayOfWeek)) {
            return 6;
        } else if ("Sunday".equals(dayOfWeek)) {
            return 7;
        }
        return 0;
    }

    private static int getDayNumberSwitch(String dayOfWeek) {
        // Switch statement
        switch (dayOfWeek) {
            case "Monday":
                return 1;
            case "Tuesday":
                return 2;
            case "Wednesday":
                return 3;
            case "Thursday":
                return 4;
            case "Friday":
                return 5;
            case "Saturday":
                return 6;
            case "Sunday":
                return 7;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(getDayNumberIf("Wednesday"));
    }
}
