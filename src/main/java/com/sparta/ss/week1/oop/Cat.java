package com.sparta.ss.week1.oop;

public class Cat extends Animal{

    public Cat(String name, String breed, int age) {
        super(name, breed, age);
    }

    // Method overriding
    @Override
    public void speak() {
        System.out.println("Purrrr");
    }
}
