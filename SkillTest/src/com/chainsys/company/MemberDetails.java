package com.chainsys.company;

import java.util.Scanner;

public class MemberDetails {
	public static void main(String[] args) {
		Manager manager=new Manager("Ram", 25, "9876543219", "Madurai", 100000, "SmartApp");
		Employee employee=new Employee("Priya", 30, "9967845678", "Madurai", 80000, "Engineer");
		
		
		
		System.out.println("Enter name:"+employee.name);
		System.out.println("Enter age:"+employee.age);
		System.out.println("Enter age:"+employee.phoneNumber);
		System.out.println("Enter phone number:"+employee.address);
		System.out.println("Enter address:"+employee.salary);
	    System.out.println("Enter Specialization:"+employee.specialization);
	    employee.printSalary();
	    
	    System.out.println("Enter name:"+manager.name);
		System.out.println("Enter age:"+manager.age);
		System.out.println("Enter age:"+manager.phoneNumber);
		System.out.println("Enter phone number:"+manager.address);
		System.out.println("Enter address:"+manager.salary);
	    System.out.println("Enter Specialization:"+manager.department);
	    manager.printSalary();
	
		
    }
		
	}
