package tka_may29_jdbc_1252;

import java.sql.Connection;
import java.sql.DriverManager;

public class C8_MyDBConf {
	
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
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}

}
