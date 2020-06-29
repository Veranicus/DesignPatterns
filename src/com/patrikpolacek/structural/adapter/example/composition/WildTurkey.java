package com.patrikpolacek.structural.adapter.example.composition;

public class WildTurkey implements Turkey {
    //  Incompatibility of Turkey and Duck
    //    We want to adapt turkey to a duck
    //    adaptor - turkey, which we want to adopt to duck
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("Flying short distance");
    }
}
