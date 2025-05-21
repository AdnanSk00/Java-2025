package tka_april30;

public class Reverse {
	public static void main(String[] args) {
		
		int arr[] = { 10, 20, 50, 30, 80 };
		
		for(int i = arr.length-1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
	}
}
