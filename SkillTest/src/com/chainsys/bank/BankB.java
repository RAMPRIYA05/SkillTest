package com.chainsys.bank;

import java.util.Scanner;

public class BankB implements Bank {


	@Override
	public void getBalance() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter amount:");
		double amount=sc.nextDouble();
		System.out.println("Balance in Bank B:"+amount);
		
	}
}
