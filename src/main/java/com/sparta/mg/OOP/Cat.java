package com.sparta.mg.OOP;

public class Cat extends Animal{

    public Cat(String name, String breed, int age) {
        super(name, breed, age);
    }

    // Method overiding
    @Override
    public void speak() {
        System.out.println("Purrr");
    }
}
