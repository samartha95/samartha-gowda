package com.nonprimitivearray;

public class Books {
	String name;
	int isbn;
	int price;
	Books(String name,int isbn,int price)
	{
		this.name=name;
		this.isbn=isbn;
		this.price=price;
	}
	void details(String x) {
		System.out.println("The price of the "+x+" book "+name+" having isbn "+isbn+" is "+price);
	}}


