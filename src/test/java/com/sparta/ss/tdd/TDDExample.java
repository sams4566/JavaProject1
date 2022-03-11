package com.sparta.ss.tdd;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TDDExample {
    // Define what will be built
    // Write tests first
    // Red, Green, Refactor
    // FizzBuzz Game

    // 1. Run Test - RED
    // 2. Make test pass -  Only write enough code to pass the test - GREEN
    // 3. Refactor - All tests should still pass

    @Test
    @DisplayName("Five should return Fizz")
    void fiveShouldReturnFizz() {
        assertEquals("Fizz", FizzBuzzGenerator.getFizzBuzzValue(5));
    }

    @Test
    @DisplayName("Seven should return Buzz")
    void sevenShouldReturnBuzz() {
        assertEquals("Buzz", FizzBuzzGenerator.getFizzBuzzValue(7));
    }

    @Test
    @DisplayName("Two should return 2")
    void twoShouldReturn2() {
        assertEquals("2", FizzBuzzGenerator.getFizzBuzzValue(2));
    }

    @Test
    @DisplayName("Thirty Five should return Fizz Buzz")
    void thirtyFiveShouldReturnFizzBuzz() {
        assertEquals("Fizz Buzz", FizzBuzzGenerator.getFizzBuzzValue(35));
    }

    @Test
    @DisplayName("Confirm True")
    void confirmTrue() {
        assertEquals(true, 1 == 1);
    }

    @Test
    @DisplayName("Check string")
    void checkString() {
        assertEquals(String.class, "Felix".getClass());
    }
}
