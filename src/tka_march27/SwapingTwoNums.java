package tka_march27;

public class SwapingTwoNums {

	public static void main(String[] args) {
		int a = 1, b = 2, swapInt = 0;
		
		System.out.println("Before swaping : a = " + a + " & "+ "b = " + b);
		
		swapInt = a;
		a = b;
		b = swapInt;
		
		System.out.println("After swaping : a = " + a + " & "+ "b = " + b);		
	}

}
