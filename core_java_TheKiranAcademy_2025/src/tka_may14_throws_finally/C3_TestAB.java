package tka_may14_throws_finally;

import java.io.FileNotFoundException;

public class C3_TestAB {
	public static void main(String[] args) throws Exception {
		
//		A Raza = new A();
//		Raza.driveA();
		
		System.out.println("Code of above exception is executing");
		
		C2_B Raja = new C2_B();
		Raja.driveB();
		
//		try {
//			Raja.driveB();
//		} catch (Exception e) {
////			e.printStackTrace();
//		}
		
		System.out.println("Thanks...Exception Chaining | Exception Propogation");
	}

}
