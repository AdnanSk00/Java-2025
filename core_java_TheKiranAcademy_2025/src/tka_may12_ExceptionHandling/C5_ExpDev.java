package tka_may12_ExceptionHandling;

public class C5_ExpDev {
	public static void main(String[] args) {
		
		System.out.println("====Welcome====");
		
		try {
			String s = null;
			s.toUpperCase();
			
			int a = 1 / 0;				
		}
		catch (ArithmeticException e) {		// RuntimeException
			e.printStackTrace();
		}
		catch (NullPointerException e) {	// RuntimeException
			e.printStackTrace();
		}
		catch (Exception e) {				// Exception e = new RuntimeException() ----> Dynamic Dispatch
			e.printStackTrace();
		}
		
		System.out.println("thanks..");
	}
}


// thanks... is not printing in above code because string exception was not handled. We are handling ArithmeticException but before it we have NullPointerException so we should handle NullPointerException or Exception first.
