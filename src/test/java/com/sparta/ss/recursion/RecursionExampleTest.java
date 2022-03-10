package com.sparta.ss.recursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RecursionExampleTest {
    private final RecursionExample recursionExample = new RecursionExample();

    @Test
    void checkForCorrectValue() {
        // Assertions
        Assertions.assertEquals(15, recursionExample.addRecursively(5));
    }
}
