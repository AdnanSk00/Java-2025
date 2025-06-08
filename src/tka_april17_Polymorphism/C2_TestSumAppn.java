package tka_april17_Polymorphism;

public class C2_TestSumAppn {
	public static void main(String[] args) {
		
		C1_Addition clientKid = new C1_Addition();
		clientKid.sum(4, 6);
		clientKid.sum(11, 22, 33);
				
		C1_Addition clientAmz1 = new C1_Addition();
		clientAmz1.sum(100, 50); 
		clientAmz1.sum(10.40f, 12.60f, 27.50f); 
		clientAmz1.sum(12, 50, 33, 44);
	}
}


