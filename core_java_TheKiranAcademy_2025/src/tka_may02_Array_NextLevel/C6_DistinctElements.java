package tka_may02_Array_NextLevel;

public class C6_DistinctElements {
	public static void main(String[] args) {	// Uniqre number
		
		int a[] = { 3, 5, 6, 4, 3, 7, 6, 3, 4 };
		
		for(int i = 0; i < a.length; i++) {
			for(int j = i+1; j < a.length; j++) {
				if(a[i] == a[j]) {
					a[j] = 0;
				}
			}
			if(a[i] != 0)
				System.out.println(a[i]);					
		}
	
	}
}
