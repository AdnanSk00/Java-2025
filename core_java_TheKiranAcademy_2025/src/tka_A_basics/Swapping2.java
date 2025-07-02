package tka_A_basics;

public class Swapping2 {
	public static void main(String[] args){

        // swapping of two numbers - without using 3rd variable.
        int a = 10, b = 5;

        System.out.println("Before Swapping >>");
        System.out.println("a: " + a + ", b: " + b);

        a = a + b;
        b = a - b;
        a = a - b;
        
        System.out.println("After Swapping >>");
        System.out.println("a: " + a + ", b: " + b);
    }
}
