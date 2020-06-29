package com.patrikpolacek.creational.builder.Challenge;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

//product class
public class Meal {
    private List<Item> items;

    public Meal() {
        this.items = new ArrayList<>();
    }
    public void addItem(Item item){
        items.add(item);
    }

    public void showItems(){
        System.out.println("\n All items are: ");
        for (Item i : items){
            System.out.println(i);
        }
    }
    public void cost(){
        BigDecimal totalCost = new BigDecimal(0);
        for (Item j: items){
            totalCost.add(j.getPrice());
        }
        System.out.println(totalCost);
    }
}
