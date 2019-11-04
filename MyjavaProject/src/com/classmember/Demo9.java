package com.classmember;

public class Demo9 {
	static boolean j;
	static
	{
		System.out.println("from sib of Demo9");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("from main of Demo9");
		System.out.println(Demo8.i);

	}

}
