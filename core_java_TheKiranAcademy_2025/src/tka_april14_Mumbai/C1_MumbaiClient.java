package tka_april14_Mumbai;

import tka_april14_Pune.C2_A;

public class C1_MumbaiClient {
	public static void main(String[] args) {
		
		C2_A obj = new C2_A();
		
//		obj.m1();
		
//		obj.pvt;
//		obj.def = 12;
//		obj.pro = 7;
		obj.pub = 4;
		
//		obj.m1();			// m1() - default
		
		C2_B objB = new C2_B();
//		objB.pro = 24;
//		objB.def = 20;		// error - default
		objB.m2();
		
	}
}
