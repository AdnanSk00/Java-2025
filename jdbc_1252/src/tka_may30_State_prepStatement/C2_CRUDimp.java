package tka_may30_State_prepStatement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class C2_CRUDimp {
	
	Connection con = null;
	Statement st = null;
	String query = null;
	ResultSet rs = null;
	int rowCount = 0;
	
	void createStudent() {
		con = C3_MyDBConf.getMyDBConnection();
		
		try {
			st = con.createStatement();					// new StatementImp();
			
//			query = "create table food (id int, name varchar(45), price float)";
//			query = "insert into food values (1, 'Biryani', 120), (2, 'Pizza', 350), (3, 'Paneer', 250) ";
//			query = "alter table food add Quantity varchar(45)";
			query = "insert into food values (4, 'Khichdi', 40, 'full')";
			
			rowCount = st.executeUpdate(query);		// DML -- insert
			
			System.out.println(rowCount + " > Inserted successfully...");
			
			System.out.println("\n***** thanks ****");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	void displayStudent() {
		con = C3_MyDBConf.getMyDBConnection();
		
		try {
			st = con.createStatement();		// new StatementImp();
			
//			query = "select * from product";
//			query = "select * from student";
			query = "select * from food";
//			query = "select * from student2";
				
			rs = st.executeQuery(query);		// DQL -- select  arr[][]
//			System.out.println(rs);						// point to columns name row
				
//			boolean IsNext = rs.next();					// point to 1st row --> limit 2
//			System.out.println("IsNext > " + IsNext);
				
//			Note:- row data index start 0,1,2... while column start 1,2,3...
			
			System.out.println("Id Name Price Quantity");
//			System.out.println("Id  Name  Per");
			while(rs.next()) {			
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getFloat(3) + "  " + rs.getString(4));
//				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getFloat(3));
			}
			System.out.println("\n***** thanks ****");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	void updateStudent() {
		con = C3_MyDBConf.getMyDBConnection();
		
		try {
			st = con.createStatement();		// new StatementImp();
			
//			query = "update student set per = 90.67 where sid = 2";
//			query = "update student set sid = 19 where name = 'Roy'";
//			query = "update food set price = 150 where name = 'Biryani'";
//			query = "update food set Quantity = 'full' where name = 'Biryani'";
			query = "update food set Price = 100 where id = 4";
			
			rowCount = st.executeUpdate(query);		// DML -- update
			
			System.out.println(rowCount + " > Updated successfully...");
			
			System.out.println("\n***** thanks ****");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	void deleteStudent() {
		con = C3_MyDBConf.getMyDBConnection();
		
		try {
			st = con.createStatement();		// new StatementImp();
			
//			query = "delete from student where name = 'sugar'";
//			query = "alter table student drop column age";
			query = "delete from food where name = 'Khichdi";
			
			rowCount = st.executeUpdate(query);		// DML -- delete
			
			System.out.println(rowCount + " > Deleted successfully...");
			
			System.out.println("\n***** thanks ****");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
}
