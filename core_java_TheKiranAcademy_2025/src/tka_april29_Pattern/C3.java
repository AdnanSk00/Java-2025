package tka_april29_Pattern;

import java.util.Scanner;

public class C3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		
		System.out.println(65);
		System.out.println((char)65);
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {				
				System.out.print((char)(j + 64) + " ");
			}
			System.out.println();
		}
		
		System.out.println("-----------");
		
		System.out.println('A');
		System.out.println((int)'A');
		
		for(char i = 'a'; i <= 'c'; i++) {
			for(char j = 'a'; j <= 'c'; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
