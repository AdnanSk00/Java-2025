package tka_march31_Logical2;

import java.util.Scanner;

public class SeriesNumber_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter no : ");
		int number = input.nextInt();
		int count = 1;
		
//		for(int i = 1; i<number*2; i++) {
//			if(i > number) {
//				System.out.print(number - count + " ");
//				count++;
//			}
//			else {				
//				System.out.print(i + " ");
//			}
//			
//		}
		
		for(int i = 1; i <= number; i++) {
			System.out.print(count + " ");
			if(i < (number+1)/2) {
				count++;
			}else {
				count--;
			}
		}
		input.close();
	}
}
