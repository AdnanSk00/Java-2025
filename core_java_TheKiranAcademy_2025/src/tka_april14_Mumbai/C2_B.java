package tka_april14_Mumbai;

import tka_april14_Pune.C2_A;

public class C2_B extends C2_A{
	
	
	void m2() {
		pro = 10;
//		def = 20;
		System.out.println(pro);
	}
	
}

//Note:- Protected can be accessed in child class of outside class (other package - C2_A{})

//E.g class MumbaiClient{
//		objMC.pro = 11; 	error	
//	}

//	class B extends A {
//		objB.pro = 11;	ok
//	}

// default - work within a same package.