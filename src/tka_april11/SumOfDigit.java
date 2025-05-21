package tka_april11;

public class SumOfDigit {
	// n = 125  --> 1 + 2 + 5 = 8
	
	public static void main(String[] args) {
		
		int n = 125; 
		int rem = 0;
		int sum = 0;
		
		while(n > 0) {
			rem = n % 10;
			n = n / 10;
			sum = sum + rem;
		}
		System.out.println("Sum of Digit " + sum);
	}
}
