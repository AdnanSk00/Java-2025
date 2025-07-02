package tka_april14_Encapsultaion;

// Setters / Getters :-

public class C3_Account {
	private int accNo;
	private String name;
	private long mob;
	private double balance;		// Secure - private - data security
	
	C3_Account(){
		
	}

	public C3_Account(int accNo, String name, long mob, double balance) {
//		super();
		this.accNo = accNo;
		this.name = name;
		this.mob = mob;
		this.balance = balance;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setBalance(double amt) {		// setters
		if(amt > 0) {
			this.balance = amt;
			System.out.println(balance + " > Balance is Updated\n");			
		}
		else {
			System.err.println(amt + " >> Invalid Entry..");
		}
	}
	
	public double getBalance(){				// getters
		return balance;
	}
	
	public void display() {
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


//PureEncapsulation - class design

//class Account{
//	private acc
//	private name
//	private balance
	
//	No-arg constructor
//	Para constructor
	
//	getters/setters
	
//	toString() / display()
//}
