package com.patrikpolacek.Builder.Challenge;

import com.patrikpolacek.Builder.Challenge.burger.VegBurger;
import com.patrikpolacek.Builder.Challenge.drink.PepsiCola;

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
