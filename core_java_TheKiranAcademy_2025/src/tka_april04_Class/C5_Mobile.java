package tka_april04_Class;

public class C5_Mobile {
	String name;
	String company;
	double price;
	double battery;
	String warranty;
	
	void update() {
		System.out.println(name + " new version is updated successfully.");
	}
	void game() {
		System.out.println("WCC2 is downloading...");
	}
	void battery() {
		System.out.println("Turn on Power saving mode, battery is less than 20%");
	}
}
