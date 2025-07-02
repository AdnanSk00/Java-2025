package tka_march28_Logical1;

import java.util.Scanner;

public class simpleInterest {
	
	public static void main(String[] args) {
		
		// Calculate simple interest
		// Calculate profit and loss taking cost and selling price
		// swapping two numbers without using 3rd variable..
		
		// post & pre -- 3 example
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your cost : ");
		int cost = input.nextInt();
		System.out.print("Enter your selling price : ");
		int sellPrice = input.nextInt();
		
		if(cost < sellPrice) {
			double profit = sellPrice - cost;
			System.out.println("Your profit is " + profit + " Rs means " + (profit/cost)*100 + " %");
		}
		else {
			double lost = cost - sellPrice;
			System.out.println("Your lost is " + lost + " Rs means " + (lost/cost)*100 + " %");
		}
		
		input.close();
	}
}
