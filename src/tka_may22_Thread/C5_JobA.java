package tka_may22_Thread;

public class C5_JobA extends C8_Admin implements Runnable{

	@Override
	public void run() {
		System.out.println("> Thread: " + Thread.currentThread().getName());
		System.out.println("A->8 State : " + Thread.currentThread().getState());
		for(int i = 201; i <= 210; i++) {
			System.out.println(i + " hiii #####");
			
			try {Thread.sleep(300);} catch (InterruptedException e){e.printStackTrace();}
		}			
		System.out.println("A->14 State : " + Thread.currentThread().getState());
	}

}
