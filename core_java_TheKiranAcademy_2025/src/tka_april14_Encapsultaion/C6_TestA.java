package tka_april14_Encapsultaion;

public class C6_TestA {
	
	public static void main(String[] args) {
		
		C5_A objA = new C5_A();
		
//		objA.pvt = 4;		// error - private
		objA.def = 3;
		objA.pro = 2;
		objA.pub = 1;
		
		System.out.println("Private : ...");
		System.out.println("Default : " + objA.def);
		System.out.println("Protected : " + objA.pro);
		System.out.println("Public : " + objA.pub);
		
		System.out.println("-------------");
		
		objA.m1();
		objA.m2();
	}

}

