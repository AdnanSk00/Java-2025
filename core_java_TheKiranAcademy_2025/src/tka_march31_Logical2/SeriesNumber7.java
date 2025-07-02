package tka_march31_Logical2;

import java.util.Scanner;

public class SeriesNumber7 {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter how many numbers you want to print in the series : ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            int value;
            if (i <= (n+1)/2) {
                value = (int) Math.pow(10, i - 1);
            } else {
                value = (int) Math.pow(10, n - i);
            }
            System.out.print(value + " ");
        }
        scanner.close();
    }
}
