package com.patrikpolacek.Factory.FactoryChallenge;

import com.patrikpolacek.Factory.FactoryChallenge.Creator.AnimalFactoryInterface;
import com.patrikpolacek.Factory.FactoryChallenge.Creator.ConcreteAnimalFactory;
import com.patrikpolacek.Factory.FactoryChallenge.Creator.ConcreteAnimalFactory2;
import com.patrikpolacek.Factory.FactoryChallenge.Product.Animal;

public class Client {

    public static void main(String[] args) throws Exception {
        ConcreteAnimalFactory concreteAnimalFactory = new ConcreteAnimalFactory();

        Animal cat = concreteAnimalFactory.getAnimalType("cat");
        cat.eat();
        Animal lion = concreteAnimalFactory.getAnimalType("Lion");
        lion.eat();
        Animal tiger = concreteAnimalFactory.getAnimalType("Tiger");
        tiger.eat();
//        alternative way with AnimalFactoryInterface
        AnimalFactoryInterface animalFactoryInterface = new ConcreteAnimalFactory2();
        Animal cat2 = animalFactoryInterface.getAnimalType("cat");
        cat2.eat();

        Animal errorAnimalType = concreteAnimalFactory.getAnimalType("Tigers");
        errorAnimalType.eat();
    }
}
