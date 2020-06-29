package com.patrikpolacek.creational.factory.FactoryChallenge.Creator;

import com.patrikpolacek.creational.factory.FactoryChallenge.Product.Animal;
//Optional way of doing factory for ConcreteAnimalFactory2
public interface AnimalFactoryInterface {

    Animal getAnimalType(String animalName) throws Exception;
}
