package tka_may02_Array_NextLevel;

public class C8_RemoveZero {
	public static void main(String[] args) {
		
		int a[] = {3, 5, 7, 0, 2, 0, 4, 0, 9};
		
		int zeroCount = 0;
		for(int i = 0; i < a.length; i++) {
			for(int j = i+1; j < a.length; j++) {
				if(a[i] < a[j]) {
					int t = a[i];		// swap
					a[i] = a[j];
					a[j] = t;
				}
			}
			if(a[i]==0) {
				zeroCount++;
			}
		}
		System.out.print("Sorted Array - ");
		for(int item : a) {
			System.out.print(item + " ");
		}
		System.out.print("\nNon Zero Array - ");
		int nonZeroArr[] = new int[a.length-zeroCount];
		for(int i = 0; i < nonZeroArr.length; i++) {
			nonZeroArr[i] = a[i];
			System.out.print(nonZeroArr[i] + " ");
		}
	}
}
