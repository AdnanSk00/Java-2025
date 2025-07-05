package tka_april25_Static_Revision;

public class C1_printerDriver {
	
	int nosPrint;		// use --> obj created
	static int printerCode;
	
	static void install() {		// no need to create obj
		System.out.println("**Installiing Drivers...");
		System.out.println("**static{...}");
		
//		System.out.println(nosPrint);	// error - object level
//		print();	// static?? -  can call static method
//		this.print();	// error - call instance method()
	}
	
	void print() {		// new ();	object -->
		System.out.println(printerCode);	// 
	}
}

// Note :- 
// We can't call non-static(instance) var or method() into static method but in opposite we can call static into non-static method.