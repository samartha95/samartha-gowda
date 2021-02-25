package com.constructorchaining;

public class p1 {
	{
		System.out.println("ok");
	}
	p1(){
		System.out.println("from p1()");
	}
	p1(int i,double d){
		this();
		System.out.println("from p1(int i)");
	}
	p1(double b){
		System.out.println("from p1(double b)");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		p1 ob1=new p1();
		System.out.println("#####");
		p1 ob2=new p1(10.0);
		p1 ob3=new p1(8,8.0);

	}

}
