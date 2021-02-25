package com.nonstaticmembs;

public class Demo5 {
	void m1() {
		System.out.println("from m1");
		System.out.println(this);
	}
	void m2() {
		System.out.println("from m2");
		System.out.println(this);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo5 ob1=new Demo5();
		Demo5 ob2= new Demo5();
		System.out.println(ob1);
		System.out.println(ob2);
		ob1.m1();
		ob1.m2();
		ob2.m1();
		ob2.m2();

	}

}
