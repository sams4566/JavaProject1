package com.sparta.ss.week1.enums;

import java.util.Arrays;

public enum Months {
    JANUARY("This month is January", 1),
    FEBRUARY("This month is February", 2),
    MARCH("This month is March", 3),
    APRIL("This month is April", 4),
    MAY("This month is May", 5),
    JUNE("This month is June", 6),
    JULY("This month is July", 7),
    AUGUST("This month is August", 8),
    SEPTEMBER("This month is September",9),
    OCTOBER("This month is October", 10),
    NOVEMBER("This month is November", 11),
    DECEMBER("This month is December", 12);

    private int number;
    private String name;

    Months(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public static void main(String[] args) {
        Months myMonthsObject = Months.MARCH;
        Months myMonthsObject2 = Months.APRIL;

        System.out.println(myMonthsObject.compareTo(myMonthsObject2));
        for (Months month: Months.values()) {
            System.out.println(month);
        }
        System.out.println(Months.valueOf("JANUARY"));

        System.out.println(myMonthsObject.getName());
        System.out.println(myMonthsObject.getNumber());
        System.out.println(myMonthsObject.equals(MARCH));
        System.out.println(myMonthsObject.name());
        System.out.println(Arrays.toString(Months.values()));
    }
}
