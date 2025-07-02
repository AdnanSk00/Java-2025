package tka_april03_Logical5;

public class C4_Laptop {
	public static void main(String[] args) {
		
		C2_Addition obj =  new C2_Addition();
		
//		obj.Sum(5, 3);
//		obj.multiply(12, 5);
		
		C2_Addition.Sum(6, 6); 	// Good aproach - static method can access by class name
		C2_Addition.multiply(12, 5);
	}
}
