package tka_april21_Abstraction;

public class C01_Circle extends C00_Shape { 		// follows all 5 methods - pure child class
	
	@Override
	void calArea() {
		System.out.println("\nCircle Area : " + 34.46);
	}
	@Override
	void draw() {
		System.out.println("Circle is draw : ");
	}
	@Override
	void color() {
		System.out.println("Circle is colored : ");
	}
	@Override
	void resize() {
		System.out.println("Circle is resized : ");
	}
	@Override
	void move() {
		System.out.println("Circle is moved 4-8");
	}
}
