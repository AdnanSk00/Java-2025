package tka_may30_State_prepStatement;

import java.sql.Connection;
import java.sql.DriverManager;

public class C3_MyDBConf {
	
	static String url = null;
	static String userId = null;
	static String pass = null;
	static Connection con = null;
	
	public static Connection getMyDBConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			url = "jdbc:mysql://localhost:3306/db_1252";
			userId = "Adnan";
			pass = "root";
			con = DriverManager.getConnection(url, userId, pass);
			System.out.println("Connection done...");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}

}
