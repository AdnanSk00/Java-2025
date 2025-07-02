package tka_A_basics;

public class PosNegZero {
	public static void main(String[] args) {

        // Check whether a number is zero, positive or negative
        int num = -9;

        if(num == 0) {
            System.out.println(num + " is zero");
        } 
        else{
            if(num > 0){
                System.out.println(num + " is positive");
            }
            else {
                System.out.println(num + " is negative");
            }
        } 

    }   // End of main() method
}
