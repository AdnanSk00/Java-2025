package tka_may14_throws_finally;

public class C4_RR {
	public static void main(String[] args) {
		
		try {
			
			String s = null;
			s.length();
			
			int arr[] = {11, 22, 0, 99};
			
			int a = 1 / arr[200];
		}
//		catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {	// same level - child of Runtime Exception
//			e.printStackTrace();
//		}
		catch (ArrayIndexOutOfBoundsException | ArithmeticException | NullPointerException e) {	// same level - child of Runtime Exception
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		catch (Throwable e) {
			e.printStackTrace();
		}
		
		System.out.println("Thanks********");
	}
}
