package com.encapsulation;

public class EmployeePortal {

	public static void main(String[] args) {
		Employee emp=new Employee(1,14.5,"sam");
		System.out.println("Employee name : "+emp.getname());
		emp.setsalary(20.5);
		System.out.println(emp.getsalary());

	}

}
