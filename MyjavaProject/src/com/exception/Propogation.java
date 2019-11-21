package com.exception;

public class Propogation {
	static void m3() {
		System.out.println("from m3");
		int a=1;
		int b=0;
		try {
			System.out.println(a/b);
		}
		catch(ArrayIndexOutOfBoundsException c) {
			System.out.println(c);
		}
	}
	static void m2() {
		System.out.println("from m2");
		try {
			m3();
		}
		catch(ClassCastException v) {
			System.out.println(v);
		}
	}
	static void m1() {
		System.out.println("from m1");
		try {
			m2();
		}
		catch(ArithmeticException c) {
			System.out.println("caught"+c);
			c.printStackTrace();
		}
	}

	public static void main(String[] args) {
		System.out.println("from main");
		m1();
		System.out.println("main ends");
	}

}
