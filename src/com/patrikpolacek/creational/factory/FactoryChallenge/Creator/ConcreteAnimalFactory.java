package com.patrikpolacek.creational.factory.FactoryChallenge.Creator;

import com.patrikpolacek.creational.factory.FactoryChallenge.Product.Animal;
import com.patrikpolacek.creational.factory.FactoryChallenge.Product.Cat;
import com.patrikpolacek.creational.factory.FactoryChallenge.Product.Lion;
import com.patrikpolacek.creational.factory.FactoryChallenge.Product.Tiger;

public class ConcreteAnimalFactory {
    public Animal getAnimalType(String animalName) throws Exception {
        String animalNameToUpperCase = animalName.toUpperCase();
        Animal animal;
        switch (animalNameToUpperCase) {
            case "CAT":
                animal = new Cat();
                break;
            case "LION":
                animal = new Lion();
                break;
            case "TIGER":
                animal = new Tiger();
                break;
            default:
                throw new Exception("Animal of that type not found !");
        }
        return animal;
    }
}
