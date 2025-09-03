package tka_june3_project_jdk8;

public class C9_TestGreetings {
	
	public static void main(String[] args) {
		
		// Client --> use --> Airtel  --> Application
//		C7_Greetings airtel1 = new C8_AirtelGreeting();		// MH
//		airtel1.greet();
		
		C7_Greetings airtel1 = (String s) -> {		// class design
			System.out.println("Airtel : Welcome to Airtel");
			System.out.println("Happy Diwali");		// Update
			System.out.println("Happy Holi");		// Update
			System.out.println("Airtel > " + s);
		};
		airtel1.greet("HNY");
		
//		C7_Greetings idea1 = new C8_IdeaGreeting();
//		idea1.greet();
	}
}
 
//	A class has no name is called Anonymous class.
//	Eg - C7_Greetings airtel1 = (String s) -> {	}};;
//	Lambda Syntax  () -> {...}; which support only one abstract method of interface
// 	If interface having two abstract method and we want to write code using lambda function so it will be confused for which abstract method, this code is written.