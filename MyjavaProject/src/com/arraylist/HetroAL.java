package com.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class HetroAL {
	public static void main(String[] args) {
	ArrayList ls=new ArrayList();
	ls.add(new Bike("shiny black",20));
	ls.add(new Car(12, "sam"));
	ls.add(new Movie("KGF", 4.8));
	ls.add(10);
	System.out.println(ls);
	for(int i=0;i<ls.size();i++) {
		Object ob=ls.get(i);
		if(ob instanceof Bike)
			System.out.println(((Bike)ob).mileage);
		if (ob instanceof Integer) {
			System.out.println((Integer)ob);
		}
	}
	for(Object x:ls) {
		if(x instanceof Bike) {
			Bike ob=(Bike)x;
			System.out.println(ob.color);
			System.out.println(ob.mileage);
		}
		if(x instanceof Car) {
			System.out.println(((Car)x).id);
			System.out.println(((Car)x).name);
		}
		if (x instanceof Integer) {
		System.out.println((Integer)x);
		}
	}
	Iterator t=ls.iterator();
	while(t.hasNext()) {
		Object y=t.next();
		
	}
}}
