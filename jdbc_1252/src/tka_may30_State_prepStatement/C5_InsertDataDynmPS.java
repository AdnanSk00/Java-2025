package tka_may30_State_prepStatement;

import java.sql.Connection;
//import java.sql.DriverManager;
import java.sql.PreparedStatement;
//import java.sql.Statement;
import java.util.Scanner;

public class C5_InsertDataDynmPS {
	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		Connection con = C3_MyDBConf.getMyDBConnection();
//		Statement st = con.createStatement();	// new StatementImp();
		
		System.out.print("Enter id : ");
		int i = sc.nextInt();
		System.out.print("Enter Name : ");
		String n = sc.next();
		System.out.print("Enter Price : ");
		float f = sc.nextFloat();
		System.out.print("Enter Quantity : ");
		String q = sc.next();
		sc.close();
		
//		String query = "insert into food values(10, 'salf', 20, 'full')";
		String query = "insert into food values(?, ?, ?, ?)";		// PrepareStatement java-sql format

		System.out.println(query);
		
		PreparedStatement pst = con.prepareStatement(query);
		
		pst.setInt(1, i);
		pst.setString(2, n);		
		pst.setFloat(3, f);
		pst.setString(4, q);
//		pst.setInt(1, 25);
//		pst.setString(2, "Dahi");		
//		pst.setFloat(3, 15.5f);
//		pst.setString(4, "half");
		int rowCount = pst.executeUpdate();		// DML -- insert
		System.out.println(rowCount + " > Inserted successfully...");
	
		System.out.println("\n***** thanks *****");
		
	}
}
