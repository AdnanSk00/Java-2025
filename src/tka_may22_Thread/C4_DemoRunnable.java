package tka_may22_Thread;

public class C4_DemoRunnable {
	
	public static void main(String[] args){
		
		System.out.println("--Welcome------------");
		
		System.out.println("> Thread: " + Thread.currentThread().getName());
		
		
		C5_JobA ja = new C5_JobA ();
//		Runnable ja = new C5_JobA ();
		Thread t1 = new Thread(ja);
		System.out.println("15-> State : " + t1.getState());
		t1.setName("Job-A");
//		System.out.println("> Thread: " + Thread.currentThread().getName());
		t1.start();		// call run() - JobA
		System.out.println("19-> State : " + t1.getState());
		
		Runnable jb = new C6_JobB ();
		Thread t2 = new Thread(jb);
		t2.setName("Job-B");
//		System.out.println("> Thread: " + Thread.currentThread().getName());
		t2.start();		// call run() - JobB
//		
		System.out.println("...Thanks...");
		System.out.println("28-> State : " + t1.getState());
	
	}
}
