package com.nonprimitivearray;

public class Loan {
	String name;
	double roi;
	Loan(String name,double roi){
		this.name=name;
		this.roi=roi;
	}
	void interest() {
		System.out.println(name+" is granted at "+roi+"%");
	}
	public static void main(String[] args) {
		Loan l1=new Loan("Vehicle laon",18);
		Loan l2=new Loan("Home loan",12);
		Loan l3=new Loan("Personal loan",13);
		Loan[]loan= {l1,l2,l3,new Loan("Make up loan",100)};
		for(int i=0;i<loan.length;i++) {
			System.out.println(loan[i].name+" "+loan[i].roi);
			loan[i].interest();
		}
		
	}
	
	

}
