package tka_april29_Pattern;

import java.util.Scanner;

public class C1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j <= i; j++) {				
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}
}
