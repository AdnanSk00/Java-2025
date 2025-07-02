package tka_march28_Logical1;

import java.util.Scanner;

public class FibonacciSeries {
	
//	Fibonacci Series - 0 1 1 2 3 5 8 13 21 34
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number : ");
		int number = input.nextInt();				
		
		int a = 0, b = 1, sum = 0;
		for(int i = 1; i <= number; i++) {
			System.out.print(sum + " ");
			a = b;
			b = sum;
			sum = a + b;
		}
		
		input.close();
	}
	
}
