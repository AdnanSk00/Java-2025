package tka_may22_Thread;

public class C7_DemoRunnable2 {
	
	public static void main(String[] args) throws Exception{
		
		System.out.println("> Welcome Thread: " + Thread.currentThread().getName());
		
		
		C5_JobA ja = new C5_JobA ();
		Thread t1 = new Thread(ja);		// login
		System.out.println("PP before>> " + t1.getPriority());
//		t1.setPriority(Thread.MAX_PRIORITY);
		System.out.println("PP after>> " + t1.getPriority());
		
		System.out.println("16-> State : " + t1.getState());
		t1.setName("Job-A");
		t1.start();	
		System.out.println("19-> State : " + t1.getState());
		
		
		Runnable jb = new C6_JobB ();
		Thread t2 = new Thread(jb);		// logout
		t2.setName("Job-B");
		t2.start();
		
		
		Thread t3 = new Thread(jb);		// homepage
//		t1.join();
		
		System.out.println("...Thanks...");
		System.out.println("28-> State : " + t1.getState());
	
	}
}

//	Q1) Descibe any five methods of thread.
