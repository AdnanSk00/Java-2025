package tka_may12_ExceptionHandling;

public class C3_DemoOld{
	
	public static void main(String[] args) {
		
			System.out.println("# >> Welcome...");
			System.out.println("# > try start");
			int a = 1 / 0;
			System.out.println("======= code success...");			
			System.out.println("@@@ code. failed...");
			System.out.println("# > try end");
			System.out.println("-----Something Wrong---");
		
	}	// end main method
}

// We have not handled exception in above program thats why after exception code is not visible
