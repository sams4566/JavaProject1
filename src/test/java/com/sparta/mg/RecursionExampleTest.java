package com.sparta.mg;

import com.sparta.mg.recursion.RecursionExample;
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
