package com.patrikpolacek.structural.adapter.example.composition;

public class Client {

    public static void main(String[] args) {
        MallarDuck mallarDuck = new MallarDuck();
        WildTurkey wildTurkey = new WildTurkey();

        Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);

        System.out.println("\n******The turkey says***********");

        wildTurkey.fly();
        wildTurkey.gobble();

        System.out.println("\n******The duck says*************");
        mallarDuck.fly();
        mallarDuck.quack();

        System.out.println("\n*****The TurkeyAdapter says********");

        turkeyAdapter.fly();
        turkeyAdapter.quack();
    }
}
