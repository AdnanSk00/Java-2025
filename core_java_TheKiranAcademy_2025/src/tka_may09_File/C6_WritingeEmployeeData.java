package tka_may09_File;

import java.io.File;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class C6_WritingeEmployeeData {
	public static void main(String[] args) throws Exception {
		// Serialization - Write Object data from java to file
		 
		C5_Employee e = new C5_Employee(1, "Karan", 77000);
		
		// Convert Employee to byte[]		// object - non primitive

		File f1 = new File("emp.txt");
		
		OutputStream fos = new FileOutputStream(f1);
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(e);
		System.out.println("Emp written successfullyy");
		
		// end file --> -1
		
		fos.close();
	}
}
