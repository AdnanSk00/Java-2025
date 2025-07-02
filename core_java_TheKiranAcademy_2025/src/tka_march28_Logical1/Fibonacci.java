package tka_march28_Logical1;

public class Fibonacci {

	public static void main(String[] args) {
		
		// Fibonacci Series - 0 1 1 2 3 5 8 13 21 34 55
		
		int a = 0, b = 1, n = 10;
		
		System.out.print(a + " " + b + " ");
		
		
		for(int i = 3; i <= n; i++) {
			int c = a + b;
			System.out.print(c + " ");
			a = b;
			b = c;			
		}
		
	}

}
