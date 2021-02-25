package com.classmember;

public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee();
		System.out.println("Ename: "+e1.Name+" id: "+e1.id+" salary: "+e1.salary);
		e1.Name="smaarth";
		e1.salary=14.7;
		e1.id=123;
		System.out.println("Ename: "+e1.Name+" id: "+e1.id+" salary: "+e1.salary);
		Employee e2= new Employee("sam",14.5,123);
		System.out.println("Ename: "+e2.Name+" id: "+e2.id+" salary: "+e2.salary);
	}

}
