package com.arraylist;
import java.util.ArrayList;

public class AL1 {
	public static void main(String[] args) {
	ArrayList al=new ArrayList();
	System.out.println(al.size());
	al.isEmpty();
	al.add(20);
	al.add("samartha");
	al.add("ok");
	al.add(2423);
	al.add(2, "bye");
	al.add(4, "last");
	System.out.println(al.contains(20));
	al.remove(5);
	System.out.println(al);
	al.add("bye");
	System.out.println(al.indexOf("bye"));
	System.out.println(al.lastIndexOf("bye"));
	System.out.println(al.contains(20));
	System.out.println(al);
}
}