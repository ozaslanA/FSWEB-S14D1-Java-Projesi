package com.workintech.oop.Company;

public class SeniorDeveloper extends Employee {

    public SeniorDeveloper(long id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        setSalary(45000);
        System.out.println("Senior Developer " + getName() + " starts working");
    }
}
