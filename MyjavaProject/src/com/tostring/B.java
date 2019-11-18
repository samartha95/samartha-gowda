package com.tostring;

public class B extends A{
	char ch;
	String s;
	B(){}
	public B(int i, double j,char ch,String s) {
		super(i, j);
		this.ch=ch;
		this.s=s;
	}
	public String toString() {
		return super.toString()+" "+ch+" "+s;
	}
	public static void main(String[] args) {
		A ob=new A(10,100);
		System.out.println(ob);
		B ob1=new B(11,12,'s',"sam");
		System.out.println(ob1);
	}
	

}
