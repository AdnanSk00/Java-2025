package tka_may29_jdbc_1252;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

//import com.mysql.cj.jdbc.Driver;

public class C3_UpdateData {
	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/db_1252";
		String userId = "Adnan";
		String pass = "root";
		Connection con = DriverManager.getConnection(url, userId, pass);
		System.out.println("Connection done...");
		
		Statement st = con.createStatement();	// new StatementImp();
		
		String query = "update student set per = 90.67 where id = 2";
//		String query = "update student set name = 'sugar' where sid = 9";
//		String query = "update student set age = 18 where sid = 15";
		
		int rowCount = st.executeUpdate(query);		// DML -- update
		
		System.out.println(rowCount + " > Updated successfully...");
		
		System.out.println("\n***** thanks ****");
		
	}
}
