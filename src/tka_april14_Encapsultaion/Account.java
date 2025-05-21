package tka_april14_Encapsultaion;

// Setters / Getters :-

public class Account {
	int accNo;
	String name;
	long mob;
	private double balance;		// Secure - private - data security
	
	Account(){
		
	}

	public Account(int accNo, String name, long mob, double balance) {
//		super();
		this.accNo = accNo;
		this.name = name;
		this.mob = mob;
		this.balance = balance;
	}
	
	void setBalance(double amt) {		// setters
		if(amt > 0) {
			this.balance = amt;
			System.out.println(amt + " > Balance is Updated\n");			
		}
		else {
			System.err.println(amt + " >> Invalid Entry..");
		}
	}
	
	double getBalance(){				// getters
		return balance;
	}
	
	void display() {
		System.out.println("Account : " + accNo);
		System.out.println("Name : " + name);
		System.out.println("Mobile : " + mob);
		System.err.println("Balance : " + balance + "\n");
	}
	
}

// Encapsulation :-
// 		Binding a related data
// setters / getters -- method related that fields
// private fields
// data security
// same class
//	> blueprint -- define data and methods
//	> method use for that data members
