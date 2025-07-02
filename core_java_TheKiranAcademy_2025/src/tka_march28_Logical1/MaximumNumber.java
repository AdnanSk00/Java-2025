package tka_march28_Logical1;

import java.util.Scanner;

public class MaximumNumber {
	public static void main(String[] args) {
		
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number : ");
		a = sc.nextInt();
		System.out.print("Enter second number : ");
		b = sc.nextInt();
		System.out.print("Enter third number : ");
		c = sc.nextInt();
		
		sc.close();
		
//		if(a>b && a>c)
//			System.out.println(a + " is greater");
//		else if(b>a && b>c)
//			System.out.println(b + " is greater");
//		else
//			System.out.println(c + " is greater");
			
		int z = (a>b)? (a>c? a : c) : (b>c? b : c);
		System.out.println(z + " is greater");
		
		int res = (a>b && a>c)? a : (b>a && b>c)? b : c;
		System.out.println(res + " is greater");
	}
}
