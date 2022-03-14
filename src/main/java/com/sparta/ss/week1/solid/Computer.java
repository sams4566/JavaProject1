package com.sparta.ss.week1.solid;

//coupling and cohesion
//Dependency Inversion - depend on abstract classes
public class Computer {
    private Keyboard keyboard;
    private Monitor monitor;

    public Computer(Keyboard keyboard, Monitor monitor) {
        this.keyboard = keyboard;
        this.monitor = monitor;
    }

    public static void main(String[] args) {
        //Dependency Injection - at the time the classes are created the objects are injected.
//        Computer computer = new Computer();
    }
}
