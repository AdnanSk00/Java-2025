package tka_april30_Array;

public class C4_ArraySum {
	public static void main(String[] args) {
		
		int arr[] = { 10, 20, 50, 30, 10 };
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("Total Sum = " + sum);
		
	}
}
