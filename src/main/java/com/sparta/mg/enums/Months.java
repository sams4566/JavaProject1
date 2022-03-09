package com.sparta.mg.enums;

public enum Months {
    JANUARY("This month is January"),
    FEBRUARY("This month is February"),
    MARCH("This month is March"),
    APRIL("This month is April"),
    MAY("This month is May"),
    JUNE("This month is June"),
    JULY("This month is July"),
    AUGUST("This month is August"),
    SEPTEMBER("This month is September"),
    OCTOBER("This month is October"),
    NOVEMBER("This month is November"),
    DECEMBER("This month is December");

    private String name;

    Months(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Months myMonthsObject = Months.MARCH;
        Months myMonthsObject2 = Months.APRIL;

        System.out.println(myMonthsObject.compareTo(myMonthsObject2));
        for (Months month: Months.values()) {
            System.out.println(month);
        }
        System.out.println(Months.valueOf("JANUARY"));
    }
}
