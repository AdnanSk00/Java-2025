package tka_march28_Logical1;

public class MatrixOfNumber {
	public static void main(String[] args) {
		int n = 9;
		for(int i = 1; i <= n; i++) {
			System.out.print(i + " ");
			if(i%3==0) {
				System.out.println();
			}
		}
	}
}
