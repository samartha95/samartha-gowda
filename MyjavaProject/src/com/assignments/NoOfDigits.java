package com.assignments;

public class NoOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		for(int n=1328382;n!=0;n=n/10) {
			count++;
		}
		System.out.println(count);
	}

}
