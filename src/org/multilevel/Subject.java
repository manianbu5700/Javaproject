package org.multilevel;

public class Subject extends Furniture {
	public void maths() {
		int sub=10;
		System.out.println(sub);
	}
	public static void main(String[]args) {
		Subject s=new Subject();
		s.maths();
		s.chair();
	}

}
