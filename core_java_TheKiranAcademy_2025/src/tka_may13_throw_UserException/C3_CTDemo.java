package tka_may13_throw_UserException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C3_CTDemo {
	public static void main(String[] args) {
		
		try {
//			int a = 1/ 0;	// raise --
			FileInputStream fis = new FileInputStream("adnsk.txt");	// Compiletime Exc - warning
//			FileInputStream fis = new FileInputStream("ss.txt");
			System.out.println("File Ready");
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
//		int a = 1 / 0;		// Runctime Exc - no warning			
		System.out.println("Thanks ***");
		
	}
}
