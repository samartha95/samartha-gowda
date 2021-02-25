package com.isa;

public class Smartphone extends Mobile{
	String brand;
	String os;
	double version;
	Smartphone(){}
	Smartphone(String type,boolean touchscreen,String brand,String os,double version){
		super(type,touchscreen);
		this.brand=brand;
		this.os=os;
		this.version=version;
	}

	public static void main(String[] args) {
		Smartphone ob=new Smartphone("Smartphone",true,"1+","Andriod",9.2);
		System.out.println("Mobile info: "+ob.type+" Touchscreen: "+ob.touchscreen+" Brand: "+ob.brand+" "+ob.os+" "+ob.version);
	}

}
