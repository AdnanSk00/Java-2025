package tka_april30_Array;

import java.util.Scanner;

public class C2_ArrayOfInput {
	public static void main(String[] args) {
		
		System.out.println("-----------------");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Size : ");
		int size1= sc.nextInt();
		int arr[] = new int[size1];
		
		for(int i = 0; i < size1; i++) {
			System.out.print("Enter element at " + i + " - ");
			arr[i] = sc.nextInt();
		}
		for(int items : arr) {
			System.out.print(items + " ");
		}
		
		sc.close();
	}
}
