package tka_april14_Mumbai;

import tka_april14_Pune.C2_A;

public class C2_B extends C2_A{
	
	void m2() {
		System.out.println(pro);
	}
}

//Note:- Protected can be accessed in child class of outside class (other package)

//E.g class MumbaiClient{
//		obj.pro = 11; 	error	
//	}

//	class B extends A {
//		obj.pro = 11;	ok
//	}