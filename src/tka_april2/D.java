package tka_april2;

public class D {
	public static void main(String[] args) {
		
		// Print the full % factors of num --
		
		int num = 12;
		int count = 0;
		
		for(int i = 1; i <= num; i++) {
			if(num % i == 0) {
				System.out.println(i);
				count++;
			}
		}
		System.out.println("% Count = " + count);
		
	}
}
