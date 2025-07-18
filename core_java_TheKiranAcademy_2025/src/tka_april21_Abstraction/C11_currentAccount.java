package tka_april21_Abstraction;

public class C11_currentAccount extends C09_Account {

	int accountNo;
	String name;
	float balance;
	
	public C11_currentAccount() {

	}
	
	public C11_currentAccount(int accountNo, String name, float balance) {
		this.accountNo = accountNo;
		this.name = name;
		this.balance = balance;
	}


	@Override
	void deposite(float balance) {
		System.out.println(balance + " Deposited successfully...");
		this.balance += balance;
	}

	void withdraw(float balance) {
		if(balance>=5000) {
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
