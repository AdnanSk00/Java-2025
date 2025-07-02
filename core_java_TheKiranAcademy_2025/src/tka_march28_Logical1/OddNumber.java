package tka_march28_Logical1;

import java.util.Scanner;

public class OddNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number : ");
		int number = input.nextInt();
		
		int i = 1;
		while(i<=number) {
			System.out.print(i + " ");
			i += 2;
		}
		
		input.close();
	}
}
