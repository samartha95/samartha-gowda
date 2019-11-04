package com.nonstaticmembs;

public class Demo1 {
	int i=10;
	boolean flag;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Demo1());
		System.out.println(new Demo1());
		Demo1 a=new Demo1();
		System.out.println(a.i);
		System.out.println(a.flag);
		a.i=10;
		a.flag=true;
		System.out.println(a.i);
		System.out.println(a.flag);
		

	}

}
