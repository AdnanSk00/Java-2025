package tka_april08_CRUD;

public class C6_ShowEmployeeDetails {
	public static void main(String[] args) {
        C5_Employee e1 = new C5_Employee();
        e1.setDetails(56,"Adnan",10000);
        e1.display();
        
        System.out.println("\n<-----Salary Updated----->\n");
        
        e1.update(20000);
        
    }
}
