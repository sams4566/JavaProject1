package com.sparta.ss.week2.design_patterns.decorator.sides;

import com.sparta.ss.week2.design_patterns.decorator.pizza.Pizza;

public abstract class Sides extends Pizza {
    protected Pizza pizza;

    public Sides(Pizza pizza) {
        this.pizza = pizza;
    }

    public abstract String getDescription();
}
