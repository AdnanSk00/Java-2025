package tka_april17_Polymorphism;

public class C5_TestDrive {
	public static void main(String[] args) {
		
		C3_A Ramlal = new C3_A();		// 1998
		Ramlal.drive();
		
		System.out.println("------------");
		
		C4_B Akki = new C4_B();			// 2020
		Akki.drive();
		
		
//		 Ways to create an object or ref / custom - variable
		
		
//		 parent =  parent()
		C3_A objA = new C3_A();
		
		// child = 	child()
		C4_B objB = new C4_B();
		
		
		// parent =  child()
		C3_A objAB = new C4_B();
		// Ref var = Object ()	--> Dynamic object creation
		// This concept exist in run time polymorphism and @override technique is followed in runtime polymorphism
//		objAB.drive();
		
		
		// child = 	parent()
//		C4_B objBA = new C3_A();		// Invalid
	}
}
