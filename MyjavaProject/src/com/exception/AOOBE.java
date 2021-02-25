package com.exception;
import java.util.Scanner;

public class AOOBE {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]= {12,23,45};
		System.out.println("enter the index b/w 0-2 to get element");
		int i=sc.nextInt();
		try {
		System.out.println(a[i]);
		}
		catch(ArrayIndexOutOfBoundsException c){
			System.out.println("mad or wat?");
		}
	}

}
