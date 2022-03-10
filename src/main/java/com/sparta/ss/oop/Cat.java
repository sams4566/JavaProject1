package com.sparta.ss.oop;

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
