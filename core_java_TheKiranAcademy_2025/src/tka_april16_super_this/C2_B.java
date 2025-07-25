package tka_april16_super_this;

public class C2_B extends C1_A{
	
	C2_B(){
//		super();		// call - byDefault - JVM
		
//		super(24);		// A(a) - call by user - on first line of method
//		this(12);		// B(b) - call by user - on first line of method
		System.out.println("B() --- B0");
	}
	C2_B(int b){
//		super();		// A() - call byDefault	- JVM
		
//		super(18);		// A(a) - call by user
		this("constructor chaining");
		System.out.println("B(int) --- B1 " + b);
	}
	
	C2_B(String string){
//		super();
		System.out.println("B(string --- B2 " + string);
	}
	
	void m2() {
		System.out.println("B m2()");
	}
}

//  Note :-
//	1) super(), this() both use inside constructor only
//	2) super & this keyword can not be written both at a time on first line of method
//	2) super()/super(para) - is used to call parent constructors
//	3) this()/this(para) - is used to call siblings(same class) constructors
//  4) Every child constructor consists super(); by default on first line.
//  5) Constructor chaining - Constructor inside constructor
//	6) Recursion cant be occured in constructor chaining because error solved in compile time
//	7) Method chaining - Method inside method
//	8) Recursion occurs in method chaining due to execution on run time
//	9) Constructor chaining is possible, until it will get recursion for deadlock
// 10) To avoid that use at least one call of super().