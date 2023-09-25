package com.workintech.oop.Main;

import com.workintech.oop.Company.HRManager;
import com.workintech.oop.Company.JuniorDeveloper;
import com.workintech.oop.Company.MidDeveloper;
import com.workintech.oop.Company.SeniorDeveloper;

import java.util.Arrays;

public class CompanyMain {

    public static void main(String[] args) {


        JuniorDeveloper juniorDeveloper1 = new JuniorDeveloper(1, "Thor");
        juniorDeveloper1.work();
        JuniorDeveloper juniorDeveloper2 = new JuniorDeveloper(2, "Loki");
        juniorDeveloper2.work();
        // JuniorDeveloper[] juniors = new JuniorDeveloper[] {
        //     juniorDeveloper1, juniorDeveloper2
        // };

        MidDeveloper midDeveloper1 = new MidDeveloper(3, "Heimdall");
        midDeveloper1.work();
        MidDeveloper midDeveloper2 = new MidDeveloper(4, "Tyr");
        midDeveloper2.work();
        // MidDeveloper[] mids = new MidDeveloper[] {
        //         midDeveloper1, midDeveloper2
        // };

        SeniorDeveloper seniorDeveloper1 = new SeniorDeveloper(5, "Frigg");
        seniorDeveloper1.work();
        // SeniorDeveloper[] seniors = new SeniorDeveloper[] {
        //         seniorDeveloper1
        // };

        HRManager hrManager = new HRManager(6, "Odin", new JuniorDeveloper()[3], new MidDeveloper[2], new SeniorDeveloper[1]);
        hrManager.work();

        System.out.println("---------------------------------");

        System.out.println("Junior salary is " + juniorDeveloper1.getSalary());
        System.out.println("Middle salary is " + midDeveloper1.getSalary());
        System.out.println("Senior salary is " + seniorDeveloper1.getSalary());
        System.out.println("HR Manager salary is " + hrManager.getSalary());

        System.out.println("---------------------------------");

        System.out.println("Juniors: " + Arrays.toString(hrManager.getJuniors()));
        System.out.println("Mids: " + Arrays.toString(hrManager.getMids()));
        System.out.println("Seniors: " + Arrays.toString(hrManager.getSeniors()));

        hrManager.addEmployee(0, juniorDeveloper1);
        hrManager.addEmployee(0, midDeveloper1);
        hrManager.addEmployee(0, seniorDeveloper1);
        hrManager.addEmployee(1, juniorDeveloper2);
        hrManager.addEmployee(1, midDeveloper2);
        hrManager.addEmployee(1, seniorDeveloper1);

        System.out.println("---------------------------------");

        System.out.println("Juniors: " + Arrays.toString(hrManager.getJuniors()));
        System.out.println("Mids: " + Arrays.toString(hrManager.getMids()));
        System.out.println("Seniors: " + Arrays.toString(hrManager.getSeniors()));
    }
}
