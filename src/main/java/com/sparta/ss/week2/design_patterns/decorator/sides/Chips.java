package com.sparta.ss.week2.design_patterns.decorator.sides;

import com.sparta.ss.week2.design_patterns.decorator.pizza.Pizza;

public class Chips extends Sides {

    public Chips(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " and chips";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 20;
    }

}
