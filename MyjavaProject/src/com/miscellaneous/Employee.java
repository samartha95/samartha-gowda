package com.miscellaneous;

public class Employee {
	int id;
	String name;
	double salary;
	static  Employee createEmployee(int id,String name,double salary ) {
		return new Employee(id,name,salary);
	}
	Employee(int id,String name,double salary){
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	Employee initialize(double d)
	{
	this.salary=d;
	return this;
	}
	Employee Hike() {
		System.out.println(this.name);
		System.out.println(this.salary);
		System.out.println(this.id);
		return this;
		 
	 }
	
	public static void main(String[] args) {
		Employee e1=Employee.createEmployee(1,"sam",2450).initialize(3540.50).Hike();
		Employee e2=Employee.createEmployee(1,"sam",2450).initialize(14500.50).Hike();
		e2.initialize(36000.50).Hike();
	}

}
