package tka_april14_Encapsultaion;

public class C5_A {		// Outer class
//	Note;- We can apply all four specifier on data members inside class.
	private int pvt;
	int def;
	protected int pro;
	public int pub;
	
	C5_A() {
		// We can apply all four on constructor because it is in the class.
	}
	
	void m1() {
		System.out.println(pvt);
		System.out.println(def);
		System.out.println(pro);
		System.out.println(pub);
	}
	void m2() {
//		private int pvt2;		// error - local variable can't be private, default, protected and public
		pvt = 12;				// pvt var - within same class 
		System.out.println("Private : " + pvt);
	}
	
}

class Y {		// Outer class - default class Y{ }
	 
	class Z{
		// This class can be accessed as private, default, protected & public becasue it is in the class.
	}
	
}

// Note: Outer class can be declare as default or public
// class A/Y {} 				- allowed
// public class A/Y {} 			- allowed
// private class A/Y {} 		- not allowed
// protected class A/Y {}		- not allowed