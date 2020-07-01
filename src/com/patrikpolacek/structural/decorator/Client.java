package com.patrikpolacek.structural.decorator;

import com.patrikpolacek.structural.decorator.component.ConcreteComponent;

public class Client {
    public static void main(String[] args)
    {
        System.out.println("***Decorator pattern Demo***");
        ConcreteComponent cc = new ConcreteComponent();

        ConcreteDecorator cd_1 = new ConcreteDecorator();

        // Decorating ConcreteComponent Object cc with ConcreteDecoratorEx_1
        cd_1.SetTheComponent(cc);
        cd_1.doJob();

        ConcreteDecorator2 cd_2= new ConcreteDecorator2();

        // Decorating ConcreteComponent Object cc with ConcreteDecoratorEx_1 & ConcreteDecoratorEX_2
        cd_2.SetTheComponent(cd_1);//Adding results from cd_1 now
        cd_2.doJob();
    }
}
