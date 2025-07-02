package tka_may29_jdbc_1252;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

//import com.mysql.cj.jdbc.Driver;

public class C5_DisplayData {
	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/db_1252";
		String userId = "Adnan";
		String pass = "root";
		Connection con = DriverManager.getConnection(url, userId, pass);
		System.out.println("Connection done...\n");
		
		Statement st = con.createStatement();	// new StatementImp();
		
//		String query = "select * from product";
		String query = "select * from student";
//		String query = "select max(Per) from student";
		
		ResultSet rs = st.executeQuery(query);		// DQL -- select  arr[][]
		
//		System.out.println(rs);		// point to columns name's row
		
//		boolean IsNext = rs.next();			// point to 1st row --> limit 2
//		System.out.println("IsNext > " + IsNext);
		
//		Note:- row data index start 0,1,2... while column start 1,2,3...
		
		System.out.println("Id Name Per Age");
		int maxPer = 0;
		while(rs.next()) {			
//			rs.getInt(1);
//			rs.getString(2);
//			maxPer = rs.getInt(1);
			System.out.println(rs.getInt(1) + " "+ rs.getString(2) + " "+ rs.getFloat(3));
		}
		System.out.println(maxPer);
		
		System.out.println("\n***** thanks ****");
		
	}
}
