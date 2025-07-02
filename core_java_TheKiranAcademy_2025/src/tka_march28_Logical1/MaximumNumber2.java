package tka_march28_Logical1;

import java.util.Scanner;

public class MaximumNumber2 {
	public static void main(String[] args) {
		
		// Using ternary operator --
		
		int num1, num2, num3, num4;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number : ");
		num1 = sc.nextInt();
		System.out.print("Enter second number : ");
		num2 = sc.nextInt();
		System.out.print("Enter third number : ");
		num3 = sc.nextInt();
		System.out.print("Enter fourth number : ");
		num4 = sc.nextInt();
		
		sc.close();
		
		
//		if(num1 > num2 && num1 > num3 && num1 > num4)
//			System.out.println(num1 + " is greater");
//		else
//			if(num2 > num3 && num2 > num4)
//				System.out.println(num2 + " is greater");
//			else
//				if(num3 > num4)
//					System.out.println(num3 + " is greater");
//				else
//					System.out.println(num4 + " is greater");
					
					
		int max = (num1 > num2 && num1 > num3 && num1 > num4) ? num1 :
				  (num2 > num3 && num2 > num4) ? num2 :
				  (num3 > num4) ? num3 : num4;
		System.out.println(max + " is greater");
						
	}
}
