package com.sparta.ss.week1.oop;

// Abstraction - hide implementation details and makes the hidden details accessible (removes code duplication)
// Encapsulation - Classes hides information e.g. 'String name' below has 'private' in front
// Polymorphism - "Poly" = many, "morpho" = forms - Overidding and overloading a method in a class
// Inheritance - Child classes from a parent/abstract parent

// WHY - 1. Remove code duplication | 2. Breaks program down

public abstract class Animal { // state behaviour
    private String name;
    private String breed;
    private int age;

    public Animal(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    // Method (access modifier, return type, name, parameters)
    // 4 Access Modifiers - public, private, protected, default
    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0) {
            System.out.println("Age should be a positive number!");
        } else {
            this.age = age;
        }
    }

    public void speak() {
        System.out.println("An Animal is speaking");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                '}';
    }
}
