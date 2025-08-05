package com.cg.eis.service;

import com.cg.eis.bean.Employee;

interface Employeeinterface {
    void displayEmployeeDetails(Employee emp);
    String getInsuranceScheme(Employee emp);
}

public class Service implements Employeeinterface {

    @Override
    public String getInsuranceScheme(Employee emp) {
        double salary = emp.getSalary();
        String designation = emp.getDesignation().toLowerCase();

        if (salary >= 50000 && designation.equals("manager")) {
            return "Scheme A";
        } else if (salary >= 30000 && designation.equals("developer")) {
            return "Scheme B";
        } else if (salary >= 20000 && designation.equals("clerk")) {
            return "Scheme C";
        } else {
            return "No Scheme";
        }
    }

    @Override
    public void displayEmployeeDetails(Employee emp) {
        System.out.println("Employee Details:");
        System.out.println("Employee ID: " + emp.getId());
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Salary: " + emp.getSalary());
        System.out.println("Employee Designation: " + emp.getDesignation());
        System.out.println("Employee Scheme: " + getInsuranceScheme(emp));
    }
}
