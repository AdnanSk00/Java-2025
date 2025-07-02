package tka_may09_File;

import java.io.File;
import java.io.FileOutputStream;

public class C3_WritingFile {
	public static void main(String[] args) throws Exception {
		// Write data from java application to file
		 
//		int data = 65;		// primitive
		byte [] data = {87, 49, 55, 34, 65, 97, 98, 99, 101};		
		File f1 = new File("ww.txt");
		
		FileOutputStream fos = new FileOutputStream(f1);
		fos.write(data);
		System.out.println("File written successfullyy");
		
		// end file --> -1
		
		fos.close();
	}
}
