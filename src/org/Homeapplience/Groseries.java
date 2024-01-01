package org.Homeapplience;

public class Groseries extends Electronics {
	//child class 2
	public void bag() {
		int d=20;
		System.out.println(d);
	}
	public void chair() {
		int c=20;
		System.out.println(c);
	}
	public static void main(String[]args) {
		Groseries g=new Groseries();
		g.fan();
		g.bag();
		g.Nail_cutter();
		g.phant();
	}

}
