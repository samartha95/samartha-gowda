package com.Abstract;

public class Jungle {

	public static void main(String[] args) {
		Animal a;
		a=new Dog(12,34);
		a.talk();
		a=new Lion(13,200);
		a.talk();
		Dog d=new Dog(4,30.6);
		d.talk();
		System.out.println(d.hieght);
		System.out.println(d.weight);
		Lion l=new Lion(5,120);
		l.talk();
		
	}

}
