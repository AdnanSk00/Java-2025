package tka_may14_throws_finally;

import java.io.FileNotFoundException;

public class C2_B {

	public void driveB() throws Exception {	// Raj
		// KTM
		
		C1_A razaFrnd = new C1_A();
		razaFrnd.useBike();
		
//		try {
//			System.out.println("Raja is taking bike---");
//			razaFrnd.useBike();
//		} catch (Exception e) {
//			System.out.println("Raja filling petrol");
//			e.printStackTrace();
//		}
		
		System.out.println("2 Raja Driving...");
	}
	
}
