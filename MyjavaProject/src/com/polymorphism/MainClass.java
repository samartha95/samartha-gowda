package com.polymorphism;

public class MainClass {

	public static void main(String[] args) {
		A ob;
		ob=new B();//uc
		ob.test();//polymorphism
		ob=new C();//uc
		ob.test();//polymorphism
		ob=new A();
		ob.test();

	}

}
