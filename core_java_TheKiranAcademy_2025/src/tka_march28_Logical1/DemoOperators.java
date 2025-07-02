package tka_march28_Logical1;

/**
 * 
 */
public class DemoOperators {

	public static void main(String[] args) {
		
//		int a = 13;
//		int b = 5;
		
//		int coRes = a / b; 
//		System.out.println("/ >> " + coRes);
		
//		int rem = a % b;
//		System.out.println("/ >> " + rem);
		
		
		int age = 22;		// after 10 years
		System.out.println("2025 >> age : " + age);
		
		age = age + 1;			// age += 10;	same operand
		System.out.println("Next >> age : " + age);
	
//		post a++ : First use then update itself
		
		int umr = 18;
		int umr2 = umr++;
		System.out.println("umr : " + umr);		// 19 / 18
		System.out.println("umr2 : " + umr2);	// 18 / 19
		
		int p = 22;
		int q = p++ + p++;
		System.out.println("p : " + p);
		System.out.println("q : " + q);
		
	}
	

}
