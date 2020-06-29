package com.patrikpolacek.structural.composite2;

//client
public class Company {

    public static void main(String[] args) {
        Employee dev1 = new Developer("John", 140L, "Senior");
        Employee dev2 = new Developer("Joanna", 141L, "Junior");

        Manager engManager = new Manager("Mike", 40000);

        engManager.addEmployee(dev1);
        engManager.addEmployee(dev2);

//        Employee man1 = new com.patrikpolacek.structural.composite.Manager("Mike", 200L, "SEO manager");
//        Employee man2 = new com.patrikpolacek.structural.composite.Manager("Dominica", 201L, "Product manager");
        Employee dev3 = new Developer("Brutus", 142L, "Midd");
        Manager generalManager = new Manager("Frank", 55000);
        generalManager.addEmployee(dev3);
        generalManager.addEmployee(engManager);
//        accManager.addEmployee(man1);
//        accManager.addEmployee(man2);


        generalManager.showEmployeeDetails();
//        Manager companyManager = new Manager();
//        companyManager.addEmployee(engManager);
//        companyManager.addEmployee(accManager);
//        companyManager.showEmployeeDetails();


    }
}
