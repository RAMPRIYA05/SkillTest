package com.chainsys.demo;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bank {

	public static void main(String[] args) {
		String name;
		long accountNumber;
		String IFSC;
		double existingBalance=10000;
		double withDrawal;
		double deposit;
		
		ArrayList<String> namearr=new ArrayList<String>();
		namearr.add("Priya");
		namearr.add("ramya");
		namearr.add("Rampriya");
		
		ArrayList<String> accountNumberarr=new ArrayList<String>();
		accountNumberarr.add("345678906412");
		accountNumberarr.add("849273846210");
		accountNumberarr.add("840264531289");

		ArrayList<String> IFSCarr=new ArrayList<String>();
		IFSCarr.add("SBII0938412");
		IFSCarr.add("SBII0234865");
		IFSCarr.add("SBII0347381");
		
		Bank bank=new Bank();
		Bank.getName();
		bank.getAccountNumber();
		bank.getIFSC();
		
		
		
		
		    System.out.println("Enter withDrawal amount");
		    Scanner sc=new Scanner(System.in);
		    withDrawal=sc.nextDouble();
		    existingBalance=existingBalance-withDrawal;
		    System.out.println("Existing Balance:"+existingBalance);
		    System.out.println("option:1.WithDrawal 2.Deposit");
		    int option=sc.nextInt();
		    switch (option) {
			case 1: {
				System.out.println("Enter withDrawal amount");
				withDrawal=sc.nextDouble();
				existingBalance=existingBalance-withDrawal;
			    System.out.println("Existing Balance:"+existingBalance);
			    
			    break;
			}
			case 2:
			{
				System.out.println("Enter deposit amount");
				deposit=sc.nextDouble();
				existingBalance=existingBalance+deposit;
				System.out.println("Existing Balance:"+existingBalance);
				break;
			}
				
	}
	}

	public static String getName() {
		Bank bank = new Bank();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = sc.next();
		
		Pattern p1 = Pattern.compile("^[A-Za-z]{5}+$");
		Matcher m1 = p1.matcher(name);
		if (m1.find()) {
			System.out.println("name:" + name);
		} else {
			bank.getName();
		}
		return name;
	}

	public static long getAccountNumber() {
		Bank bank = new Bank();
		System.out.println("Enter your account Number");
		Scanner sc = new Scanner(System.in);
		long accountNumber = sc.nextLong();
		String accountNumber1=Long.toString(accountNumber);
		Pattern p2 = Pattern.compile("^[0-9]{12}$");
		Matcher m2 = p2.matcher(accountNumber1);
		if (m2.find()) {
			System.out.println("accountNumber:" + accountNumber);
		} else {
			bank.getAccountNumber();
		}
		
		return accountNumber;
	}

	public static String getIFSC() {
		Bank bank = new Bank();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your IFSC");
		String IFSC = sc.next();
		
		  Pattern p3 = Pattern.compile("[A-Z]{4}0[0-9]{6}"); 
		  Matcher m3 =p3.matcher(IFSC); if (m3.find()) {
		 
			System.out.println("IFSC:" + IFSC);
			
			 } else { bank.getIFSC(); }
			 
		
		return IFSC;
	}
	
     
}

