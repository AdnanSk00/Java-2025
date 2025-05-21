package tka_may2;

public class SortArray {
	public static void main(String[] args) {	// Uniqre number
		
		int a[] = {5, 6, 8, 4, -7};
		for(int item : a) {
			System.out.print(item + " ");
		}
		
		for(int i = 0; i < a.length; i++) {
			for(int j = i+1; j < a.length; j++) {
				if(a[i] > a[j]) {
					// swap
					int t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
		}
		System.out.println("\nSorted Array -");
		for(int item : a) {
			System.out.print(item + " ");
		}
		
		System.out.println("\nLargest > " + a[a.length-1]);
	
	}
}
