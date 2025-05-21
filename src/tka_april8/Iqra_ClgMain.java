package tka_april8;

public class Iqra_ClgMain {
	public static void main(String[] args) {
		
		Student Shaheen = new Student();
		
		Shaheen.accept(1, "Abuzar", "UI/UX", 83.72f);
//		Shaheen.display();
		
		System.out.println("--------------------------------");
		
		Student Iqra = new Student();

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
