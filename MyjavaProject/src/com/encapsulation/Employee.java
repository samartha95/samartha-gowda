package com.encapsulation;

public class Employee {
	private int Id;
	private double salary;
	private String name;
	public Employee(int id,double salary,String name) {
		this.Id=id;
		this.name=name;
		this.salary=salary;
	}
	public int getId() {
		return Id;
	}
	public String getname() {
		return name;
	}
	public double getsalary() {
		return salary;
	}
	public void setsalary(double salary) {
		if(salary>this.salary) {
			this.salary=salary;
		}
		else
			System.out.println("no");
	}
}
