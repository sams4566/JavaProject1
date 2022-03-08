package com.sparta.mg.Solid;

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
        //Dependency Injection
//        Computer computer = new Computer();
    }
}
