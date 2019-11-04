package com.nonstaticmembs;

public class Sam {
	int i;
	void initializing(int i)
	{
		this.i=i;
		System.out.println(this.i);
	}
	public static void main(String[] args) {
		Sam ob=new Sam();
		ob.initializing(10);
		System.out.println(ob.i);
	}
	
}
