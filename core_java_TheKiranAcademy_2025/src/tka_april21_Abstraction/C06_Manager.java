package tka_april21_Abstraction;

public abstract class C06_Manager {
	
//	public C6_Manager() {		// JVM makes it automatically
//	}

	void direction() {		
		System.out.println("Assigning instructions...");
	}
	
	abstract void assignTask();
	
	abstract void salaryWithdraw(float salary);
	
	abstract void reportSubmit();
	
	
	
}
