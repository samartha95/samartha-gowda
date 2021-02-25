package com.exception;
public class Voter {
	int age;
	public Voter(int age) {
		super();
		if(age>=18) {
		this.age = age;
		System.out.println("success and age is "+age);
		}
		else {
			throw new WrongAge();
		}
	}
	public static void main(String[] args) {
		Voter v=new Voter(100);
		System.out.println(v.age);
		Voter v1=new Voter(18);
		Voter v3=new Voter(100);
		System.out.println(v3.equals(v));
		System.out.println(v.hashCode());
		System.out.println(v3.hashCode());

	}
	@Override
	public String toString() {
		return "Voter [age=" + age + "]";
	}
	@Override
	public int hashCode() {
		return age;
	}
	@Override
	public boolean equals(Object obj) {
		return this.age==((Voter)obj).age;
	}
	

}
