package tka_may22_Thread;


public class C3_B extends Thread{

	public void run() {
		
		for(int i = 201; i <= 210; i++) {
			System.out.println(i + " hiii #####");
			
			try {Thread.sleep(300);} catch (InterruptedException e) {e.printStackTrace();}
		}	
	}
}
