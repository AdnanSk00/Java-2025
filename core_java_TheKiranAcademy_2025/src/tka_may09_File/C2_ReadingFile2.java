package tka_may09_File;

import java.io.File;
import java.io.FileInputStream;

public class C2_ReadingFile2 {
	public static void main(String[] args) throws Exception {
		// Reading data from file to java application
		 
//		String path = "C:\\Adnan Shaikh\\notepadFile.txt";
		
		File f1 = new File("aaa.txt");
		
		FileInputStream FIS = new FileInputStream(f1);
		
		int b = FIS.read();
		
		while(b != -1) {
			System.out.print((char)b);	// A - 65
			b = FIS.read();		// -1
		}
		// end file --> -1
		FIS.close();
	}
}
