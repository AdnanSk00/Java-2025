package tka_april29_Pattern;

public class C5 {
	public static void main(String[] args) {
		for(int i = 1; i <= 3; i++) {
			for(int j = 1; j <= 4-i; j++) {
				System.out.print("* ");
//				if(j <= 3-1+i)
//					System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("------------");
		for(int i = 1; i <= 3; i++) {
			for(int j = 1; j <= 3; j++) {
//				System.out.print("* ");
				if(j >= i && j <= 3)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
	}
}
