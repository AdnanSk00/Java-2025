package tka_may30_State_prepStatement;

import java.util.Scanner;

//import com.mysql.cj.jdbc.Driver;

public class C1_ClientCRUD {
	public static void main(String[] args) throws Exception{
		
		System.out.println("*** CRUD MENU ***");
		
		C2_CRUDimp crud = new C2_CRUDimp();

		Scanner input = new Scanner(System.in);
		
		int n;
		do {
			System.out.println("Select one options for querey operations :");
			System.out.println("1. Create \n2. Display \n3. Update \n4. Delete \n5. Exit");
			n = input.nextInt();
//			input.close();
			
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
				case 5:
                    System.out.println("Thanks for using it. Bye!");
                    break;
				default:
					throw new IllegalArgumentException("Invalid option: " + n);
			}
		}while(n != 5);
		
		
	}
}
