package com.patrikpolacek.structural.composite;

import com.patrikpolacek.creational.builder.Challenge.Director;

//client
public class Company {

    public static void main(String[] args) {
        Employee dev1 = new Developer("John", 140L, "Senior");
        Employee dev2 = new Developer("Joanna", 141L, "Junior");

        Directory engDirectory = new Directory();

        engDirectory.addEmployee(dev1);
        engDirectory.addEmployee(dev2);

        Employee man1 = new Manager("Mike", 200L, "SEO manager");
        Employee man2 = new Manager("Dominica", 201L, "Product manager");

        Directory accDirectory = new Directory();
        accDirectory.addEmployee(man1);
        accDirectory.addEmployee(man2);

        Directory companyDirectory = new Directory();
        companyDirectory.addEmployee(engDirectory);
        companyDirectory.addEmployee(accDirectory);
        companyDirectory.showEmployeeDetails();


    }
}
