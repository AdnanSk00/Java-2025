package tka_april29_Pattern;

public class A5 {
	public static void main(String[] args) {
		
//		for(int i = 1; i <= 3; i++) {}
//			for(int j = 1; j <= 4-i; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
		
		System.out.println("-------------");
		for(int i = 3; i >= 1; i--) {
			for(int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
