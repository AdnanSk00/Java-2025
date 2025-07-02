package tka_april11_Logical6;

public class C2_PerfectNo {
	
	public static void main(String[] args) {
		
		int n = 6; 
		int sum = 0;
		
		for(int i = 1; i<=n/2; i++) {
			if(n%i==0) {
				sum = sum + i;
				System.out.println("% Factor : " + i);
			}
		}
		System.out.println("Sum of Digit " + sum);
		if(n == sum) {
			System.out.println(n + " is perfect number");
		}
		else {
			System.out.println(n + " is not perfect");
		}
		
		
//		for(int i = 1; i<=100; i++) {
//			int sum1 = 0;
//			for(int j = 1; j<=i/2; j++) {
//				if(i%j==0) {
//					sum1 = sum1 + j;
//				}
//			}
//			if(i == sum1) {
//				System.out.println("Perfect no: " + i);
//			}
//			
//		}
	}
}