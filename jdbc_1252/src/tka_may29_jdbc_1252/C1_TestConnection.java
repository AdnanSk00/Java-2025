package tka_may29_jdbc_1252;

import com.mysql.cj.jdbc.Driver;

import java.sql.DriverManager;

// Download jar - Maven repository for jdbc - connect.jar 8.0 version

public class C1_TestConnection {
	public static void main(String[] args) throws Exception {
		
//		System.out.println("hello");
		Driver d = new Driver();
//		
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver loaded...");

		String url = "jdbc:mysql://localhost:3306/db_1252";
		String userId = "Adnan";
		String pass = "root";
		DriverManager.getConnection(url, userId, pass);
//		
		System.out.println("connection done...");
		
		System.out.println("\n***** thanks ****");
		
	}
}
