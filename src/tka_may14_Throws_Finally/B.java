package tka_may14_Throws_Finally;

import java.io.FileNotFoundException;

public class B {

	public void driveB() throws FileNotFoundException {	// Raja
		// KTM
		
		A razaFrnd = new A();
		razaFrnd.useBike();
		
//		try {
//			razaFrnd.useBike();
//		} catch (Exception e) {
//			System.out.println("Raja filling petrol");
////			e.printStackTrace();
//		}
		
		System.out.println("2 Raja Driving...");
	}
	
}
