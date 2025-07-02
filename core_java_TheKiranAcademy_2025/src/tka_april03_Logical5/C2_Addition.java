package tka_april03_Logical5;

public class C2_Addition {
	public static void main(String[] args) {
//		sum of 10 & 5
//		sum of 4 & 4
//		sum of 9 & 3
//		sum of 23 & 5
//		sum of 1 & 7
//		sum of 6 & 8
//		Final output - Sum is : 15, Sum is 8
		System.out.println("Welcome Android applicaton...");
		
		Sum(3, 7);
		multiply(3, 6);
//		Sum(43, 57);
		areaOfCircle(4);
		areaOfCircle(5);
	}
	
	static void Sum(int a, int b){
		System.out.println("---WhatsApp...");
		int sum = a + b;
		System.out.println("Sum is : " + sum);
	}
	
	static void multiply(int a, int b) {
		System.out.println("\nMultiply --Facebook--");
		int mul = a * b;
		System.out.println("Multiplication is : " + mul);
	}
	
	static void areaOfSquare(int r) {
		
	}
	
	static void areaOfCircle(int r) {
		System.out.println("\nareaOfCircle --YouTube--");
		double c = 3.14*r*r;
		System.out.println("Area of Circle is " + c);
	}
}
