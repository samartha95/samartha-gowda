package com.Interface;

public class ATMImplementation implements ATM{
	long balance;

	@Override
	public void deposite(long depositeamount) {
		if(depositeamount>0) {
			balance=balance+depositeamount;
			System.out.println("successfully deposited RS "+depositeamount);
		}
		else {
			System.out.println("inncorrect deposite amount");
		}
		
	}

	@Override
	public void withdrwal(long withdrawalamount) {
		if(withdrawalamount>0) {
			balance=balance+withdrawalamount;
			System.out.println("successfully withdrwan RS "+withdrawalamount);
		}
		else {
			System.out.println("inncorrect withdrawal amount");
		}
		
	}

	@Override
	public long checkbalance() {
		System.out.println(balance);
		return balance;
	}
	

}
