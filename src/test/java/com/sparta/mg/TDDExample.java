package com.sparta.mg;

import com.sparta.mg.tdd.FizzBuzzGenerator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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
        Assertions.assertEquals("Fizz", FizzBuzzGenerator.getFizzBuzzValue(5));
    }

    @Test
    @DisplayName("Seven should return Buzz")
    void sevenShouldReturnBuzz() {
        Assertions.assertEquals("Buzz", FizzBuzzGenerator.getFizzBuzzValue(7));
    }

    @Test
    @DisplayName("Two should return 2")
    void twoShouldReturn2() {
        Assertions.assertEquals("2", FizzBuzzGenerator.getFizzBuzzValue(2));
    }

    @Test
    @DisplayName("Thirty Five should return Fizz Buzz")
    void thirtyFiveShouldReturnFizzBuzz() {
        Assertions.assertEquals("Fizz Buzz", FizzBuzzGenerator.getFizzBuzzValue(35));
    }

}
