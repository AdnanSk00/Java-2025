package tka_april21_Abstraction;

public class C10_savingAccount extends C09_Account{

	int accountNo;
	String name;
	float balance;
	
	public C10_savingAccount() {

	}
	
	public C10_savingAccount(int accountNo, String name, float balance) {
		this.accountNo = accountNo;
		this.name = name;
		this.balance = balance;
	}


	@Override
	void deposite(float balance) {
		System.out.println(balance + " Deposited successfully...");
		this.balance = balance;
	}

	void withdraw(float balance) {
		if(balance>=1000) {
			System.out.println(balance + " Withdrawn successfully...");			
			this.balance = balance;
		}else {
			System.err.println(balance + " low balance. Your can't withdraw");
		}
	}
	
	void display() {
		System.out.println("Account No : " + this.accountNo);
		System.out.println("Name : " + this.name);
		System.out.println("Current Balance : " + this.balance);
	}

}
