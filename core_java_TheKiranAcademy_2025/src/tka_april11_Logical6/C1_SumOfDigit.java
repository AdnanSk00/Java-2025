package tka_april11_Logical6;

public class C1_SumOfDigit {
	// n = 125  --> 1 + 2 + 5 = 8
	
	public static void main(String[] args) {
		
		int n = 125; 
		int rem = 0;
		int sum = 0;
		
		while(n > 0) {
			rem = n % 10;
			sum = sum + rem;
			n = n / 10;
		}
		System.out.println("Sum of Digit - " + sum);
	}
}
