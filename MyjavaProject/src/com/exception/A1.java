package com.exception;
class A1{
 public static void main(String[] args){
		System.out.println("hi");
		try {
		   m1();
		   }
		catch(ClassNotFoundException c) {
			System.out.println(c);
			c.printStackTrace();
		}
		System.out.println("bye");
	}
 static void m1() throws ClassNotFoundException {
	 Class.forName("com.exception.A");
	 System.out.println("end m1");
 }

 }