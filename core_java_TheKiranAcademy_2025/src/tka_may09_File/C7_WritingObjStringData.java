package tka_may09_File;

import java.io.File;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class C7_WritingObjStringData {
	public static void main(String[] args) throws Exception {
		// Write data from java application to file
		 
		String s = "Raj";
		
		// Convert String to byte[]			// Object - non primitive

		File f1 = new File("str.txt");
		
		OutputStream fos = new FileOutputStream(f1);
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(s);		// -- Seriallizable type object
		System.out.println("String written successfullyy");
		
		// end file --> -1
		
		fos.close();
	}
}
