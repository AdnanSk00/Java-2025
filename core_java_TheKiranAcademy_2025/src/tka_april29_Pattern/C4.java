package tka_april29_Pattern;

public class C4 {
	public static void main(String[] args) {
		for(int i = 1; i <= 3; i++) {
			for(int j = 1; j <= i; j++) {
//				System.out.print("* ");
				if(j <= i)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println("------------------");
		for(int i = 3; i >= 1; i--) {
			for(int j = 1; j <= 3; j++) {
				if(j >= i && j <= 3) {
					System.out.print("* ");					
				}
				else {
					System.out.print("  ");										
				}
			}
			System.out.println();
		}
	}
}
