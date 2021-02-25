package com.hashcode;

public class Company {
		public static void main(String[] args) {
			TestEngineer t1=new TestEngineer(1,"A",20,"ALM");
			TestEngineer t2=new TestEngineer(1,"A",20,"selenium");
			TestEngineer t3=new TestEngineer(1,"A",20,"ALM");
			Developer d1=new Developer(1,"A",25,"java");
			Developer d2=new Developer(1,"A",25,"java");
			Developer d3=new Developer(1,"S",25,"java");
		     System.out.println(t1);
		     System.out.println(t2);
		     System.out.println(d1);
		     System.out.println(d2);
		     System.out.println(t1.hashCode());
		     System.out.println(t2.hashCode());
		     System.out.println(t3.hashCode());
		     System.out.println(d1.hashCode());
		     System.out.println(d2.hashCode());
		     System.out.println(d3.hashCode());
		     System.out.println(t1.equals(t2));
		     System.out.println(t1.equals(t3));
		     System.out.println(d1.equals(d2));
		     System.out.println(d1.equals(d3));

		}

	}
