package tka_may22_Thread;

public class C2_A extends Thread{

	public void run() {
		for(int i = 1; i <= 20; i++) {
			System.out.println(i + " hello *****");
			
			try {Thread.sleep(300);} catch (InterruptedException e) {e.printStackTrace();}
		}
	}
}
