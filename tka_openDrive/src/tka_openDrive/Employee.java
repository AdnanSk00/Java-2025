package tka_openDrive;

public class Employee {
	
	// CRUD Operation :-
	
	int id;
	String name;
	String department;
	long mobile;
	float salary;
	
	Employee(){};
	
	Employee(int id, String name, long mobile, String department, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.mobile = mobile;
		this.department = department;
		this.salary = salary;
	}
	
	void display() {
		System.out.println("*** Employee Details ***\n");
		System.out.println("ID : " + this.id);
		System.out.println("Name : " + this.name);
		System.out.println("Mobile : " + this.mobile);
		System.out.println("Department : " + this.department);
		System.out.println("Salary : " + this.salary);
	}
	
	void update(float updateSalary) {
		if(updateSalary > 0) {
			System.out.println("After Update");
			this.salary = updateSalary;		
			System.out.println(updateSalary + " Salary Updated Successfully.");
		}else {
			System.err.println(updateSalary + " > Invalid Salary");
		}
	}
	
	
	
	
}
