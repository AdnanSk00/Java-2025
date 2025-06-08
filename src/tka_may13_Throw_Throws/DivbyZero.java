package tka_may13_Throw_Throws;

public class DivbyZero {
	public static void main(String[] args) {
		try {
			int a = 1 / 0;	// throw new ArithmeticException(); [JVM]
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
