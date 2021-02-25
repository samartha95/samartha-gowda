package com.instanceOF;

public class MainClass {
	public static void display(A1 obj) {
		System.out.println(obj.i);
		if(obj instanceof B1) {
			System.out.println("##############");
			B1 obj1=(B1)obj;
			System.out.println(obj1.j);}
		if(obj instanceof C1) {
			System.out.println("############");
			C1 obj2=(C1)obj;
			System.out.println(obj2.k);}
		}

	public static void main(String[] args) {
		A1 ob1=new A1(10);
		B1 ob2=new B1(100,200);
		C1 ob3=new C1(2000,100);
		A1 ob4=new B1(2,3);
		A1 ob5=new C1(45,65);
		display(ob1);
		display(ob2);
		display(ob3);
		display(ob4);
		display(ob5);
	}

}
