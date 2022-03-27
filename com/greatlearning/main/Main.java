package com.greatlearning.main;

// driver class Main

import com.greatlearning.dept.Admin_Department;
import com.greatlearning.dept.Hr_Department;
import com.greatlearning.dept.Tech_Department;

public class Main {

    public static void main(String args[]) {

// creation of object for the classes
// Admin_Department,Hr_Department,Tech_Department
        Admin_Department admin = new Admin_Department();
        Hr_Department hrdept = new Hr_Department();
        Tech_Department techdpt = new Tech_Department();

// displaying functionalities of Admin_Department
        System.out.println(admin.departmentName());
        System.out.println(admin.getTodayswork());
        System.out.println(admin.getworkDeadLine());
// calling method from the Super_Department which is the superclass.
        System.out.println(admin.isTodayHoliday());
        System.out.println("                   ");
        System.out.println("                     ");

// displaying functionalities of Hr_Department
        System.out.println(hrdept.departmentName());
        System.out.println(hrdept.doActivity());
        System.out.println(hrdept.getTodayswork());
        System.out.println(hrdept.getworkDeadline());
// calling method from the Super_Department  which is the superclass
        System.out.println(hrdept.isTodayHoliday());
        System.out.println("                   ");
        System.out.println("                    ");

// displaying functionalities of Tech_Department

        System.out.println(techdpt.departmnentName());
        System.out.println(techdpt.getTodayswork());
        System.out.println(techdpt.WorkDeadLine());
        System.out.println(techdpt.getTechStackinformation());
// calling method from the Super_Department  which is the superclass
        System.out.println(techdpt.isTodayHoliday());

    }

}
