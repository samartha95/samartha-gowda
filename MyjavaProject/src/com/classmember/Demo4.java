package com.classmember;

public class Demo4 {
	static int i;
	static
	{
	System.out.println("from sib-1");
	System.out.println(i);
	i=20;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("from main");
		System.out.println(i);

	}

}
