package tka_may09_File;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class C8_ReadingEmployeeData {
	public static void main(String[] args) throws Exception {
		// De-serialization - Read Object data from file to java application
		 
		
		File f1 = new File("emp.txt");
		
		InputStream fis = new FileInputStream(f1);
		
		ObjectInputStream ois = new ObjectInputStream(fis);		// object - non primitive
		
		Object objectData = ois.readObject();
		
		System.out.println(objectData);
		System.out.println("Read successfully...");
		
		// end file --> -1
		
		ois.close();
	}
}
