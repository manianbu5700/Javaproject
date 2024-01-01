package org.Constructor;
//Constructor

public class Create {
	public Create(){
		System.out.println("This is default or Non_Parameterized constructor");
		
	}
	public Create(int a){
		System.out.println("Parameterized Constructor:"+a);
	}
	public Create(int a ,int b) {
		int c=a+b;
		System.out.println("Parameterized constructor:"+c);
		
	}
	public Create(String name) {
		System.out.println("Enter the name:"+name);
	}
	

	public static void main(String[] args) {
		Create cs=new Create();
		new Create(15);
		new Create(12,12);
		new Create(" Manikandan ");
		
	
				
		

	}

}
