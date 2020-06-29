package com.patrikpolacek.structural.composite2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//We always hierarchize the object structure by directory
public class Manager implements Employee {

    private List<Employee> employeeList = new ArrayList<>();

    private String name;
    private double salary;

    public Manager() {
    }

    public Manager(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employee getChild(int i){
        return employeeList.get(i);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println(name);
        System.out.println(salary);

        Iterator<Employee> employeeIterator = employeeList.iterator();
        while (employeeIterator.hasNext()){
            Employee employee = employeeIterator.next();
            employee.showEmployeeDetails();
        }

        for (Employee e: employeeList){
            e.showEmployeeDetails();
        }
    }

    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }

    public void removeEmployee(Employee employee){
        employeeList.remove(employee);
    }
}
