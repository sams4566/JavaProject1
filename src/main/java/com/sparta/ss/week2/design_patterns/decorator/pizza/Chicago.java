package com.sparta.ss.week2.design_patterns.decorator.pizza;

public class Chicago extends Pizza {
    @Override
    public String getDescription() {
        return "Chicago Pizza";
    }

    @Override
    public double getCost() {
        return 30;
    }
}
