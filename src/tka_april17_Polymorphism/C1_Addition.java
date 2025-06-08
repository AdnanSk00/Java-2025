package tka_april17_Polymorphism;

//Polymorphism :
// 1) Method overloading :-

// @Dev
public class C1_Addition {
	
	void sum(int a, int b) {
		int res = a + b;
		System.out.println("Sum is : " + res);
	}

	void sum(int a, int b, int c) {
		int res = a + b + c;
		System.out.println("Sum is : " + res);
	}
	
	void sum(float a, float b, float c) {
		float res = a + b + c;
		System.out.println("Sum is : " + res);
	}
	
	void sum(int a, int b, int c, int d) {
		int res = a + b + c + d;
		System.out.println("Sum is : " + res);
	}
}

//Polymorphism -
//	Performing a same task or functionality with the help of different forms
// 	Objective - Code readability
//  Best practice -	We can achieve it at compile time and run time
// Compile Time Poly :-
//		Binding a data at compile time or performing a same task with using different form which we can achieve at compile time.
//		In OOP we can achieve compile time polymorphism by using Method overloading and operator overloading. but Java does not support for operator overloading. Java only supports for method overloading.
