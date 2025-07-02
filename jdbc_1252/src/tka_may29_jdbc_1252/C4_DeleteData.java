package tka_may29_jdbc_1252;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

//import com.mysql.cj.jdbc.Driver;

public class C4_DeleteData {
	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/db_1252";
		String userId = "Adnan";
		String pass = "root";
		Connection con = DriverManager.getConnection(url, userId, pass);
		System.out.println("Connection done...");
		
		Statement st = con.createStatement();	// new StatementImp();
		
//		String query = "delete from student where name = 'sugar'";
		String query = "alter table student drop column age";
		
		int rowCount = st.executeUpdate(query);		// DML -- delete
		
		System.out.println(rowCount + " > Deleted successfully...");
		
		System.out.println("\n***** thanks ****");
		
	}
}
