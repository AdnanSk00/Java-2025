package tka_may29_jdbc_1252;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

//import com.mysql.cj.jdbc.Driver;

public class C2_CreatInsertData {
	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/db_1252";
		String userId = "root";
		String pass = "root";
		
//		Connection con2 = DriverManager.getConnection(url, userId, pass);	// Mulitple connection
		Connection con = DriverManager.getConnection(url, userId, pass);
		System.out.println("Connection done...");
		
		Statement st = con.createStatement();	// new StatementImp();
		
		String query = "insert into student values(6, 'brook', 61.4)";
//		String query = "alter table student add rank int";
		
		int rowCount = st.executeUpdate(query);		// DML -- insert
		
		System.out.println(rowCount + " > Inserted successfully...");
		
		System.out.println("\n***** thanks ****");
		
	}
}
