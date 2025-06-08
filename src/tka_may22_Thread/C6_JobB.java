package tka_may22_Thread;


public class C6_JobB implements Runnable{

	@Override
	public void run() {
		System.out.println("> Thread: " + Thread.currentThread().getName());
		for(int i = 201; i <= 210; i++) {
			System.out.println(i + " hello #####");
			
			try {Thread.sleep(300);} catch (InterruptedException e){e.printStackTrace();}
		}	
		
	}

}
