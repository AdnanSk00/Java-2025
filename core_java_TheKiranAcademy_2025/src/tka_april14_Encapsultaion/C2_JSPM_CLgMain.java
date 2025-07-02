package tka_april14_Encapsultaion;

public class C2_JSPM_CLgMain {
	public static void main(String[] args) {
		
		// 1. create
		C1_Student s1 = new C1_Student(1, "SRK", "Acting", 99.99f);	// 2. create
		
		
			// 2. display()
		s1.display();
		
//		3. --update
		
		s1.updatePer(90.1f);
		s1.updatePer(200.1f);
		s1.display();
		
		s1.per = 300;	// Restric form out side invalid users
		s1.display();
		
		
		
	}
}
