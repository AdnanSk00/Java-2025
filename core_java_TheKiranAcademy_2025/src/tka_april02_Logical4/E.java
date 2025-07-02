package tka_april02_Logical4;

public class E {
	public static void main(String[] args) {
		
		// Print number is prime or not using Count --
		int num = 16;
		int count = 0;
		
		for(int i = 1; i <= num; i++) {
			if(num % i == 0) {
				System.out.println(i);
				count++;
			}
		}
		System.out.println("% Count = " + count);
		if(count == 2)
			System.out.println(num + " is prime");
		else
			System.out.println(num + " is not prime");
	}
}
