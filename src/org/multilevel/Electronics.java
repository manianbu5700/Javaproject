package org.multilevel;

public class Electronics extends Subject {
	int c=10;
	public void fan() {
		int a=12+c;
		System.out.println(a);
	}
	public static void main(String[]args) {
		Electronics e=new Electronics();
		e.fan();
		e.maths();
		e.chair();
	}
	

}
