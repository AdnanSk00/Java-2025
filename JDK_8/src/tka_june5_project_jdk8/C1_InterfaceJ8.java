
package tka_june5_project_jdk8;


public interface C1_InterfaceJ8 {	// 1. Self - child not update  or	2. common for Child
	
	int pass = 1234;
	
	public void m1Abst();					// abstract
	
	public static void m3Static() {			// self
		System.out.println("Static Parent private code");
	}
	
//	like concret class -- concrete same
	public default void m2Default() {		// common - child can @override it
		System.out.println("Def Common code");
	}

//	void m4Concrete() {		// concrete -> need object -> interface (no constructor) -> not allowed object
//	}
}
