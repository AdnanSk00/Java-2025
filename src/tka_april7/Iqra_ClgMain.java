package tka_april7;

public class Iqra_ClgMain {
	public static void main(String[] args) {
		
		Student Shaheen = new Student();
		
//		Shaheen.id = 1;			// C - Create
//		Shaheen.name = "Abuzar";
//		Shaheen.course = "UI/UX";
//		Shaheen.per = 83.72f;
		
		Shaheen.accept(1, "Abuzar", "UI/UX", 83.72f);
//		Shaheen.display();
		
		System.out.println("--------------------------------");
		
		Student Iqra = new Student();

		Iqra.accept(2, "Aman", "MERN", 78.09f);
		Iqra.display();
		
	}
}
