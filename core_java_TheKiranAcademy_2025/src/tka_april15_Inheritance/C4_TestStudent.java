package tka_april15_Inheritance;

public class C4_TestStudent {
	public static void main(String[] args) {
		
		System.out.println("---- main ----");
		
//		C1_Person p1 = new C1_Person();	// @@@@@@
		C1_Person p2 = new C1_Person(1, "Raj", 18);	// #######	
		
//		C2_Student studObject = new C2_Student();	// ****** and JVM - @@@@@@
//		studObject.m1();
//		
		
		new C2_Student(1, "Raj", 18, "BE", 77.9f);	// JVM - @@@@@@
//		
//		C2_Student s2 = new C2_Student(1, "Raj", 18, "BE", 77.9f); // $$$$$$		
//		s2.display();
		
		
//		int a = 11;
//		System.out.println(a);
		
		System.out.println("----------------");		
		
		C3_Employee e1 = new C3_Employee(101, "William", 42, "Assistant", 80000);	// JVM - @@@@@@
		
//		String EmpDetails = e1.toString();
//		System.out.println(EmpDetails);			// print toString(){}		
		
//		System.out.println(e1.toString());		// print toString(){}
//		System.out.println(e1);					// print toString(){}
		
//		System.out.println(s2); 				// Dont have toString(){}
		
//		String s = "java";
//		System.out.println(s);
//		System.err.println(s.toString());
	}
}
