package com.isa;

public class TE extends Employee{
	String tool;
	TE(int id,double salary,String name,String tool){
		super(id,salary,name);
		this.tool=tool;
	}

	public static void main(String[] args) {
			TE ob=new TE(121,15500,"abc","ALM");
			System.out.println(ob.id);
			System.out.println(ob.name);
			System.out.println(ob.salary);
			System.out.println(ob.tool);

	}

}
