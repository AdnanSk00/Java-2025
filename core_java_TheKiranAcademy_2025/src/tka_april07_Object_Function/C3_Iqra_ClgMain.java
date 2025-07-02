package tka_april07_Object_Function;

public class C3_Iqra_ClgMain {
	public static void main(String[] args) {
		
		C2_Student Shaheen = new C2_Student();
		
//		Shaheen.id = 1;			// C - Create
//		Shaheen.name = "Abuzar";
//		Shaheen.course = "UI/UX";
//		Shaheen.per = 83.72f;
		
		Shaheen.accept(1, "Abuzar", "UI/UX", 83.72f);
//		Shaheen.display();
		
		System.out.println("--------------------------------");
		
		C2_Student Iqra = new C2_Student();

		Iqra.accept(2, "Aman", "MERN", 78.09f);
		Iqra.display();
		
	}
}
