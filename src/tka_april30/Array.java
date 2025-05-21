package tka_april30;

public class Array {
	// Array - Group of objects/elements
	// Array - Collection of similar type of data stored in a unit.
	
	public static void main(String[] args) {
		int a[] = {11, 22, 33, 44, 55, 66};
		int b[] = {101, 202, 303};
		
		System.out.println("a[0] = " + a[0]);
		System.out.println("b[1] = " + b[1]);
		
		int size = a.length;
		System.out.println("Size : " + size);
		
		for (int i : a) {
			System.out.print(i + " ");
		}
		
	}
}	
