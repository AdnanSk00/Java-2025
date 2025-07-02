package tka_april21_Abstraction;


public class C07_Employee extends C06_Manager{

	@Override
	void assignTask() {
		System.out.println("Task submitted successfully...");
	}
	
	@Override
	void salaryWithdraw(float salary) {
		System.out.println("Salary " + salary + "withdrawn successfully...");
	}

	@Override
	void reportSubmit() {
		System.out.println("Report submitted successfully...");
	}
	
}
