package tka_march27;

public class SwapingTwoNumsWithout3rdVariable {

	public static void main(String[] args) {
		int a = 1, b = 2;
		System.out.println("Before swaping : a = " + a + " & "+ "b = " + b);
		
		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("After swaping : a = " + a + " & "+ "b = " + b);
	}

}
