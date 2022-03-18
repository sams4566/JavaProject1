package com.sparta.ss.week2.generics;

public class Box<T extends Number> {
    private T item;

    public T getItem() {
        return item;
    }
    public void setItem(T item) {
        this.item = item;
    }

    public static void main(String[] args) {
        Box<Integer> numberBox = new Box<>();
        numberBox.setItem(7);
        // E - Element (used extensively by the Java Collections Framework)
        // K - Key
        // N - Number
        // T - Type
        // V - Value
        // S,U,V etc. - 2nd, 3rd, 4th types
    }
}
