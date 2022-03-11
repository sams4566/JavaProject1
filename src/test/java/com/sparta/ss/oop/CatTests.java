package com.sparta.ss.oop;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CatTests {
    @Test
    @DisplayName("Check Age")
    void checkAge() {
        Cat cat1 = new Cat("Harry", "Persian", 5);
        assertEquals(5, cat1.getAge());
    }

    @Test
    @DisplayName("Check Name")
    void checkName() {
        Cat cat1 = new Cat("Harry", "Persian", 5);
        assertEquals("Harry", cat1.getName());
    }
}


