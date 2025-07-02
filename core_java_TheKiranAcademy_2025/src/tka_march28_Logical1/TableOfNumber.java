package tka_march28_Logical1;

import java.util.Scanner;

public class TableOfNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number : ");
		int number = input.nextInt();
		
		int i = 1;
		while(i<=10) {
			System.out.print(number*i + " ");
			i += 1;
		}
		
		input.close();
	}
}
