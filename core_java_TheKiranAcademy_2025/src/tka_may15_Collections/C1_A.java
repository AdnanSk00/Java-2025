package tka_may15_Collections;

import java.util.ArrayList;

public class C1_A {
	
	public static void main(String[] args) {
		// add, remove, size, get
		int a [] = new int [3];
		
		ArrayList al = new ArrayList();
		System.out.println("Size > " + al.size());
		
		al.add(11);		// .add(new Integer(11)) - soln in Typecasting.java
		
		boolean b = al.add("java");		// return boolean
		System.out.println(b);
		
		al.add(77.7f);
		al.add(77.8f);
		al.add(77.9f);
//		int t = 56;
//		al.add(t);		// int value object -->  new Integer(t)
		
		
//		al.remove(2);
//		al.remove(77.8f);	// int primitive
		boolean remove = al.remove("java");		// return boolean
		
		System.out.println(al);
		System.out.println("Size > " + al.size());
		
	}
}
