package tka_march31_Logical2;

import java.util.Scanner;

public class SeriesNumber_2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter no : ");
		int number = input.nextInt();
		input.close();
		
		int count = 0;
		for(int i = 1; i<=number; i++) {
			System.out.print(count  + " ");
			count += i;
		}
	}
}
