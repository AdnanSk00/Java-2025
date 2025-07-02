package tka_april30_Array;

public class C1_Array {
	// Array - Group of objects/elements
	// Array - Collection of similar type of data stored in a unit.
	
	public static void main(String[] args) {
		int a[] = {11, 22, 33, 44, 55, 66};		// static declaration
		int b[] = {101, 202, 303};
		
		int c[] = new int[5];					// dynamic declaration
		
		System.out.println("a[0] = " + a[0]);
		System.out.println("b[1] = " + b[1]);
		
		int size = a.length;
		System.out.println("Size : " + size);
		
		for (int i : a) {
			System.out.print(i + " ");
		}
		
	}
}	
