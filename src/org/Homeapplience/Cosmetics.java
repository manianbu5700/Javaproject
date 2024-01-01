package org.Homeapplience;
  
public class Cosmetics extends Dresses {
	//Grand parant class 2
	public void Nail_cutter() {
		int a=17;
		System.out.println(a);
	}

	public static void main(String []args) {
		Cosmetics c=new Cosmetics();
		c.Nail_cutter();
		c.phant();
	}
}
