package com.pack1;

public class C extends A {
	public static void main(String[] args) {
		System.out.println(C.i);//cte i is private
		C ob=new C();
		System.out.println(ob.j);//cte j is private so not visible outside class A
	}
}
