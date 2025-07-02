package tka_april30_Array;

public class C6_CopyOneToOne {
	
	public static void main(String[] args) {
		
		int arr[] = { 10, 20, 50, 30, 80 };
		
		int copyArr[] = new int[arr.length];

		copyArr = arr;
		
		System.out.print("Print CopyArr[] = ");
		for(int values : copyArr) {
			System.out.print(values + " ");
		}
		
	}
}
