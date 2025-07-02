package tka_may14_Throws_Finally;

import java.io.FileNotFoundException;

public class TestAB {
	public static void main(String[] args) throws FileNotFoundException {
		
//		A Raza = new A();
//		Raza.driveA();
		
		B Raja = new B();
		Raja.driveB();
//		try {
//			Raja.driveB();
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
//		
		System.out.println("Thanks...Exception Chaining | Exception Propogation");
	}

}
