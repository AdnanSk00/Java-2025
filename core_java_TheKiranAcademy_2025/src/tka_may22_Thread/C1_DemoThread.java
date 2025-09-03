package tka_may22_Thread;

//Thread - Every executable program [part of application] runs parallaly or simultaniosly
//Thread - Part of entire application

public class C1_DemoThread {
	
	public static void main(String[] args){
		
		C2_A aa = new C2_A ();
		aa.start();		// call run()
		
		C3_B bb = new C3_B ();
		bb.start();		// call run()
		
	
	}
}

//	Q1) What is thread in java?
//  Q2) How to cread thread in java?
//  Q3) Which is the best way to creat thread?
//  Q4) Why the runnable interface is best way to creat thread?
//	Q5) Difference between process and thread?
//  Q6) What is synchronized keyword ?
//  Q7) What is GC?
//  Q8) how to call GC?
//  Q9) What is finalize()?
//  Q10) Why finalize used?
