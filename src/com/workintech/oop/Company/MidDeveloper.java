package com.workintech.oop.Company;

public class MidDeveloper extends Employee {
    public MidDeveloper(long id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        setSalary(35000);
        System.out.println("Middle Developer " + getName() + " starts working ");
    }
}