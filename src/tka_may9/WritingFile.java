package tka_may9;

import java.io.File;
import java.io.FileOutputStream;

public class WritingFile {
	public static void main(String[] args) throws Exception {
		// Write data from java application to file
		 
//		int data = 65;		// primitive
		byte [] data = {87, 55, 34, 65, 97, 98, 99, 101};		
		File f1 = new File("ww.txt");
		
		FileOutputStream fos = new FileOutputStream(f1);
		fos.write(data);
		System.out.println("File written successfullyy");
		
		// end file --> -1
		
		fos.close();
	}
}
