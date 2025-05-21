package tka_april9_Constructor;

public class JSPM_CLgMain {
	
	public static void main(String[] args) {
		Student s = new Student(1, "Abuzar", "UI/UX", 83.72f);
		s.display();
		
		Student s2 = new Student();
		s2.id = 2;
		s2.name = "Iqra";
		s2.course = "MbA";
		s2.per = 99.03f;
		s2.display();
	}
}