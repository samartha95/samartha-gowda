package com.polymorphism;

public class BankInfo {

	public static void main(String[] args) {
		Bank bank;
		bank=new SBI();
		System.out.println(bank.rateOfInterest());
		bank=new ICIC();
		System.out.println(bank.rateOfInterest());
		bank=new SBITouch();
		System.out.println(bank.rateOfInterest());
	
	//or
	
		Bank[] b= {new Bank(),new SBI(),new ICIC(),new SBITouch()};
		for(Bank x:b) {
			System.out.println(x.rateOfInterest());
		}
		
		
	}

}
