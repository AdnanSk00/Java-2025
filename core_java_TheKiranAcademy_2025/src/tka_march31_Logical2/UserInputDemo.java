package tka_march31_Logical2;

import java.util.Scanner;

public class UserInputDemo {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter char value : ");
		char c = sc.next().charAt(0);
		System.out.println("c --> " + c);
		
		System.out.print("Enter float value : ");
		float f = sc.nextFloat();
		System.out.println("f --> " + f);
		
		System.out.print("Enter int value : ");
		int i = sc.nextInt();
		System.out.println("i --> " + i);
		
		System.out.print("Enter String value : ");
		String s = sc.next();
		System.out.println("s --> " + s);
		
		sc.close();
	}
}
