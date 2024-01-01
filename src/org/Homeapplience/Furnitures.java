package org.Homeapplience;

import Com.Single.Bike;

public class Furnitures extends Electronics {
	//child class 1
	static void chair() {
		int c=20;
		System.out.println(c);
	}
	public void table() {
		int c=20;
		System.out.println(c);
	}
	public static void main(String []args) {
		Furnitures f=new Furnitures();
		f.fan();
		chair();
		f.Nail_cutter();
		f.phant();
		
	}

}
