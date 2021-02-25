package com.nonstaticmembs;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A ob1=new A();
		A ob2=new A();
		System.out.println(ob1.d);
		System.out.println(ob2.d);
		ob1.d=10;
		ob2.d=20;
		System.out.println(ob1.d);
		System.out.println(ob2.d);
		ob1.d=90;
		System.out.println(ob1.d);
		System.out.println(ob2.d);

	}

}
