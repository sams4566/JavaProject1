package com.sparta.ss.week2.design_patterns.factory;

import java.util.Locale;

public class AnimalFactory {
    public static Speaker getAnimal (String animal) {
        switch (animal.toLowerCase()) {
            case "dog":
                return new Dog();
            case "cat":
                return new Cat();
            case "goldfish":
                return new Goldfish();
            default:
                return null;
        }
    }
}
