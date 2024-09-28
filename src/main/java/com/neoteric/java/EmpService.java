package com.neoteric.java;

import java.util.Date;

public class EmpService {

    public static void main (String[] args){
        Employee employee=new Employee();
        employee.name="swathi";
        employee. empid="2345678";
        employee. salary="20000";
        employee.department="manager";
        employee. mobileNo="8899776543";
        employee.age="25";
        Date dob=new Date();


        DepartmentDetails dept=new DepartmentDetails();
        dept.deptName="manager";
        dept.deptid="98765";

        System.out.println(employee.name);
        System.out.println(employee.empid);
        System.out.println(employee.salary);
        System.out.println(employee.mobileNo);
        System.out.println(employee.department);
        System.out.println(employee.age);
        System.out.println(dept.deptName);
        System.out.println(dept.deptid);















    }


}
