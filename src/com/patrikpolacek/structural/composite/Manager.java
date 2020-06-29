package com.patrikpolacek.structural.composite;

public class Manager implements Employee {
    private String name;

    private Long employeeId;

    private String position;


    public Manager(String name, Long employeeId, String position) {
        this.name = name;
        this.employeeId = employeeId;
        this.position = position;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println(name + " " + employeeId + " " + position);
    }
}
