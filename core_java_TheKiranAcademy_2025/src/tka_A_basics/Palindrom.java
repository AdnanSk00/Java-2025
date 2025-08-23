package tka_A_basics;

import java.util.Scanner;

public class Palindrom {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		
		int realNo = n;
		int rem = 0, reverse = 0;
		while(n>0) {
			rem = n % 10;
			reverse = (reverse*10) + rem;
			n = n / 10;
		}
		System.out.println("Reverse Number : " + reverse);
		if(realNo == reverse) {
			System.out.println(realNo + " is an Arsmstrong Number");
		}
		else {
			System.out.println(realNo + " is not an Arsmstrong Number");
		}
		
	}
}
