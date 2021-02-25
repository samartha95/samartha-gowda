package com.upcatsing;

public class Mainclass1 {

	public static void main(String[] args) {
		A1 ob1=new B1();//upcating
		System.out.println(ob1.i);
		A1 ob2=new C1();//upcating
		System.out.println(ob2.i);
		C1 ob3=new C1();
		System.out.println(ob3.i);
		System.out.println(ob3.j);
		System.out.println(ob3.k);
		A1 ob4=ob3;//upcating
		B1 ob5=new B1();
		System.out.println(ob5.i);
		//System.out.println(ob5.k);
		System.out.println(ob5.i);
		//System.out.println(ob4.j);
		//System.out.println(ob2.k);//
		//System.out.println(ob1.j);

	}

}
