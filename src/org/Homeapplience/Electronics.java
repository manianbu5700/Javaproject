package org.Homeapplience;

public class Electronics extends Cosmetics {
	//parent class
	public void fan() {
		int a=12;
		System.out.println(a);
	}
	public void mixer() {
		int a=10;
		System.out.println(a);
	}
	public static void main(String []args) {
		Electronics e=new Electronics();
		e.mixer();
		e.Nail_cutter();
		e.phant();
	}

}
