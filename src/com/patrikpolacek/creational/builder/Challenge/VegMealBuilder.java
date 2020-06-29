package com.patrikpolacek.creational.builder.Challenge;

import com.patrikpolacek.creational.builder.Challenge.burger.VegBurger;
import com.patrikpolacek.creational.builder.Challenge.drink.PepsiCola;

public class VegMealBuilder implements BuilderInterface {

    private Meal meal = new Meal();

    @Override
    public void buildBurger() {
        meal.addItem(new VegBurger());
    }

    @Override
    public void buildDrink() {
        meal.addItem(new PepsiCola());

    }

    @Override
    public Meal getMeal() {
        return meal;
    }
}
