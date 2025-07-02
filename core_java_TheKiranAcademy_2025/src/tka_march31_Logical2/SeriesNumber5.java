package tka_march31_Logical2;

import java.util.Scanner;

public class SeriesNumber5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter no : ");
		int number = input.nextInt();
		int count = 1;
		for (int i = 1; i <= number; i++) {
			System.out.print(count + " ");
			count = count * 10;
		}
		input.close();
	}
}
