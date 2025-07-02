package tka_march31_Logical2;

import java.util.Scanner;

public class SeriesNumber6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter no : ");
		int number = input.nextInt();
//		for(int i = 1; i <= number; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print(j);
//			}
//			System.out.print(" ");
//		}
		
		int count = 0;
		for(int i = 1; i <= number; i++) {
			count = (count * 10) + i;
			System.out.print(count + " ");
		}
		input.close();
	}
}
