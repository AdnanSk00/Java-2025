package tka_may09_File;

import java.io.File;
import java.io.FileInputStream;

public class C1_ReadingFile {
	public static void main(String[] args) throws Exception {
		// Reading data from file to java application

		System.out.println("***Welcome...\n");
//		String path = "C:\\Adnan Shaikh\\notepadFile.txt";
		String path = "G:\\NotepadFIles\\notepadFile.txt";

		File f1 = new File(path);

		FileInputStream fis = new FileInputStream(f1);
		
		int b = fis.read();		// java --> int default
//		System.out.println((char)b);		// int data - char
		
//		b = fis.read();
//		System.out.println((char)b);
		
		while(b != -1) {
			System.out.print((char)b);
			b = fis.read();
		}
		// end file --> -1
		
		System.out.println("\n***Thanks");
		
		fis.close();
	}
}
