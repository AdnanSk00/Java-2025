package tka_may30_State_prepStatement;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

public class C4_CreatInsertDataDynm {
	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		Connection con = C3_MyDBConf.getMyDBConnection();
		Statement st = con.createStatement();	// new StatementImp();
		
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
		String query = "insert into food values(" + i + ", '" + n + "', " + f + ", '" + q + "')";
		
		System.out.println(query);
		
		int rowCount = st.executeUpdate(query);		// DML -- insert
		System.out.println(rowCount + " > Inserted successfully...");
	
		System.out.println("\n***** thanks ****");
		
	}
}
