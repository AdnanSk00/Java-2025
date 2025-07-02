package tka_may02_Array_NextLevel;

public class C2_SquareSameArr {
	public static void main(String[] args) {
		
		// Find 1st array element's square in Same array
	
		int a[] = { 3, 5, 16, 9, 4, 7 };
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a.length; j++) {
				if(i != j && a[i]*a[i] == a[j]) {
					System.out.println(a[i] + " square found " + a[i]*a[i]);
					break;
				}
			}
		}
	
	}
}
