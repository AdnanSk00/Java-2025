package tka_april23_Interface_MultipleInheritance;

public class C9_Employee {
	int age;
	String name;
	
	public C9_Employee() {

	}
	
	public C9_Employee(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return "C9_Employee [age=" + age + ", name=" + name + "]";
	}

	
	

	
}
