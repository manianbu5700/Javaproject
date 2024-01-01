package org.Interface;

public class Execute implements Manditate,Create{
	
	
	@Override
	public void comp() {
		System.out.println("Enter the comp statement");
		
	}

	@Override
	public void org() {
		System.out.println("Enter the org statement");
		
	}

	@Override
	public void run() {
		System.out.println("Enter the run statement");
	}

	@Override
	public void go() {
	System.out.println("Enter the Ongoing statement");	
		
	}
	void change(){
		System.out.println("Make Changes");
	}
public static void main(String[] args) {
	Execute ex=new Execute();
	ex.comp();
	ex.org();
	ex.run();
	ex.go();
	ex.change();
		
	}

	

}
