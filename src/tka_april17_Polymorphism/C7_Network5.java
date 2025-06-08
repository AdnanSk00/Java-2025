package tka_april17_Polymorphism;

public class C7_Network5 extends C6_Network4 {
	
	C7_Network5(){
		System.out.println("Constructor");
	}
	
	void C7_Network5() {
		System.out.println("Constructor/method? --> method");
	}
	
	void C6_Network4() {
		System.out.println("Constructor/method? --> method");
	}
	
	@Override
	void calling() {
		System.out.println("---Finally Calling 5G---");
	}
}

//	Q - If we define a return type to the constructor7
//  A - It looks as a method
//  Q - Can we define and override(same name constructor in another class) constructor? - No
//  Q - Can we overload(same name but different parameters) constructor? - Yes
