package com.Abstract;

public class Geometry {

	public static void main(String[] args) {
		Shape ob;
		ob=new Circle(12);
		System.out.println(ob.area());
		ob=new Rectangle(13,20);
		System.out.println(ob.area());
		ob=new RightAngledTriangle(11,17);
		System.out.println(ob.area());

	}

}
