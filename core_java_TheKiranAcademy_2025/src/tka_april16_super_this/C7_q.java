package tka_april16_super_this;

public class C7_q extends C6_p{

	int y = 100;
	int z = 30;
	
	void m1() {
		int y = 1000;
//		int z = 60;
		
//		System.out.println("x : " + super.x);
		System.out.println("p y : " + super.y);
		System.out.println("q y : " + this.y);
		System.out.println("m1 y : " + y);
		System.out.println("z : " + z);
	}
	
	void m2() {
		System.out.println("home : q - m2");	// m2 - under construction
	}
	void m3() {
		System.out.println("login : q - m3");
		this.m2();			// q
		super.m2();			// p 
	}
	
}
