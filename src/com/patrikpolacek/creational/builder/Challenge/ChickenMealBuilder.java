package com.patrikpolacek.creational.builder.Challenge;

import com.patrikpolacek.creational.builder.Challenge.burger.ChickenBurger;
import com.patrikpolacek.creational.builder.Challenge.drink.CocaCola;

public class ChickenMealBuilder implements BuilderInterface {
    Meal meal = new Meal();

    @Override
    public void buildBurger() {
        meal.addItem(new ChickenBurger());
    }

    @Override
    public void buildDrink() {
        meal.addItem(new CocaCola());
    }

    @Override
    public Meal getMeal() {
        return meal;
    }
}
