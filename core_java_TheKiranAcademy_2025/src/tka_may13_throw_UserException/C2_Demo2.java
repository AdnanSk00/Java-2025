package tka_may13_throw_UserException;

public class C2_Demo2 {
	public static void main(String[] args) {
		
		System.out.println(">> Welcome");			
		try {
			String s = null;	// NullPtr
			s.length();		// ???
			System.out.println("# > try start");
			int a = 1 / 0;		// ArithExc;
			System.out.println("# > try end");
//			Error	--> Unsolved
		}
		catch (Throwable e) {		// Throwable = Error | Exception
			e.printStackTrace();
			System.out.println("aaaaaa code. failed...");
		}

		System.out.println("<< Thanks");
		
	}
}
