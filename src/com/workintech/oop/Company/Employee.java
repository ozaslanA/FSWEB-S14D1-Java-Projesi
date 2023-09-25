package com.workintech.oop.Company;

public class Employee {
    public int id;
    public String name;
    public int Salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        Salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }
    public void work() {
        System.out.println(name + " starts working");
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("ID: " + id);
        builder.append(" Name: " + name);
        return builder.toString();
    }

}
