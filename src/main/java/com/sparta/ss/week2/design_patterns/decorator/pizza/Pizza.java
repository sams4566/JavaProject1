package com.sparta.ss.week2.design_patterns.decorator.pizza;

public abstract class Pizza {
    private String description;
    private double cost;

    public String getDescription() {
        return description;
    }

    public double getCost() {
        return cost;
    }
}
