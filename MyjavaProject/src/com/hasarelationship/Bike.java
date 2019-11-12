package com.hasarelationship;

public class Bike {
	Engine e= new Engine(100);
	double mileage;
	String colour;
	Bike(){}
	Bike(double mileage,String colour){
		this.colour=colour;
		this.mileage=mileage;
		
	}

}
