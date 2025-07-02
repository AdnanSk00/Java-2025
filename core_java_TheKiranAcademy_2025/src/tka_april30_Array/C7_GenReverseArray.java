package tka_april30_Array;

public class C7_GenReverseArray {
	public static void main(String[] args) {
		
		int arr[] = { 10, 20, 50, 30, 80 };
		
		int revArr[] = new int[arr.length];

		for(int i = 0, j = arr.length-1; j >= 0; i++,j--) {
			// i - 0, 1, 2, 3, 4
			// j - 4, 3, 2, 1, 0
			revArr[i] = arr[j];
		}
		
//		for(int i = 0; i < revArr.length; i++) {
//			revArr[i] = arr[arr.length-1-i];
//		}
		
		System.out.print("Print revArr[]  = ");
		for(int values : revArr) {
			System.out.print(values + " ");
		}
	}
}
