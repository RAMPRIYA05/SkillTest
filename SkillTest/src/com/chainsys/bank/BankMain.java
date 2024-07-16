package com.chainsys.bank;

public class BankMain {

	public static void main(String[] args) {
		BankA bankA=new BankA();
		BankB bankB=new BankB();
		BankC bankC=new BankC();
		
		bankA.getBalance();
		bankB.getBalance();
		bankC.getBalance();
	}

}
