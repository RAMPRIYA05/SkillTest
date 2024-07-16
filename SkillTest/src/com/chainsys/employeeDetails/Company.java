package com.chainsys.employeeDetails;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Company {
    private String companyName;
    private List<EmployeeData> employees = new ArrayList<>();
    
    public void companyDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Company name: ");
        this.companyName = sc.nextLine();
        System.out.println("Enter Number of Employees:");
        int numEmployees = sc.nextInt();
        sc.nextLine(); 
        
        for (int i = 0; i < numEmployees; i++) {
            System.out.println("Enter id: ");
            int id = sc.nextInt();
            sc.nextLine(); 
            System.out.println("Enter name:");
            String name = sc.nextLine();
            System.out.println("Enter designation: ");
            String designation = sc.nextLine();
            System.out.println("Enter salary: ");
            double salary = sc.nextDouble();
            sc.nextLine(); 
            
            employees.add(new EmployeeData(id, name, designation, salary));
        }
    }

    public double getAverageSalary() {
        double sum = 0;
        for (EmployeeData employee : employees) {
            sum =sum+ employee.getSalary();
        }
        return sum / employees.size(); 
    }

    public double getMaxSalary() {
        double maxSalary = Double.MIN_VALUE;
        for (EmployeeData employee : employees) {
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
            }
        }
        return maxSalary;
    }

    public List<EmployeeData> getEmployeesByDesignation(String designation) {
        List<EmployeeData> filteredEmployees = new ArrayList<>();
        for (EmployeeData employee : employees) {
            if (employee.getDesignation().equalsIgnoreCase(designation)) {
                filteredEmployees.add(employee);
            }
        }
        return filteredEmployees;
    }

    public static void main(String[] args) {
        Company company = new Company();
        company.companyDetails();
        System.out.println("Average Salary: " + company.getAverageSalary());
        System.out.println("Max Salary: " + company.getMaxSalary());

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter designation: ");
        String designation = sc.nextLine();
        List<EmployeeData> employeesByDesignation = company.getEmployeesByDesignation(designation);
        
        System.out.println("Employees with designation :" + designation );
        for (EmployeeData employee : employeesByDesignation) {
            System.out.println(employee);  
        }
    }
}
