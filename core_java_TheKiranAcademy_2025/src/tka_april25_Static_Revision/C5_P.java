package tka_april25_Static_Revision;

// Can we override static method? --> No
// Can we override constructor? --> No
// Can we override final method? --> No
// Can constructor declare as fine --> No

public class C5_P {		// parent
	
//	public C5_P() {}	// Constructor(){}
//	final public C5_P() {}	// error -   final constructor(){}
	
	
	
//	static void m1() {
//		System.out.println("Hello---");
//	}
	
//	final void m2() {
//	}
	
	public C5_P() {
		super();			// call superclass constructor --> Object
	}
	void m3() {}
	
}

// Constructor can not be override so no need to write final with constructor. Because we write final with method() to prevent @override
// Note :- Final & Static can not be override.