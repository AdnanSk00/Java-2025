package tka_april02_Logical4;

public class B {
	public static void main(String[] args) {
		
		for (int i = 1, j = 10; i <= 5; i++, j--) {
			System.out.println(i + " -- " + j);	
		}
		System.out.println();
		
		
		for(int i = 1, j = 10, k = 50; i <= 5 || i<j;  i++, j--, k++) {
			System.out.println(i + " -- " + j + " -- " + k);
		}
	}
}
