package com.sparta.ss.oop;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Cat felix = new Cat("Felix", "Mane Coon", 7);
        Dog peter = new Dog("Peter", "Poodle", 3);
        System.out.println("Hello, my name is " + felix.getName());
        felix.setName("Bob");
        felix.setAge(-7);
        System.out.println(felix);
        felix.speak();
        peter.speak("Henry"); // Method overloading
        peter.speak();
        System.out.println(peter.getName());
        System.out.println(Integer.MAX_VALUE); // static
        // Utility classes - classes with only static methods
        System.out.println(getAnimal("Dog").getName());
        getAnimal("Dog").speak();
//        getAnimal("Dog").speak("Henry"); // Method doesn't work due to Liskov substitution
        getAnimal("Cat").speak();
    }


    private static Animal getAnimal(String name) {
        if (name.equals("Dog")) {
            return new Dog("Peter", "poodle", 3);
        } else if (name.equals("Cat")) {
            return new Cat("Felix", "Mane Coon", 7);
        } else {
            return null;
        }
    }
}
