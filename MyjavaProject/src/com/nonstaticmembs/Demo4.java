package com.nonstaticmembs;

public class Demo4 {
	void m1() {// non static context or method
		System.out.println("From m1");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo4 x=new Demo4();
		x.m1();// we call non static method using object refereve variable

	}

}
