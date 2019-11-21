package com.arraylist;

public class Bike {
	String color;
	double mileage;
	public Bike(String color, double mileage) {
		super();
		this.color = color;
		this.mileage = mileage;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return (color+" "+mileage);
	}
	

}
