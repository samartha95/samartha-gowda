package com.array;
import java.util.Scanner;

public class userinput {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size =sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter thr values");
		for(int i=0;i<size;i++)
			a[i]=sc.nextInt();
		System.out.println("The values are");
		for(int i=0;i<size;i++)
			System.out.println(a[i]);
		

	}

}
