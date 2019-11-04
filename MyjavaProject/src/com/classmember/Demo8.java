package com.classmember;

public class Demo8 {
	static int i;
	static
	{
		System.out.println("from sib of Demo8 ");
	}
	public static void main(String[] args)
	{
		System.out.println("from mian of Demo8");
		System.out.println(Demo9.j);
	}
	
		

}
