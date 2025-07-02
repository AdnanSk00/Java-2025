package tka_may13_Throw_Throws;

public class Demo {
	public static void main(String[] args) {
		
		System.out.println(">> Welcome");			
		try {
			String s = null;
			s.length();
			System.out.println("# > try start");
			int a = 1 / 0;		// orderId = 0
			System.out.println("======= code success...");			
			System.out.println("# > try end");
		}
		catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("aaaaaa code. failed...");
		}
		catch (NullPointerException e) {
			e.printStackTrace();
			System.out.println("nnnnnnn code. failed...");
		}

		System.out.println("<< Thanks");
		System.out.println("To be continue...next api");
		
	}	// end main method
}
