package tka_may29_jdbc_1252;

import java.sql.Connection;
//import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class C7_CRUDimp {
	
	Connection con = null;
	Statement st = null;
	String query = null;
	ResultSet rs = null;
	int rowCount = 0;
	
	void createStudent() {
		con = C8_MyDBConf.getMyDBConnection();
		
		try {
			st = con.createStatement();					// new StatementImp();
			
			query = "insert into student values(15, 'tom', 46.1)";
//			query = "alter table student add age int";
			
			rowCount = st.executeUpdate(query);		// DML -- insert
			
			System.out.println(rowCount + " > Inserted successfully...");
			
			System.out.println("\n***** thanks ****");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	void displayStudent() {
		con = C8_MyDBConf.getMyDBConnection();
		
		try {
			st = con.createStatement();		// new StatementImp();
			
//			query = "select * from product";
			query = "select * from student";
				
			rs = st.executeQuery(query);		// DQL -- select  arr[][]
//			System.out.println(rs);						// point to columns name row
				
//			boolean IsNext = rs.next();					// point to 1st row --> limit 2
//			System.out.println("IsNext > " + IsNext);
				
//			Note:- row data index start 0,1,2... while column start 1,2,3...
			
			System.out.println("Id Name Per");
			while(rs.next()) {			
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getFloat(3));
			}
			System.out.println("\n***** thanks ****");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	void updateStudent() {
		con = C8_MyDBConf.getMyDBConnection();
		
		try {
			st = con.createStatement();		// new StatementImp();
			
//			query = "update student set per = 90.67 where sid = 2";
			query = "update student set sid = 19 where name = 'Roy'";
			
			rowCount = st.executeUpdate(query);		// DML -- update
			
			System.out.println(rowCount + " > Updated successfully...");
			
			System.out.println("\n***** thanks ****");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	void deleteStudent() {
		con = C8_MyDBConf.getMyDBConnection();
		
		try {
			st = con.createStatement();		// new StatementImp();
			
//			query = "delete from student where name = 'sugar'";
			query = "alter table student drop column age";
			
			rowCount = st.executeUpdate(query);		// DML -- delete
			
			System.out.println(rowCount + " > Deleted successfully...");
			
			System.out.println("\n***** thanks ****");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
}
