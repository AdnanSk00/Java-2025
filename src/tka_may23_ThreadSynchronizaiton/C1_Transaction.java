package tka_may23_ThreadSynchronizaiton;

public class C1_Transaction implements Runnable{
	int txId;
	double balance;
	
	@Override
	public void run() {
		for(int i = 1; i <= 5; i++) {
			doTransaction(1000);
			
			try {Thread.sleep(300);}catch(Exception e){}
		}

	}
	public C1_Transaction(int txId, double balance) {
		super();
		this.txId = txId;
		this.balance = balance;
	}
	
//		public void doTransaction(double amt) {
		synchronized public void doTransaction(double amt) {
		if(balance - amt >= 1000) {
			balance = balance - amt;
			String name = Thread.currentThread().getName();
			System.out.println(name + " " + amt + " > tx done successfully... " + balance);
		} else {
			String name = Thread.currentThread().getName();
			System.out.println(name + " Insuficient Balance : " + balance);
		}
	}
	
	@Override
	public String toString() {
		return "Transaction [txId=" + txId + ", balance=" + balance + "]";
	}
	
	
}
