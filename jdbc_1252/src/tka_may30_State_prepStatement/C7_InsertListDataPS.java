package tka_may30_State_prepStatement;

import java.sql.Connection;
//import java.sql.DriverManager;
import java.sql.PreparedStatement;
//import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
//import java.util.Scanner;

public class C7_InsertListDataPS {
	public static void main(String[] args) throws Exception {
		
		List<C6_Student> studList = new ArrayList<>();
		studList.add(new C6_Student(10, "Shami", 87.34f));
		studList.add(new C6_Student(20, "Rahul", 74.0f));
		studList.add(new C6_Student(30, "Head",  68.29f));
//		studList.forEach(System.out::println);
		
		Connection con = C3_MyDBConf.getMyDBConnection();
		
		String query = "insert into student2 values(?, ?, ?)";		// PrepareStatement java-sql format
		PreparedStatement pst = con.prepareStatement(query);
		
		for(C6_Student std : studList){
			System.out.println(std);					// print on console
// 			insert into DB
			pst.setInt(1, std.id);
			pst.setString(2, std.name);		
			pst.setFloat(3, std.per);
			pst.executeUpdate();						// DML -- insert			
		};
		
		System.out.println(studList.size() + " > Inserted successfully...");
	
		System.out.println("\n***** thanks *****");
		
	}
}
