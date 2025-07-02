package tka_april17_Polymorphism;

public class C8_TestNetwork {
	public static void main(String[] args) {
		
		C6_Network4 nokia = new C6_Network4();
		nokia.calling();
		
		C7_Network5 vivo5G = new C7_Network5();
		vivo5G.calling();
		vivo5G.C6_Network4();
		vivo5G.C7_Network5();
	}
}
