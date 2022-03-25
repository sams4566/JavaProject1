package com.sparta.ss.week3.functional_programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //printBeatles();
        //Check if a string contains every letter of the alphabet
        System.out.println('a' < 'b');
        String sentence = "The quick brown fox jumps over the lazy dog";
        boolean containsAllLetters =
                sentence.toLowerCase().chars()
                        .filter(letter -> letter >= 'a' && letter <= 'z')
                        .distinct()
                        .count() == 26;
        System.out.println(containsAllLetters);
        //when doing something complicated
    }

    private static void printBeatles() {
        ArrayList<String> beatles = new ArrayList<>(Arrays.asList("John", "Paul", "George", "Ringo"));
        beatles.stream() //creation
                .filter(name -> name.contains("o")) //intermediate
                .map(name -> name.toUpperCase()) //intermediate
//                .forEach(name -> System.out.println(name)); //terminal
//                .collect() // turns it back into a list or set
                .forEach(System.out::println);
        System.out.println(beatles);
    }
}
