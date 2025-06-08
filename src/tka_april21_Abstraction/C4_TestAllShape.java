package tka_april21_Abstraction;

//	Dynamic Dispatch --

public class C4_TestAllShape {
	public static void main(String[] args) {
		
//		C0_Shape s = new C0_Shape();		// 1990
		// Dont have body or complete mehtod
		
		C0_Shape s = new C1_Circle();		// reference =>  parent ref = new child()
//		abstract class can not create object but can have a reference
		s.calArea();
		s.draw();
		
		
//		C5_A aa = new C5_A();		// private constructor
		
	}	
}

// Object can be created if class having all complete method - under construction
// Shape - 1990, Children - 2025 ==> Parent object can not access child methods
// Here shape class have abstract methods so these methods are completed by their children and we can make object of circle, rectangle & square
// We cant make object of Shape but make constructor of Shape resaon -> Because child class constructor can not be invoked without parent constructor - super() 
// Why we cannot create object of abstract class?
// What is the role of Constructor in abstract class if could not create object of abstract class?
