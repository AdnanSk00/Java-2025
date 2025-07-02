package tka_may29_jdbc_1252;

//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.Statement;
import java.util.Scanner;

//import com.mysql.cj.jdbc.Driver;

public class C6_ClientCRUD {
	public static void main(String[] args) throws Exception{
		
		System.out.println("*** CRUD MENU ***");
		
		C7_CRUDimp crud = new C7_CRUDimp();
//		crud.createStudent();
//		crud.displayStudent();
//		crud.updateStudent();
//		crud.deleteStudent();
		
		// 1. create  2. display  3... switch case
		Scanner input = new Scanner(System.in);
		System.out.println("Select one options for querey operations :");
		System.out.println("1. Create \n2. Display \n3. Update \n4. Delete");
		int n = input.nextInt();
		input.close();
		
		switch (n) {
			case 1:
				crud.createStudent();
				break;
			case 2:
				crud.displayStudent();
				break;
			case 3:
				crud.updateStudent();
				 break;
			case 4:
				crud.deleteStudent();
				 break;
			default:
				throw new IllegalArgumentException("Invalid option: " + n);
		}
		
		
	}
}
