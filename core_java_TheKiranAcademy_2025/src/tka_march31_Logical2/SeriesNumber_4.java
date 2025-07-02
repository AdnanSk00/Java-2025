package tka_march31_Logical2;

import java.util.Scanner;

public class SeriesNumber_4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter no : ");
		int number = input.nextInt();
//		for(int i = 1; i<=number; i++) {
//			int count = 1;
//			for(int j = 1; j<2*i; j++) {
//				if(i>=j) {
//					System.out.print(j);									
//				}
//				else {
//					System.out.print(i - count);									
//					count ++;
//				}
//			}
//			System.out.print(" ");									
//		}
		
		int a = 1;
		for(int i = 1; i <= number; i++) {
			System.out.print((a*a) + " ");
			a = (a * 10) + 1;
		}
		input.close();
	}
}
