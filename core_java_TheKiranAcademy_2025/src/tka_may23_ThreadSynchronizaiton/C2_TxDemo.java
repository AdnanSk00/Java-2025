package tka_may23_ThreadSynchronizaiton;

public class C2_TxDemo {
	public static void main(String[] args) {
		
		C1_Transaction tx1 = new C1_Transaction(111, 5000);
		
		Thread t1 = new Thread(tx1);
		Thread t2 = new Thread(tx1);
		Thread t3 = new Thread(tx1);
		
		t1.setName("Gpay");
		t2.setName("Pytm");
		t3.setName("AMZ");
		
		t1.start();
		t2.start();
		t3.start();
	}
}
