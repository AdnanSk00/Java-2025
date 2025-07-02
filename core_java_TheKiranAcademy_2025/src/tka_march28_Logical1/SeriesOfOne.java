package tka_march28_Logical1;

public class SeriesOfOne {
	public static void main(String[] args) {
//		int n = 5;
//		for(int i = 1; i <= n; i++) {
//			for(int j = 1; j <= i; j++) {
//				System.out.print("1");
//			}
//			System.out.print(" ");
//		}
		
		int a = 1;
		
		for(int i = 1; i <= 4; i++) {
			System.out.print(a + " ");
			a = (a * 10) + 1;
		}
	}
}
