package tka_may19_Comparable_Comparator;

public class C12_EmployeeHW {
	int id;
	String name;
	String role;
	double salary;
	
	public C12_EmployeeHW() {
		
	}
	public C12_EmployeeHW(int id, String name, String role, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.role = role;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "EmployeeHW [id=" + id + ", name=" + name + ", role=" + role + ", salary=" + salary + "]";
	}
	
	
}
