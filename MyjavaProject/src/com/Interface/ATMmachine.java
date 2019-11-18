package com.Interface;

public class ATMmachine {

	public static void main(String[] args) {
		ATM ob=new ATMImplementation();
		ob.deposite(-35);
		ob.deposite(40000);
		ob.checkbalance();
		ob.withdrwal(20000);
		ob.checkbalance();
	}

}
