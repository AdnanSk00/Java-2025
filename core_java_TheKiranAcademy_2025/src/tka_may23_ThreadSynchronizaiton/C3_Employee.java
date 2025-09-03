package tka_may23_ThreadSynchronizaiton;

import java.io.File;

public class C3_Employee {

	int id;
	String name;
	
	// object level first line codes :- Constructor
	// object level last line codes :- finalize()
	
	public C3_Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println(name + " TATA BYE BYE!");
		super.finalize();
	}
	
	void doCoding() {
		System.out.println("Welcome to coding method");
		System.out.println("Coding...");
		System.out.println("chart form view...");
		
		File f1;
		int [] a ;
		
		
		// method level last line codes : finally bloack {... }
		System.out.println("Thanks coding method");
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
}
