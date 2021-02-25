package com.constructor;

public class BoxOffice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie ob1=new Movie("PAILWAN",2019,"****");
		Movie ob2=new Movie("KGF",2018,"*****");
		Movie ob3=new Movie("AIRAVATHA",2017,"**");
		System.out.println("Movie: "+ob1.Name+" Rating: "+ob1.Rating+" Year of relaese: "+ob1.YOR);
		System.out.println("Movie: "+ob2.Name+" Rating: "+ob2.Rating+" Year of relaese: "+ob2.YOR);
		System.out.println("Movie: "+ob3.Name+" Rating: "+ob3.Rating+" Year of relaese: "+ob3.YOR);
		
		
	}

}
