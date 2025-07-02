package tka_may09_File;

import java.io.File;
import java.io.FileOutputStream;

public class C4_WritingStringData {
	public static void main(String[] args) throws Exception {
		// Write data from java application to file
		 
		String str = "TKA Hadapsar, Pune";
		
		// Convert String to byte[]			// primitive
		
		byte[] strArr = str.getBytes();
//		byte [] data = {87, 55, 34, 98, 99, 101};	
		
		File f1 = new File("ss.txt");
		
		FileOutputStream fos = new FileOutputStream(f1);
//		fos.write(data);
		fos.write(strArr);
		System.out.println("File written successfullyy");
		
		// end file --> -1
		
		fos.close();
	}
}
