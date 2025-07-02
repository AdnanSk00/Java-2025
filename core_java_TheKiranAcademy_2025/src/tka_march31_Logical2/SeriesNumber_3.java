package tka_march31_Logical2;

import java.util.Scanner;

public class SeriesNumber_3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter no : ");
		int number = input.nextInt();
		input.close();
		
		for(int i = 1; i<=number; i++) {
			if(i%2==1) {
			System.out.print(i*i + " ");
			}
			else { 
				System.out.print("-"+i*i + " ");
			}
		}
	}
}
