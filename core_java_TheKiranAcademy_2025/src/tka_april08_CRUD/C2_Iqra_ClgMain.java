package tka_april08_CRUD;

public class C2_Iqra_ClgMain {
	public static void main(String[] args) {
		
		C1_Student Shaheen = new C1_Student();
		
		Shaheen.accept(1, "Abuzar", "UI/UX", 83.72f);
//		Shaheen.display();
		
		System.out.println("--------------------------------");
		
		C1_Student Iqra = new C1_Student();

		System.out.println("<---- Before update % ---->");
		Iqra.accept(2, "Aman", "MERN", 78.09f);
		Iqra.display();
		
		System.out.println("\n<---- After update % ---->\n");
		Iqra.updatePer(-12.9f);
		Iqra.display();
		
		System.out.println("\n<---- After update % ---->\n");
		Iqra.updatePer(86.44f);
		Iqra.display();
	}
}
