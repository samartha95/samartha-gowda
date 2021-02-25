package com.tostring;

public class EMP {
	int id;
	double salary;
	String name;
	EMP(){}
	public EMP(int id, double salary, String name) {
		this.id = id;
		this.salary = salary;
		this.name = name;
	}
	public String toString() {
		return id+" "+salary+" "+name+" ";
	}
	

}
