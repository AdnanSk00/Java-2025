package tka_april01_Logical3;

public class ZeroPosOrNeg {
	public static void main(String[] args) {
		
		int n = -8;
		
		if(n==0) {
			System.out.println(n + " is zero");
		}
		else {
			if(n>0)
				System.out.println(n + " is positive");
			else
				System.out.println(n + " is negative");
		}
	}
}
