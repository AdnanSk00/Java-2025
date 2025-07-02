package tka_april14_Encapsultaion;

public class C4_SBI {
	public static void main(String[] args) {
		
		C3_Account a1 = new C3_Account(565656, "Mr Shaikh", 8662854118L, 5000.0);
		
		a1.display();
		
		a1.setBalance(10000);
		a1.setBalance(-8000);
//		a1.balance = -7000;		// Should not do this - Secure due to private							
// Note :- Outside the class we cant access private members
		
		a1.setName("Adnan"); 
		System.out.println("Now Bal : " + a1.getBalance() + "\n");

		a1.display();
	}
}