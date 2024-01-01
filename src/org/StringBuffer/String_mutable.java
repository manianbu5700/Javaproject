package org.StringBuffer;

public class String_mutable {
	public static void main(String[] args) {
		//String s1="Poun";
		//String s2="Mani";
		//String concat = s1.concat(s2);
//		System.out.println(concat);
		//System.out.println(System.identityHashCode(concat));
		StringBuffer s1=new StringBuffer("Java");
		StringBuffer s2=new StringBuffer("Program");
		StringBuffer append = s1.append(s2);
		System.out.println(append);
		System.out.println(System.identityHashCode(append));
		StringBuffer append1 = s2.append(s1);
		System.out.println(append1);
		System.out.println(System.identityHashCode(append1));
		
		
		
		
		}

}
