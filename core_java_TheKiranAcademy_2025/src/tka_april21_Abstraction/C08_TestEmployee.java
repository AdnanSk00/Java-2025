package tka_april21_Abstraction;


public class C08_TestEmployee{
	public static void main(String[] args) {
		
		C07_Employee obj = new C07_Employee();		// JVM makes constructor
		
		obj.direction();
		obj.assignTask();
		obj.salaryWithdraw(70000);
		obj.reportSubmit();
	}
	
}
