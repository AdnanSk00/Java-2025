package tka_may02_Array_NextLevel;

public class C1_SquareAnotherArray {
	public static void main(String[] args) {
		
		// Find 1st array element's square in another array
	
		int a[] = { 3, 5, 6, 4, 7 };
		int b[] = { 11, 9, 36, 77, 25, 16 };
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < b.length; j++) {
				if(a[i]*a[i] == b[j]) {
					System.out.println(a[i] + " square found " + b[j]);
					break;
				}
			}
		}
	
	}
}
