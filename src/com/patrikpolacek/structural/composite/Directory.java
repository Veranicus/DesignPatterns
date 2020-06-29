package com.patrikpolacek.structural.composite;

import java.util.ArrayList;
import java.util.List;

//We always hierarchize the object structure by directory
public class Directory implements Employee {

    private List<Employee> employeeList = new ArrayList<>();


    @Override
    public void showEmployeeDetails() {
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
