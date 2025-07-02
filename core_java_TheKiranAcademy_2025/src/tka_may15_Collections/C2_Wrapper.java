package tka_may15_Collections;

// Wrapper class of int - extra functionality

public class C2_Wrapper {
	public static void main(String[] args) {
		
		int a = 11;
		int sq = a * a;	// operation direct on primitive
		System.out.println(sq);
		
		char c = '5';
//		int c2 = (int)c ;
		int c2 = Character.getNumericValue(c); // ascii(53) to 5
		System.out.println(c2);
		int sqt = c2 * c2;	// char -- ascii --> numeric value [5]
		System.out.println(sqt);
		
	}
}
