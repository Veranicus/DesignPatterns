package com.patrikpolacek.structural.composite2;

public class Developer implements Employee {
    private String name;

    private Long employeeId;

    private String position;

    public Developer() {
    }

    public Developer(String name, Long employeeId, String position) {
        this.name = name;
        this.employeeId = employeeId;
        this.position = position;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println(name + " " + employeeId + " " + position);
    }
}
