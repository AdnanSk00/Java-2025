package tka_april24_Static;

public class C2_TestStudent{
	public static void main(String[] args) {
		C1_Student s1 = new C1_Student(1, "Rahul", 555);
		C1_Student s2 = new C1_Student(1, "Rahul", 555);
		C1_Student s3 = new C1_Student(1, "Rahul", 555);
		C1_Student s4 = new C1_Student(1, "Rahul", 555);
		
		System.out.println("==== Sem I ====");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);

		System.out.println("==== Sem II ====");
//		s1.clgCode = 888;		// single updates by obj => updated everywhere
		C1_Student.clgCode = 888;	// Better approach - call by class name
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
//		Math m1 = new Math();	// error - sqrt() is static - can access by class directly
//		m1.sqrt(4);
		double result = Math.sqrt(9);
		System.out.println("----------\n"+ result);
	}
	
	
}

