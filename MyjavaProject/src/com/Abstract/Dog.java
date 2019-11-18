package com.Abstract;

public class Dog extends Animal {
	void talk() {
		System.out.println("bow bow");
	}
	public Dog() {
	}
	Dog(double hieght,double weight){
		super(hieght,weight);
	}
}
