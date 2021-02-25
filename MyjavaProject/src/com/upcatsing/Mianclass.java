package com.upcatsing;

public class Mianclass {

	public static void main(String[] args) {
		A ob1=new B();//upcasting
		System.out.println(ob1.i);
		System.out.println(ob1.j);//cte: we cannot access members of child calss using parent type ref var
		B ob2=new B();
		A ob3=ob2;//upcating
		System.out.println(ob3.j);//cte: we cannot access members of child calss using parent type ref var
		System.out.println(ob2.i);

	}

}
