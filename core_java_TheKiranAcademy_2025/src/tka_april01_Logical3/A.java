package tka_april01_Logical3;

public class A {
	public static void main(String[] args) {
		
		int a = 10, b = 50;		// Max ?? == 50
		int max;
		
//		boolean res = a > b;	// 10 > 5 -->
		
//		System.out.println("Res : " + res);
		
//		if(res == true) {
		if(a>b) {
			max = a;
		}
		else {
			max = b;
		}
		System.out.println("Maximum : " + max);
	}
}
