package com.chainsys.transport;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.chainsys.employeeDetails.EmployeeData;



public class MyClass {
	
	 public static int countOfEmployeeUsingTransport;
	public static void main(String[] args) {
		 Employee[] employees = new Employee[4];
		MyClass.employeeDetails();
		Scanner sc=new Scanner(System.in);
		String branch = sc.next();
		int countOfEmployeeUsingTransport=findCountOfEmployeesUsingCompTransport(employees, branch);
		if(countOfEmployeeUsingTransport>0)
		{
			System.out.println(countOfEmployeeUsingTransport);
		}
		else {
            System.out.println("Zero Employees Using Company Transport");
        }
			MyClass.findEmployeeWithSecondHighestRating(employees);
		}

	
	 public static int findCountOfEmployeesUsingCompTransport(Employee[] employees,String branch) {
	
		for(Employee employee : employees) {
		if(employee.getBranch().equals(branch) && employee.isCompanyTransport()) {
		   countOfEmployeeUsingTransport++;
		}
		}
		System.out.println("count"+countOfEmployeeUsingTransport);
		return countOfEmployeeUsingTransport;
	}
	 
	 
	 
	 
	 public static Employee findEmployeeWithSecondHighestRating(Employee[] employees) {
		 Employee highestRating = null;
		 Employee secondHighestRating = null;
		 for(Employee employee:employees)
		 {
			 
			 if (!employee.isCompanyTransport()) {
		            if (highestRating == null) {
		               
		            	highestRating = employee; 
		            } else if (employee.getRating() > highestRating.getRating()) {
		               
		            	secondHighestRating = highestRating; 
		                highestRating = employee; 
		            } else if (secondHighestRating == null || employee.getRating() > secondHighestRating.getRating()) {
		               
		            	secondHighestRating= employee;
		            }
			 
		 }
		 }
	
		return secondHighestRating;
		 
	 }
	 public static void employeeDetails(){
		 Scanner sc=new Scanner(System.in);
		 Employee[] employees = new Employee[4];
		 for (int i = 0; i < 4; i++) {
			System.out.println("Enter Employee Id:");
			int employeeId=sc.nextInt();
			System.out.println("Enter name:");
			String name=sc.next();
			System.out.println("Enter branch:");
			String branch=sc.next();
			System.out.println("Enter Rating:");
			double rating=sc.nextDouble();
			System.out.println("Enter Company Transport");
			boolean companyTransport=sc.nextBoolean();
		 }
	 }

}
