package com.iib;

public class p2 {
	int i;
	{
		System.out.println(i);
		i=20;
		System.out.println("from iib");
	}
	p2(){
		System.out.println("from p2()");
	}
	p2(int i){
		System.out.println(this.i);
		this.i=i;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("from main");
		p2 ob1=new p2();
		System.out.println(ob1.i);
		p2 ob2=new p2(10);
		System.out.println(ob2.i);
		System.out.println("main ends");

	}

}
