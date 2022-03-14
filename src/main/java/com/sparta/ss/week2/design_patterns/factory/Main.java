package com.sparta.ss.week2.design_patterns.factory;

public class Main {
    public static void main(String[] args) {
        Speaker myDog = AnimalFactory.getAnimal("dog");
        System.out.println(myDog.speak());
    }
}
