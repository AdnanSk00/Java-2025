package tka_may23_ThreadSynchronizaiton;

public class C4_ByeObject {

	public static void main(String[] args) {
		
		C3_Employee e1 = new C3_Employee(1, "Rahul");
		C3_Employee e2 = new C3_Employee(2, "Iyer");
		
		System.out.println("2024 ----------");
		System.out.println(e1);
		System.out.println(e2);
//		e1.doCoding();
//		e2.doCoding();
		
		System.out.println("2025 ----------");
		e1 = null;					// String(class obj) - not initialize
		System.gc();
		System.out.println(e1);
		System.out.println(e2);
//		e1.doCoding();
//		e2.doCoding();
		
		int a = 10, b = 5;
		
//		System.out.println(b); 		// use
		a = 0;						// int - not initialize
	}
}

//	Garbage Collector (gc) - It is used to clean up our HEAP memory by deleting unused or unclaimed objects
//	gc process in background automatically.
//	Eg - e1 = null;		[unclaimed] -- 1000 clean
//  System.gc() - garbage collector will clean HEAP