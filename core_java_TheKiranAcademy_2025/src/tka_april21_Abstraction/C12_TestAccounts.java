package tka_april21_Abstraction;

public class C12_TestAccounts {
	
	public static void main(String[] args) {
		
		C10_savingAccount obj1 = new C10_savingAccount(10001, "Prem", 700);
		obj1.withdraw(500);
		obj1.display();
		
		C11_currentAccount obj2 = new C11_currentAccount(50005, "Raj", 5600);
		obj2.deposite(1400);
		obj2.display();
		obj2.withdraw(2100);
		obj2.display();
	}
	
	
}
