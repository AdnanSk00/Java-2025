package tka_april8;

public class MIT_Appl {
	public static void main(String[] args) {
		
		Student2 s2 = new Student2();
		
		s2.accept(256, "Kabir", 67, 89, 78);
		s2.display();
		
		System.out.println("----- Update -----");
		
		s2.updateMarks(70, 72, 74);
		s2.display();
	}
}
