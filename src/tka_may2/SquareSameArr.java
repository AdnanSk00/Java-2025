package tka_may2;

public class SquareSameArr {
	public static void main(String[] args) {
		
		// Find 1st array element's square in another array
	
		int a[] = { 3, 5, 16, 9, 4, 7 };
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a.length; j++) {
				if(a[i]*a[i] == a[j] && i != j) {
					System.out.println(a[i] + " square found " + a[i]*a[i]);
					break;
				}
			}
		}
	
	}
}
