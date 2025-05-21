package tka_march28;

public class HiiiHello {
	public static void main(String[] args) {
		for(int i = 1; i <= 9; i++) {
			if(i % 5 == 0) {
				System.out.println(i + " Welcome");
			}
			else if(i % 2 != 0) {				
				System.out.println(i + " Hello");				
			}
			else {
				System.out.println(i + " Hii");
			}
		}
	}
}
