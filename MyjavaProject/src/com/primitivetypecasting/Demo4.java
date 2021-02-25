package com.primitivetypecasting;

public class Demo4 {
	public static boolean isprime(int n) {
		int count =0;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0)
				count++;}
			return (count==0);}

	public static void main(String[] args){
		int a[]=new int[7];
		for(int i=0,n=333;i<a.length;n++) {
			if(isprime(n))
				a[i++]=n;}
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
		}	
		
	}


