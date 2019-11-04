package com.classmember;

public class Marker {
	static int price;
	static String colour;
	static void writing()
	{
		System.out.println("Marker of colour "+colour+"is writing");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Marker.colour);
		System.out.println(Marker.price);
		Marker.price=100;
		Marker.colour="Black";
		System.out.println("Marker of colour "+colour+" is writing."+" Marker price is "+price);
	}

}
