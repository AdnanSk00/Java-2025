package tka_A_basics;

public class Swapping {
	public static void main(String[] args){
        // swapping of two numbers with using 3rd variable.

        int a = 10, b = 5;
        System.out.println("Before Swapping >> ");
        System.out.println("a: "+ a + ", b: " + b);

        int t = a;
        a = b;
        b = t;

        System.out.println("After Swapping >> ");
        System.out.println("a: " + a + ", b: " + b);

    }
}
