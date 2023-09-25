package com.workintech.oop.Company;

public class JuniorDeveloper extends Employee {

    public JuniorDeveloper(long id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        setSalary(22000);
        System.out.println("Junior Developer " + getName() + " starts working");
    }


}