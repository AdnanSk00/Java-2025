package tka_april09_Constructor;

public class C3_JSPM_CLgMain {
	
	public static void main(String[] args) {
		C2_Student s = new C2_Student(1, "Abuzar", "UI/UX", 83.72f);
		s.display();
		
		C2_Student s2 = new C2_Student();
		s2.id = 2;
		s2.name = "Iqra";
		s2.course = "MbA";
		s2.per = 99.03f;
		s2.display();
	}
}