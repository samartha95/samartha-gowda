package com.tostring;

public class A {
	int i;
	double j;
	A(){}
	public A(int i, double j) {
		super();
		this.i = i;
		this.j = j;
	}
	public String toString() {
		return i+" "+j;
	}

}
