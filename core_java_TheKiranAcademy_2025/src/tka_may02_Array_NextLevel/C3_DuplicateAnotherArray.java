package tka_may02_Array_NextLevel;

public class C3_DuplicateAnotherArray {
	public static void main(String[] args) {
		
		int a[] = { 3, 5, 6, 4, 7 };
		int b[] = { 7, 9, 6, 1, 8, 5 };
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < b.length; j++) {
				if(a[i] == b[j]) {
					System.out.println(a[i] + " found in both array" );
					break;
				}
			}
		}
	
	}
}
