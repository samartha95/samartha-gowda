package com.Abstract;

public class Rectangle extends Shape {
	int l;
	int b;
	Rectangle(int l,int b){
		this.b=b;
		this.l=l;
	}
	double area() {
		return (l*b);
	}
}
