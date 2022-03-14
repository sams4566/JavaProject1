package com.sparta.ss.oop;

import com.sparta.ss.week1.oop.Dog;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.sparta.ss.week1.oop.App.getAnimal;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DogTests {
    @Test
    @DisplayName("Check Interface works")
    void checkInterfaceWorks() {
        Dog dog1 = new Dog("Peter", "Poodle", 3);
        assertEquals("I am jumping", dog1.doSomething("jumping"));
    }

    @Test
    @DisplayName("Check getAmimal method")
    void checkGetAmimalMethod() {
        assertEquals("Peter", getAnimal("Dog").getName());
    }
}
