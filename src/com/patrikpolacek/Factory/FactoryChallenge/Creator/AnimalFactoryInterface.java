package com.patrikpolacek.Factory.FactoryChallenge.Creator;

import com.patrikpolacek.Factory.FactoryChallenge.Product.Animal;
//Optional way of doing factory for ConcreteAnimalFactory2
public interface AnimalFactoryInterface {

    Animal getAnimalType(String animalName) throws Exception;
}
