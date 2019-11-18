package com.Abstract;

public class Circle extends Shape {
	int r;
	Circle (int r){
		this.r=r;
	}
	double area() {
		return(r*r*PI);
	}

}
