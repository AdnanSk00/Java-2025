package tka_april07_Object_Function;

public class C4_Employee {
	int id;			// id - Global Variable
	String name;
	String role;
	double salary;
	
	// Create
	void setDetails(int id, String name, String role, double salary) {
		this.id = id;		// id - loacal variable
		this.name = name;
		this.role = role;
		this.salary = salary;
	}
	
	void getDetails() {
		System.out.println("Employee Details **");
		System.out.println("EMP ID : " + id);
		System.out.println("Name : " + name);
		System.out.println("Role : " + role);
		System.out.println("Salary : " + salary);
	}
}
