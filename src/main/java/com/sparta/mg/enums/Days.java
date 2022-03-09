package com.sparta.mg.enums;

public enum Days {
    MONDAY("Today is Monday"),
    TUESDAY("Today is Tuesday"),
    WEDNESDAY("Today is Wednesday"),
    THURSDAY("Today is Thursday"),
    FRIDAY("Today is Friday"),
    SATURDAY("Today is Saturday"),
    SUNDAY("Today is Sunday");

    private String name;

    Days(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        //Dog dog = new Dog("SFDFS")
        Days myDayObject = Days.WEDNESDAY;
        Days myDayObject2 = Days.THURSDAY;


        System.out.println(myDayObject.compareTo(myDayObject2));
        for (Days day: Days.values()) {
            System.out.println(day);
        }
        System.out.println(Days.valueOf("MONDAY"));
    }
}
