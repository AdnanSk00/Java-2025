package tka_may14_throws_finally;

import java.io.FileOutputStream;

public class C5_Finally {
	public static void main(String[] args) {
		
		try {
			FileOutputStream fis = new FileOutputStream("tt.txt");
			System.out.println("File opened");
			int a = 1 / 1;
			System.out.println("1 data written");
			int a2 = 1 / 1;
			System.out.println("2 data written");
			int a3 = 1 / 0;
			System.out.println("3 data written");
			
//			System.out.println("try >>> File saved & closed");
		}
		catch(Exception e) {
			e.printStackTrace();
//			System.out.println("catch --- File saved & closed");
		}
		finally{
			System.out.println("Finally --- file saved & closed");
		}
	
		System.out.println("\n**** Thanks ****");
	}
}
