package com.workintech.oop.Company;

public class HRManager extends Employee{
    private JuniorDeveloper[] juniors;
    private MidDeveloper[] mids;
    private SeniorDeveloper[] seniors;

    public HRManager(int id, String name, int salary, JuniorDeveloper[] juniors, MidDeveloper[] mids, SeniorDeveloper[] seniors) {
        super(id, name, salary);
        this.juniors = juniors;
        this.mids = mids;
        this.seniors = seniors;
    }

    public JuniorDeveloper[] getJuniors() {
        return juniors;
    }

    public MidDeveloper[] getMids() {
        return mids;
    }

    public SeniorDeveloper[] getSeniors() {
        return seniors;
    }
    public void addEmployee(int index, JuniorDeveloper developer) {
        try {
            // boolean isExist = false;
            // for (JuniorDeveloper junior : juniors) {
            //     if (junior.equals(developer)) {
            //         isExist = true;
            //         break;
            //     }
            // }
            // if (!isExist) {
            if (juniors[index] == null) {
                juniors[index] = developer;
            } else {
                System.out.println("A developer already exists for the relevant index");
            }
            // } else {
            //     System.out.println("Employee " + developer + " already exist");
            // }
            // this.juniors[index] = developer;
        } catch (
                ArrayIndexOutOfBoundsException ex) {
            System.out.println("Index" + index + " not found " + ex.getMessage());
        }
    }

    public void addEmployee(int index, MidDeveloper developer) {
        try {
            // boolean isExist = false;
            // for (MidDeveloper mid : mids) {
            //     if (mid.equals(developer)) {
            //         isExist = true;
            //         break;
            //     }
            // }
            // if (!isExist) {
            if (mids[index] == null) {
                mids[index] = developer;
            } else {
                System.out.println("A developer already exists for the relevant index");
            }
            // } else {
            //     System.out.println("Employee " + developer + " already exist");
            // }
            // this.mids[index] = developer;
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Index" + index + " not found " + ex.getMessage());
        }
    }

    public void addEmployee(int index, SeniorDeveloper developer) {
        try {
            // boolean isExist = false;
            // for (SeniorDeveloper senior : seniors) {
            //     if (senior.equals(developer)) {
            //         isExist = true;
            //         break;
            //     }
            // }
            // if (!isExist) {
            if (seniors[index] == null) {
                seniors[index] = developer;
            } else {
                System.out.println("A developer already exists for the relevant index");
            }
            // } else {
            //     System.out.println("Employee " + developer + " already exist");
            // }
            // this.seniors[index] = developer;
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Index" + index + " not found " + ex.getMessage());
        }
    }

    @Override
    public void work() {
        setSalary(60000);
        System.out.println("HR Manager " + getName() + " starts working ");
    }
}