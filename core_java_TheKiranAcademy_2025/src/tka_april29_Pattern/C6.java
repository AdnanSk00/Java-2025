package tka_april29_Pattern;

public class C6 {
	public static void main(String[] args) {
		int p = 1;
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= p; j++) {
				System.out.print("* ");
			}
			System.out.println();
			if(i < 3)
				p++;
			else
				p--;
		}
		System.out.println("-----------");
		int m = 3, n = 3;
		for(int i = 1; i <= 3; i++, m--, n++){
			for(int j = 1; j <= 5; j++){
				if(j >= m && j <= n)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println("-----------");
		// Without m & n
		for(int i = 1; i <= 3; i++, m--, n++){
			for(int j = 1; j <= i+2; j++){
				if(j >= 4-i)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}
