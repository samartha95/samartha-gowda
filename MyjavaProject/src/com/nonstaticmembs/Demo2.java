package com.nonstaticmembs;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo2 x= new Demo2();
		Demo2 y=x;
		System.out.println(x==y);
		System.out.println("x: "+x);
		System.out.println("y: "+y);

	}

}
